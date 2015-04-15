/*
 * An XML document type.
 * Localname: shallow-matching-configuration
 * Namespace: http://configuration.openempi.openhie.org/mpiconfig
 * Java type: org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.impl;
/**
 * A document containing one shallow-matching-configuration(@http://configuration.openempi.openhie.org/mpiconfig) element.
 *
 * This is a complex type.
 */
public class ShallowMatchingConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationDocument
{
    
    public ShallowMatchingConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHALLOWMATCHINGCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "shallow-matching-configuration");
    private static final org.apache.xmlbeans.QNameSet SHALLOWMATCHINGCONFIGURATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "shallow-matching-configuration"),
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/shallow-matching", "shallow-matching"),
    });
    
    
    /**
     * Gets the "shallow-matching-configuration" element
     */
    public org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType getShallowMatchingConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType target = null;
            target = (org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType)get_store().find_element_user(SHALLOWMATCHINGCONFIGURATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "shallow-matching-configuration" element
     */
    public void setShallowMatchingConfiguration(org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType shallowMatchingConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType target = null;
            target = (org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType)get_store().find_element_user(SHALLOWMATCHINGCONFIGURATION$1, 0);
            if (target == null)
            {
                target = (org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType)get_store().add_element_user(SHALLOWMATCHINGCONFIGURATION$0);
            }
            target.set(shallowMatchingConfiguration);
        }
    }
    
    /**
     * Appends and returns a new empty "shallow-matching-configuration" element
     */
    public org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType addNewShallowMatchingConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType target;
            target = (org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType)get_store().add_element_user(SHALLOWMATCHINGCONFIGURATION$0);
            return target;
        }
    }
}
