/*
 * XML Type:  admin-configuration
 * Namespace: http://configuration.openempi.openhie.org/mpiconfig
 * Java type: org.openhie.openempi.configuration.xml.AdminConfiguration
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml;


/**
 * An XML admin-configuration(@http://configuration.openempi.openhie.org/mpiconfig).
 *
 * This is a complex type.
 */
public interface AdminConfiguration extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("adminconfigurationc5fftype");
    
    /**
     * Gets the "file-repository-directory" element
     */
    java.lang.String getFileRepositoryDirectory();
    
    /**
     * Gets (as xml) the "file-repository-directory" element
     */
    org.apache.xmlbeans.XmlString xgetFileRepositoryDirectory();
    
    /**
     * Sets the "file-repository-directory" element
     */
    void setFileRepositoryDirectory(java.lang.String fileRepositoryDirectory);
    
    /**
     * Sets (as xml) the "file-repository-directory" element
     */
    void xsetFileRepositoryDirectory(org.apache.xmlbeans.XmlString fileRepositoryDirectory);
    
    /**
     * Gets the "autostart-pixpdq" element
     */
    boolean getAutostartPixpdq();
    
    /**
     * Gets (as xml) the "autostart-pixpdq" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAutostartPixpdq();
    
    /**
     * Sets the "autostart-pixpdq" element
     */
    void setAutostartPixpdq(boolean autostartPixpdq);
    
    /**
     * Sets (as xml) the "autostart-pixpdq" element
     */
    void xsetAutostartPixpdq(org.apache.xmlbeans.XmlBoolean autostartPixpdq);
    
    /**
     * Gets the "data-directory" element
     */
    java.lang.String getDataDirectory();
    
    /**
     * Gets (as xml) the "data-directory" element
     */
    org.apache.xmlbeans.XmlString xgetDataDirectory();
    
    /**
     * Sets the "data-directory" element
     */
    void setDataDirectory(java.lang.String dataDirectory);
    
    /**
     * Sets (as xml) the "data-directory" element
     */
    void xsetDataDirectory(org.apache.xmlbeans.XmlString dataDirectory);
    
    /**
     * Gets the "update-notification-entries" element
     */
    org.openhie.openempi.configuration.xml.UpdateNotificationEntries getUpdateNotificationEntries();
    
    /**
     * True if has "update-notification-entries" element
     */
    boolean isSetUpdateNotificationEntries();
    
    /**
     * Sets the "update-notification-entries" element
     */
    void setUpdateNotificationEntries(org.openhie.openempi.configuration.xml.UpdateNotificationEntries updateNotificationEntries);
    
    /**
     * Appends and returns a new empty "update-notification-entries" element
     */
    org.openhie.openempi.configuration.xml.UpdateNotificationEntries addNewUpdateNotificationEntries();
    
    /**
     * Unsets the "update-notification-entries" element
     */
    void unsetUpdateNotificationEntries();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.AdminConfiguration newInstance() {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.AdminConfiguration parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.AdminConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
