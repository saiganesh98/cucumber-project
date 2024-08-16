## How to use this project :

- Clone this repo(you require git to be installed for this)
- Open in intellij
- configure Java SDK, make sure you have maven configured already
- Install all the plugins required for this project : Cucumber, Gherkin
- Build project


### References :
- https://www.linkedin.com/pulse/using-testng-xml-run-feature-files-cucumber-bdd-pinakin-chaubal/


## Steps to run test runners -
- Go to src/test/java/runners
- Right click in TestRunnerTestNG and select option run TestRunnerTestNG

## Steps to run from runner.xml file
- include TestRunnerTestNG class in test block of runner.xml(alias testng.xml) and right click in runner.xml and select run runner.xml

## Steps to run from CLI using maven
- Go to terminal and run command -> mvn test -DsuiteXmlFile=runner.xml

