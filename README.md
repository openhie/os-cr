# os-cr
Open Source Client Registry

OS-CR is an open source Client Registry forked from OpenEMPI. OS-CR is currently used in the OpenHIE 1.0 release.


## Build Instructions
Adding missing libraries to maven repository:

mvn -X install:install-file -Dfile=simmetrics-1.6.2.jar -DgroupId=simmetrics -DartifactId=simmetrics -Dversion=1.6.2 -Dpackaging=jar
