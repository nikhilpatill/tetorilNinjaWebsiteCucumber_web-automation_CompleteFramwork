Feature: product display functionality

  Background: 
   Given user_is_on_Product_page
    When varify Loginn EmailFiled Sendkeys "sagrl@gmail.com"
    And varify Loginn PasswordFiled Sendkeys "sag@123"
    Then varify Loginn Click
    And varify Searchh "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/account"
    
  
    Scenario: Product Display in the Wish_List page
    Then varify Wish_List Click
    Then varify Searchh "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/wishlist"
    And varify Searchh "Title" IsDisplayed "My Wish List"
    Then varify ContinueBTN Click
    And varify Searchh "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/account"
    
    @nikhil
    Scenario: In Wish_List page Right Side Menu 
    Then varify Wish_List Click
    Then varify Searchh "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/wishlist"
    And varify Searchh "Title" IsDisplayed "My Wish List"
    Then varify Wich_List_RightSide_functionality_Menu "My Account","Edit Account","Password","Address Book","Wish List","Order History","Downloads","Recurring payments","Reward Points","Returns","Transactions","Newsletter","Logout"
    Then varify Wich_List_RightSide_functionality_Menu count 13
       
  
    Scenario: Product Display in the Wish_List page product ADD_TO_Cart
    Then varify Wish_List Click
    Then varify Searchh "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/wishlist"
    And varify Searchh "Title" IsDisplayed "My Wish List"
    Then varify Wish_List_product_ADD_TO_Cart Click
   
   
 
    Scenario: varify Product Display in the Wish_List page -- List_Product__
    Then varify Wish_List Click
    Then varify Searchh "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/wishlist"
    And varify Searchh "Title" IsDisplayed "My Wish List"
    Then varify Wich_List_Product_Name "Product Name","iMac","MacBook Air"
    Then varify Wich_List_Model_Name "Model","Product 14","Product 17"
    Then varify Wich_List_Produc_Stock "Stock","In Stock","In Stock"
    Then varify Wich_List_Product_Unit_Price "Unit Price","$122.00","$1,202.00"
  
  