Feature: Search functionality

  Scenario: User searches for a valid product
    When varify Search Sendkeys "imac"
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search&search=imac"
    Then varify Search "Txt" IsDisplayed "Search - imac"
    Then varify Search "title" IsDisplayed "Search -imac"

  Scenario: User searches for a valid product by using Keyboad Key (TABKey & EnterKey)
    When varify Search Sendkeys "imac"
    Then varify TABKeyy Click
    Then varify EnterKeyy Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search&search=imac"
    Then varify Search "Txt" IsDisplayed "Search - imac"
    Then varify Search "title" IsDisplayed "Search -imac"

  Scenario: User searches for an invalid product
    When varify Search Sendkeys "Fitbit"
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search&search=Fitbit"
    Then varify Search "title" IsDisplayed "Search - Fitbit"
    
@nikhil
  Scenario: User searches for a valid product it display more then one product.
    When varify Search Sendkeys "mac"
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search&search=mac"
    Then varify Search "title" IsDisplayed "Search - mac"
    Then varify Search productCount IsDisplayed graterthen 1

  Scenario: User searches for a search exixting roduct  product
    When varify Search Sendkeys ""
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search"
    Then varify Search "Txt" IsDisplayed "Search - "
    When varify Search Sendkeys "imac"
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search&search=imac"
    Then varify Search "Txt" IsDisplayed "Search -imac"
@nikhil
  Scenario: User searches for an  search exixting product  product decription box
    When varify Search Sendkeys ""
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search"
    Then varify Search "Txt" IsDisplayed "Search"
    When varify categorybox Sendkeys "mac"
    Then varify  DescriptinCheck Click
    Then varify  DescriptinSearchBtn Click
    Then varify Search "title" IsDisplayed "Search - mac"
    Then varify Search productCount IsDisplayed graterthen 1

  Scenario: Verify Search by selecting the category of product
    When varify Search Sendkeys ""
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search"
    Then varify Search "Txt" IsDisplayed "Search"
    When varify categorybox Sendkeys "mac"
    Then varify  categorydropdownBox Click
    Then varify  categorydropdownOption Click
    Then varify  DescriptinSearchBtn Click
    Then varify Search "title" IsDisplayed "Search - mac"
    
  Scenario: Verify the  categorydropdown  product name is display
    When varify Search Sendkeys ""
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search"
    Then varify Search "Txt" IsDisplayed "Search"
    When varify categorybox Sendkeys "mac"
    Then varify  categorydropdownBox Click
    Then varify  categorydropdownOption "All Categories","Desktops","      PC","      Mac","Laptops & Notebooks","      Macs","      Windows","Components"   

  Scenario: Verify the Sorted-By DropdownList Options
    When varify Search Sendkeys ""
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search"
    When varify categorybox Sendkeys "mac"
    Then varify  categorydropdownBox Click
    Then varify  categorydropdownOption Click
    Then varify  DescriptinSearchBtn Click
    Then varify SortedBox Click
    Then varify SortedByDropdownOption "Default","Name (A - Z)","Name (Z - A)","Price (Low > High)","Price (High > Low)","Rating (Highest)","Rating (Lowest)","Model (A - Z)","Model (Z - A)"

  Scenario: Verify the Sorted-By DropdownList option Price (High_To_Low)  product shows
    When varify Search Sendkeys ""
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search"
    When varify categorybox Sendkeys "mac"
    Then varify  categorydropdownBox Click
    Then varify  categorydropdownOption Click
    Then varify  DescriptinSearchBtn Click
    Then varify Search "title" IsDisplayed "Search - mac"
    Then varify SortedBox Click
    Then varify SortedPrice_High_To_Low Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search&sort=p.price&order=DESC&search=mac&category_id=18"

 
  Scenario: Verify the Sorted-By DropdownList option Price (Low_To_High) product shows
    When varify Search Sendkeys ""
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search"
    
    When varify categorybox Sendkeys "mac"
    Then varify  categorydropdownBox Click
    Then varify  categorydropdownOption Click
    Then varify  DescriptinSearchBtn Click
    Then varify Search "Txt" IsDisplayed "Search -mac"
    Then varify SortedBox Click
    Then varify SortedPrice_Low_To_High Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search&sort=p.price&order=ASC&search=mac&category_id=18"

  Scenario: Verify the Navigation-Bars product name is display
    Then varify Navigation_Bar_product_name "Desktops","Laptops & Notebooks","Components","Tablets","Software","Phones & PDAs","Cameras","MP3 Players"

  Scenario: Verify the Navigation-Bars product name DropdownList  product name is display
    Then varify DesktopsLinkTxt Hover
    Then varify DesktopsLinkDropdownProductName "PC (0)","Mac (1)"
    Then varify ComponentsLinkTxt Hover
    Then varify ComponentsLinkDropdownProductName "Mice and Trackballs (0)","Monitors (2)","Printers (0)","Scanners (0)","Web Cameras (0)"
    Then varify Laptops_NotebooksTxt Hover
    Then varify Laptops_NotebooksLinkDropdownProductName "Macs (0)","Windows (0)"

  Scenario: User searches for an  blank
    When varify Search Sendkeys ""
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search"
    Then varify Search "Txt" IsDisplayed "Search - "

  Scenario: User  first login application searches for valid product
    Given user_is_on_login_page
    When varify Login EmailFiled Sendkeys "sagrl@gmail.com"
    And varify Login PasswordFiled Sendkeys "sag@123"
    Then varify Login Click
    And varify Login "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=account/account"
    When varify Search Sendkeys "imac"
    Then varify SearchBtn Click
    Then varify Search "Url" IsDisplayed "https://tutorialsninja.com/demo/index.php?route=product/search&search=imac"
    Then varify Search "Txt" IsDisplayed "Search - imac"

    