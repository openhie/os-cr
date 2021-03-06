/**
 *
 * Copyright (C) 2002-2012 "SYSNET International, Inc."
 * support@sysnetint.com [http://www.sysnetint.com]
 *
 * This file is part of OpenEMPI.
 *
 * OpenEMPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.openhie.openempi.openpixpdqadapter;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openhealthtools.openexchange.datamodel.Address;
import org.openhealthtools.openexchange.datamodel.Identifier;
import org.openhealthtools.openexchange.datamodel.Patient;
import org.openhealthtools.openexchange.datamodel.PatientIdentifier;
import org.openhealthtools.openexchange.datamodel.PersonName;
import org.openhealthtools.openexchange.datamodel.PhoneNumber;
import org.openhealthtools.openexchange.datamodel.SharedEnums.SexType;
import org.openhealthtools.openpixpdq.api.PdqQuery;
import org.openhealthtools.openpixpdq.impl.v2.ImpreciseCalendar;
import org.openhie.openempi.model.EthnicGroup;
import org.openhie.openempi.model.Gender;
import org.openhie.openempi.model.IdentifierDomain;
import org.openhie.openempi.model.ImpreciseDate;
import org.openhie.openempi.model.NameType;
import org.openhie.openempi.model.Nationality;
import org.openhie.openempi.model.Person;
import org.openhie.openempi.model.PersonIdentifier;
import org.openhie.openempi.model.PhoneType;
import org.openhie.openempi.model.Race;
import org.openhie.openempi.model.Religion;

public class ConversionHelper
{
	private static final Log log = LogFactory.getLog(ConversionHelper.class);
	
	//private static final String MAIDEN_NAME_NAME_TYPE_CODE = "M";
	private static final String LEGAL_NAME_NAME_TYPE_CODE = "L";
	
	private static final String PHONE_TYPE_CODE_HOME          = "H";
	private static final String PHONE_TYPE_CODE_PRIMARY_HOME  = "HP";
	private static final String PHONE_TYPE_CODE_VACATION_HOME = "HV";
	private static final String PHONE_TYPE_CODE_WORK = "O";
	private static final String PHONE_TYPE_CODE_CELL = "C";
	private static final String PHONE_TYPE_CODE_EMERGENCY = "EC";
	private static final String PHONE_TYPE_CODE_FAX = "F";
	private static final String PHONE_TYPE_CODE_SERVICE = "AS";
	private static final String PHONE_TYPE_CODE_UNKNOWN = "UN";

	private static final String PIXPDQ_RACE_CODE_AMERICAN_INDIAN = "AI";
	private static final String PIXPDQ_RACE_CODE_ASIAN = "AP";
	private static final String PIXPDQ_RACE_CODE_BLACK = "BL";
	private static final String PIXPDQ_RACE_CODE_WHITE = "WH";
	private static final String PIXPDQ_RACE_CODE_HISPANIC = "HI"; // This is wrong; Hispanic is not a race but a cultural/ethnic group
	
	private static final String OPENEMPI_RACE_CODE_AMERICAN_INDIAN = "1002-5";
	private static final String OPENEMPI_RACE_CODE_ASIAN = "2028-9";
	private static final String OPENEMPI_RACE_CODE_BLACK = "2054-5";
	private static final String OPENEMPI_RACE_CODE_WHITE = "2106-3";
	private static final String OPENEMPI_RACE_SPANISH_AMERICAN_INDIAN = "1074-4";
	private static final String OPENEMPI_RACE_CODE_OTHER = "2131-1";
	
	private static HashMap<String,String> pixPdqToOpenEmpiRaceCodeMap = new HashMap<String,String>();
	private static HashMap<String,String> openempiToPixPdqRaceCodeMap = new HashMap<String,String>();
	static {
		pixPdqToOpenEmpiRaceCodeMap.put(PIXPDQ_RACE_CODE_AMERICAN_INDIAN, OPENEMPI_RACE_CODE_AMERICAN_INDIAN);
		pixPdqToOpenEmpiRaceCodeMap.put(PIXPDQ_RACE_CODE_ASIAN, OPENEMPI_RACE_CODE_ASIAN);
		pixPdqToOpenEmpiRaceCodeMap.put(PIXPDQ_RACE_CODE_BLACK, OPENEMPI_RACE_CODE_BLACK);
		pixPdqToOpenEmpiRaceCodeMap.put(PIXPDQ_RACE_CODE_WHITE, OPENEMPI_RACE_CODE_WHITE);
		pixPdqToOpenEmpiRaceCodeMap.put(PIXPDQ_RACE_CODE_HISPANIC, OPENEMPI_RACE_SPANISH_AMERICAN_INDIAN);
		
		openempiToPixPdqRaceCodeMap.put(OPENEMPI_RACE_CODE_AMERICAN_INDIAN, PIXPDQ_RACE_CODE_AMERICAN_INDIAN);
		openempiToPixPdqRaceCodeMap.put(OPENEMPI_RACE_CODE_ASIAN, PIXPDQ_RACE_CODE_ASIAN);
		openempiToPixPdqRaceCodeMap.put(OPENEMPI_RACE_CODE_BLACK, PIXPDQ_RACE_CODE_BLACK);
		openempiToPixPdqRaceCodeMap.put(OPENEMPI_RACE_CODE_WHITE, PIXPDQ_RACE_CODE_WHITE);
		openempiToPixPdqRaceCodeMap.put(OPENEMPI_RACE_SPANISH_AMERICAN_INDIAN, PIXPDQ_RACE_CODE_HISPANIC);
	}
	
	public static Person getPerson(final PdqQuery query) {
		final Person person = new Person();
		if (query.getPersonName() != null) {
			populatePersonName(person, query);
		}
		if (query.getSsn() != null) {
			person.setSsn(query.getSsn());
		}
		if (query.getSex() != null) {
			final Gender gender = new Gender();
			gender.setGenderCode(query.getSex().getCDAValue());
			person.setGender(gender);
		}
		person.setDateOfBirth(toDate(query.getBirthDate()));
		if (query.getAddress() != null) {
			populateAddress(person, query.getAddress());
		}
		if (query.getPhone() != null) {
			populatePhone(person, query.getPhone());
		}
		if (query.getPatientIdentifier() != null) {
			person.addPersonIdentifier(getPersonIdentifier(query.getPatientIdentifier(), query));
		}
		if (query.getPatientAccountNumber() != null) {
			final PatientIdentifier account = query.getPatientAccountNumber();
			if (account.getId() != null) {
				person.setAccount(handlePrefixSuffix(query, account.getId()));
			}
			if (account.getAssigningAuthority() != null) {
			    final IdentifierDomain id = new IdentifierDomain();
				id.setNamespaceIdentifier(handlePrefixSuffix(query, account.getAssigningAuthority().getNamespaceId()));
				id.setUniversalIdentifier(handlePrefixSuffix(query, account.getAssigningAuthority().getUniversalId()));
				id.setUniversalIdentifierTypeCode(handlePrefixSuffix(query,account.getAssigningAuthority().getUniversalIdType()));
				person.setAccountIdentifierDomain(id);
			}
		}		
		log.trace("Converted object: " + query + " to " + person);		
		return person;
	}
	
	public static Patient getPatient(final Person person) {
		final Patient patient = new Patient();
		patient.setRecordId("" + person.getPersonId());
		patient.setBirthPlace(person.getBirthPlace());
		if (person.getBirthOrder() != null) {
			patient.setBirthOrder(person.getBirthOrder().intValue());
		}
		patient.setDeathIndicator(person.getDeathInd());
		if (person.getNationality() != null) {
			patient.setCitizenship(person.getNationality().getNationalityCode());
		}
		if (person.getLanguage() != null) {
			patient.setPrimaryLanguage(person.getLanguage().getLanguageCode());
		}
		patient.setPatientName(getPersonName(person));
		patient.setSsn(person.getSsn());
		if (person.getGender() != null) {
			SexType sexType = SexType.UNKNOWN;
			try {
				sexType = SexType.getByString(person.getGender().getGenderCode());
			} catch (IllegalArgumentException e) {
			}
			patient.setAdministrativeSex(sexType);
		}
		patient.setBirthDateTime(toCalendar(person.getDateOfBirth()));
		patient.setDeathDate(toCalendar(person.getDeathTime()));
		if (person.getRace() != null) {
			patient.setRace(getPixPdqRaceCode(person.getRace().getRaceCode()));
		}
		if (person.getReligion() != null) {
			patient.setReligion(person.getReligion().getReligionCode());
		}
		patient.setMaritalStatus(person.getMaritalStatusCode());
		if (person.getEthnicGroup() != null) {
			patient.setEthnicGroup(person.getEthnicGroup().getEthnicGroupCode());
		}
		final String mothersMaidenName = person.getMothersMaidenName(), mothersName = person.getMotherName();
		if (mothersMaidenName != null || mothersName != null) {
		    final PersonName maidenName = new PersonName();
			maidenName.setLastName(mothersMaidenName);
			maidenName.setFirstName(mothersName);
//			maidenName.setNameTypeCode(MAIDEN_NAME_NAME_TYPE_CODE);
			maidenName.setNameTypeCode(LEGAL_NAME_NAME_TYPE_CODE);
			patient.setMothersMaidenName(maidenName);			
		}
		if (person.getAccount() != null) {
		    final PatientIdentifier accountIdentifier = new PatientIdentifier();
			accountIdentifier.setId(person.getAccount());
			if (person.getAccountIdentifierDomain() != null) {
				Identifier accountDomain = new Identifier(person.getAccountIdentifierDomain().getNamespaceIdentifier(), 
						person.getAccountIdentifierDomain().getUniversalIdentifier(), person.getAccountIdentifierDomain().getUniversalIdentifierTypeCode());
				accountIdentifier.setAssigningAuthority(accountDomain);
			}
			patient.setPatientAccountNumber(accountIdentifier);
		}
		patient.addAddress(getAddress(person));
		patient.addPhoneNumber(getPhoneNumber(person));
		for (final PersonIdentifier identifier : person.getPersonIdentifiers()) {
			patient.addPatientId(ConversionHelper.getPatientIdentifier(identifier));
		}
		log.trace("Converted object: " + person + " to " + patient);
		return patient;
	}
	
	private static Calendar toCalendar(final Date d) {
	    if (d == null) {
	        return null;
	    }
	    final Calendar c = Calendar.getInstance();
        c.setTime(d);
        return c;
	}

	public static Person getPerson(final Patient patient) {
	    /*
	    For inserts, this output of this pretty much passes directly to the database code.
	    For updates, we read the existing Person and then copy fields from this Person into the original.
	    So PixManagerAdapter.updatePersonAttributes needs to support the same fields as this method.
	    */
	    final Person person = new Person();
		person.setBirthOrder(Integer.valueOf(patient.getBirthOrder()));
		person.setBirthPlace(patient.getBirthPlace());
		person.setDeathInd(patient.getDeathIndicator());
		if (patient.getCitizenship() != null) {
		    final Nationality nationality = new Nationality();
			nationality.setNationalityCode(patient.getCitizenship());
			person.setNationality(nationality);
		}
		person.setLanguage(patient.getPrimaryLanguage());
		populatePersonName(person, patient.getPatientName());
		person.setSsn(patient.getSsn());
		if (patient.getAdministrativeSex() != null) {
		    final Gender gender = new Gender();
			gender.setGenderCode(patient.getAdministrativeSex().getCDAValue());
			person.setGender(gender);
		}
		person.setDateOfBirth(toDate(patient.getBirthDateTime()));
		person.setDeathTime(toDate(patient.getDeathDate()));
		if (patient.getRace() != null) {
		    final Race race = new Race();
			race.setRaceCode(getOpenEmpiRaceCode(patient.getRace()));
			person.setRace(race);
		}
		if (patient.getReligion() != null) {
		    final Religion religion = new Religion();
			religion.setReligionCode(patient.getReligion());
			person.setReligion(religion);
		}
		if (patient.getMaritalStatus() != null) {
			person.setMaritalStatusCode(patient.getMaritalStatus().substring(0,1));
		}
		if (patient.getEthnicGroup() != null) {
		    final EthnicGroup ethnicGroup = new EthnicGroup();
			ethnicGroup.setEthnicGroupCode(patient.getEthnicGroup());
			person.setEthnicGroup(ethnicGroup);
		}
		if (patient.getAddresses() != null && patient.getAddresses().size() > 0) {
		    final Address address = patient.getAddresses().get(0);
			person.setAddress1(address.getAddLine1());
			person.setAddress2(address.getAddLine2());
			person.setCity(address.getAddCity());
			person.setState(address.getAddState());
			person.setPostalCode(address.getAddZip());
			person.setCountry(address.getAddCountry());
		}
		if (patient.getPhoneNumbers() != null && patient.getPhoneNumbers().size() > 0) {
		    final PhoneNumber number = patient.getPhoneNumbers().get(0);
			person.setPhoneAreaCode(number.getAreaCode());
			person.setPhoneCountryCode(number.getCountryCode());
			person.setPhoneNumber(number.getNumber());
			person.setPhoneExt(number.getExtension());
			if (number.getType() != null) {
				person.setPhoneType(getOpenEmpiPhoneType(number.getType()));
			}
		}
		if (patient.getPatientAccountNumber() != null) {
			final PatientIdentifier accountIdentifier = patient.getPatientAccountNumber();
			person.setAccount(accountIdentifier.getId());
			if (accountIdentifier.getAssigningAuthority() != null &
					(accountIdentifier.getAssigningAuthority().getNamespaceId() != null ||
					 accountIdentifier.getAssigningAuthority().getUniversalId() != null ||
					 accountIdentifier.getAssigningAuthority().getUniversalIdType() != null)) {
			    final IdentifierDomain accountDomain = new IdentifierDomain();
				accountDomain.setNamespaceIdentifier(accountIdentifier.getAssigningAuthority().getNamespaceId());
				accountDomain.setUniversalIdentifier(accountIdentifier.getAssigningAuthority().getUniversalId());
				accountDomain.setUniversalIdentifierTypeCode(accountIdentifier.getAssigningAuthority().getUniversalIdType());
				person.setAccountIdentifierDomain(accountDomain);
			}
		}
		final PersonName mothersMaidenName = patient.getMothersMaidenName();
		if (mothersMaidenName != null) {
			person.setMothersMaidenName(mothersMaidenName.getLastName());
			person.setMotherName(mothersMaidenName.getFirstName());
		}
		if (patient.getPatientIds() != null) {
			for (PatientIdentifier pid : patient.getPatientIds()) {
				person.addPersonIdentifier(getPersonIdentifier(pid));
			}
		}
		log.trace("Converted object: " + patient + " to " + person);
		return person;
	}
	
	private static Date toDate(final Calendar c) {
	    if (c == null) {
	        return null;
	    } else if (c instanceof ImpreciseCalendar) {
	        return new ImpreciseDate((ImpreciseCalendar) c);
	    }
	    return c.getTime();
	}

	private static String getOpenEmpiRaceCode(String race) {
		if (race == null || race.length() == 0) {
			return null;
		}
		String openEmpiRaceCode = pixPdqToOpenEmpiRaceCodeMap.get(race);
		if (openEmpiRaceCode == null) {
			openEmpiRaceCode = OPENEMPI_RACE_CODE_OTHER;
		}
		log.trace("Mapped incoming race code " + race + " to " + openEmpiRaceCode);
		return openEmpiRaceCode;
	}

	private static String getPixPdqRaceCode(String raceCode) {
		if (raceCode == null || raceCode.length() == 0) {
			return null;
		}
		String pixPdqRaceCode = openempiToPixPdqRaceCodeMap.get(raceCode);
		log.trace("Mapped local race code " + pixPdqRaceCode + " to " + pixPdqRaceCode);
		return pixPdqRaceCode;
	}
	
	private static void populatePhone(Person person, PhoneNumber phone) {
		if (phone == null) {
			return;
		}
		person.setPhoneAreaCode(phone.getAreaCode());
		person.setPhoneCountryCode(phone.getCountryCode());
		person.setPhoneExt(phone.getExtension());
		person.setPhoneNumber(phone.getNumber());
		if (phone.getType() != null) {
			person.setPhoneType(getOpenEmpiPhoneType(phone.getType()));
		}
	}

	private static PhoneType getOpenEmpiPhoneType(org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType type) {
		PhoneType phoneType = new PhoneType();
		if (type.equals(org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.CELL)) {
			phoneType.setPhoneTypeCode(PHONE_TYPE_CODE_CELL);
		} else if (type.equals(org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.EMERGENCY)) {
			phoneType.setPhoneTypeCode(PHONE_TYPE_CODE_EMERGENCY);
		} else if (type.equals(org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.FAX)) {
			phoneType.setPhoneTypeCode(PHONE_TYPE_CODE_FAX);
		} else if (type.equals(org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.HOME)) {
			phoneType.setPhoneTypeCode(PHONE_TYPE_CODE_HOME);
		} else if (type.equals(org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.PRIMARY_HOME)) {
			phoneType.setPhoneTypeCode(PHONE_TYPE_CODE_PRIMARY_HOME);
		} else if (type.equals(org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.VACATION_HOME)) {
			phoneType.setPhoneTypeCode(PHONE_TYPE_CODE_VACATION_HOME);
		} else if (type.equals(org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.SERVICE)) {
			phoneType.setPhoneTypeCode(PHONE_TYPE_CODE_SERVICE);
		} else if (type.equals(org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.UNKNOWN)) {
			phoneType.setPhoneTypeCode(PHONE_TYPE_CODE_UNKNOWN);
		} else if (type.equals(org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.WORK)) {
			phoneType.setPhoneTypeCode(PHONE_TYPE_CODE_WORK);
		} else {
			log.warn("Unknown OpenPIXPDQ phone type " + type.getHL7Value() + " encountered. Need to update the adapter code.");
			phoneType.setPhoneTypeCode(PHONE_TYPE_CODE_UNKNOWN);
		}
		return phoneType;
	}

	private final static org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType getMisysPhoneType(final PhoneType type) {
	    final String code = (type == null) ? null : type.getPhoneTypeCode();
		if (code == null) {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.UNKNOWN; 
		} else if (code.equalsIgnoreCase(PHONE_TYPE_CODE_CELL)) {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.CELL;
		} else if (code.equalsIgnoreCase(PHONE_TYPE_CODE_EMERGENCY)) {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.EMERGENCY;
		} else if (code.equalsIgnoreCase(PHONE_TYPE_CODE_FAX)) {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.FAX;
		} else if (code.equalsIgnoreCase(PHONE_TYPE_CODE_HOME)) {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.HOME;
		} else if (code.equalsIgnoreCase(PHONE_TYPE_CODE_PRIMARY_HOME)) {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.PRIMARY_HOME;
		} else if (code.equalsIgnoreCase(PHONE_TYPE_CODE_VACATION_HOME)) {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.VACATION_HOME;
		} else if (code.equalsIgnoreCase(PHONE_TYPE_CODE_SERVICE)) {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.SERVICE;
		} else if (code.equalsIgnoreCase(PHONE_TYPE_CODE_UNKNOWN)) {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.UNKNOWN;
		} else if (code.equalsIgnoreCase(PHONE_TYPE_CODE_WORK)) {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.WORK;
		} else {
			return org.openhealthtools.openexchange.datamodel.SharedEnums.PhoneType.UNKNOWN;
		}
	}
	
	private final static PhoneNumber getPhoneNumber(final Person person) {
	    final PhoneNumber number = new PhoneNumber();
		number.setAreaCode(person.getPhoneAreaCode());
		number.setCountryCode(person.getPhoneCountryCode());
		number.setExtension(person.getPhoneExt());
		number.setNumber(person.getPhoneNumber());
		number.setType(getMisysPhoneType(person.getPhoneType()));
		return number;
	}

	public static void populateAddress(Person person, Address address) {
		if (address == null) {
			return;
		}
		person.setAddress1(address.getAddLine1());
		person.setAddress2(address.getAddLine2());
		person.setCity(address.getAddCity());
		person.setState(address.getAddState());
		person.setPostalCode(address.getAddZip());
		person.setCountry(address.getAddCountry());
	}


	private static Address getAddress(Person person) {
		Address address = new Address();
		address.setAddLine1(person.getAddress1());
		address.setAddLine2(person.getAddress2());
		address.setAddCity(person.getCity());
		address.setAddState(person.getState());
		address.setAddZip(person.getPostalCode());
		address.setAddCountry(person.getCountry());
		return address;
	}

	public static PersonIdentifier getPersonIdentifier(org.openhealthtools.openexchange.datamodel.PersonIdentifier personIdentifier) {
		log.trace("Person identifier is: " + personIdentifier.getAssigningAuthority());
		PersonIdentifier pi = new PersonIdentifier();
		pi.setIdentifier(personIdentifier.getId());
		if (personIdentifier.getAssigningAuthority() == null) {
			return pi;
		}
		IdentifierDomain id = new IdentifierDomain();
		id.setNamespaceIdentifier(personIdentifier.getAssigningAuthority().getNamespaceId());
		id.setUniversalIdentifier(personIdentifier.getAssigningAuthority().getUniversalId());
		id.setUniversalIdentifierTypeCode(personIdentifier.getAssigningAuthority().getUniversalIdType());
		pi.setIdentifierDomain(id);
		return pi;
	}


	public static PersonIdentifier getPersonIdentifier(org.openhealthtools.openexchange.datamodel.PersonIdentifier personIdentifier, PdqQuery query) {
		log.trace("Person identifier is: " + personIdentifier.getAssigningAuthority());
		PersonIdentifier pi = new PersonIdentifier();
		pi.setIdentifier(handlePrefixSuffix(query, personIdentifier.getId()));
		if (personIdentifier.getAssigningAuthority() == null) {
			return pi;
		}
		IdentifierDomain id = new IdentifierDomain();
		id.setNamespaceIdentifier(handlePrefixSuffix(query, personIdentifier.getAssigningAuthority().getNamespaceId()));
		id.setUniversalIdentifier(handlePrefixSuffix(query, personIdentifier.getAssigningAuthority().getUniversalId()));
		id.setUniversalIdentifierTypeCode(handlePrefixSuffix(query, personIdentifier.getAssigningAuthority().getUniversalIdType()));
		pi.setIdentifierDomain(id);
		return pi;
	}

	public static PatientIdentifier getPatientIdentifier(PersonIdentifier identifier) {
		Identifier aa = new Identifier(identifier.getIdentifierDomain().getNamespaceIdentifier(),
				identifier.getIdentifierDomain().getUniversalIdentifier(),
				identifier.getIdentifierDomain().getUniversalIdentifierTypeCode());
		return new PatientIdentifier(identifier.getIdentifier(), aa);
	}

	public static void populatePersonName(Person person, PdqQuery query) {
		PersonName from = query.getPersonName();
		if (from == null) {
			return;
		}
		person.setGivenName(handlePrefixSuffix(query, from.getFirstName()));
		person.setFamilyName(handlePrefixSuffix(query, from.getLastName()));
		person.setMiddleName(handlePrefixSuffix(query, from.getSecondName()));
		person.setPrefix(from.getPrefix());
		person.setSuffix(from.getSuffix());
		person.setDegree(from.getDegree());
	}
	
	/**
	 * Replaces prefix and suffix from the OpenPIXPDQ with the default prefix/suffix
	 * character used by OpenEMPI (namely, %). 
	 * 
	 * @param query the PdqQuery
	 * @param from the String
	 * @return the updated String
	 */
	private static String handlePrefixSuffix(PdqQuery query, String from) {
		if (from == null) return null;
		
		String ret = from;
		String prefix = query.getPrefix();
		String suffix = query.getSuffix();
		
		if (prefix != null) {
			if (from.startsWith(prefix)) {
				ret = "%" + ret.substring(prefix.length());
			}
		}
		if (suffix != null) {
			if (from.endsWith(suffix)) {
				ret = ret.substring(0, ret.length()-suffix.length()) + "%";
			}
		}
		return ret;
	}
	
	public static PersonName getPersonName(Person person) {
		PersonName personName = new PersonName();
		personName.setDegree(person.getDegree());
		personName.setFirstName(person.getGivenName());
		personName.setLastName(person.getFamilyName());
		personName.setPrefix(person.getPrefix());
		personName.setSecondName(person.getMiddleName());
		personName.setSuffix(person.getSuffix());
//		if (person.getNameType() != null) {
//			personName.setNameTypeCode(person.getNameType().getNameTypeCode());
//		}
		personName.setNameTypeCode(LEGAL_NAME_NAME_TYPE_CODE);
		return personName;
	}

	public static void populatePersonName(final Person person, final PersonName personName) {
		person.setGivenName(toUpperCase(personName.getFirstName()));
		person.setMiddleName(toUpperCase(personName.getSecondName()));
		person.setFamilyName(toUpperCase(personName.getLastName()));
		person.setPrefix(personName.getPrefix());
		person.setSuffix(personName.getSuffix());
		person.setDegree(personName.getDegree());
		
		if (personName.getNameTypeCode() != null) {
			final NameType nameType = new NameType();
			nameType.setNameTypeCode(personName.getNameTypeCode());
			person.setNameType(nameType);
		}
	}
	
	private final static String toUpperCase(final String s) {
	    return (s == null) ? null : s.toUpperCase();
	}


	public static PatientIdentifier convertPatientIdentifier(PersonIdentifier pid) {
		if (pid == null) {
			return null;
		}
		 
		PatientIdentifier ret = new PatientIdentifier();
		ret.setId(pid.getIdentifier());
		ret.setAssigningAuthority(convertIdentifierDomain(pid.getIdentifierDomain()));
		return ret;
	}


	public static Identifier convertIdentifierDomain(IdentifierDomain identifierDomain) {
		if (identifierDomain == null) {
			return null;
		}
		Identifier ret = new Identifier(identifierDomain.getNamespaceIdentifier(),
				identifierDomain.getUniversalIdentifier(),
				identifierDomain.getUniversalIdentifierTypeCode());
		return ret;
	}
}
