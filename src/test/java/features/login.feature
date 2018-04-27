Feature: Facebook Login
  This feature deals with the login functionality

  @Web1
  Scenario Outline: Login with valid credentials using outline
    Given I am on facebook homepage
    When I enter valid "<username>" and "<password>"
    And I click on login button
    Then I logged into facebook
    Examples:
      | username          | password |
      | abcd134@gmail.com | abcd1234 |

    @Web2
  Scenario: Login with invalid credentials
    Given I am on facebook homepage
    And I enter the users email address as email:"admin"
    And I enter the following
      | username         | password |
      | abc123@gmail.com | abc123   |
    And I click on login button
    Then I will get a notification for invalid username/password