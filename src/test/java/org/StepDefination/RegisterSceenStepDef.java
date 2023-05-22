

package org.StepDefination;

import org.BaseUtility.startUp;
import org.POMPages.LoginScreenPage;
import org.POMPages.RegisterScreenPage;
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

	@Then("varify register {string} IsDisplayed {string}")
	public void varify_register_is_displayed(String LoginpageFileds, String Expectedfiled) {
		
		if(LoginpageFileds.equalsIgnoreCase("Url"))
		{
			
			 ac.assertEquals(Rp.varify_Register_Url(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
	/*	if(LoginpageFileds.equalsIgnoreCase("NewsletterTxt"))
		{
			
		      ac.assertEquals(Rp.NewsletteTxtr(),Expectedfiled, Expectedfiled);
			 scn.log("expected condition pass"+Expectedfiled);
				
		}*/
		
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
	
	@Then("varify Subscribe Click")
	public void varify_Subscribe_click() {
		Rp.Subscribe_radio_Click();
	}
	

	@Then("varify Privacy_Policy_checked Click")
	public void varify_Privacy_Policy_checked_click() {
		Rp.Privacy_Policy_checkbox_();
	}
	

	@Then("varify Continue Click")
	public void Continue_click() {
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
