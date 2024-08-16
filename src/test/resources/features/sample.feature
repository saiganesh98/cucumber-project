Feature: test feature

    @ex1
    Scenario: test scenario
        Given open browser
        When land on login page
        Then url should contain "google"




    @ex2
    Scenario Outline: test scenario
        Given open browser
        When land on login page
        Then url should contain "<url>"

    Examples:
        |url|
        |google|