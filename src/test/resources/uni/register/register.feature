
Feature: Register user

  Scenario Outline: Register user
    Given User open register page
    When Inser username: "<username>"
    And Inser password: "<password>"
    And Inser second password: "<password2>"
    And Inser email: "<email>"
    And Click the register button
    Then See mssage: "<message>"

    Examples: 
      | username  | password    | password2  | email           | message                              |
      | eyyy      |     12345   | 12345      | emia@abv.bg     | Successful registration!             |
      | anii      |     abdii   | aiaoidh    | ani@abv.bg      | Enter one password!                  |
      |           |     12345   | 12345      | emis@abv.bg     | Enter username!                      |
      | emin      |             | 12345      | emsdi@abv.bg    | Enter password!                      | 
      | emint     |     12345   |            | emioj@abv.bg    | Enter second password!               |
      | en        |     12378   | 12378      | emiio@abv.bg    | Username must be at least 3 simbols! |
      | enms      |     1234    | 1234       | emasoabv.bg     | Enter valid email!                   |
      
