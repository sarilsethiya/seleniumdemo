Feature: Footer links are working fine

  Scenario Outline: Login as HCP
    Given User navigates to Home Page website
    When user login as HCP
    And user selects country as "<Country Name>"
    And user Selects checkbox for HCP with a correct license
    And user clicks on Enter
    Then User should see message HEALTHCARE PROFESSIONALS, GET THE ANSWERS YOU ARE SEARCHING FOR HERE

    Examples: 
      | Country Name |
      | Canada       |

  Scenario: Validates that all the footer links are working properly
    And user clicks on prescribing link
    And user clicks on other requests link
    And user clicks on client research link
    And user clicks on abbvie global link
    And user clicks on terms of use link
    And user clicks on privacy policy link
    And user clicks on site feedback link
    And Close the browser
