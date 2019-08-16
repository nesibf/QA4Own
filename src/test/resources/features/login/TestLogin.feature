@TestLogin
Feature: Test Login

  @Ignore
  Scenario Outline: Verify Login Process
    Given the user is on the Start home page
    When the user login as '<username>'
     And the user enters the '<password>'
    Then the user verifies the login was successful

    Examples:
      | username      | password     |
      | usern@me4.you | abcABC123!@# |
