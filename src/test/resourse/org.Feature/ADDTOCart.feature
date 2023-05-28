Feature: ADD_TO_CART functionality

  Background: 
   Given user_is_on_ADD_TO_CART_page
    When varify ADD_TO_CART EmailFiled Sendkeys "sagrl@gmail.com"
    And varify ADD_TO_CART PasswordFiled Sendkeys "sag@123"
    Then varify ADD_TO_CART Click
    And varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/account"
    
  
    Scenario: Product Display in the Wish_List page
    Then varify ADD_TO_CART Clickk
    Then varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/cart"
    And varify ADD_TO_CART "Title" IsDisplayed "Shopping Cart"
   
     
   
    Scenario: Product Display in the ADD_TO_CART_update Button functinality
    Then varify ADD_TO_CART Clickk
    Then varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/cart"
    And varify ADD_TO_CART "Title" IsDisplayed "Shopping Cart"
    Then varify ADD_TO_CART_update Clickk
    And varify ADD_TO_CART_Message IsDisplayed "Success: You have modified your shopping cart!"
    
      
    
    Scenario: Product Display in the Countinue_ShoppingCart Button functionality
    Then varify ADD_TO_CART Clickk
    Then varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/cart"
    And varify ADD_TO_CART "Title" IsDisplayed "Shopping Cart"
    Then varify Countinue_ShoppingCart Clickk
    And varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=common/home"
    
     
   
    Scenario: Product Display in the CheckoutBtn functionality 
    Then varify ADD_TO_CART Clickk
    Then varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/cart"
    And varify ADD_TO_CART "Title" IsDisplayed "Shopping Cart"
    Then varify CheckoutBtn Clickk
    And varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/cart"
    
    
    
    Scenario: Product Display in the Applay_coupon_Btn functionality 
    Then varify ADD_TO_CART Clickk
    Then varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/cart"
    And varify ADD_TO_CART "Title" IsDisplayed "Shopping Cart"
    Then varify Use_Coupon_Code_txt Clickk
    When varify ADD_TO_CART input_coupon Sendkeys "sagrl456"
    Then varify Applay_coupon_Btn Clickk
    And varify Warning_Coupon_Message IsDisplayed "Warning: Coupon is either invalid, expired or reached its usage limit"
    
     
   
    Scenario: Product Display in the CheckoutBtn functionality 
    Then varify ADD_TO_CART Clickk
    Then varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/cart"
    And varify ADD_TO_CART "Title" IsDisplayed "Shopping Cart"
    Then varify Use_Coupon_Code_txt Clickk
    When varify ADD_TO_CART input_coupon Sendkeys ""
    Then varify Applay_coupon_Btn Clickk
    And varify Warning_Coupon_blank_Message IsDisplayed "Warning: Please enter a coupon code!"
    
     
     
    
   #Then varify ADD_TO_CART Clickk
    #Then varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/cart"
    #And varify ADD_TO_CART "Title" IsDisplayed "Shopping Cart"
    #Then varify Use_Gift_Certificate_txt_click Clickk
    #When varify ADD_TO_CART input_voucher Sendkeys "123"
    #Then varify Applay_voucher_Btn Clickk
    #And varify Warning_Gift_Message IsDisplayed "Warning: Gift Certificate is either invalid or the balance has been used up"
    
        
   
    #Scenario: Product Display in the Applay_coupon_Btn functionality 
    #Then varify ADD_TO_CART Clickk
    #Then varify ADD_TO_CART "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=checkout/cart"
    #And varify ADD_TO_CART "Title" IsDisplayed "Shopping Cart"
    #Then varify Use_Gift_Certificate_txt_click Clickk
    #When varify ADD_TO_CART input_voucher Sendkeys ""
    #Then varify Applay_voucher_Btn Clickk
    #And varify Warning_Gift_blank_Message IsDisplayed "Warning: Please enter a gift certificate code!"
    
     
     
     
     
     
     
     