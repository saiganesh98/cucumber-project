# Cucumber Core
Cucumber Core is the main component of Cucumber that provides the fundamental functionalities required to run Cucumber tests. It includes the following:

- Gherkin Parser: Parses Gherkin feature files to understand the scenarios and steps defined in them.
- Execution Engine: Executes the scenarios by matching the steps in the feature files with the corresponding step definitions.
- Event Handling: Manages the events that occur during the test execution, such as the start and end of scenarios, steps, and hooks.
- Reporting: Generates reports that summarize the test execution results.
- Essentially, Cucumber Core is the heart of Cucumber, enabling it to interpret feature files, match steps, execute scenarios, and provide feedback through reports.

# Cucumber Java
Cucumber Java is a module that provides support for writing step definitions and hooks in Java. It bridges the gap between the Gherkin feature files and the Java code that implements the steps. Key functionalities include:

- Java Step Definitions: Allows you to write step definitions in Java, where each step in the feature file is linked to a method in a Java class.
- Dependency Injection: Supports various dependency injection frameworks like Spring, Guice, and CDI, allowing for better management of test dependencies.
- Hooks: Provides support for writing hooks (methods annotated with @Before, @After, etc.) that run before or after scenarios and steps


# Gherkin Plugin

Gherkin is a domain-specific language (DSL) used for writing Cucumber feature files, this plugin is mainly used for writing feature files

# Cucumber for Java plugin
Cucumber for Java plugin is a tool or set of tools that provides support for writing and running Cucumber tests in a Java development environment.

