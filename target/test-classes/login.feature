Feature: To validate the login functionality

  Scenario: To verify the login functionality
    Given user has to launch the chrome and hit the Fb url
    When user has to enter the username and password
    And click the login button
    Then user unable to enter the homepage
