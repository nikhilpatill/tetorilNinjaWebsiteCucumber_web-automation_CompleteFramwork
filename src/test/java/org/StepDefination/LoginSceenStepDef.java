

package org.StepDefination;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.BaseUtility.startUp;
import org.POMPages.LoginScreenPage;
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

public class LoginSceenStepDef {
	
	public static  startUp sb;
	public static  SoftAssert ac;
	public static Scenario scn;
	public static WebDriver driver;
	public LoginScreenPage lp;
	


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
		lp = new LoginScreenPage(driver);
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

	
	
	
	
	
	
	@Given("user_is_on_login_page")
	public void user_is_on_login_page() {
		lp = new LoginScreenPage(driver);
		
		lp.My_AccountTXT_Click();
		 lp.LoginTXT_Click();
		
	}

	
	@Then("varify Login {string} ISDisplayed")
	public void varify_login_is_displayed(String LoginpageFileds) {
		if(LoginpageFileds.equalsIgnoreCase("PasswordFiled"))
		{
			ac.assertTrue(lp.varify_Login_PasswordFiled_ISDisplayed());
		}
		
		if(LoginpageFileds.equalsIgnoreCase("UsernameFiled"))
		{
			 ac.assertTrue(lp.varify_Login_UsernameFiled_ISDisplayed());
		}
		
		if(LoginpageFileds.equalsIgnoreCase("btnFiled"))
		{
			ac.assertTrue(lp.varify_Login_btnFiled_ISDisplayed());
		}
		
	       ac.assertAll();

		
	   
	}

	@Then("varify Login {string} IsDisplayed {string}")
	public void varify_login_is_displayed(String LoginpageFileds, String Expectedfiled) {
		
		if(LoginpageFileds.equalsIgnoreCase("Title"))
		{
			
			 ac.assertEquals(lp.varify_Login_Title(),Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
			
		}
		if(LoginpageFileds.equalsIgnoreCase("Url"))
		{
			
			 ac.assertEquals(lp.varify_Login_Url(),Expectedfiled);
			 scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		if(LoginpageFileds.equalsIgnoreCase("Txt"))
		{
			
			 ac.assertEquals(lp.varify_ReturningTXT(),Expectedfiled);
		     scn.log("expected condition pass"+Expectedfiled);
				
		}
	   
		ac.assertAll();

	}
	
	@When("varify Login {string} Sendkeys {string}")
	public void varify_login_Sendkeys(String LoginpageFileds, String  Expectedfiled) {
		
		if(LoginpageFileds.equalsIgnoreCase("UsernameFiled"))
		{
			
			lp.varify_Login_UsernameFiled_Sendkays(Expectedfiled);
			scn.log("expected condition pass"+Expectedfiled);
				
		}
		
		if(LoginpageFileds.equalsIgnoreCase("PasswordFiled"))
			scn.log("expected condition pass"+Expectedfiled);
		
		{
			
			lp.varify_Login_PasswordFiled_sendKeys(Expectedfiled);
		     scn.log("expected condition pass"+Expectedfiled);
			
		}
		
		ac.assertAll();

		
		
	}
	
	@Then("varify Login Click")
	public void varify_login_click() {
		lp.varify_Login_Click();
	}
	
	@Then("varify {string} kay")
	public void varify_kay(String LoginpageFileds) {
	    
		if(LoginpageFileds.equalsIgnoreCase("tab"))
		{
			lp.varify_tab_Kay();
		}
	    
	   if(LoginpageFileds.equalsIgnoreCase("Enter"))
	   {
		   lp.varify_Enter_kay();
		}
	  
	   
	   
	   
   }
		
	@Then("Verify {string} palceholder isdisplay {string}")
	public void verify_palceholder_isdisplay(String LoginpageFileds, String Expected) {
		  
				if(LoginpageFileds.equalsIgnoreCase("username"))
				{
					 ac.assertEquals(lp.varify_Login_UsernameFiled_placeholder_ISDisplayed(),Expected);
					scn.log("expected condition pass"+Expected);
						
				}
			    
				  
				if(LoginpageFileds.equalsIgnoreCase("Pasword"))
				{
					ac.assertEquals(lp.varify_Login_passwordFiled_placeholder_ISDisplayed(),Expected);
					scn.log("expected condition pass"+Expected);
						
				}
			    
			ac.assertAll();

	}
	




	






	

}
