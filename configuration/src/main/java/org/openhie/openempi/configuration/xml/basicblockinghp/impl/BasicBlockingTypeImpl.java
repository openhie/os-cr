/*
 * XML Type:  basic-blocking-type
 * Namespace: http://configuration.openempi.openhie.org/basic-blocking-hp
 * Java type: org.openhie.openempi.configuration.xml.basicblockinghp.BasicBlockingType
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.basicblockinghp.impl;
/**
 * An XML basic-blocking-type(@http://configuration.openempi.openhie.org/basic-blocking-hp).
 *
 * This is a complex type.
 */
public class BasicBlockingTypeImpl extends org.openhie.openempi.configuration.xml.impl.BlockingConfigurationTypeImpl implements org.openhie.openempi.configuration.xml.basicblockinghp.BasicBlockingType
{
    
    public BasicBlockingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOCKINGROUNDS$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/basic-blocking-hp", "blocking-rounds");
    private static final javax.xml.namespace.QName MAXIMUMBLOCKSIZE$2 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/basic-blocking-hp", "maximum-block-size");
    private static final javax.xml.namespace.QName ENTITYNAME$4 = 
        new javax.xml.namespace.QName("", "entity-name");
    
    
    /**
     * Gets the "blocking-rounds" element
     */
    public org.openhie.openempi.configuration.xml.basicblockinghp.BlockingRounds getBlockingRounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.basicblockinghp.BlockingRounds target = null;
            target = (org.openhie.openempi.configuration.xml.basicblockinghp.BlockingRounds)get_store().find_element_user(BLOCKINGROUNDS$0, 0);
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
    public void setBlockingRounds(org.openhie.openempi.configuration.xml.basicblockinghp.BlockingRounds blockingRounds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.basicblockinghp.BlockingRounds target = null;
            target = (org.openhie.openempi.configuration.xml.basicblockinghp.BlockingRounds)get_store().find_element_user(BLOCKINGROUNDS$0, 0);
            if (target == null)
            {
                target = (org.openhie.openempi.configuration.xml.basicblockinghp.BlockingRounds)get_store().add_element_user(BLOCKINGROUNDS$0);
            }
            target.set(blockingRounds);
        }
    }
    
    /**
     * Appends and returns a new empty "blocking-rounds" element
     */
    public org.openhie.openempi.configuration.xml.basicblockinghp.BlockingRounds addNewBlockingRounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.basicblockinghp.BlockingRounds target;
            target = (org.openhie.openempi.configuration.xml.basicblockinghp.BlockingRounds)get_store().add_element_user(BLOCKINGROUNDS$0);
            return target;
        }
    }
    
    /**
     * Gets the "maximum-block-size" element
     */
    public int getMaximumBlockSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMBLOCKSIZE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximum-block-size" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaximumBlockSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXIMUMBLOCKSIZE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maximum-block-size" element
     */
    public void setMaximumBlockSize(int maximumBlockSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMBLOCKSIZE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUMBLOCKSIZE$2);
            }
            target.setIntValue(maximumBlockSize);
        }
    }
    
    /**
     * Sets (as xml) the "maximum-block-size" element
     */
    public void xsetMaximumBlockSize(org.apache.xmlbeans.XmlInt maximumBlockSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXIMUMBLOCKSIZE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXIMUMBLOCKSIZE$2);
            }
            target.set(maximumBlockSize);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$4);
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
            return get_store().find_attribute_user(ENTITYNAME$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$4);
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
            get_store().remove_attribute(ENTITYNAME$4);
        }
    }
}
