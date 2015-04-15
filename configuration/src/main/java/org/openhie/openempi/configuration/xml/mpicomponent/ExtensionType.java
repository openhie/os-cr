/*
 * XML Type:  extension-type
 * Namespace: http://configuration.openempi.openhie.org/mpicomponent
 * Java type: org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.mpicomponent;


/**
 * An XML extension-type(@http://configuration.openempi.openhie.org/mpicomponent).
 *
 * This is a complex type.
 */
public interface ExtensionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("extensiontype661etype");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "implementation" element
     */
    java.lang.String getImplementation();
    
    /**
     * Gets (as xml) the "implementation" element
     */
    org.apache.xmlbeans.XmlString xgetImplementation();
    
    /**
     * Sets the "implementation" element
     */
    void setImplementation(java.lang.String implementation);
    
    /**
     * Sets (as xml) the "implementation" element
     */
    void xsetImplementation(org.apache.xmlbeans.XmlString implementation);
    
    /**
     * Gets the "interface" attribute
     */
    org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType.Interface.Enum getInterface();
    
    /**
     * Gets (as xml) the "interface" attribute
     */
    org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType.Interface xgetInterface();
    
    /**
     * Sets the "interface" attribute
     */
    void setInterface(org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType.Interface.Enum xinterface);
    
    /**
     * Sets (as xml) the "interface" attribute
     */
    void xsetInterface(org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType.Interface xinterface);
    
    /**
     * An XML interface(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlString.
     */
    public interface Interface extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("interface71bfattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CONFIGURATION_LOADER = Enum.forString("configuration-loader");
        static final Enum CONFIGURATION_GUI = Enum.forString("configuration-gui");
        static final Enum IMPLEMENTATION = Enum.forString("implementation");
        
        static final int INT_CONFIGURATION_LOADER = Enum.INT_CONFIGURATION_LOADER;
        static final int INT_CONFIGURATION_GUI = Enum.INT_CONFIGURATION_GUI;
        static final int INT_IMPLEMENTATION = Enum.INT_IMPLEMENTATION;
        
        /**
         * Enumeration value class for org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType$Interface.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_CONFIGURATION_LOADER
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_CONFIGURATION_LOADER = 1;
            static final int INT_CONFIGURATION_GUI = 2;
            static final int INT_IMPLEMENTATION = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("configuration-loader", INT_CONFIGURATION_LOADER),
                    new Enum("configuration-gui", INT_CONFIGURATION_GUI),
                    new Enum("implementation", INT_IMPLEMENTATION),
                }
            );
            private static final long serialVersionUID = 1L;
            private Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType.Interface newValue(java.lang.Object obj) {
              return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType.Interface) type.newValue( obj ); }
            
            public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType.Interface newInstance() {
              return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType.Interface) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType.Interface newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType.Interface) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType newInstance() {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.mpicomponent.ExtensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
