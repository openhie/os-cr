/*
 * An XML document type.
 * Localname: mpi-config
 * Namespace: http://configuration.openempi.openhie.org/mpiconfig
 * Java type: org.openhie.openempi.configuration.xml.MpiConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.impl;
/**
 * A document containing one mpi-config(@http://configuration.openempi.openhie.org/mpiconfig) element.
 *
 * This is a complex type.
 */
public class MpiConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openhie.openempi.configuration.xml.MpiConfigDocument
{
    
    public MpiConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MPICONFIG$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "mpi-config");
    
    
    /**
     * Gets the "mpi-config" element
     */
    public org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig getMpiConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig target = null;
            target = (org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig)get_store().find_element_user(MPICONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mpi-config" element
     */
    public void setMpiConfig(org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig mpiConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig target = null;
            target = (org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig)get_store().find_element_user(MPICONFIG$0, 0);
            if (target == null)
            {
                target = (org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig)get_store().add_element_user(MPICONFIG$0);
            }
            target.set(mpiConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "mpi-config" element
     */
    public org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig addNewMpiConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig target;
            target = (org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig)get_store().add_element_user(MPICONFIG$0);
            return target;
        }
    }
    /**
     * An XML mpi-config(@http://configuration.openempi.openhie.org/mpiconfig).
     *
     * This is a complex type.
     */
    public static class MpiConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openhie.openempi.configuration.xml.MpiConfigDocument.MpiConfig
    {
        
        public MpiConfigImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GLOBALIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "global-identifier");
        private static final javax.xml.namespace.QName SCHEDULEDTASKS$2 = 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "scheduled-tasks");
        private static final javax.xml.namespace.QName BLOCKINGCONFIGURATION$4 = 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "blocking-configuration");
        private static final org.apache.xmlbeans.QNameSet BLOCKINGCONFIGURATION$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "blocking-configuration"),
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/basic-blocking", "basic-blocking"),
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/suffix-array-blocking", "suffix-array-blocking"),
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/basic-blocking-hp", "basic-blocking"),
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/sorted-neighborhood-blocking", "sorted-neighborhood-blocking"),
        });
        private static final javax.xml.namespace.QName MATCHINGCONFIGURATION$6 = 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "matching-configuration");
        private static final org.apache.xmlbeans.QNameSet MATCHINGCONFIGURATION$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/probabilistic-matching", "probabilistic-matching"),
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/exact-matching", "exact-matching"),
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "matching-configuration"),
        });
        private static final javax.xml.namespace.QName SHALLOWMATCHINGCONFIGURATION$8 = 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "shallow-matching-configuration");
        private static final org.apache.xmlbeans.QNameSet SHALLOWMATCHINGCONFIGURATION$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "shallow-matching-configuration"),
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/shallow-matching", "shallow-matching"),
        });
        private static final javax.xml.namespace.QName SINGLEBESTRECORD$10 = 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "single-best-record");
        private static final org.apache.xmlbeans.QNameSet SINGLEBESTRECORD$11 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/single-best-record", "single-best-record"),
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "single-best-record"),
        });
        private static final javax.xml.namespace.QName ADMINCONFIGURATION$12 = 
            new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/mpiconfig", "admin-configuration");
        
        
        /**
         * Gets the "global-identifier" element
         */
        public org.openhie.openempi.configuration.xml.GlobalIdentifier getGlobalIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.GlobalIdentifier target = null;
                target = (org.openhie.openempi.configuration.xml.GlobalIdentifier)get_store().find_element_user(GLOBALIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "global-identifier" element
         */
        public boolean isSetGlobalIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GLOBALIDENTIFIER$0) != 0;
            }
        }
        
        /**
         * Sets the "global-identifier" element
         */
        public void setGlobalIdentifier(org.openhie.openempi.configuration.xml.GlobalIdentifier globalIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.GlobalIdentifier target = null;
                target = (org.openhie.openempi.configuration.xml.GlobalIdentifier)get_store().find_element_user(GLOBALIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.openhie.openempi.configuration.xml.GlobalIdentifier)get_store().add_element_user(GLOBALIDENTIFIER$0);
                }
                target.set(globalIdentifier);
            }
        }
        
        /**
         * Appends and returns a new empty "global-identifier" element
         */
        public org.openhie.openempi.configuration.xml.GlobalIdentifier addNewGlobalIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.GlobalIdentifier target;
                target = (org.openhie.openempi.configuration.xml.GlobalIdentifier)get_store().add_element_user(GLOBALIDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Unsets the "global-identifier" element
         */
        public void unsetGlobalIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GLOBALIDENTIFIER$0, 0);
            }
        }
        
        /**
         * Gets the "scheduled-tasks" element
         */
        public org.openhie.openempi.configuration.xml.ScheduledTasks getScheduledTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.ScheduledTasks target = null;
                target = (org.openhie.openempi.configuration.xml.ScheduledTasks)get_store().find_element_user(SCHEDULEDTASKS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "scheduled-tasks" element
         */
        public boolean isSetScheduledTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCHEDULEDTASKS$2) != 0;
            }
        }
        
        /**
         * Sets the "scheduled-tasks" element
         */
        public void setScheduledTasks(org.openhie.openempi.configuration.xml.ScheduledTasks scheduledTasks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.ScheduledTasks target = null;
                target = (org.openhie.openempi.configuration.xml.ScheduledTasks)get_store().find_element_user(SCHEDULEDTASKS$2, 0);
                if (target == null)
                {
                    target = (org.openhie.openempi.configuration.xml.ScheduledTasks)get_store().add_element_user(SCHEDULEDTASKS$2);
                }
                target.set(scheduledTasks);
            }
        }
        
        /**
         * Appends and returns a new empty "scheduled-tasks" element
         */
        public org.openhie.openempi.configuration.xml.ScheduledTasks addNewScheduledTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.ScheduledTasks target;
                target = (org.openhie.openempi.configuration.xml.ScheduledTasks)get_store().add_element_user(SCHEDULEDTASKS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "scheduled-tasks" element
         */
        public void unsetScheduledTasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCHEDULEDTASKS$2, 0);
            }
        }
        
        /**
         * Gets array of all "blocking-configuration" elements
         */
        public org.openhie.openempi.configuration.xml.BlockingConfigurationType[] getBlockingConfigurationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BLOCKINGCONFIGURATION$5, targetList);
                org.openhie.openempi.configuration.xml.BlockingConfigurationType[] result = new org.openhie.openempi.configuration.xml.BlockingConfigurationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "blocking-configuration" element
         */
        public org.openhie.openempi.configuration.xml.BlockingConfigurationType getBlockingConfigurationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.BlockingConfigurationType target = null;
                target = (org.openhie.openempi.configuration.xml.BlockingConfigurationType)get_store().find_element_user(BLOCKINGCONFIGURATION$5, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "blocking-configuration" element
         */
        public int sizeOfBlockingConfigurationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BLOCKINGCONFIGURATION$5);
            }
        }
        
        /**
         * Sets array of all "blocking-configuration" element
         */
        public void setBlockingConfigurationArray(org.openhie.openempi.configuration.xml.BlockingConfigurationType[] blockingConfigurationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(blockingConfigurationArray, BLOCKINGCONFIGURATION$4, BLOCKINGCONFIGURATION$5);
            }
        }
        
        /**
         * Sets ith "blocking-configuration" element
         */
        public void setBlockingConfigurationArray(int i, org.openhie.openempi.configuration.xml.BlockingConfigurationType blockingConfiguration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.BlockingConfigurationType target = null;
                target = (org.openhie.openempi.configuration.xml.BlockingConfigurationType)get_store().find_element_user(BLOCKINGCONFIGURATION$5, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(blockingConfiguration);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "blocking-configuration" element
         */
        public org.openhie.openempi.configuration.xml.BlockingConfigurationType insertNewBlockingConfiguration(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.BlockingConfigurationType target;
                target = (org.openhie.openempi.configuration.xml.BlockingConfigurationType)get_store().insert_element_user(BLOCKINGCONFIGURATION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "blocking-configuration" element
         */
        public org.openhie.openempi.configuration.xml.BlockingConfigurationType addNewBlockingConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.BlockingConfigurationType target;
                target = (org.openhie.openempi.configuration.xml.BlockingConfigurationType)get_store().add_element_user(BLOCKINGCONFIGURATION$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "blocking-configuration" element
         */
        public void removeBlockingConfiguration(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BLOCKINGCONFIGURATION$5, i);
            }
        }
        
        /**
         * Gets array of all "matching-configuration" elements
         */
        public org.openhie.openempi.configuration.xml.MatchingConfigurationType[] getMatchingConfigurationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MATCHINGCONFIGURATION$7, targetList);
                org.openhie.openempi.configuration.xml.MatchingConfigurationType[] result = new org.openhie.openempi.configuration.xml.MatchingConfigurationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "matching-configuration" element
         */
        public org.openhie.openempi.configuration.xml.MatchingConfigurationType getMatchingConfigurationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.MatchingConfigurationType target = null;
                target = (org.openhie.openempi.configuration.xml.MatchingConfigurationType)get_store().find_element_user(MATCHINGCONFIGURATION$7, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "matching-configuration" element
         */
        public int sizeOfMatchingConfigurationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MATCHINGCONFIGURATION$7);
            }
        }
        
        /**
         * Sets array of all "matching-configuration" element
         */
        public void setMatchingConfigurationArray(org.openhie.openempi.configuration.xml.MatchingConfigurationType[] matchingConfigurationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(matchingConfigurationArray, MATCHINGCONFIGURATION$6, MATCHINGCONFIGURATION$7);
            }
        }
        
        /**
         * Sets ith "matching-configuration" element
         */
        public void setMatchingConfigurationArray(int i, org.openhie.openempi.configuration.xml.MatchingConfigurationType matchingConfiguration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.MatchingConfigurationType target = null;
                target = (org.openhie.openempi.configuration.xml.MatchingConfigurationType)get_store().find_element_user(MATCHINGCONFIGURATION$7, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(matchingConfiguration);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "matching-configuration" element
         */
        public org.openhie.openempi.configuration.xml.MatchingConfigurationType insertNewMatchingConfiguration(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.MatchingConfigurationType target;
                target = (org.openhie.openempi.configuration.xml.MatchingConfigurationType)get_store().insert_element_user(MATCHINGCONFIGURATION$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "matching-configuration" element
         */
        public org.openhie.openempi.configuration.xml.MatchingConfigurationType addNewMatchingConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.MatchingConfigurationType target;
                target = (org.openhie.openempi.configuration.xml.MatchingConfigurationType)get_store().add_element_user(MATCHINGCONFIGURATION$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "matching-configuration" element
         */
        public void removeMatchingConfiguration(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MATCHINGCONFIGURATION$7, i);
            }
        }
        
        /**
         * Gets array of all "shallow-matching-configuration" elements
         */
        public org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType[] getShallowMatchingConfigurationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SHALLOWMATCHINGCONFIGURATION$9, targetList);
                org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType[] result = new org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "shallow-matching-configuration" element
         */
        public org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType getShallowMatchingConfigurationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType target = null;
                target = (org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType)get_store().find_element_user(SHALLOWMATCHINGCONFIGURATION$9, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "shallow-matching-configuration" element
         */
        public int sizeOfShallowMatchingConfigurationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHALLOWMATCHINGCONFIGURATION$9);
            }
        }
        
        /**
         * Sets array of all "shallow-matching-configuration" element
         */
        public void setShallowMatchingConfigurationArray(org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType[] shallowMatchingConfigurationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(shallowMatchingConfigurationArray, SHALLOWMATCHINGCONFIGURATION$8, SHALLOWMATCHINGCONFIGURATION$9);
            }
        }
        
        /**
         * Sets ith "shallow-matching-configuration" element
         */
        public void setShallowMatchingConfigurationArray(int i, org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType shallowMatchingConfiguration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType target = null;
                target = (org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType)get_store().find_element_user(SHALLOWMATCHINGCONFIGURATION$9, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(shallowMatchingConfiguration);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shallow-matching-configuration" element
         */
        public org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType insertNewShallowMatchingConfiguration(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType target;
                target = (org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType)get_store().insert_element_user(SHALLOWMATCHINGCONFIGURATION$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shallow-matching-configuration" element
         */
        public org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType addNewShallowMatchingConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType target;
                target = (org.openhie.openempi.configuration.xml.ShallowMatchingConfigurationType)get_store().add_element_user(SHALLOWMATCHINGCONFIGURATION$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "shallow-matching-configuration" element
         */
        public void removeShallowMatchingConfiguration(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHALLOWMATCHINGCONFIGURATION$9, i);
            }
        }
        
        /**
         * Gets array of all "single-best-record" elements
         */
        public org.openhie.openempi.configuration.xml.SingleBestRecordType[] getSingleBestRecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SINGLEBESTRECORD$11, targetList);
                org.openhie.openempi.configuration.xml.SingleBestRecordType[] result = new org.openhie.openempi.configuration.xml.SingleBestRecordType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "single-best-record" element
         */
        public org.openhie.openempi.configuration.xml.SingleBestRecordType getSingleBestRecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.SingleBestRecordType target = null;
                target = (org.openhie.openempi.configuration.xml.SingleBestRecordType)get_store().find_element_user(SINGLEBESTRECORD$11, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "single-best-record" element
         */
        public int sizeOfSingleBestRecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SINGLEBESTRECORD$11);
            }
        }
        
        /**
         * Sets array of all "single-best-record" element
         */
        public void setSingleBestRecordArray(org.openhie.openempi.configuration.xml.SingleBestRecordType[] singleBestRecordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(singleBestRecordArray, SINGLEBESTRECORD$10, SINGLEBESTRECORD$11);
            }
        }
        
        /**
         * Sets ith "single-best-record" element
         */
        public void setSingleBestRecordArray(int i, org.openhie.openempi.configuration.xml.SingleBestRecordType singleBestRecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.SingleBestRecordType target = null;
                target = (org.openhie.openempi.configuration.xml.SingleBestRecordType)get_store().find_element_user(SINGLEBESTRECORD$11, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(singleBestRecord);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "single-best-record" element
         */
        public org.openhie.openempi.configuration.xml.SingleBestRecordType insertNewSingleBestRecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.SingleBestRecordType target;
                target = (org.openhie.openempi.configuration.xml.SingleBestRecordType)get_store().insert_element_user(SINGLEBESTRECORD$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "single-best-record" element
         */
        public org.openhie.openempi.configuration.xml.SingleBestRecordType addNewSingleBestRecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.SingleBestRecordType target;
                target = (org.openhie.openempi.configuration.xml.SingleBestRecordType)get_store().add_element_user(SINGLEBESTRECORD$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "single-best-record" element
         */
        public void removeSingleBestRecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SINGLEBESTRECORD$11, i);
            }
        }
        
        /**
         * Gets the "admin-configuration" element
         */
        public org.openhie.openempi.configuration.xml.AdminConfiguration getAdminConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.AdminConfiguration target = null;
                target = (org.openhie.openempi.configuration.xml.AdminConfiguration)get_store().find_element_user(ADMINCONFIGURATION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "admin-configuration" element
         */
        public void setAdminConfiguration(org.openhie.openempi.configuration.xml.AdminConfiguration adminConfiguration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.AdminConfiguration target = null;
                target = (org.openhie.openempi.configuration.xml.AdminConfiguration)get_store().find_element_user(ADMINCONFIGURATION$12, 0);
                if (target == null)
                {
                    target = (org.openhie.openempi.configuration.xml.AdminConfiguration)get_store().add_element_user(ADMINCONFIGURATION$12);
                }
                target.set(adminConfiguration);
            }
        }
        
        /**
         * Appends and returns a new empty "admin-configuration" element
         */
        public org.openhie.openempi.configuration.xml.AdminConfiguration addNewAdminConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openhie.openempi.configuration.xml.AdminConfiguration target;
                target = (org.openhie.openempi.configuration.xml.AdminConfiguration)get_store().add_element_user(ADMINCONFIGURATION$12);
                return target;
            }
        }
    }
}
