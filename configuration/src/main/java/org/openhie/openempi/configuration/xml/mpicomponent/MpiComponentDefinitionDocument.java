/*
 * An XML document type.
 * Localname: mpi-component-definition
 * Namespace: http://configuration.openempi.openhie.org/mpicomponent
 * Java type: org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.mpicomponent;


/**
 * A document containing one mpi-component-definition(@http://configuration.openempi.openhie.org/mpicomponent) element.
 *
 * This is a complex type.
 */
public interface MpiComponentDefinitionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("mpicomponentdefinition42acdoctype");
    
    /**
     * Gets the "mpi-component-definition" element
     */
    org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument.MpiComponentDefinition getMpiComponentDefinition();
    
    /**
     * Sets the "mpi-component-definition" element
     */
    void setMpiComponentDefinition(org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument.MpiComponentDefinition mpiComponentDefinition);
    
    /**
     * Appends and returns a new empty "mpi-component-definition" element
     */
    org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument.MpiComponentDefinition addNewMpiComponentDefinition();
    
    /**
     * An XML mpi-component-definition(@http://configuration.openempi.openhie.org/mpicomponent).
     *
     * This is a complex type.
     */
    public interface MpiComponentDefinition extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("mpicomponentdefinitione632elemtype");
        
        /**
         * Gets the "mpi-component" element
         */
        org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentType getMpiComponent();
        
        /**
         * Sets the "mpi-component" element
         */
        void setMpiComponent(org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentType mpiComponent);
        
        /**
         * Appends and returns a new empty "mpi-component" element
         */
        org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentType addNewMpiComponent();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument.MpiComponentDefinition newInstance() {
              return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument.MpiComponentDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument.MpiComponentDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument.MpiComponentDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument newInstance() {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.MpiComponentDefinitionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
