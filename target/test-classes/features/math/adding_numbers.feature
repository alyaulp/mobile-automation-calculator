@android
Feature: Adding Numbers

  @positive
  Scenario: Adding two numbers
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Given input first number "5"
    And input second number "4"
    When i summation first and second number
    Then the total should be "9"

    @positive
  Scenario: Subtraction two numbers
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Given input first number "4"
    And input second number "2"
    When i subtraction first and second number
    Then the total should be "2"

  @positive
  Scenario: Divide two numbers
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Given input first number "8"
    And input second number "2"
    When i divide first and second number
    Then the total should be "4"

  @positive
  Scenario: Multiple two numbers
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Given input first number "3"
    And input second number "2"
    When i multiple first and second number
    Then the total should be "6"