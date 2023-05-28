

package org.StepDefination;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;

import org.BaseUtility.startUp;
import org.POMPages.LoginScreenPage;
import org.POMPages.SearchScreenPage;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSceenStepDef<CategoryBoxoptionName> {
	
	public static  startUp sb;
	public static  SoftAssert ac;
	public static Scenario scn;
	public static WebDriver driver;
	public SearchScreenPage sp;
	


	@Before(order=1)
	public void beforehook() {
		sb = new startUp();
		// driver=sb.initalize("ch");//user property as well
		driver = sb.startUp("ch", "http://tutorialsninja.com/demo");

	}
	
	@Before(order=2)
	public void befor_EachStepe_hook(Scenario scn) {
		sb = new startUp();
		ac = new SoftAssert();
		sp = new SearchScreenPage(driver);
		this.scn=scn;

	}

	@After(order=5) // hooks after exicute each senario
	public void afterhook() {
		
		driver.quit();

	}

	

	@After(order=10)
	public void After_EachStepe_hook() {
      if(scn.isFailed()) {

    	
			 byte[]scntype = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    	    // File scntype = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          // String scntype= ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
           String scnName = scn.getName().replaceAll("", "") + ".png";
           scn.attach(scntype, "image/png", scnName);
            
    	
		
		}

		
	}

	
	
	
	@Then("varify SearchBtn Click")
	public void varify_SearchBtn_click() {
		sp.SearchBTN_Click();
	}
	
	
	 @Then("varify ADD_TO_Cart_ Click")
		public void varify_ADD_TO_Cart__click() {
			sp.ADD_TO_Cart_Click();
		}
		
	 @Then("varify Wish_List_ADD_ Click")
		public void varify_Wish_List_ADD__click() {
			
		 sp.WishList_add_Click();
		}
		
	 
	 @Then("varify ADD_TO_Cart_Message {string}")
	 public void varify_add_to_cart_message(String string) {
	   
		 ac.assertEquals(sp.ADD_TO_Cart_OR_wishlist_add_Message(), string);
		 ac.assertAll();
	 }
	 
	 @Then("varify wishlist_ADD_Message {string}")
	 public void varify_wishlist_add_message(String string) {
	    
		 ac.assertEquals(sp.ADD_TO_Cart_OR_wishlist_add_Message(), string);
		 ac.assertAll();
	 }


	
	@When("varify Search Sendkeys {string}")
	public void varify_Search_sendkeys(String string) {
		sp.varify_SearchBox_Sendkays(string);
	}
	
	
	
	@Then("varify Search productCount IsDisplayed graterthen {int}")
	public void varify_search_product_count_is_displayed_graterthen(int expTabCount) {
		ac.assertTrue(sp.varify_SearchBox_DisplayProducts()>=expTabCount);
    	scn.log("Dashboard page tabs are displayed as :"+sp.varify_SearchBox_DisplayProducts());
	    ac.assertAll();
	}
	
	@Then("varify DesktopsLinkTxt Hover")
	public void varify_desktops_link_txt_hover() {
	   
		sp.DesktopsLinkTxt();
	}
	
	@Then("varify ComponentsLinkTxt Hover")
	public void varify_Components_link_txt_hover() {
	   
		sp.DesktopsLinkTxt();
	}
	
	@Then("varify SortedBox Click")
	public void varify_sorted_box_click() {
	   sp.SortedBox_Click();
	}
	

	@Then("varify SortedPrice_High_To_Low Click")
	public void varify_SortedPrice_High_To_Lowclick() {
	   sp.SortedPrice_High_To_Low();
	}
	
	
	
	@Then("varify SortedPrice_Low_To_High Click")
	public void varify_SortedPrice_Low_To_Highclick() {
	   sp.SortedPrice_Low_To_High();
	}
	@Then("varify SortedByDropdownOption {string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void varify_sorted_by_dropdown_option(String op1, String op2, String op3, String op4, String op5, String op6, String op7, String op8,String op9) {
	   
		ArrayList<String> actualele = sp.SortedByDropdownOption();
		
		ac.assertEquals(actualele.get(0), op1);
		ac.assertEquals(actualele.get(1), op2);
		ac.assertEquals(actualele.get(2), op3);
		ac.assertEquals(actualele.get(3), op4);
		ac.assertEquals(actualele.get(4), op5);
		ac.assertEquals(actualele.get(5), op6);
		ac.assertEquals(actualele.get(6), op7);
		ac.assertEquals(actualele.get(7), op8);
		ac.assertEquals(actualele.get(8), op9);
		
		ac.assertAll();
		
	}
	
	@Then("varify Laptops_NotebooksTxt Hover")
	public void varify_Laptops_NotebooksTxt_hover() {
	   
		sp.DesktopsLinkTxt();
	}
	
	
	@Then("varify ComponentsLinkDropdownProductName {string},{string},{string},{string},{string}")
	public void varify_desktops_link_dropdown_product_name(String op1, String op2,String op3,String op4,String op5) {
	   
	ArrayList<String> actualele = sp.ComponentsLinkDropdownProductName();
		
		ac.assertEquals(actualele.get(0), op1);
		ac.assertEquals(actualele.get(1), op2);
		ac.assertEquals(actualele.get(2), op3);
		ac.assertEquals(actualele.get(3), op4);
		ac.assertEquals(actualele.get(4), op5);
		
	}
	
	
	@Then("varify Laptops_NotebooksLinkDropdownProductName {string},{string}")
	public void varify_Laptops_NotebooksLink_DropdownProduct_Name(String op1, String op2) {
	   
	ArrayList<String> actualele = sp.Laptops_NotebooksLinkDropdownProductName();
		
		ac.assertEquals(actualele.get(0), op1);
		ac.assertEquals(actualele.get(1), op2);
	}
	
	
	@Then("varify DesktopsLinkDropdownProductName {string},{string}")
	public void varify_desktops_link_dropdown_product_name(String op1, String op2) {
	   
	ArrayList<String> actualele = sp.DesktopsLinkDropdownProductName();
		
		ac.assertEquals(actualele.get(0), op1);
		ac.assertEquals(actualele.get(1), op2);
	}
	
   
	@Then("varify  categorydropdownOption {string},{string},{string},{string},{string},{string},{string},{string}")
	public void varify_categorydropdown_option(String op1, String op2, String op3, String op4, String op5, String op6, String op7, String op8) {
	   
		ArrayList<String> actualele = sp.CategoryBoxoptionName(); 
		
		ac.assertEquals(actualele.get(0), op1);
		ac.assertEquals(actualele.get(1), op2);

		ac.assertEquals(actualele.get(2), op3);
		ac.assertEquals(actualele.get(3), op4);

		ac.assertEquals(actualele.get(4), op5);
		ac.assertEquals(actualele.get(5), op6);

		ac.assertEquals(actualele.get(6), op7);
		ac.assertEquals(actualele.get(7), op8);
		
		ac.assertAll();
		
		
				
	}
	
	@Then("varify Navigation_Bar_product_name {string},{string},{string},{string},{string},{string},{string},{string}")
	public void varify_navigation_bar_product_name(String op1, String op2, String op3, String op4, String op5, String op6, String op7, String op8) {
	  
		ArrayList<String> actualele = sp.Navigation_Bar_product_Name();
		

		ac.assertEquals(actualele.get(0), op1);
		ac.assertEquals(actualele.get(1), op2);

		ac.assertEquals(actualele.get(2), op3);
		ac.assertEquals(actualele.get(3), op4);

		ac.assertEquals(actualele.get(4), op5);
		ac.assertEquals(actualele.get(5), op6);

		ac.assertEquals(actualele.get(6), op7);
		ac.assertEquals(actualele.get(7), op8);
		
		ac.assertAll();
		
		
	}
	

	
	@When("varify categorybox Sendkeys {string}")
	public void varify_categorybox_sendkeys(String string) {
		
		sp.varify_DescriptionBox_Sendkays(string);
		
	   
	}
	@Then("varify  DescriptinCheck Click")
	public void varify_descriptin_check_click() {
	    
		sp.DescriptionCheckBox_Click();
		
		
	}
	@Then("varify  DescriptinSearchBtn Click")
	public void varify_Descriptin_Search_Btn_click() {
	   
		sp.DescriptionSearchBtn_Click();
	}
	
	@Then("varify  categorydropdownBox Click")
	public void varify_categorydropdown_box_click() {
	 
		sp.CategoryBoxClick_Click();
	}
	@Then("varify  categorydropdownOption Click")
	public void varify_categorydropdown_option_click() {
	    
		sp.CategoryBox4optionClick();
		
	}
	
	@Then("varify TABKeyy Click")
	public void varify_tab_keyy_click() {
	   
		sp.varify_TabKeyclick();
	}
	@Then("varify EnterKeyy Click")
	public void varify_enter_keyy_click() {
	   sp.varify_EnterKeyclick();
	}

	@Then("varify Search {string} IsDisplayed {string}")
	public void varify_Search_is_displayed(String LoginpageFileds, String Expectedfiled) {
		
		if(LoginpageFileds.equalsIgnoreCase("Txt"))
		{
			
			 ac.assertEquals(sp.varify_SearchTxt(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		if(LoginpageFileds.equalsIgnoreCase("Url"))
		{
			
			 ac.assertEquals(sp.url(),Expectedfiled);
			 scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		if(LoginpageFileds.equalsIgnoreCase("title"))
		{
			
			 ac.assertEquals(sp.Title(),Expectedfiled);
			 scn.log("expected condition pass"+Expectedfiled);
				
		}
	 }
	
	
	


	






	

}
