@Pending
Feature: Test Scoring Data

  Scenario Outline: Looking up TEST site for scoring values
    Given the user is on TEST home page
    When the user starts the game with '<values>'
    Then the user win the points of '<points>'

    Examples:
      | values | points |
      | 00000  | 0      |
