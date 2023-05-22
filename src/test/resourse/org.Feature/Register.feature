Feature: register page

  @nikhil
  Scenario: verify Login page
    Given user_is_on_register_page
    Then varify register "FirstName" ISDisplayed
    And varify register "LastName" ISDisplayed
    And varify register "E_Mail" ISDisplayed
    And varify register "Telephone" ISDisplayed
    And varify register "Password" ISDisplayed
    And varify register "Password_Confirm" ISDisplayed
    And varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/register"
    And varify register "NewsletterTxt" IsDisplayed "Newsletter"
    And varify register "RegisterAccountTxt" IsDisplayed "Register Account"
    And varify register "Title" IsDisplayed "Register Account"
    And varify register "login_page_Link" IsDisplayed "login page"
    And varify register "Privacy_Policy_Link" IsDisplayed "Privacy Policy"

  @nikhil
  Scenario: varify register Functionality
    Given user_is_on_register_page
    When varify register "First_Name" Sendkeys "sagar"
    And varify register "Last_Name" Sendkeys "patil"
    And varify register "E_Mail" Sendkeys "sagrl@gmail.com"
    And varify register "Telephone" Sendkeys "7798564646"
    And varify register "Password" Sendkeys "sag@123"
    And varify register "Password_Confirm" Sendkeys "sag@123"
    Then varify Subscribe Click
    And varify Privacy_Policy_checked Click
    And varify Continue Click
    And varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/success"

 @nikhil
  Scenario: varify register Url
    Given user_is_on_register_page
    Then varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/register"
 @nikhil
  Scenario: varify register Tittle
    Given user_is_on_register_page
   And varify register "Title" IsDisplayed "Register Account"
   
 @nikhil
  Scenario: Verify Register page have the place holder texts
    Given user_is_on_register_page
    Then Verify "First" register_page palceholder "First Name"
    And Verify "Last" register_page palceholder "Last Name"
    And Verify "E_Mail" register_page palceholder "E-Mail"
    And Verify "Telephone" register_page palceholder "Telephone"
    And Verify "Password" register_page palceholder "Password"
    And Verify "Confirm" register_page palceholder "Last Name"
