

package org.StepDefination;

import org.ActionClassUtility.ActionClassGenericMethod;
import org.BaseUtility.startUp;
import org.POMPages.LoginScreenPage;
import org.POMPages.RegisterScreenPage;
import org.WaitUtility.WaitGenericMethod;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSceenStepDef {
	
	


	public static  startUp sb;
	public static  SoftAssert ac;
	public static Scenario scn;
	public static WebDriver driver;
	public RegisterScreenPage Rp;
	


	@Before(order=1)
	public void beforehook() {
		sb = new startUp();
		// driver=sb.initalize("ch");//user property as well
		driver = sb.startUp("ch", "http://tutorialsninja.com/demo/");

	}
	
	@Before(order=2)
	public void befor_EachStepe_hook(Scenario scn) {
		sb = new startUp();
		ac = new SoftAssert();
		Rp = new RegisterScreenPage(driver);
		this.scn=scn;

	}

	@After(order=5) // hooks after exicute each senario
	public void afterhook() {
	
		
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

	
	
	
	
	
	
	@Given("user_is_on_register_page")
	public void user_is_on_login_page() {
		
		Rp.My_AccountTXT();
		Rp.RegisterTXT();
		
		
	}

	
	@Then("varify register {string} ISDisplayed")
	public void varify_register_is_displayed(String LoginpageFileds) {
		if(LoginpageFileds.equalsIgnoreCase("FirstName"))
		{
			ac.assertTrue(Rp.varify_Register_First_NameFiled_ISDisplayed());
		}
		
		if(LoginpageFileds.equalsIgnoreCase("LastName"))
		{
			 ac.assertTrue(Rp.varify_Register_Last_NameFiled_ISDisplayed());
		}
		
		if(LoginpageFileds.equalsIgnoreCase("E_Mail"))
		{
			ac.assertTrue(Rp.varify_Register_E_MailFiled_ISDisplayed());
		}
		if(LoginpageFileds.equalsIgnoreCase("Telephone"))
		{
			ac.assertTrue(Rp.varify_Register_TelephoneFiled_ISDisplayed());
		}
		if(LoginpageFileds.equalsIgnoreCase("Password"))
		{
			ac.assertTrue(Rp.varify_Register_PasswordFiled_ISDisplayed());
		}
		if(LoginpageFileds.equalsIgnoreCase("Password_Confirm"))
		{
			ac.assertTrue(Rp.varify_Register_Password_ConfirmFiled_ISDisplayed());
		}
		
		
		
	       ac.assertAll();

		
	   
	}

	
	@Then("varify Loginpage Url IsDisplayed {string}")
	public void varify_Loginpage_Url_is_displayed(String Expectedfiled) {
		
			
			 ac.assertEquals(Rp.varify_Register_Url(),Expectedfiled);
			 scn.log("expected condition pass"+Expectedfiled);
			
		
		
	}
	
	@Then("varify register {string} warning_message IsDisplayed {string}")
	public void varify_register_warning_messageis_displayed(String LoginpageFileds, String Expectedfiled) {
		
		if(LoginpageFileds.equalsIgnoreCase("First_Name"))
		{
			
			 ac.assertEquals(Rp.varify_First_Name_warning_message(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		if(LoginpageFileds.equalsIgnoreCase("First_Name"))
		{
			
			 ac.assertEquals(Rp.varify_First_Name_warning_message(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		if(LoginpageFileds.equalsIgnoreCase("Last_Name"))
		{
			
			 ac.assertEquals(Rp.varify_Last_Name_warning_message(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		if(LoginpageFileds.equalsIgnoreCase("E_Mail"))
		{
			
			 ac.assertEquals(Rp.varify_E_Mail_warning_message(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		
		if(LoginpageFileds.equalsIgnoreCase("message_already_registered"))
		{
			
			 ac.assertEquals(Rp.varify_E_Mail_warning_message_already_registered(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		if(LoginpageFileds.equalsIgnoreCase("Telephone"))
		{
			
			 ac.assertEquals(Rp.varify_Telephone_warning_message(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		if(LoginpageFileds.equalsIgnoreCase("Password"))
		{
			
			 ac.assertEquals(Rp.varify_Password_warning_message(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		
		if(LoginpageFileds.equalsIgnoreCase("Privacy_Policy"))
		{
			
			 ac.assertEquals(Rp.varify_Privacy_Policy_warning_message(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		
	}
	
	
	
	
	@Then("varify register {string} IsDisplayed {string}")
	public void varify_register_is_displayed(String LoginpageFileds, String Expectedfiled) {
		
		if(LoginpageFileds.equalsIgnoreCase("Url"))
		{
			
			 ac.assertEquals(Rp.varify_Register_Url(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		if(LoginpageFileds.equalsIgnoreCase("login_page_Link"))
		{
			
		      ac.assertEquals(Rp.varify_login_pageTxt(), Expectedfiled);
			 scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		if(LoginpageFileds.equalsIgnoreCase("RegisterAccountTxt"))
		{
			
			 ac.assertEquals(Rp.varify_RegisterAccountTxt(),Expectedfiled);
		     scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		if(LoginpageFileds.equalsIgnoreCase("Title"))
		{
			
			 ac.assertEquals(Rp.varify_Register_Title(),Expectedfiled);
		     scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		if(LoginpageFileds.equalsIgnoreCase("login_page_Link"))
		{
			
			 ac.assertEquals(Rp.varify_login_pageTxt(),Expectedfiled);
		     scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		if(LoginpageFileds.equalsIgnoreCase("Privacy_Policy_Link"))
		{
			
			 ac.assertEquals(Rp.varify_Privacy_Policy_Link(),Expectedfiled);
		     scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		
		ac.assertAll();

	}
	

	
	@When("varify register {string} Sendkeys {string}")
	public void varify_register_Sendkeys(String LoginpageFileds, String  Expectedfiled) {
		
		if(LoginpageFileds.equalsIgnoreCase("First_Name"))
		{
			
			Rp.varify_Register_First_NameFiled_Sendkays(Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		if(LoginpageFileds.equalsIgnoreCase("Last_Name"))
		{
			
			Rp.varify_Register_Last_NameFiledSendkays(Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
				
		}
		if(LoginpageFileds.equalsIgnoreCase("E_Mail"))
		{
			
			Rp.varify_Register_E_MailFiledSendkays(Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		if(LoginpageFileds.equalsIgnoreCase("Telephone"))
		{
			
			Rp.varify_Register_TelephoneFiled_Sendkays(Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		if(LoginpageFileds.equalsIgnoreCase("Password"))
		{
			
			Rp.varify_Register_PasswordFiled_Sendkays(Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
				
		}
		if(LoginpageFileds.equalsIgnoreCase("Password_Confirm"))
		{
			
			Rp.varify_Register_Password_ConfirmFiled_Sendkays(Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		
		ac.assertAll();

		
		
	}
	
	//------------------footer links ------------------------------
	@Then("varify {string} Clickk")
	public void varify_about_us_clickk(String Linkname) {
		
		if(Linkname.equalsIgnoreCase("About_Us"))
		{
			
		  Rp.About_Us_click();
		}
		

		if(Linkname.equalsIgnoreCase(""))
		{
		  
		}
	  

		if(Linkname.equalsIgnoreCase(""))
		{
		   
		}
	  

		if(Linkname.equalsIgnoreCase(""))
		{
		  
		}
	  

		if(Linkname.equalsIgnoreCase(""))
		{
		   
		}
	  

		if(Linkname.equalsIgnoreCase(""))
		{
		   Rp.About_Us_click();
		}
	  

		if(Linkname.equalsIgnoreCase(""))
		{
		   Rp.About_Us_click();
		}

		if(Linkname.equalsIgnoreCase(""))
		{
		   Rp.About_Us_click();
		}

		if(Linkname.equalsIgnoreCase(""))
		{
		   Rp.About_Us_click();
		}

		if(Linkname.equalsIgnoreCase(""))
		{
		  
		}

		if(Linkname.equalsIgnoreCase(""))
		{
		  
		}
	  
	}
	
	//-------------------------------------------------------
	
	
	
	
	
	
	@Then("varify Subscribe Click")
	public void varify_Subscribe_click() {
		Rp.Subscribe_radio_Click();
	}
	

	@Then("varify Privacy_Policy_checked Click")
	public void varify_Privacy_Policy_checked_click() {
		Rp.Privacy_Policy_checkbox_();
	}
	

	@Then("varify New_Customer_Continue Click")
	public void New_Customer_Continue_click() {
		Rp.varify_New_Customer_Continue_click();
	}
	
	@Then("varify Continue Click")
	public void Continue_click() {
		Rp.Continue_btn_Click();
	}
	

	@Then("varify TabKey Click")
	public void TabKey_click() {
		Rp.actionclass_TabKey_click();;
	}
	

	@Then("varify EnterKey Click")
	public void EnterKey_click() {
		Rp.actionclass_EnterKey_click();;
	}
	
	
	
	@Then("varify My Account Click")
	public void My_Account_click() {
		Rp.varify_My_Account_click();
	}
	

	@Then("varify Register_dropdownmenu Click")
	public void Register_dropdownmenu_click() {
		Rp.varify_Register_dropdownmenu_click();
	}
	
	@Then("varify My Accoun_dropdownmenut Click")
	public void varify_my_accoun_dropdownmenut_click() {
		Rp.varify_My_Account_dropdownmenu_click();
	}
	
	
	@Then("varify Subscribe yes_Radio_btn Click")  
	public void Subscribe_yes_Radio_btn_click() {
		Rp.varify_Yes_radio_btn_click();;
	}
	
	
	 @Then("varify Subscribe unsubscribe to newsletter Click")  
		public void Subscribe_unsubscribe_to_newsletter_click() {
			Rp.varify_Subscribe_unsubscribe_to_newsletter_click();
		}
	

	@Then("varify LoginTxt_Link Click")
	public void LoginTxt_Link() {
		Rp.Continue_btn_Click();
	}
	
	  
	   
	@Then("Verify {string} register_page palceholder {string}")
	public void verify_register_page_palceholder(String LoginpageFileds, String Expected) {

		if(LoginpageFileds.equalsIgnoreCase("First_Name"))
		{
			 ac.assertEquals(Rp.varify_Register_First_NameFiled_placeholder_ISDisplayed(),Expected);
			scn.log("expected condition pass"+Expected);
				
		}
	    
		if(LoginpageFileds.equalsIgnoreCase("Last_Name"))
		{
			 ac.assertEquals(Rp.varify_Register_Last_NameFiled_placeholder_ISDisplayed(),Expected);
			scn.log("expected condition pass"+Expected);
				
		}
		if(LoginpageFileds.equalsIgnoreCase("E_Mail"))
		{
			 ac.assertEquals(Rp.varify_Register_E_MailFiled_placeholde_ISDisplayed(),Expected);
			scn.log("expected condition pass"+Expected);
				
		}
		if(LoginpageFileds.equalsIgnoreCase("Telephone"))
		{
			 ac.assertEquals(Rp.varify_Register_TelephoneFiled_placeholde_ISDisplayed(),Expected);
			scn.log("expected condition pass"+Expected);
				
		}
		if(LoginpageFileds.equalsIgnoreCase("Password"))
		{
			 ac.assertEquals(Rp.varify_Register_PasswordFiled_placeholde_ISDisplayed(),Expected);
			scn.log("expected condition pass"+Expected);
				
		}
		if(LoginpageFileds.equalsIgnoreCase("Password_Confirm"))
		{
			 ac.assertEquals(Rp.varify_Register_PasswordFiled_placeholde_ISDisplayed(),Expected);
			scn.log("expected condition pass"+Expected);
				
		}
	    
		ac.assertAll();
	
	} 
	   
	// Then Verify "First_Name"register_page palceholder isdisplay "First Name"
	
	



	






	

}
