//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 11:16:51 AM EDT 
//


package org.openhie.openempi.configuration.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fields" type="{http://configuration.openempi.openhie.org/fileloadermap}FieldsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="delimeter" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="header-first-line" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="training-data-extractor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="namespace-identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="one-to-many" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="universal-identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fields"
})
@XmlRootElement(name = "file-loader-map")
public class FileLoaderMap {

    @XmlElement(required = true)
    protected FieldsType fields;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String delimeter;
    @XmlAttribute(name = "header-first-line")
    protected Boolean headerFirstLine;
    @XmlAttribute(name = "training-data-extractor")
    protected String trainingDataExtractor;
    @XmlAttribute(name = "namespace-identifier")
    protected String namespaceIdentifier;
    @XmlAttribute(name = "one-to-many")
    protected Boolean oneToMany;
    @XmlAttribute(name = "universal-identifier")
    protected String universalIdentifier;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link FieldsType }
     *     
     */
    public FieldsType getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldsType }
     *     
     */
    public void setFields(FieldsType value) {
        this.fields = value;
    }

    /**
     * Gets the value of the delimeter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimeter() {
        return delimeter;
    }

    /**
     * Sets the value of the delimeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimeter(String value) {
        this.delimeter = value;
    }

    /**
     * Gets the value of the headerFirstLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeaderFirstLine() {
        return headerFirstLine;
    }

    /**
     * Sets the value of the headerFirstLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeaderFirstLine(Boolean value) {
        this.headerFirstLine = value;
    }

    /**
     * Gets the value of the trainingDataExtractor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainingDataExtractor() {
        return trainingDataExtractor;
    }

    /**
     * Sets the value of the trainingDataExtractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainingDataExtractor(String value) {
        this.trainingDataExtractor = value;
    }

    /**
     * Gets the value of the namespaceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceIdentifier() {
        return namespaceIdentifier;
    }

    /**
     * Sets the value of the namespaceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceIdentifier(String value) {
        this.namespaceIdentifier = value;
    }

    /**
     * Gets the value of the oneToMany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOneToMany() {
        if (oneToMany == null) {
            return false;
        } else {
            return oneToMany;
        }
    }

    /**
     * Sets the value of the oneToMany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneToMany(Boolean value) {
        this.oneToMany = value;
    }

    /**
     * Gets the value of the universalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalIdentifier() {
        return universalIdentifier;
    }

    /**
     * Sets the value of the universalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalIdentifier(String value) {
        this.universalIdentifier = value;
    }

}
