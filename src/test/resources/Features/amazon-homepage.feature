#Author: amulya.xxx@xx.com
#Feature: Login Feature
@HompageTest @Regression @ignore
Feature: Amazon Homepage Test
  User want to verify the amazon hompegae functinality

  @HompageTest @ignore
  Scenario: Amazon Homepage title verification
    Given Open the Chrome and Launch the amazon application
    When User on amazon homepage
    Then Verify meta title of the page

  @HompageTest @ignore
  Scenario: Should not be Amazon Homepage
    Given Open the Chrome and Launch the amazon application
    When Navigate user on diffrent link
    Then Verify meta title of the current page
