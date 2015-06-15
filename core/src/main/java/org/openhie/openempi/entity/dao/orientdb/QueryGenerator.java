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
package org.openhie.openempi.entity.dao.orientdb;

import java.util.Calendar;
import java.util.Map;
import java.util.List;

import org.apache.log4j.Logger;
import org.openhealthtools.openpixpdq.impl.v2.ImpreciseCalendar;
import org.openhie.openempi.entity.Constants;
import org.openhie.openempi.model.AttributeDatatype;
import org.openhie.openempi.model.Entity;
import org.openhie.openempi.model.EntityAttribute;
import org.openhie.openempi.model.Identifier;
import org.openhie.openempi.model.ImpreciseDate;
import org.openhie.openempi.model.LinkSource;
import org.openhie.openempi.model.Record;
import org.openhie.openempi.model.RecordLinkState;

public class QueryGenerator
{
	private static final String DATE_FORMAT_STRING = "'%1$tY-%1$tm-%1$td'";
	private static final String DATETIME_FORMAT_STRING = "'%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS'";
	private static Logger log = Logger.getLogger(QueryGenerator.class);

	public static String generateQueryFromRecordIds(Entity entity, int clusterId,  List<Integer> recordIds) {
		
		StringBuffer query = new StringBuffer("select from " + entity.getName() + " where dateVoided is null and @rid in ");
		boolean start = true;
		for (Integer recordId : recordIds) {			
			 if(start ) {
			    query.append("[");
			    start = false;
			 } else {
				query.append(",");
			 }
			 query.append("#")
			.append(clusterId)
			.append(":")
			.append(recordId);	
		}
		 query.append("]");
		
		if (log.isDebugEnabled()) {
			log.debug("Generated query: " + query.toString());
		}
		return query.toString();
	}	
	
	public static String generateQueryFromRecord(Entity entity, Record record, Map<String, Object> params, int firstResult, int maxResults) {
		StringBuffer query = new StringBuffer("select from " + entity.getName() + " where dateVoided is null");
		
		for (String property : record.getPropertyNames()) {
			if (record.get(property) == null) {
				continue;
			}
			EntityAttribute attrib = entity.findAttributeByName(property);
			if (attrib == null) {
				log.error("This should not occur; a query record has property " + property + " that is not defined in the entity: " + entity.getName());
				continue;
			}
			addCriterionToQuery(attrib, record.get(property), query, params);
		}
		addPagingModifiersToQuery(firstResult, maxResults, query);

		if (log.isDebugEnabled()) {
			log.debug("Generated query: " + query.toString());
		}
		return query.toString();
	}

	public static String generateCountQueryFromRecordLinks(RecordLinkState state) {
		StringBuffer query = new StringBuffer("select count(*) from recordLink");
		if (state != null) {
			query.append(" where state = '").append(state.getState().toString()).append("'");
		}
		
		if (log.isDebugEnabled()) {
			log.debug("Generated query: " + query.toString());
		}
		return query.toString();
	}	
	
	public static String generateQueryForRecordLinks(RecordLinkState state, int firstResult, int maxResults) {
		StringBuffer query = new StringBuffer("select from recordLink");
		if (state != null) {
			query.append(" where state = '").append(state.getState().toString()).append("'");
		}
		addPagingModifiersToQuery(firstResult, maxResults, query);

		if (log.isDebugEnabled()) {
			log.debug("Generated query: " + query.toString());
		}
		return query.toString();
	}

	public static String generateQueryForRecordLink(String recordLinkId) {
		StringBuffer query = new StringBuffer("select from " + recordLinkId);
		return query.toString();
	}

	public static String generateQueryForRecordLink(LinkSource linkSource, RecordLinkState state) {
		StringBuffer query = new StringBuffer("select from recordLink where source = " + linkSource.getLinkSourceId());
		if (state != null) {
			query.append(" and state = '" + state.getState() + "'");
		}
		return query.toString();
	}

