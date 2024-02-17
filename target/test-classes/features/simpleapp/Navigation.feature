@login @android
Feature: Navigation

  @test @positive
  Scenario: Verify long press nav menu
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    And user long press nav menu

  @test @positive
  Scenario: Verify long press nav menu
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    And user multiple press nav menu