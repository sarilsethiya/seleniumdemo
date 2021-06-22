Feature: Login as HCP

  Scenario Outline: Login as HCP
    Given User navigates to Home Page website
    When user login as HCP
    And user selects country as "<Country Name>"
    And user Selects checkbox for HCP with a correct license
    And user clicks on Enter
    Then User should see message HEALTHCARE PROFESSIONALS, GET THE ANSWERS YOU ARE SEARCHING FOR HERE
    And Close the browser

    Examples: 
      | Country Name |
      | Canada       |
