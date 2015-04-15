/*
 * An XML document type.
 * Localname: probabilistic-matching
 * Namespace: http://configuration.openempi.openhie.org/probabilistic-matching
 * Java type: org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.probabilisticmatching;


/**
 * A document containing one probabilistic-matching(@http://configuration.openempi.openhie.org/probabilistic-matching) element.
 *
 * This is a complex type.
 */
public interface ProbabilisticMatchingDocument extends org.openhie.openempi.configuration.xml.MatchingConfigurationDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("probabilisticmatching009fdoctype");
    
    /**
     * Gets the "probabilistic-matching" element
     */
    org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType getProbabilisticMatching();
    
    /**
     * Sets the "probabilistic-matching" element
     */
    void setProbabilisticMatching(org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType probabilisticMatching);
    
    /**
     * Appends and returns a new empty "probabilistic-matching" element
     */
    org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType addNewProbabilisticMatching();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument newInstance() {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
