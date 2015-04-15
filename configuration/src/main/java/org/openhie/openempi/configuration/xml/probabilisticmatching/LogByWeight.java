/*
 * XML Type:  log-by-weight
 * Namespace: http://configuration.openempi.openhie.org/probabilistic-matching
 * Java type: org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.probabilisticmatching;


/**
 * An XML log-by-weight(@http://configuration.openempi.openhie.org/probabilistic-matching).
 *
 * This is a complex type.
 */
public interface LogByWeight extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("logbyweight99dbtype");
    
    /**
     * Gets the "weight-lower-bound" element
     */
    double getWeightLowerBound();
    
    /**
     * Gets (as xml) the "weight-lower-bound" element
     */
    org.apache.xmlbeans.XmlDouble xgetWeightLowerBound();
    
    /**
     * Sets the "weight-lower-bound" element
     */
    void setWeightLowerBound(double weightLowerBound);
    
    /**
     * Sets (as xml) the "weight-lower-bound" element
     */
    void xsetWeightLowerBound(org.apache.xmlbeans.XmlDouble weightLowerBound);
    
    /**
     * Gets the "weight-upper-bound" element
     */
    double getWeightUpperBound();
    
    /**
     * Gets (as xml) the "weight-upper-bound" element
     */
    org.apache.xmlbeans.XmlDouble xgetWeightUpperBound();
    
    /**
     * Sets the "weight-upper-bound" element
     */
    void setWeightUpperBound(double weightUpperBound);
    
    /**
     * Sets (as xml) the "weight-upper-bound" element
     */
    void xsetWeightUpperBound(org.apache.xmlbeans.XmlDouble weightUpperBound);
    
    /**
     * Gets the "sample-size-percentage" element
     */
    double getSampleSizePercentage();
    
    /**
     * Gets (as xml) the "sample-size-percentage" element
     */
    org.apache.xmlbeans.XmlDouble xgetSampleSizePercentage();
    
    /**
     * Sets the "sample-size-percentage" element
     */
    void setSampleSizePercentage(double sampleSizePercentage);
    
    /**
     * Sets (as xml) the "sample-size-percentage" element
     */
    void xsetSampleSizePercentage(org.apache.xmlbeans.XmlDouble sampleSizePercentage);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight newInstance() {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.LogByWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
