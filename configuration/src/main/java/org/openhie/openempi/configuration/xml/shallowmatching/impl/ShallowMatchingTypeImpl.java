/*
 * XML Type:  shallow-matching-type
 * Namespace: http://configuration.openempi.openhie.org/shallow-matching
 * Java type: org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.shallowmatching.impl;
/**
 * An XML shallow-matching-type(@http://configuration.openempi.openhie.org/shallow-matching).
 *
 * This is a complex type.
 */
public class ShallowMatchingTypeImpl extends org.openhie.openempi.configuration.xml.impl.ShallowMatchingConfigurationTypeImpl implements org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType
{
    
    public ShallowMatchingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATCHFIELDS$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/shallow-matching", "match-fields");
    private static final javax.xml.namespace.QName ENTITYNAME$2 = 
        new javax.xml.namespace.QName("", "entity-name");
    
    
    /**
     * Gets the "match-fields" element
     */
    public org.openhie.openempi.configuration.xml.shallowmatching.MatchFields getMatchFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.shallowmatching.MatchFields target = null;
            target = (org.openhie.openempi.configuration.xml.shallowmatching.MatchFields)get_store().find_element_user(MATCHFIELDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "match-fields" element
     */
    public void setMatchFields(org.openhie.openempi.configuration.xml.shallowmatching.MatchFields matchFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.shallowmatching.MatchFields target = null;
            target = (org.openhie.openempi.configuration.xml.shallowmatching.MatchFields)get_store().find_element_user(MATCHFIELDS$0, 0);
            if (target == null)
            {
                target = (org.openhie.openempi.configuration.xml.shallowmatching.MatchFields)get_store().add_element_user(MATCHFIELDS$0);
            }
            target.set(matchFields);
        }
    }
    
    /**
     * Appends and returns a new empty "match-fields" element
     */
    public org.openhie.openempi.configuration.xml.shallowmatching.MatchFields addNewMatchFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.shallowmatching.MatchFields target;
            target = (org.openhie.openempi.configuration.xml.shallowmatching.MatchFields)get_store().add_element_user(MATCHFIELDS$0);
            return target;
        }
    }
    
    /**
     * Gets the "entity-name" attribute
     */
    public java.lang.String getEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entity-name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "entity-name" attribute
     */
    public boolean isSetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENTITYNAME$2) != null;
        }
    }
    
    /**
     * Sets the "entity-name" attribute
     */
    public void setEntityName(java.lang.String entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$2);
            }
            target.setStringValue(entityName);
        }
    }
    
    /**
     * Sets (as xml) the "entity-name" attribute
     */
    public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$2);
            }
            target.set(entityName);
        }
    }
    
    /**
     * Unsets the "entity-name" attribute
     */
    public void unsetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENTITYNAME$2);
        }
    }
}