	public static String generateQueryForRecordLinks(Entity entity, String recordId) {
	    // select from (traverse bothe() from 11:3077) where source = 3 and @class = 'recordLink';
		StringBuffer query = new StringBuffer("select from (traverse * from ");
        query.append(recordId)
            .append(") where @class = '")
            .append(Constants.RECORD_LINK_TYPE)
            .append("' and state = 'M'");
		return query.toString();
	}

	public static String generateQueryForRecordLinks(Entity entity, String recordId, RecordLinkState state) {
        StringBuffer query = new StringBuffer("select from (traverse * from ");
        query.append(recordId)
            .append(") where @class = '")
            .append(Constants.RECORD_LINK_TYPE)
            .append("'");
        if (state != null) {
            query.append(" and state = '").append(state.getState()).append("'");
        }
        return query.toString();
    }

	private static void addPagingModifiersToQuery(int firstResult, int maxResults, StringBuffer query) {
		// Add paging modifiers
		if (firstResult > 0) {
			query.append(" skip " + firstResult);
		}
		if (maxResults > 0) {
			query.append(" limit " + maxResults);
		}
	}	

	public static String generateCountQueryFromRecord(Entity entity, Record record,  Map<String, Object> params) {
		StringBuffer query = new StringBuffer("select count(*) from " + entity.getName() + " where dateVoided is null");
		
		for (String property : record.getPropertyNames()) {
			if (record.get(property) == null) {
				continue;
			}
			EntityAttribute attrib = entity.findAttributeByName(property);
			if (attrib == null) {
				log.error("This should not occur; a query record has property " + property + " that is not defined in the entity: " + entity.getName());
				continue;
			}
			addCriterionToQuery(attrib, record.get(property), query, params);
		}

		if (log.isDebugEnabled()) {
			log.debug("Generated query: " + query.toString());
		}
		return query.toString();
	}	

	public static String generateCountQueryFromRecord(Entity entity, Identifier identifier, Map<String, Object> params) {
	    StringBuffer query = new StringBuffer("select from identifier where dateVoided is null ");
	
		if (identifier.getIdentifier() != null) {
			String value = identifier.getIdentifier();
			query.append(" and ").append(Constants.IDENTIFIER_PROPERTY)
				.append(" ")
				.append(chooseWhereClauseOperator(value))
				.append(" ")
				.append(":").append(Constants.IDENTIFIER_PROPERTY);
                params.put(Constants.IDENTIFIER_PROPERTY, value);
		}
		if (identifier.getIdentifierDomain() != null ) {
				Integer integerValue = identifier.getIdentifierDomain().getIdentifierDomainId();
				if( integerValue != null ) {
					query.append(" and ").append(Constants.IDENTIFIER_DOMAIN_ID_PROPERTY)
					.append(" ")
					.append('=')
					.append(" ")
					.append(":").append(Constants.IDENTIFIER_DOMAIN_ID_PROPERTY);
                    params.put(Constants.IDENTIFIER_DOMAIN_ID_PROPERTY, integerValue);
				}
		}
		
		
		if (log.isDebugEnabled()) {
			log.debug("Generated query: " + query.toString());
		}
		return query.toString();
	}	
	
	public static String generateRecordIdQuery(Entity entity) {
		String query = "select @rid from " + entity.getName() + " where dateVoided is null";
		return query;
	}

	public static String generateLoadQueryFromRecordId(String rid) {
		String query = "select from " + rid + " where dateVoided is null";
		return query;
	}
	
