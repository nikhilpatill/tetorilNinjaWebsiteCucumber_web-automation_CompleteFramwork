Feature: Loginpage Feature


  @nikhil
  Scenario: verify Login page
    Given user_is_on_login_page
    Then varify Login "PasswordFiled" ISDisplayed
    And varify Login "UsernameFiled" ISDisplayed
    And varify Login "btnFiled" ISDisplayed
    And varify Login "Title" IsDisplayed "OrangeHRM"
    And varify Login "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And  varify Login "Txt" IsDisplayed "Logi"
   
  
  Scenario: varify Login Functionality
    Given user_is_on_login_page
    When varify Login "UsernameFiled" Sendkeys "admin"
    And  varify Login "PasswordFiled" Sendkeys "admin123"
    Then varify Login Click
    And varify Login "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"


 
  Scenario: varify Login Tittle
    Given user_is_on_login_page
    And varify Login "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    
 
  Scenario: varify Login Url
    Given user_is_on_login_page
    And varify Login "Title" IsDisplayed "OrangeHRM"


  Scenario: varify valid_usename and Inavlied password
    Given user_is_on_login_page
    When varify Login "UsernameFiled" Sendkeys "admin"
    And  varify Login "PasswordFiled" Sendkeys "admin456"
    Then varify Login Click
    And  varify Login "Txt" IsDisplayed "Login"    
    

  Scenario: varify Invalid_usename and vlied password
    Given user_is_on_login_page
     When varify Login "UsernameFiled" Sendkeys "nikhil"
     And  varify Login "PasswordFiled" Sendkeys "admin123"
    Then varify Login Click
    And  varify Login "Txt" IsDisplayed "Login"    

  Scenario: varify Blank_usename and Blank password
     Given user_is_on_login_page
     When varify Login "UsernameFiled" Sendkeys ""
    And  varify Login "PasswordFiled" Sendkeys ""
    Then varify Login Click
    And  varify Login "Txt" IsDisplayed "Login"    
    
    
  

  Scenario: Verify logging into the Application using Keyboard keys (Tab and Enter)
   Given user_is_on_login_page
   Then varify "click" kay 
   When varify Login "UsernameFiled" Sendkeys "admin"
   Then varify "tab" kay 
   When varify Login "PasswordFiled" Sendkeys "admin123"
   Then varify "tab" kay 
   And  varify "Enter" kay
   And varify Login "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"

 
   
 
  Scenario: Verify username  and Password text fields in the Login page have the place holder text
    Given user_is_on_login_page
    Then Verify "username" palceholder isdisplay "Username"
    And Verify "Pasword" palceholder isdisplay "Password"
    
  
  