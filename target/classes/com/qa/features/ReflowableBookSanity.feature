@Sanity
Feature: This is a Smoke Test of PDF Book launch

  @Sanity
  Scenario: Reflowable book lanch verification
    Given user opens the browser
    Given user gets logged in to bookshelf
    When user lauches the reflowable book
    When user clicks on toc icon