	public static String generateRecordQueryByIdentifier(Entity entity, Identifier identifier, Map<String, Object> params) {
		StringBuffer query = new StringBuffer("select from identifier where dateVoided is null ");
		if (identifier.getIdentifier() != null) {
			String value = identifier.getIdentifier();
			query.append(" and ").append(Constants.IDENTIFIER_PROPERTY)
				.append(" ")
				.append(chooseWhereClauseOperator(value))
				.append(" ")
				.append(":").append(Constants.IDENTIFIER_PROPERTY);
                params.put(Constants.IDENTIFIER_PROPERTY, value);
		}
		if (identifier.getIdentifierDomain() != null ) {
			Integer value = identifier.getIdentifierDomain().getIdentifierDomainId();
			if( value != null ) {
				query.append(" and ").append(Constants.IDENTIFIER_DOMAIN_ID_PROPERTY)
				    .append(" ")
				 	.append('=')
				 	.append(" ")
				 	.append(":").append(Constants.IDENTIFIER_DOMAIN_ID_PROPERTY);
	                params.put(Constants.IDENTIFIER_DOMAIN_ID_PROPERTY, value);
			}
		}

		if (log.isDebugEnabled()) {
			log.debug("Generated query: " + query.toString());
		}
		return query.toString();
	}

	public static String generateRecordQueryPaged(Entity entity, int firstResult, int maxResults) {
		StringBuffer query = new StringBuffer("select from " + entity.getName() + " where dateVoided is null");
		addPagingModifiersToQuery(firstResult, maxResults, query);

		if (log.isDebugEnabled()) {
			log.debug("Generated query: " + query.toString());
		}
		return query.toString();
	}
	
	public static String generateDirtyRecordQueryPaged(Entity entity, int maxResults) {
	    StringBuffer query = new StringBuffer("select from " + entity.getName() + 
	            " where dateVoided is null and _dirty = true");
	    addPagingModifiersToQuery(0, maxResults, query);

	    if (log.isDebugEnabled()) {
	        log.debug("Generated query: " + query.toString());
	    }
	    return query.toString();
	}

	public static String generateRecordQueryByIdentifier(Entity entity, Identifier identifier, Map<String, Object> params, int firstResult, int maxResults) {
		StringBuffer query = new StringBuffer("select from identifier where dateVoided is null ");
		if (identifier.getIdentifier() != null) {			
			String value = identifier.getIdentifier();
			query.append(" and ").append(Constants.IDENTIFIER_PROPERTY)
				.append(" ")
				.append(chooseWhereClauseOperator(value))
				.append(" ")
				.append(":").append(Constants.IDENTIFIER_PROPERTY);
                params.put(Constants.IDENTIFIER_PROPERTY, value);
		 }

		if (identifier.getIdentifierDomain() != null ) {
				Integer integerValue = identifier.getIdentifierDomain().getIdentifierDomainId();
				if( integerValue != null ) {
					query.append(" and ")
					.append(Constants.IDENTIFIER_DOMAIN_ID_PROPERTY)
					.append(" ")
					.append('=')
					.append(" ")
					.append(":").append(Constants.IDENTIFIER_DOMAIN_ID_PROPERTY);
                    params.put(Constants.IDENTIFIER_DOMAIN_ID_PROPERTY, integerValue);
				}
		}
		
		addPagingModifiersToQuery(firstResult, maxResults, query);

		if (log.isDebugEnabled()) {
			log.debug("Generated query: " + query.toString());
		}
		return query.toString();
	}

    public static String generateRecordQueryNotInIdentifierDomain(Entity entity, Integer identifierDomainId,
            boolean hasLinks, Map<String, Object> params, int firstResult, int maxResults) {
        StringBuffer query = new StringBuffer("select from ");
        query.append(entity.getName()).append(" let $id = ")
            .append(Constants.IDENTIFIER_OUT_PROPERTY)
            .append(" where dateVoided is null ");
        if (identifierDomainId != null ) {
            query
                .append(" and ($id.size() = 0 or $id.in.identifierDomainId not contains ")
                .append(identifierDomainId)
                .append(") ");
        }

        if (hasLinks) {
            query.append(" and ").append(Constants.VERTEX_IN_PROPERTY).append(" is not null");
        } else {
            query.append(" and ").append(Constants.VERTEX_IN_PROPERTY).append(" is null");
        }
        
        addPagingModifiersToQuery(firstResult, maxResults, query);

        if (log.isDebugEnabled()) {
            log.debug("Generated query: " + query.toString());
        }
        return query.toString();
    }
	
