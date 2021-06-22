Feature: Abbvie Welcome Page

  Scenario: Check presence of all the controls on Home page
    Given User navigates to Home Page website
    Then I should see label Welcome to AbbVie’s Medical Information Site
    And I should see language as label
    And I should see language dropdown with prepopulated values
    And I should see I am label
    And Close the browser

   
