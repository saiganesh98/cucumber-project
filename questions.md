plugins to install? (Intellij IDEA -> Preferences -> Plugins)
- Cucumber for java
- Gherkin plugin
- Lombok
- TestNG plugin if not installed

Depedencies ->

- Cucumber core
- Cucumber java
- Cucumber testng
- Cucumber junit
- lombok


## Concepts
- Features
- Scenario
- Scenario Outline , Examples: 
- Syntax to access examples values in steps - "<url>"
- Background 
- Hooks(Before, After, BeforeStep, AfterStep, ...) 
- Conditional Hooks(with tags)
- Tags
- CucumberOptions for TestNG and Junit
- RunWith for Junit
- AbstractTestNGCucumberTests for TestNG
- runner.xml to run only test runners extending AbstractTestNGCucumberTests
- Can run using maven from cli or maven option on right side 
  - mvn test
- Writing custom CucumberParallelExecutor extends AbstractTestNGCucumberTests 
  - our test runners will extend CucumberParallelExecutor instead of AbstractTestNGCucumberTests
  - we write testng hooks in CucumberParallelExecutor
- Adding tags, features, glue, reports to test runners
- Reports - Cucumber, junit, json, extent report, custom report(if any), allure report
- Creating multiple test runners
- Running multiple test runners from runner.xml
- Reading browser parameter from test blocks
- We can write as many before and after hooks with alwaysRun and order attributes
- Creating test runner using junit runner 
- Running sample feature file to create step definitions
- Datatables


FAQs?
Cucumber core vs Cucumber java
Gherkin vs Cucumber for Java plugin
.idea folder in the repo indicated the settings of the project
