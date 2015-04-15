/*
 * XML Type:  match-rules
 * Namespace: http://configuration.openempi.openhie.org/exact-matching
 * Java type: org.openhie.openempi.configuration.xml.exactmatching.MatchRules
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.exactmatching.impl;
/**
 * An XML match-rules(@http://configuration.openempi.openhie.org/exact-matching).
 *
 * This is a complex type.
 */
public class MatchRulesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openhie.openempi.configuration.xml.exactmatching.MatchRules
{
    
    public MatchRulesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATCHRULE$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/exact-matching", "match-rule");
    
    
    /**
     * Gets array of all "match-rule" elements
     */
    public org.openhie.openempi.configuration.xml.exactmatching.MatchRule[] getMatchRuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MATCHRULE$0, targetList);
            org.openhie.openempi.configuration.xml.exactmatching.MatchRule[] result = new org.openhie.openempi.configuration.xml.exactmatching.MatchRule[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "match-rule" element
     */
    public org.openhie.openempi.configuration.xml.exactmatching.MatchRule getMatchRuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.exactmatching.MatchRule target = null;
            target = (org.openhie.openempi.configuration.xml.exactmatching.MatchRule)get_store().find_element_user(MATCHRULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "match-rule" element
     */
    public int sizeOfMatchRuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATCHRULE$0);
        }
    }
    
    /**
     * Sets array of all "match-rule" element
     */
    public void setMatchRuleArray(org.openhie.openempi.configuration.xml.exactmatching.MatchRule[] matchRuleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(matchRuleArray, MATCHRULE$0);
        }
    }
    
    /**
     * Sets ith "match-rule" element
     */
    public void setMatchRuleArray(int i, org.openhie.openempi.configuration.xml.exactmatching.MatchRule matchRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.exactmatching.MatchRule target = null;
            target = (org.openhie.openempi.configuration.xml.exactmatching.MatchRule)get_store().find_element_user(MATCHRULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(matchRule);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "match-rule" element
     */
    public org.openhie.openempi.configuration.xml.exactmatching.MatchRule insertNewMatchRule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.exactmatching.MatchRule target;
            target = (org.openhie.openempi.configuration.xml.exactmatching.MatchRule)get_store().insert_element_user(MATCHRULE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "match-rule" element
     */
    public org.openhie.openempi.configuration.xml.exactmatching.MatchRule addNewMatchRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.exactmatching.MatchRule target;
            target = (org.openhie.openempi.configuration.xml.exactmatching.MatchRule)get_store().add_element_user(MATCHRULE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "match-rule" element
     */
    public void removeMatchRule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATCHRULE$0, i);
        }
    }
}
