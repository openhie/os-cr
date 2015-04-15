X xjc -p org.openhie.openempi.configuration.xml.basicblocking -d java resources\basic-blocking.xsd

*****

C:\Users\am202\Documents\git\playground\ohie\openempi\configuration\src\main>"c:\Program Files\Java\jdk1.6.0_35\bin\xjc.exe" -p org.openhie.openempi.configuration.xml.singlebestrecord -d java resources\single-best-record.xsd
parsing a schema...
compiling a schema...
[ERROR] A class/interface with the same name "org.openhie.openempi.configuration.xml.singlebestrecord.SingleBestRecordType" is already in use. Use a class custo
mization to resolve this conflict.
  line 33 of file:/C:/Users/am202/Documents/git/playground/ohie/openempi/configuration/src/main/resources/single-best-record.xsd

[ERROR] (Relevant to above error) another "SingleBestRecordType" is generated from here.
  line 109 of file:/C:/Users/am202/Documents/git/playground/ohie/openempi/configuration/src/main/resources/mpi-config.xsd

[ERROR] Two declarations cause a collision in the ObjectFactory class.
  line 33 of file:/C:/Users/am202/Documents/git/playground/ohie/openempi/configuration/src/main/resources/single-best-record.xsd

[ERROR] (Related to above error) This is the other declaration.
  line 109 of file:/C:/Users/am202/Documents/git/playground/ohie/openempi/configuration/src/main/resources/mpi-config.xsd

[ERROR] Two declarations cause a collision in the ObjectFactory class.
  line 111 of file:/C:/Users/am202/Documents/git/playground/ohie/openempi/configuration/src/main/resources/mpi-config.xsd

[ERROR] (Related to above error) This is the other declaration.
  line 32 of file:/C:/Users/am202/Documents/git/playground/ohie/openempi/configuration/src/main/resources/single-best-record.xsd

Failed to produce code.

*****

C:\Users\am202\Documents\git\playground\ohie\openempi\configuration\src\main>java -classpath c:\app\xmlbeans-1.0.0\lib\xbean.jar org.apache.xmlbeans.impl.tool.SchemaCompiler -src java -srconly resources\single-best-record.xsd resources\.xsdconfig

*****

C:\Users\am202\Documents\git\playground\ohie\openempi\configuration\src\main>java -classpath c:\app\xmlbeans-1.0.0\lib\xbean.jar org.apache.xmlbeans.impl.tool.SchemaCompiler -src java -srconly resources resources\.xsdconfig
Time to build schema type system: 0.702 seconds
Time to generate code: 1.186 seconds

X C:\Users\am202\Documents\git\playground\ohie\openempi\configuration\src\main>java -classpath c:\app\xmlbeans-1.0.0\lib\xbean.jar org.apache.xmlbeans.impl.tool.SchemaCompiler -src java -srconly schemas resources\.xsdconfig
X Time to build schema type system: 0.485 seconds
X Time to generate code: 0.306 seconds
Wrong package

X C:\Users\am202\Documents\git\playground\ohie\openempi\configuration\src\main>java -classpath c:\app\xmlbeans-1.0.0\lib\xbean.jar org.apache.xmlbeans.impl.tool.SchemaCompiler -src java -srconly resources\entity-model.xsd resources\.xsdconfig
X Time to build schema type system: 0.468 seconds
X Time to generate code: 0.234 seconds
Created interface where class was expected

C:\Users\am202\Documents\git\playground\ohie\openempi\configuration\src\main>"c:\Program Files\Java\jdk1.6.0_35\bin\xjc.exe" -p org.openhie.openempi.configurati
on.xml.model -d java schemas\entity-model.xsd
parsing a schema...
compiling a schema...
org\openhie\openempi\configuration\xml\model\AttributeType.java
org\openhie\openempi\configuration\xml\model\AttributesType.java
org\openhie\openempi\configuration\xml\model\EntityModel.java
org\openhie\openempi\configuration\xml\model\GroupType.java
org\openhie\openempi\configuration\xml\model\GroupsType.java
org\openhie\openempi\configuration\xml\model\ObjectFactory.java
org\openhie\openempi\configuration\xml\model\ValidationParameterType.java
org\openhie\openempi\configuration\xml\model\ValidationParametersType.java
org\openhie\openempi\configuration\xml\model\ValidationType.java
org\openhie\openempi\configuration\xml\model\ValidationsType.java
org\openhie\openempi\configuration\xml\model\package-info.java

C:\Users\am202\Documents\git\playground\ohie\openempi\configuration\src\main>"c:\Program Files\Java\jdk1.6.0_35\bin\xjc.exe" -p org.openhie.openempi.configurati
on.xml.model -d java schemas\file-loader-map.xsd
parsing a schema...
compiling a schema...
org\openhie\openempi\configuration\xml\model\Datatype.java
org\openhie\openempi\configuration\xml\model\FieldType.java
org\openhie\openempi\configuration\xml\model\FieldsType.java
org\openhie\openempi\configuration\xml\model\FileLoaderMap.java
org\openhie\openempi\configuration\xml\model\ObjectFactory.java
org\openhie\openempi\configuration\xml\model\SubFieldsType.java
org\openhie\openempi\configuration\xml\model\package-info.java