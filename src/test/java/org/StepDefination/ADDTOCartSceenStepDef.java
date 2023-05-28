
package org.StepDefination;

import java.util.ArrayList;

import org.BaseUtility.startUp;
import org.POMPages.ADDTOCartpage;
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

public class ADDTOCartSceenStepDef {

	public static startUp sb;
	public static SoftAssert ac;
	public static Scenario scn;
	public static WebDriver driver;
	public ADDTOCartpage cp;

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
		cp = new ADDTOCartpage(driver);
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

	@Given("user_is_on_ADD_TO_CART_page")
	public void user_is_on_ADD_TO_CART_page() {

		cp.My_AccountTXT_Clickk();
		cp.LoginTXT_Click();

	}

	@When("varify ADD_TO_CART EmailFiled Sendkeys {string}")
	public void varify_login_email_filed_sendkeys(String string) {
		cp.varify_Login_UsernameFiled_Sendkays(string);
	}

	@When("varify ADD_TO_CART PasswordFiled Sendkeys {string}")
	public void varify_ADD_TO_CART_password_filed_sendkeys(String string) {
		cp.varify_Login_password_Sendkays(string);
	}

	@Then("varify ADD_TO_CART Click")
	public void varify_ADD_TO_CART_click() {
		cp.varify_Login_Click();
	}
	

	
	@Then("varify ADD_TO_CART Clickk")
	public void varify_ADD_TO_CART_clickk() {
   
		cp.Shopping_Cart_Click();
	
	}
	
	
	@Then("varify ADD_TO_CART_update Clickk")
	public void varify_add_to_cart_update_clickk() {
		
	   cp.Update_ShoppingCart_click();
	}
	
	@Then("varify ADD_TO_CART_Message IsDisplayed {string}")
	public void varify_add_to_cart_message_is_displayed(String string2) {
	   
	ac.assertEquals(cp.Update_ShoppingCart_Message(), string2);
		
	}

	@Then("varify Countinue_ShoppingCart Clickk")
	public void varify_countinue_shopping_cart_clickk() {
	    
		  cp.Countinue_ShoppingCart_Click();
	}
	
	
	@Then("varify Use_Coupon_Code_txt Clickk")
	public void varify_use_coupon_code_txt_clickk() {
	   
		cp.Use_Coupon_Code_txt_click();
	}
	@When("varify ADD_TO_CART input_coupon Sendkeys {string}")
	public void varify_add_to_cart_input_coupon_sendkeys(String string) {
	  
		cp.input_coupon_SendKey(string);
	}
	@Then("varify Applay_coupon_Btn Clickk")
	public void varify_applay_coupon_btn_clickk() {
	   
		cp.Applay_coupon_Btn();
	}
	@Then("varify Warning_Coupon_Message IsDisplayed {string}")
	public void varify_warning_coupon_message_is_displayed(String string) {
	 
		ac.assertEquals(cp.Warning_Coupon(),string);
	}
	
	@Then("varify Warning_Coupon_blank_Message IsDisplayed {string}")
	public void varify_warning_coupon_blank_message_is_displayed(String string) {
	 
		ac.assertEquals(cp.Warning_Coupon_blank(),string);
	}
	
	@Then("varify Warning_Gift_blank_Message IsDisplayed {string}")
	public void varify_Warning_Gift_blank_Message_is_displayed(String string) {
	 
		ac.assertEquals(cp.Warning_Gift_blank(),string);
	}
	
	
	@Then("varify Use_Gift_Certificate_txt_click Clickk")
	public void varify_use_gift_certificate_txt_click_clickk() {
	   cp.Use_Gift_Certificate_txt_click();
	}
	@When("varify ADD_TO_CART input_voucher Sendkeys {string}")
	public void varify_add_to_cart_input_voucher_sendkeys(String string) {
	   
		cp.input_voucher_SendKey(string);
	}
	@Then("varify Applay_voucher_Btn Clickk")
	public void varify_applay_voucher_btn_clickk() {
	   
		cp.Applay_voucher_Btn();
	}
	@Then("varify Warning_Gift_Message IsDisplayed {string}")
	public void varify_warning_gift_message_is_displayed(String string) {
	  ac.assertEquals(cp.Warning_Gift(), string);
	}
	
	
	
	
	
	

	@Then("varify CheckoutBtn Clickk")
	public void varify_CheckoutBtn_clickk() {
	    
		  cp.CheckoutBtn_Click();
	}
	

	@Then("varify ADD_TO_CART {string} IsDisplayed {string}")
	public void varify_ADD_TO_CART_is_displayed(String LoginpageFileds, String Expectedfiled) {

		if (LoginpageFileds.equalsIgnoreCase("url")) {

			ac.assertEquals(cp.url(), Expectedfiled);
			scn.log("expected condition pass" + Expectedfiled);

		}

		if (LoginpageFileds.equalsIgnoreCase("Title")) {

			ac.assertEquals(cp.Title(), Expectedfiled);
			scn.log("expected condition pass" + Expectedfiled);

		}

	}

}
