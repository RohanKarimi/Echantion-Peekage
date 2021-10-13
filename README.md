
Cucumber+Maven+Selenium , Design production ready framework !


Tools and Technologies
======================
- Cucumber JVM
- Gherkin
- Java
- Maven
- Log4J2
- JUnit
- TestNG
- Eclipse

Framework features
==================
- Behavioral Driven
- Production Ready
- Supports Parallel Execution
- Screenshot on Scenario Failure
- Log4J logging with Parallel Logging Support
- Integration with Cucumber-HTML-Reports Plugin
- Execution from Runner file or from Maven Command Line



Prerequisite
==================
Maven (For managing dependencies)
IntelliJ or Eclipse
Installation
==================
Install from git (using git clone)
Run "mvn clean test" from project directory




Setup automation project
==================
*. Checkout the project

*. Download and install JDK 1.8.

*. Add the environment paths

Type defaults write com.apple.finder AppleShowAllFiles YES in terminal to view hidden files

Alt+Right click on finder and click relaunch to activate changes

Navigate to your user's directory

If you don't have a .bash_profile file, you can create one by following these steps:
Start up Terminal
Type cd ~/ to go to your home folder
Type touch .bash_profile to create your new file.
Edit .bash_profile with your favorite editor (or you can just type open -e .bash_profile to open it in TextEdit.

Add the following to the bash_profile:
export JAVA_HOME=/Library/Java/JavaVirtualMachines/{jdk version}/Contents/Home/
export PATH=${JAVA_HOME}/bin:$PATH

*. Import the project in Eclipse/IntelliJ IDEA (using import from external model Gradle) and do a Gradle sync

*. Install Cucumber for Java plugin on the IDE(Eclipse/IntelliJ)
From the menu, select Eclipse IDEA -> 
Go to Help
Click on the eclipse marketplace
Search Cucumber and then Select Cucumber for Java and click install
You will have to restart Eclipse 


From the menu, select IntelliJ IDEA -> Preferences
Go to Plugins
Click Install JetBrains plugins
Select Cucumber for Java and click install
You will have to restart IntelliJ

*. Duplicate all .properties files from /src/test/resources/config/ into /src/test/resources/config/local/ and update the new files with the values specific to your machine (usually the same way you've set up Appium UI app).

*. Run tests

Right-click on a test class/feature file and select Run As cucumber