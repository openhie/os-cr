/*
 * XML Type:  blocking-fields
 * Namespace: http://configuration.openempi.openhie.org/suffix-array-blocking
 * Java type: org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.suffixarrayblocking.impl;
/**
 * An XML blocking-fields(@http://configuration.openempi.openhie.org/suffix-array-blocking).
 *
 * This is a complex type.
 */
public class BlockingFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields
{
    
    public BlockingFieldsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOCKINGFIELD$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/suffix-array-blocking", "blocking-field");
    
    
    /**
     * Gets array of all "blocking-field" elements
     */
    public org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField[] getBlockingFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BLOCKINGFIELD$0, targetList);
            org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField[] result = new org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "blocking-field" element
     */
    public org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField getBlockingFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField target = null;
            target = (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField)get_store().find_element_user(BLOCKINGFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "blocking-field" element
     */
    public int sizeOfBlockingFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOCKINGFIELD$0);
        }
    }
    
    /**
     * Sets array of all "blocking-field" element
     */
    public void setBlockingFieldArray(org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField[] blockingFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(blockingFieldArray, BLOCKINGFIELD$0);
        }
    }
    
    /**
     * Sets ith "blocking-field" element
     */
    public void setBlockingFieldArray(int i, org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField blockingField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField target = null;
            target = (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField)get_store().find_element_user(BLOCKINGFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(blockingField);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blocking-field" element
     */
    public org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField insertNewBlockingField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField target;
            target = (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField)get_store().insert_element_user(BLOCKINGFIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blocking-field" element
     */
    public org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField addNewBlockingField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField target;
            target = (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField)get_store().add_element_user(BLOCKINGFIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "blocking-field" element
     */
    public void removeBlockingField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOCKINGFIELD$0, i);
        }
    }
}
