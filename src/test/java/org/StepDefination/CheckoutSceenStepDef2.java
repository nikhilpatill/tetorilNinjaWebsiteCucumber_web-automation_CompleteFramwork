
package org.StepDefination;

import java.util.ArrayList;

import org.BaseUtility.startUp;
import org.POMPages.ADDTOCartpage;
import org.POMPages.CheckOutpage;
import org.POMPages.LoginScreenPage;
import org.POMPages.WishListPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Scenario;

public class CheckoutSceenStepDef2 {

	public static startUp sb;
	public static SoftAssert ac;
	public static Scenario scn;
	public static WebDriver driver;
	public CheckOutpage cop;

	@Before(order = 1)
	public void beforehook() {
		sb = new startUp();
		// driver=sb.initalize("ch");//user property as well
		driver = sb.startUp("ch", "http://tutorialsninja.com/demo");

	}

	@Before(order = 2)
	public void befor_EachStepe_hook(Scenario scn) {
		sb = new startUp();
		ac = new SoftAssert();
		cop = new CheckOutpage(driver);
		this.scn = scn;

	}

	@After(order = 5) // hooks after exicute each senario
	public void afterhook() {

driver.quit();		

	}

	@After(order = 10)
	public void After_EachStepe_hook() {
		if (scn.isFailed()) {

			byte[] scntype = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			// File scntype = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// String scntype= ((TakesScreenshot)
			// driver).getScreenshotAs(OutputType.BASE64);
			String scnName = scn.getName().replaceAll("", "") + ".png";
			scn.attach(scntype, "image/png", scnName);

		}

	}

	@Given("user_is_on_Check_Out_page")
	public void user_is_on_ADD_TO_CART_page() {

		cop.My_AccountTXT_Clickk();
		cop.LoginTXT_Click();

	}

	@When("varify Check_Out EmailFiled Sendkeys {string}")
	public void varify_Check_Out_email_filed_sendkeys(String string) {
		cop.varify_Login_UsernameFiled_Sendkays(string);
	}

	@When("varify Check_Out PasswordFiled Sendkeys {string}")
	public void varify_Check_Out_password_filed_sendkeys(String string) {
		cop.varify_Login_password_Sendkays(string);
	}

	@Then("varify Check_Out Click")
	public void varify_ADD_TO_CART_click() {
		cop.varify_Login_Click();
	}
	

	
	@Then("varify Check_Out Clickk")
	public void varify_Check_Out_clickk() {
   
		cop.CheackOut_Btn();
	
	}
	
	@Then("varify Billing_DetailsTxt Clickk")
	public void Billing_DetailsTxt_Clickk() {
   
		cop.Billing_DetailsTxt_click();
	
	}
	@Then("varify existing_addressRadio_Btn Clickk")
	public void existing_addressRadio_Btn_Clickk() {
   
		cop.existing_addressRadio_Btn();
	
	}
	
	@Then("varify Billing_Continue_Btn Clickk")
	public void Billing_Continue_Btn_Clickk() {
   
		cop.Billing_Continue_Btn();
	
	}
	

	@When("varify Search Sendkeyss {string}")
	public void varify_Search_sendkeyss(String string) {
		cop.varify_SearchBox_Sendkays(string);
	}
	
	
	@Then("varify SearchBtn Clickk")
	public void varify_SearchBtn_click() {
		cop.SearchBTN_Click();
	}

	 @Then("varify ADD_TO_Cart_ Clickk")
		public void varify_ADD_TO_Cart__click() {
			cop.ADD_TO_Cart_Click();
		}
	
	
	
	@Then("varify Delivery_Continue_Btn Clickk")
	public void Delivery_Continue_Btn_Clickk() {
   
		cop.Delivery_Continue_Btn();
	
	}
	
	@Then("varify Delivery_method_Continue_Btn Clickk")
	public void Delivery_method_Continue_Btn() {
   
		cop.Delivery_method_Continue_Btn();
	
	}
	
	 
		@Then("varify Terms_Conditions_check_Box Clickk")
		public void Terms_Conditions_check_Box() {
	   
			cop.Terms_Conditions_check_Box();
		
		}	
	 @Then("varify payment_method_Continue_Btn Clickk")
		public void payment_method_Continue_Btn() {
			   
			cop.payment_method_Continue_Btn();
		
		}
	 
	 @Then("varify Conform_order_Btn Clickk")
		public void Conform_order_Btn_Btn() {
			   
			cop.Conform_order_Btn();
		
		}
	 
	 
	 @Then("varify order_placed_Continue Clickk")
		public void order_placed_Continue() {
			   
			cop.order_placed_Continue();
		
		}
	 
	 
	
	
	
	
	
	
	@Then("varify Check_Out {string} IsDisplayed {string}")
	public void varify_Check_Out_is_displayed(String LoginpageFileds, String Expectedfiled) {

		if (LoginpageFileds.equalsIgnoreCase("url")) {

			ac.assertEquals(cop.url(), Expectedfiled);
			scn.log("expected condition pass" + Expectedfiled);

		}

		if (LoginpageFileds.equalsIgnoreCase("Title")) {

			ac.assertEquals(cop.Title(), Expectedfiled);
			scn.log("expected condition pass" + Expectedfiled);

		}

	}
	
	
}
