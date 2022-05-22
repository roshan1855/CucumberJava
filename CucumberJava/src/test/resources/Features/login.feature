Feature: feature to test login functionality

  @smoketest
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is naviagaed to the home page

    Examples: 
      | username |  | password |
      | Abc123   |  | yhn432   |
      | DEF123   |  | ujm432   |

  @Test1
  Scenario Outline: click on the login
    Given user is on login page
    Then user should able to click on Freen Signup

