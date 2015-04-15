/*
 * XML Type:  basic-blocking-type
 * Namespace: http://configuration.openempi.openhie.org/basic-blocking
 * Java type: org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.basicblocking;


/**
 * An XML basic-blocking-type(@http://configuration.openempi.openhie.org/basic-blocking).
 *
 * This is a complex type.
 */
public interface BasicBlockingType extends org.openhie.openempi.configuration.xml.BlockingConfigurationType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("basicblockingtypeca22type");
    
    /**
     * Gets the "blocking-rounds" element
     */
    org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds getBlockingRounds();
    
    /**
     * Sets the "blocking-rounds" element
     */
    void setBlockingRounds(org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds blockingRounds);
    
    /**
     * Appends and returns a new empty "blocking-rounds" element
     */
    org.openhie.openempi.configuration.xml.basicblocking.BlockingRounds addNewBlockingRounds();
    
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
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType newInstance() {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.basicblocking.BasicBlockingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
