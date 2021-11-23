@P1 @LoginFunction
Feature: To validate login function

  Background: 
    Given User launch the browser and navigates to hotel booking app

  @TC01 @login @Regression
  Scenario: To validate login function with invalid username and valid password
    When User enters the credentials in hotel booking app
    And User clicks the login button
    Then User validates the error mesaage

  @TC02 @login @Smoke
  Scenario Outline: To validate login function with combination of all credentials
    When User enters the "<userName>" and "<password>" in hotel booking app
    And User clicks the login button
    Then User validates the error mesaage

    Examples: 
      | userName | password |
      |  4356789 |  4567890 |
      | dsfghjk  | 67890-   |
      | Helo     |  5667890 |
