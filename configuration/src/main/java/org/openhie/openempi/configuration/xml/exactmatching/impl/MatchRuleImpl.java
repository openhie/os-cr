/*
 * XML Type:  match-rule
 * Namespace: http://configuration.openempi.openhie.org/exact-matching
 * Java type: org.openhie.openempi.configuration.xml.exactmatching.MatchRule
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.exactmatching.impl;
/**
 * An XML match-rule(@http://configuration.openempi.openhie.org/exact-matching).
 *
 * This is a complex type.
 */
public class MatchRuleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openhie.openempi.configuration.xml.exactmatching.MatchRule
{
    
    public MatchRuleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATCHFIELDS$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/exact-matching", "match-fields");
    
    
    /**
     * Gets the "match-fields" element
     */
    public org.openhie.openempi.configuration.xml.exactmatching.MatchFields getMatchFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.exactmatching.MatchFields target = null;
            target = (org.openhie.openempi.configuration.xml.exactmatching.MatchFields)get_store().find_element_user(MATCHFIELDS$0, 0);
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
    public void setMatchFields(org.openhie.openempi.configuration.xml.exactmatching.MatchFields matchFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.exactmatching.MatchFields target = null;
            target = (org.openhie.openempi.configuration.xml.exactmatching.MatchFields)get_store().find_element_user(MATCHFIELDS$0, 0);
            if (target == null)
            {
                target = (org.openhie.openempi.configuration.xml.exactmatching.MatchFields)get_store().add_element_user(MATCHFIELDS$0);
            }
            target.set(matchFields);
        }
    }
    
    /**
     * Appends and returns a new empty "match-fields" element
     */
    public org.openhie.openempi.configuration.xml.exactmatching.MatchFields addNewMatchFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.exactmatching.MatchFields target;
            target = (org.openhie.openempi.configuration.xml.exactmatching.MatchFields)get_store().add_element_user(MATCHFIELDS$0);
            return target;
        }
    }
}
