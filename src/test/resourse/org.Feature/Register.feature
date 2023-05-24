Feature: register page

 
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
    
  
  
  Scenario: varify register Functionality is blank warning message Display
    Given user_is_on_register_page
    When varify register "First_Name" Sendkeys ""
    And varify register "Last_Name" Sendkeys ""
    And varify register "E_Mail" Sendkeys ""
    And varify register "Telephone" Sendkeys ""
    And varify register "Password" Sendkeys ""
    And varify register "Password_Confirm" Sendkeys ""
    Then varify Subscribe Click
   # And varify Privacy_Policy_checked Click
    And varify Continue Click
    And varify register "First_Name" warning_message IsDisplayed "First Name must be between 1 and 32 characters!"
    And varify register "Last_Name" warning_message IsDisplayed "Last Name must be between 1 and 32 characters!" 
    And varify register "E_Mail" warning_message IsDisplayed "E-Mail Address does not appear to be valid!"
    And varify register "Telephone" warning_message IsDisplayed "Telephone must be between 3 and 32 characters!"
    And varify register "Password" warning_message IsDisplayed "Password must be between 4 and 20 characters!"
    And varify register "Privacy_Policy" warning_message IsDisplayed "Warning: You must agree to the Privacy Policy!"
  
  
  Scenario: varify register Functionality click Yes radio btn     [TC_RF_005]
    Given user_is_on_register_page
    When varify register "First_Name" Sendkeys "saga"
    And varify register "Last_Name" Sendkeys "patil"
    And varify register "E_Mail" Sendkeys "sagl@gmail.com"
    And varify register "Telephone" Sendkeys "7798564646"
    And varify register "Password" Sendkeys "sag@123"
    And varify register "Password_Confirm" Sendkeys "sag@123"
    Then varify Subscribe yes_Radio_btn Click 
    And varify Privacy_Policy_checked Click
    And varify Continue Click
    And varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/success"
    And varify My Account Click
    And varify Subscribe unsubscribe to newsletter Click
   
   
    Scenario: varify register Functionality by providing the existing account details (i.e. existing email address)  
    Given user_is_on_register_page 
    When varify register "First_Name" Sendkeys "saga"
    And varify register "Last_Name" Sendkeys "patil"
    And varify register "E_Mail" Sendkeys "sagl@gmail.com"
    And varify register "Telephone" Sendkeys "7798564646"
    And varify register "Password" Sendkeys "sag@123"
    And varify register "Password_Confirm" Sendkeys "sag@123"
    Then varify Subscribe yes_Radio_btn Click 
    And varify Privacy_Policy_checked Click
    And varify Continue Click
    And varify register "message_already_registered" warning_message IsDisplayed "Warning: E-Mail Address is already registered!"
   
  
    Scenario: varify register Functionality providing an Invalid email address into the E-Mail field 
    Given user_is_on_register_page 
    When varify register "First_Name" Sendkeys "saga"
    And varify register "Last_Name" Sendkeys "patil"
    And varify register "E_Mail" Sendkeys "sagggg"
    And varify register "Telephone" Sendkeys "7798564646"
    And varify register "Password" Sendkeys "sag@123"
    And varify register "Password_Confirm" Sendkeys "sag@123"
    Then varify Subscribe yes_Radio_btn Click 
    And varify Privacy_Policy_checked Click
    And varify Continue Click
   # And varify register "message_already_registered" warning_message IsDisplayed "Warning: E-Mail Address is already registered!"
   
   
   
 
    Scenario: varify register Functionality without selecting the Privacy Policy checkbox option
    Given user_is_on_register_page 
    When varify register "First_Name" Sendkeys "saga"
    And varify register "Last_Name" Sendkeys "patil"
    And varify register "E_Mail" Sendkeys "sagl@gmail.com"
    And varify register "Telephone" Sendkeys "7798564646"
    And varify register "Password" Sendkeys "sag@123"
    And varify register "Password_Confirm" Sendkeys "sag@123"
    Then varify Subscribe yes_Radio_btn Click 
   # And varify Privacy_Policy_checked Click
    And varify Continue Click
    And varify register "Privacy_Policy" warning_message IsDisplayed "Warning: You must agree to the Privacy Policy!"
  
    
    Scenario: varify register Functionality by providing an invalid phone number
    Given user_is_on_register_page 
    When varify register "First_Name" Sendkeys "saga"
    And varify register "Last_Name" Sendkeys "patil"
    And varify register "E_Mail" Sendkeys "nik@gmail.com"
    And varify register "Telephone" Sendkeys "7798"
    And varify register "Password" Sendkeys "sag@123"
    And varify register "Password_Confirm" Sendkeys "sag@123"
    Then varify Subscribe yes_Radio_btn Click 
    And varify Privacy_Policy_checked Click
    And varify Continue Click
    And varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/register"
 
 
  
    Scenario: varify register Functionality by using the Keyboard keys
    Given user_is_on_register_page 
    When varify register "First_Name" Sendkeys "saga"
    And varify register "Last_Name" Sendkeys "patil"
    And varify register "E_Mail" Sendkeys "nikddk@gmail.com"
    And varify register "Telephone" Sendkeys "7798260576"
    And varify register "Password" Sendkeys "sag@123"
    And varify register "Password_Confirm" Sendkeys "sag@123"
    Then varify TabKey Click
   

    Then varify TabKey Click
    
    Then varify TabKey Click
      And varify Privacy_Policy_checked Click
    Then varify TabKey Click
    And varify EnterKey Click
   
    And varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/success"
 
  #this is issue for scorlling  
   @nikhil
    Scenario: varify register Functionality different ways of navigating to Register Account page   
    Given user_is_on_register_page
    Then varify "About_Us" Clickk
    And varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=information/information&information_id=4"
    
  
  
  
  Scenario: varify register Functionality different ways of navigating to Register Account page   
    Given user_is_on_register_page
    Then varify My Accoun_dropdownmenut Click
    And varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/login"
    And varify New_Customer_Continue Click
    And varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/register"
    Then varify My Account Click
    And varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/login"
   Then varify Register_dropdownmenu Click
  
  
     Scenario: varify registerpage  LoginTxt_Link
      Given user_is_on_register_page
      Then varify register "login_page_Link" IsDisplayed "login page"
      And varify LoginTxt_Link Click
      And varify Loginpage Url IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/login"
    
       
    

 
  Scenario: varify register Url
    Given user_is_on_register_page
    Then varify register "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/register"

  
  Scenario: varify register Tittle
    Given user_is_on_register_page
    And varify register "Title" IsDisplayed "Register Account"

  
  Scenario: Verify Register page have the place holder texts
    Given user_is_on_register_page
    Then Verify "First" register_page palceholder "First Name"
    And Verify "Last" register_page palceholder "Last Name"
    And Verify "E_Mail" register_page palceholder "E-Mail"
    And Verify "Telephone" register_page palceholder "Telephone"
    And Verify "Password" register_page palceholder "Password"
    And Verify "Confirm" register_page palceholder "Last Name"
    
    
