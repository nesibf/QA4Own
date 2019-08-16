@TestRegister
Feature: Test Register

  @Ignore
  Scenario Outline: Verify Registration Process
    Given the user is on the Start home page
    When the user registers as '<username>'
     And the user enters the '<password>'
    Then the user verifies the registration was successful

    Examples:
      | username      | password     |
      | usern@me4.you | abcABC123!@# |
