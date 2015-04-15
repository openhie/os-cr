/*
 * XML Type:  basic-blocking-type
 * Namespace: http://configuration.openempi.openhie.org/basic-blocking
 * Java type: org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.basicblocking.impl;
/**
 * An XML basic-blocking-type(@http://configuration.openempi.openhie.org/basic-blocking).
 *
 * This is a complex type.
 */
public class BasicBlockingTypeImpl extends org.openhie.openempi.configuration.xml.impl.BlockingConfigurationTypeImpl implements org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType
{
    
    public BasicBlockingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOCKINGROUNDS$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/basic-blocking", "blocking-rounds");
    private static final javax.xml.namespace.QName ENTITYNAME$2 = 
        new javax.xml.namespace.QName("", "entity-name");
    
    
    /**
     * Gets the "blocking-rounds" element
     */
    public org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds getBlockingRounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds target = null;
            target = (org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds)get_store().find_element_user(BLOCKINGROUNDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "blocking-rounds" element
     */
    public void setBlockingRounds(org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds blockingRounds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds target = null;
            target = (org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds)get_store().find_element_user(BLOCKINGROUNDS$0, 0);
            if (target == null)
            {
                target = (org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds)get_store().add_element_user(BLOCKINGROUNDS$0);
            }
            target.set(blockingRounds);
        }
    }
    
    /**
     * Appends and returns a new empty "blocking-rounds" element
     */
    public org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds addNewBlockingRounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds target;
            target = (org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds)get_store().add_element_user(BLOCKINGROUNDS$0);
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
