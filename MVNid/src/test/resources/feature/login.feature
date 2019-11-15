@tag
Feature: Login Feature
	As a user I should be able to log in so I can see my profile page

  #ValidLogin
  @ignore
  Scenario: As a user I should be able to log in with valid credentials
    #Given User opens the browser 
    #And User navigate to the following page "http://automationpractice.com/index.php"
    Given User clicks on sign in
    When User enters valid Email address "test800@hotmail.com"
    And User enters valid password "test123"
    And User clicks sign in button
    Then User should be in profile page
    
    
  @AddToCart
  Scenario: As a user I should be able to add  to cart
  	Given User should be logged
  	When User should click on Women
  	And User add an article
  	And User click on Proceed to check out
  	

  #@Invalidemail
  @ignore
  Scenario: As a user I shouldn't be able to log in with invalid email address
    Given User opens the browser 
    And User navigate to the following page "http://automationpractice.com/index.php"
    And User clicks on sign in
    When User enters invalid Email address "test800.com"
    And User enters valid password "test123"
    And User clicks sign in button 
    Then User should get an error message "Invalid email address."

  #@IncorrectPassword
  @ignore
  Scenario: As a user I shouldn't be able to log in with invalid password
    Given User opens the browser 
    And User navigate to the following page "http://automationpractice.com/index.php"
    And User clicks on sign in
    When User enters valid Email address "test800@hotmail.com"
    And User enters valid password "test13"
    And User clicks sign in button
    Then User should get an error message "Authentication failed." 

  #@emptyLogin
  @ignore
  Scenario: As a user I shouldn't be able to log in without credentials
    Given User opens the browser 
    And User navigate to the following page "http://automationpractice.com/index.php"
    And User clicks on sign in
    When User clicks sign in button
    Then User should get an error message "An email address required."

  #@navigateForgotpassword
  @ignore
  Scenario: As a user I should be able to enter the  forgot your password option
    Given User opens the browser 
    And User navigate to the following page "http://automationpractice.com/index.php"
    And User clicks on sign in
    When User clicks on  forgot your password?
    Then User should be at the forgot your password page
    

  