	public static String generateQueryFromRecord(Entity entity, Record record, Map<String, Object> params) {
		return generateQueryFromRecord(entity, record, params, 0, -1);
	}

	private static void addCriterionToQuery(EntityAttribute attrib, Object value, StringBuffer query, Map<String, Object> params) {
		query.append(" and ");
		final AttributeDatatype type = AttributeDatatype.getById(attrib.getDatatype().getDatatypeCd().intValue());
		final String name = attrib.getName();
		switch (type) {
			case BOOLEAN:
			case INTEGER:
			case LONG:
			case SHORT:
			case DOUBLE:
			case FLOAT:
				query.append(name).append(" = :").append(name);
                params.put(name, value);
				break;
			case DATE:
			case TIMESTAMP:
			    String fs = (type == AttributeDatatype.DATE) ? DATE_FORMAT_STRING : DATETIME_FORMAT_STRING;
			    if (value instanceof ImpreciseDate) {
			        addDateCriterionToQuery(name, name + "Start", value, query, params, fs, ">=");
			        query.append(" and ");
			        final ImpreciseCalendar c = ((ImpreciseDate) value).getCalendar();
			        final int p = c.getPrecision(), field;
			        if (p == 4) {
			            field = ImpreciseCalendar.YEAR;
			        } else if (p == 6) {
			            field = ImpreciseCalendar.MONTH;
			        } else {
			            throw new IllegalArgumentException("Unexpected precision " + p);
			        }
			        c.add(field, 1);
			        addDateCriterionToQuery(name, name + "End", c.getTime(), query, params, fs, "<");
			        c.add(field, -1);
			    } else {
			        final String s = value.toString(), suffix;
			        final int len = s.length(), field;
			        if (len == 4) {
			            suffix = "-01-01";
			            field = ImpreciseCalendar.YEAR;
			        } else if (len == 7) {
			            suffix = "-01";
			            field = ImpreciseCalendar.MONTH;
			        } else {
			            suffix = null;
			            field = -1;
			        }
			        if (suffix != null) {
			            fs = DATE_FORMAT_STRING;
			            final String full = s + suffix;
			            addDateCriterionToQuery(name, name + "Start", full, query, params, fs, ">=");
			            query.append(" and ");
			            final Calendar c = Calendar.getInstance();
			            c.set(Calendar.YEAR, parseInt(full, 0, 4));
			            c.set(Calendar.MONTH, parseInt(full, 5, 7) - 1);
			            c.set(Calendar.DATE, parseInt(full, 8, 10));
			            c.add(field, 1);
			            final String end = "" + c.get(Calendar.YEAR) + "-" + to2Digit(c.get(Calendar.MONTH) + 1) + "-" + to2Digit(c.get(Calendar.DATE));
			            addDateCriterionToQuery(name, name + "End", end, query, params, fs, "<");
			        } else {
			            addDateCriterionToQuery(name, name, value, query, params, fs, chooseWhereClauseOperator(value));
			        }
			    }
				break;
			case STRING:
				query.append(name).append(" ").append(chooseWhereClauseOperator(value)).append(" :").append(name);
                params.put(name, value);
				break;
		}
	}
	
	private final static int parseInt(final String s, final int start, final int end) {
	    int n = 0;
	    for (int i = start; i < end; i++) {
	        n = (n * 10) + (s.charAt(i) - '0');
	    }
	    return n;
	}
	
	private final static String to2Digit(final int i) {
	    return (i < 10) ? ("0" + i) : Integer.toString(i);
	}
	
	private static void addDateCriterionToQuery(final String name, final String pName, final Object value, final StringBuffer query, final Map<String, Object> params, final String fs, final String op) {
	    query.append("format(").append(fs).append(",").append(name).append(") ").append(op).append(" :").append(pName);
        params.put(pName, value);
	}

	private static String chooseWhereClauseOperator(final Object value) {
		final String strValue = value.toString();
		if (strValue.indexOf('%') >= 0 || strValue.indexOf('_') >= 0) {
			return "like";
		}
		return "=";
	}
}
