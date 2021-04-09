@SmokeTest
Feature: Splash Screen Links Verifcation

  @SmokeTest
  Scenario Outline: This is App Store Links Verifcation
    Given user is present on login page
    When user will click on "<link>"
    And window with "<title>" open succesfully
    Then close the window succesfully

    Examples: 
      | link        | title                                      |
      | Appstore    | ‎Kitaboo eBook Reader on the App     |
      | Playstore   | Kitaboo eBook Reader - Apps on Google Play |
      | WindowStore | Get Kitaboo eBook Reader - Microsoft Store |
