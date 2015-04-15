/*
 * An XML document type.
 * Localname: mpi-config
 * Namespace: http://configuration.openempi.openhie.org/mpiconfig
 * Java type: org.openhie.openempi.configuration.xml.MpiConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml;


/**
 * A document containing one mpi-config(@http://configuration.openempi.openhie.org/mpiconfig) element.
 *
 * This is a complex type.
 */
public interface MpiConfigDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("mpiconfigf192doctype");
    
    /**
     * Gets the "mpi-config" element
     */
    org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig getMpiConfig();
    
    /**
     * Sets the "mpi-config" element
     */
    void setMpiConfig(org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig mpiConfig);
    
    /**
     * Appends and returns a new empty "mpi-config" element
     */
    org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig addNewMpiConfig();
    
    /**
     * An XML mpi-config(@http://configuration.openempi.openhie.org/mpiconfig).
     *
     * This is a complex type.
     */
    public interface MpiConfig extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("mpiconfigabcdelemtype");
        
        /**
         * Gets the "global-identifier" element
         */
        org.openhie.openempi.configuration.xml.GlobalIdentifier getGlobalIdentifier();
        
        /**
         * True if has "global-identifier" element
         */
        boolean isSetGlobalIdentifier();
        
        /**
         * Sets the "global-identifier" element
         */
        void setGlobalIdentifier(org.openhie.openempi.configuration.xml.GlobalIdentifier globalIdentifier);
        
        /**
         * Appends and returns a new empty "global-identifier" element
         */
        org.openhie.openempi.configuration.xml.GlobalIdentifier addNewGlobalIdentifier();
        
        /**
         * Unsets the "global-identifier" element
         */
        void unsetGlobalIdentifier();
        
        /**
         * Gets the "scheduled-tasks" element
         */
        org.openhie.openempi.configuration.xml.ScheduledTasks getScheduledTasks();
        
        /**
         * True if has "scheduled-tasks" element
         */
        boolean isSetScheduledTasks();
        
        /**
         * Sets the "scheduled-tasks" element
         */
        void setScheduledTasks(org.openhie.openempi.configuration.xml.ScheduledTasks scheduledTasks);
        
        /**
         * Appends and returns a new empty "scheduled-tasks" element
         */
        org.openhie.openempi.configuration.xml.ScheduledTasks addNewScheduledTasks();
        
        /**
         * Unsets the "scheduled-tasks" element
         */
        void unsetScheduledTasks();
        
        /**
         * Gets array of all "blocking-configuration" elements
         */
        org.openhie.openempi.configuration.xml.BlockingConfigurationType[] getBlockingConfigurationArray();
        
        /**
         * Gets ith "blocking-configuration" element
         */
        org.openhie.openempi.configuration.xml.BlockingConfigurationType getBlockingConfigurationArray(int i);
        
        /**
         * Returns number of "blocking-configuration" element
         */
        int sizeOfBlockingConfigurationArray();
        
        /**
         * Sets array of all "blocking-configuration" element
         */
        void setBlockingConfigurationArray(org.openhie.openempi.configuration.xml.BlockingConfigurationType[] blockingConfigurationArray);
        
        /**
         * Sets ith "blocking-configuration" element
         */
        void setBlockingConfigurationArray(int i, org.openhie.openempi.configuration.xml.BlockingConfigurationType blockingConfiguration);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "blocking-configuration" element
         */
        org.openhie.openempi.configuration.xml.BlockingConfigurationType insertNewBlockingConfiguration(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "blocking-configuration" element
         */
        org.openhie.openempi.configuration.xml.BlockingConfigurationType addNewBlockingConfiguration();
        
        /**
         * Removes the ith "blocking-configuration" element
         */
        void removeBlockingConfiguration(int i);
        
        /**
         * Gets array of all "matching-configuration" elements
         */
        org.openhie.openempi.configuration.xml.MatchingConfigurationType[] getMatchingConfigurationArray();
        
        /**
         * Gets ith "matching-configuration" element
         */
        org.openhie.openempi.configuration.xml.MatchingConfigurationType getMatchingConfigurationArray(int i);
        
        /**
         * Returns number of "matching-configuration" element
         */
        int sizeOfMatchingConfigurationArray();
        
        /**
         * Sets array of all "matching-configuration" element
         */
        void setMatchingConfigurationArray(org.openhie.openempi.configuration.xml.MatchingConfigurationType[] matchingConfigurationArray);
        
        /**
         * Sets ith "matching-configuration" element
         */
        void setMatchingConfigurationArray(int i, org.openhie.openempi.configuration.xml.MatchingConfigurationType matchingConfiguration);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "matching-configuration" element
         */
        org.openhie.openempi.configuration.xml.MatchingConfigurationType insertNewMatchingConfiguration(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "matching-configuration" element
         */
        org.openhie.openempi.configuration.xml.MatchingConfigurationType addNewMatchingConfiguration();
        
        /**
         * Removes the ith "matching-configuration" element
         */
        void removeMatchingConfiguration(int i);
        
        /**
         * Gets array of all "shallow-matching-configuration" elements
         */
        org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType[] getShallowMatchingConfigurationArray();
        
        /**
         * Gets ith "shallow-matching-configuration" element
         */
        org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType getShallowMatchingConfigurationArray(int i);
        
        /**
         * Returns number of "shallow-matching-configuration" element
         */
        int sizeOfShallowMatchingConfigurationArray();
        
        /**
         * Sets array of all "shallow-matching-configuration" element
         */
        void setShallowMatchingConfigurationArray(org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType[] shallowMatchingConfigurationArray);
        
        /**
         * Sets ith "shallow-matching-configuration" element
         */
        void setShallowMatchingConfigurationArray(int i, org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType shallowMatchingConfiguration);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shallow-matching-configuration" element
         */
        org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType insertNewShallowMatchingConfiguration(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shallow-matching-configuration" element
         */
        org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType addNewShallowMatchingConfiguration();
        
        /**
         * Removes the ith "shallow-matching-configuration" element
         */
        void removeShallowMatchingConfiguration(int i);
        
        /**
         * Gets array of all "single-best-record" elements
         */
        org.openhie.openempi.configuration.xml.SingleBestRecordType[] getSingleBestRecordArray();
        
        /**
         * Gets ith "single-best-record" element
         */
        org.openhie.openempi.configuration.xml.SingleBestRecordType getSingleBestRecordArray(int i);
        
        /**
         * Returns number of "single-best-record" element
         */
        int sizeOfSingleBestRecordArray();
        
        /**
         * Sets array of all "single-best-record" element
         */
        void setSingleBestRecordArray(org.openhie.openempi.configuration.xml.SingleBestRecordType[] singleBestRecordArray);
        
        /**
         * Sets ith "single-best-record" element
         */
        void setSingleBestRecordArray(int i, org.openhie.openempi.configuration.xml.SingleBestRecordType singleBestRecord);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "single-best-record" element
         */
        org.openhie.openempi.configuration.xml.SingleBestRecordType insertNewSingleBestRecord(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "single-best-record" element
         */
        org.openhie.openempi.configuration.xml.SingleBestRecordType addNewSingleBestRecord();
        
        /**
         * Removes the ith "single-best-record" element
         */
        void removeSingleBestRecord(int i);
        
        /**
         * Gets the "admin-configuration" element
         */
        org.openhie.openempi.configuration.xml.AdminConfiguration getAdminConfiguration();
        
        /**
         * Sets the "admin-configuration" element
         */
        void setAdminConfiguration(org.openhie.openempi.configuration.xml.AdminConfiguration adminConfiguration);
        
        /**
         * Appends and returns a new empty "admin-configuration" element
         */
        org.openhie.openempi.configuration.xml.AdminConfiguration addNewAdminConfiguration();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig newInstance() {
              return (org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument newInstance() {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.MpiConfigDocument parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.MpiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
