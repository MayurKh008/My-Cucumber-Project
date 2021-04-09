@SmokeTest
Feature: Access Code Verification Test

  @SmokeTest
  Scenario: Invalid Access Code Verifcation Test
    Given user opens the browser
    Then user enters invalid access code
    And error message gets displayed

  @SmokeTest
  Scenario Outline: Valid Access Code Verifcation
    Given user opens the browser
    Then user enters valid access code
    Then User navigates to access code window and enters "<username>" "<email ID>" "<password>" "<confirmpasswod>"
    Then user clicks on submit button and bookshlef gets displayed

    Examples: 
      |Full Name|email ID|password|confirmpasswod|
      |Invalid Name|invalidemail@yopmail.com|kitaboo@123|kitaboo@1234|
      |Valid User|validuser01@yopmail.com|kitaboo@123|kitaboo@123|
