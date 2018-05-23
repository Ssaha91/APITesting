Feature: Homedepot Login Scenarios
  This feature deals with the login functionality

  Background: User should see HomeDepot HomePage
    Given User should click on my account
    Then User shoold click on login button


  @Web1
  Scenario Outline: Login with valid credentials using outline
    When I enter valid "<username>" and "<password>"
    And I click on login button
    Then I logged into HomeDepot
    Examples:
      | username          | password |
      | saha4311@gmail.com | Abcd1234* |

  @Web2
  Scenario: Login with valid credentials using outline
    When I enter valid username and password
    And I click on login button
    Then I should see welcome txt




#    @Web2
#  Scenario: Login with invalid credentials
#    And I enter the users email address as email:"admin"
#    And I enter the following
#      | username         | password |
#      | abc123@gmail.com | abc123   |
#    And I click on login button
#    Then I will get a notification for invalid username/password