/*
 * XML Type:  single-best-record-type
 * Namespace: http://configuration.openempi.openhie.org/single-best-record
 * Java type: org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.singlebestrecord;


/**
 * An XML single-best-record-type(@http://configuration.openempi.openhie.org/single-best-record).
 *
 * This is a complex type.
 */
public interface SingleBestRecordType extends org.openhie.openempi.configuration.xml.SingleBestRecordType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("singlebestrecordtype7124type");
    
    /**
     * Gets the "implementation-name" element
     */
    java.lang.String getImplementationName();
    
    /**
     * Gets (as xml) the "implementation-name" element
     */
    org.apache.xmlbeans.XmlString xgetImplementationName();
    
    /**
     * Sets the "implementation-name" element
     */
    void setImplementationName(java.lang.String implementationName);
    
    /**
     * Sets (as xml) the "implementation-name" element
     */
    void xsetImplementationName(org.apache.xmlbeans.XmlString implementationName);
    
    /**
     * Gets the "implementation-description" element
     */
    java.lang.String getImplementationDescription();
    
    /**
     * Gets (as xml) the "implementation-description" element
     */
    org.apache.xmlbeans.XmlString xgetImplementationDescription();
    
    /**
     * Sets the "implementation-description" element
     */
    void setImplementationDescription(java.lang.String implementationDescription);
    
    /**
     * Sets (as xml) the "implementation-description" element
     */
    void xsetImplementationDescription(org.apache.xmlbeans.XmlString implementationDescription);
    
    /**
     * Gets the "ruleset" element
     */
    org.openhie.openempi.configuration.xml.singlebestrecord.Ruleset getRuleset();
    
    /**
     * Sets the "ruleset" element
     */
    void setRuleset(org.openhie.openempi.configuration.xml.singlebestrecord.Ruleset ruleset);
    
    /**
     * Appends and returns a new empty "ruleset" element
     */
    org.openhie.openempi.configuration.xml.singlebestrecord.Ruleset addNewRuleset();
    
    /**
     * Gets the "entity-name" attribute
     */
    java.lang.String getEntityName();
    
    /**
     * Gets (as xml) the "entity-name" attribute
     */
    org.apache.xmlbeans.XmlString xgetEntityName();
    
    /**
     * True if has "entity-name" attribute
     */
    boolean isSetEntityName();
    
    /**
     * Sets the "entity-name" attribute
     */
    void setEntityName(java.lang.String entityName);
    
    /**
     * Sets (as xml) the "entity-name" attribute
     */
    void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
    
    /**
     * Unsets the "entity-name" attribute
     */
    void unsetEntityName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType newInstance() {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
