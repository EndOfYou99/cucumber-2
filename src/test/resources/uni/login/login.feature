Feature: Login in system

Background: 
    Given User open enter page


  Scenario: Login system with valid data
    When Insert username: "Emmy"
    And Insert user password: ("1234567810emmy")
    And Click the login button
    Then See message: "Successful entrence"
    
    Scenario: Login system withouth password
    When Insert username: "Emmy"
    And Click the login button
    Then See message: "Enter username and password!"
    
    Scenario: Login system withouth username
    When Insert user password: ("1234567810emmy")
    And Click the login button
    Then See message: "Enter username and password!"
    
    Scenario: Login system withouth data
    When Click the login button
    Then See message: "Enter username and password!"
    
    Scenario: Login system with invalid username
    When Insert username: "Wrong user name"
    And Insert user password: ("1234567810emmy")
    And Click the login button
    Then See message: "Wrong data!"
    
    Scenario: Login system with invalid user password
    When Insert username: "Emmy"
    And Insert user password: ("Wrong user password")
    And Click the login button
    Then See message: "Wrong data!"
    
    Scenario: Login system with invalid data
    When Insert username: "Wrong user name"
    And Insert user password: ("Wrong user password")
    And Click the login button
    Then See message: "Wrong data!"
