/*
 * XML Type:  match-field
 * Namespace: http://configuration.openempi.openhie.org/shallow-matching
 * Java type: org.openhie.openempi.configuration.xml.shallowmatching.MatchField
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.shallowmatching;


/**
 * An XML match-field(@http://configuration.openempi.openhie.org/shallow-matching).
 *
 * This is a complex type.
 */
public interface MatchField extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("matchfield7c65type");
    
    /**
     * Gets the "field-name" element
     */
    java.lang.String getFieldName();
    
    /**
     * Gets (as xml) the "field-name" element
     */
    org.apache.xmlbeans.XmlString xgetFieldName();
    
    /**
     * Sets the "field-name" element
     */
    void setFieldName(java.lang.String fieldName);
    
    /**
     * Sets (as xml) the "field-name" element
     */
    void xsetFieldName(org.apache.xmlbeans.XmlString fieldName);
    
    /**
     * Gets the "comparator-function" element
     */
    org.openhie.openempi.configuration.xml.ComparatorFunction getComparatorFunction();
    
    /**
     * True if has "comparator-function" element
     */
    boolean isSetComparatorFunction();
    
    /**
     * Sets the "comparator-function" element
     */
    void setComparatorFunction(org.openhie.openempi.configuration.xml.ComparatorFunction comparatorFunction);
    
    /**
     * Appends and returns a new empty "comparator-function" element
     */
    org.openhie.openempi.configuration.xml.ComparatorFunction addNewComparatorFunction();
    
    /**
     * Unsets the "comparator-function" element
     */
    void unsetComparatorFunction();
    
    /**
     * Gets the "match-threshold" element
     */
    float getMatchThreshold();
    
    /**
     * Gets (as xml) the "match-threshold" element
     */
    org.apache.xmlbeans.XmlFloat xgetMatchThreshold();
    
    /**
     * True if has "match-threshold" element
     */
    boolean isSetMatchThreshold();
    
    /**
     * Sets the "match-threshold" element
     */
    void setMatchThreshold(float matchThreshold);
    
    /**
     * Sets (as xml) the "match-threshold" element
     */
    void xsetMatchThreshold(org.apache.xmlbeans.XmlFloat matchThreshold);
    
    /**
     * Unsets the "match-threshold" element
     */
    void unsetMatchThreshold();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField newInstance() {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.shallowmatching.MatchField parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.shallowmatching.MatchField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
