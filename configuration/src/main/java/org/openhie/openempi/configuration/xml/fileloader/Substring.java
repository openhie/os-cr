/*
 * XML Type:  substring
 * Namespace: http://configuration.openempi.openhie.org/file-loader
 * Java type: org.openhie.openempi.configuration.xml.fileloader.Substring
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.fileloader;


/**
 * An XML substring(@http://configuration.openempi.openhie.org/file-loader).
 *
 * This is a complex type.
 */
public interface Substring extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("substring6f34type");
    
    /**
     * Gets the "target-field-name" element
     */
    java.lang.String getTargetFieldName();
    
    /**
     * Gets (as xml) the "target-field-name" element
     */
    org.apache.xmlbeans.XmlString xgetTargetFieldName();
    
    /**
     * Sets the "target-field-name" element
     */
    void setTargetFieldName(java.lang.String targetFieldName);
    
    /**
     * Sets (as xml) the "target-field-name" element
     */
    void xsetTargetFieldName(org.apache.xmlbeans.XmlString targetFieldName);
    
    /**
     * Gets the "begin-index" element
     */
    int getBeginIndex();
    
    /**
     * Gets (as xml) the "begin-index" element
     */
    org.apache.xmlbeans.XmlInt xgetBeginIndex();
    
    /**
     * Sets the "begin-index" element
     */
    void setBeginIndex(int beginIndex);
    
    /**
     * Sets (as xml) the "begin-index" element
     */
    void xsetBeginIndex(org.apache.xmlbeans.XmlInt beginIndex);
    
    /**
     * Gets the "end-index" element
     */
    int getEndIndex();
    
    /**
     * Gets (as xml) the "end-index" element
     */
    org.apache.xmlbeans.XmlInt xgetEndIndex();
    
    /**
     * Sets the "end-index" element
     */
    void setEndIndex(int endIndex);
    
    /**
     * Sets (as xml) the "end-index" element
     */
    void xsetEndIndex(org.apache.xmlbeans.XmlInt endIndex);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.fileloader.Substring newInstance() {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.Substring parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.fileloader.Substring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
