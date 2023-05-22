Feature: Loginpage Feature

  @nikhil
  Scenario: verify Login page
    Given user_is_on_login_page
    Then varify Login "PasswordFiled" ISDisplayed
    And varify Login "EmailFiled" ISDisplayed
    And varify Login "btnFiled" ISDisplayed
    And varify Login "Title" IsDisplayed "Account Login"
    And varify Login "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/login"
    And varify Login "Txt" IsDisplayed "Returning Customer"
    

  Scenario: varify Login Functionality
    Given user_is_on_login_page
    When varify Login "EmailFiled" Sendkeys "pragatipatil7798@gmail.com"
    And varify Login "PasswordFiled" Sendkeys "nik@123"
    Then varify Login Click
    And varify Login "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/account"


  Scenario: varify Login Tittle
    Given user_is_on_login_page
    And varify Login "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/login"

  Scenario: varify Login Url
    Given user_is_on_login_page
    And varify Login "Title" IsDisplayed "Account Login"

  Scenario: varify valid_usename and Inavlied password
    Given user_is_on_login_page
    When varify Login "EmailFiled" Sendkeys "pragatipatil7798@gmail.com"
    And varify Login "PasswordFiled" Sendkeys "admin456"
    Then varify Login Click
    And varify Login "Txt" IsDisplayed "Login"

  Scenario: varify Invalid_usename and valied password
    Given user_is_on_login_page
    When varify Login "EmailFiled" Sendkeys "nikhil"
    And varify Login "PasswordFiled" Sendkeys "nik@123"
    Then varify Login Click
    And varify Login "Txt" IsDisplayed "Login"

  Scenario: varify Blank_usename and Blank password
    Given user_is_on_login_page
    When varify Login "EmailFiled" Sendkeys ""
    And varify Login "PasswordFiled" Sendkeys ""
    Then varify Login Click
    And varify Login "Txt" IsDisplayed "Login"

  Scenario: Verify logging into the Application using Keyboard keys (Tab and Enter)
    Given user_is_on_login_page
    Then varify "click" kay
    When varify Login "EmailFiled" Sendkeys "pragatipatil7798@gmail.com"
    Then varify "tab" kay
    When varify Login "PasswordFiled" Sendkeys "nik@123"
    Then varify "tab" kay
    And varify "Enter" kay
    And varify Login "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/account"

  Scenario: Verify username  and Password text fields in the Login page have the place holder text
    Given user_is_on_login_page
    Then Verify "EmailFiled" palceholder isdisplay "E-Mail Address"
    And Verify "Pasword" palceholder isdisplay "Password"
