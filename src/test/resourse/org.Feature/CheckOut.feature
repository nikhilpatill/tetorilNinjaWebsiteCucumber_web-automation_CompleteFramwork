Feature: Check_Out functionality

  Background: 
   Given user_is_on_Check_Out_page
    When varify Check_Out EmailFiled Sendkeys "sagrl@gmail.com"
    And varify Check_Out PasswordFiled Sendkeys "sag@123"
    Then varify Check_Out Click
    And varify Check_Out "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/account"
    When varify Search Sendkeyss "mac"
    Then varify SearchBtn Clickk
    Then varify Check_Out "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search&search=mac"
    Then varify Check_Out Clickk
   
   @nikhil
    Scenario: Product Display in the Check_Out page
    Then varify Check_Out Clickk
    Then varify Check_Out "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/checkout"
    And varify Check_Out "Title" IsDisplayed "Checkout"
   
     
  
    Scenario: Product Display in the Check_Out functinality
    Then varify Check_Out Clickk
    Then varify Check_Out "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/checkout"
    And varify Check_Out "Title" IsDisplayed "Checkout"
    Then varify Billing_Continue_Btn Clickk
    Then varify Delivery_Continue_Btn Clickk
    Then varify Delivery_method_Continue_Btn Clickk
    Then varify Terms_Conditions_check_Box Clickk
    Then varify payment_method_Continue_Btn Clickk
    Then varify Conform_order_Btn Clickk
    Then varify Check_Out "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/success"
    Then varify order_placed_Continue Clickk
    Then varify Check_Out "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=common/home"
 
    
    
    