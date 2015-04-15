/*
 * An XML document type.
 * Localname: shallow-matching
 * Namespace: http://configuration.openempi.openhie.org/shallow-matching
 * Java type: org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingDocument
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.shallowmatching.impl;
/**
 * A document containing one shallow-matching(@http://configuration.openempi.openhie.org/shallow-matching) element.
 *
 * This is a complex type.
 */
public class ShallowMatchingDocumentImpl extends org.openhie.openempi.configuration.xml.impl.ShallowMatchingConfigurationDocumentImpl implements org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingDocument
{
    
    public ShallowMatchingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHALLOWMATCHING$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/shallow-matching", "shallow-matching");
    
    
    /**
     * Gets the "shallow-matching" element
     */
    public org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType getShallowMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType target = null;
            target = (org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType)get_store().find_element_user(SHALLOWMATCHING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "shallow-matching" element
     */
    public void setShallowMatching(org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType shallowMatching)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType target = null;
            target = (org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType)get_store().find_element_user(SHALLOWMATCHING$0, 0);
            if (target == null)
            {
                target = (org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType)get_store().add_element_user(SHALLOWMATCHING$0);
            }
            target.set(shallowMatching);
        }
    }
    
    /**
     * Appends and returns a new empty "shallow-matching" element
     */
    public org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType addNewShallowMatching()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType target;
            target = (org.openhie.openempi.configuration.xml.shallowmatching.ShallowMatchingType)get_store().add_element_user(SHALLOWMATCHING$0);
            return target;
        }
    }
}
