@SmokeTest
Feature: Kitaboo Application Automation Test

  @SmokeTest
  Scenario: Kitaboo Invalid Login Test
    Given opens the browser
    Then user will enter invalid username and invalid password
    Then error message will be displayed

  @SmokeTest
  Scenario: Kitaboo Valid Login Test
    Given opens the browser
    Then user will enter valid username and valid password
    Then User will navigate to homepage

  @SmokeTest
  Scenario: Change the profile picture
    Given user will click on profile icon and upload the picture
    Then user will click on save button

  