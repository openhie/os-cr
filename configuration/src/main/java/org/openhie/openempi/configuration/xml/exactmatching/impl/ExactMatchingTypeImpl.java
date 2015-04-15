/*
 * XML Type:  exact-matching-type
 * Namespace: http://configuration.openempi.openhie.org/exact-matching
 * Java type: org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingType
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.exactmatching.impl;
/**
 * An XML exact-matching-type(@http://configuration.openempi.openhie.org/exact-matching).
 *
 * This is a complex type.
 */
public class ExactMatchingTypeImpl extends org.openhie.openempi.configuration.xml.impl.MatchingConfigurationTypeImpl implements org.openhie.openempi.configuration.xml.exactmatching.ExactMatchingType
{
    
    public ExactMatchingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATCHRULES$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/exact-matching", "match-rules");
    private static final javax.xml.namespace.QName ENTITYNAME$2 = 
        new javax.xml.namespace.QName("", "entity-name");
    
    
    /**
     * Gets the "match-rules" element
     */
    public org.openhie.openempi.configuration.xml.exactmatching.MatchRules getMatchRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.exactmatching.MatchRules target = null;
            target = (org.openhie.openempi.configuration.xml.exactmatching.MatchRules)get_store().find_element_user(MATCHRULES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "match-rules" element
     */
    public void setMatchRules(org.openhie.openempi.configuration.xml.exactmatching.MatchRules matchRules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.exactmatching.MatchRules target = null;
            target = (org.openhie.openempi.configuration.xml.exactmatching.MatchRules)get_store().find_element_user(MATCHRULES$0, 0);
            if (target == null)
            {
                target = (org.openhie.openempi.configuration.xml.exactmatching.MatchRules)get_store().add_element_user(MATCHRULES$0);
            }
            target.set(matchRules);
        }
    }
    
    /**
     * Appends and returns a new empty "match-rules" element
     */
    public org.openhie.openempi.configuration.xml.exactmatching.MatchRules addNewMatchRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.exactmatching.MatchRules target;
            target = (org.openhie.openempi.configuration.xml.exactmatching.MatchRules)get_store().add_element_user(MATCHRULES$0);
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
