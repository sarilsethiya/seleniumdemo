Feature: login as Abbive employee using incorrect username and password

  Scenario: Login as a abbvie employee
    Given User navigates to Home Page website
    When User selects user as abbvie employee
    And User clicks on Enter button

  Scenario Outline: Login Failed
    And User enter Username as "<username>"
    And User enter Password as "<password>"
    And User clicks on SignIn button
    Then User should see error message
    And reset username and passowrd

    Examples: 
      | username                           | password                 | status |
      | gfdgdfg                            | gdfd                     | false  |
      | aaa                                | gdd                      | false  |
      | aaa                                | aaaaaaa                  | false  |
      | !!!$$$$%%%%%%%%%%%%%%%%%%%%%%%%%%% | !%%^^^^^^^^^554654546454 | false  |

  Scenario: 
    And Close the browser
