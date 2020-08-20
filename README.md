# XML Utilities

This is a collection of XML related utilities.


## Project Set Up

```bash
ofenloch@teben:~/workspaces/java$ mvn archetype:generate -DgroupId=de.ofenloch.xml.utils -DartifactId=xmlutils -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] >>> maven-archetype-plugin:3.1.2:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO] 
[INFO] <<< maven-archetype-plugin:3.1.2:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO] 
[INFO] 
[INFO] --- maven-archetype-plugin:3.1.2:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Batch mode
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: maven-archetype-quickstart:1.4
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: de.ofenloch.xml.utils
[INFO] Parameter: artifactId, Value: xmlutils
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: de.ofenloch.xml.utils
[INFO] Parameter: packageInPathFormat, Value: de/ofenloch/xml/utils
[INFO] Parameter: package, Value: de.ofenloch.xml.utils
[INFO] Parameter: groupId, Value: de.ofenloch.xml.utils
[INFO] Parameter: artifactId, Value: xmlutils
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Project created from Archetype in dir: /home/ofenloch/workspaces/java/xmlutils
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.432 s
[INFO] Finished at: 2020-08-20T20:13:52+02:00
[INFO] ------------------------------------------------------------------------
ofenloch@teben:~/workspaces/java$ cd xmlutils/
ofenloch@teben:~/workspaces/java/xmlutils$ git init
Initialized empty Git repository in /home/ofenloch/workspaces/java/xmlutils/.git/
ofenloch@teben:~/workspaces/java/xmlutils$ git add .
ofenloch@teben:~/workspaces/java/xmlutils$ git commit -a -m"initial commit right after 'mvn archetype:generate -DgroupId=de.ofenloch.xml.utils -DartifactId=xmlutils -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false'"
[master (root-commit) c3d1c00] initial commit right after 'mvn archetype:generate -DgroupId=de.ofenloch.xml.utils -DartifactId=xmlutils -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false'
 3 files changed, 108 insertions(+)
 create mode 100644 pom.xml
 create mode 100644 src/main/java/de/ofenloch/xml/utils/App.java
 create mode 100644 src/test/java/de/ofenloch/xml/utils/AppTest.java
ofenloch@teben:~/workspaces/java/xmlutils$ 
```