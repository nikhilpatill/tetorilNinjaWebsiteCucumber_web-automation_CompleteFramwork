
package org.StepDefination;

import java.util.ArrayList;

import org.BaseUtility.startUp;
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

public class WishListSceenStepDef {

	public static startUp sb;
	public static SoftAssert ac;
	public static Scenario scn;
	public static WebDriver driver;
	public WishListPage pd;

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
		pd = new WishListPage(driver);
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

	@Given("user_is_on_Product_page")
	public void user_is_on_Product_page() {

		pd.My_AccountTXT_Click();
		pd.LoginTXT_Click();

	}

	@When("varify Loginn EmailFiled Sendkeys {string}")
	public void varify_login_email_filed_sendkeys(String string) {
		pd.varify_Login_UsernameFiled_Sendkays(string);
	}

	@When("varify Loginn PasswordFiled Sendkeys {string}")
	public void varify_login_password_filed_sendkeys(String string) {
		pd.varify_Login_password_Sendkays(string);
	}

	@Then("varify Loginn Click")
	public void varify_login_click() {
		pd.varify_Login_Click();
	}
	
	@Then("varify ContinueBTN Click")
	public void varify_ContinueBTN_click() {
		pd.ContinueBTN_Click();
	}
	
	@Then("varify Wish_List_product_ADD_TO_Cart Click")
	public void varify_Wish_List_product_ADD_TO_Cart_click() {
		pd.Wish_List_product_ADD_TO_Cart_Click();
	}
	
	@Then("varify Wich_List_RightSide_functionality_Menu count {int}")
	public void varify_wich_list_right_side_functionality_menu_count(int int1) {
	  
		ac.assertTrue(pd.Wich_List_RightSide_functionality_Menu_count()==int1);
		
	}
	
	
	@Then("varify Wich_List_RightSide_functionality_Menu {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void varify_Wich_List_RightSide_functionality_Menu(String op1, String op2, String op3, String op4, String op5, String op6, String op7, String op8,String op9,String op10,String op11, String op12,String op13) {
	   
	ArrayList<String> actualele = pd.Wich_List_RightSide_functionality_Menu();
		try
		{
			ac.assertEquals(actualele.get(0), op1);
			ac.assertEquals(actualele.get(1), op2);
			ac.assertEquals(actualele.get(2), op3);
			ac.assertEquals(actualele.get(3), op4);
			ac.assertEquals(actualele.get(4), op5);
			ac.assertEquals(actualele.get(5), op6);
			ac.assertEquals(actualele.get(6), op7);
			ac.assertEquals(actualele.get(7), op8);
			ac.assertEquals(actualele.get(8), op9);
			ac.assertEquals(actualele.get(9), op10);
			ac.assertEquals(actualele.get(10),op11);
			ac.assertEquals(actualele.get(11),op12);
			ac.assertEquals(actualele.get(12),op13);
			
			ac.assertAll();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
	
	
	
	
	
	@Then("varify Wich_List_Product_Name {string},{string},{string}")
	public void varify_desktops_link_dropdown_product_name(String op1,String op2, String op3) {
	   
	ArrayList<String> actualele = pd.Wich_List_Product_Name();
		try
		{
		ac.assertEquals(actualele.get(0), op1);
		ac.assertEquals(actualele.get(1), op2);
		ac.assertEquals(actualele.get(2), op3);
		ac.assertAll();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Then("varify Wich_List_Model_Name {string},{string},{string}")
	public void varify_Wich_List_Model_Name(String op1, String op2, String op3) {
	   
	ArrayList<String> actualele = pd.Wich_List_Model_Name();
	try
	{
		ac.assertEquals(actualele.get(0), op1);
		ac.assertEquals(actualele.get(1), op2);
		ac.assertEquals(actualele.get(2), op3);
		ac.assertAll();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	
	

	@Then("varify Wich_List_Produc_Stock {string},{string},{string}")
	public void varify_Wich_List_Produc_Stock(String op1, String op2, String op3) {
	   
	ArrayList<String> actualele = pd.Wich_List_Produc_Stock();
	try
	{
		ac.assertEquals(actualele.get(0), op1);
		ac.assertEquals(actualele.get(1), op2);
		ac.assertEquals(actualele.get(2), op3);
		ac.assertAll();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	
	  

		@Then("varify Wich_List_Product_Unit_Price {string},{string},{string}")
		public void varify_Wich_List_Product_Unit_Price(String op1, String op2, String op3) {
		   
		ArrayList<String> actualele = pd.Wich_List_Product_Unit_Price();
		try
		{
			ac.assertEquals(actualele.get(0), op1);
			ac.assertEquals(actualele.get(1), op2);
			ac.assertEquals(actualele.get(2), op3);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	@Then("varify Wish_List Click")
	public void varify_Wish_List_click() {

		pd.Wish_List_Click();
	}

	@Then("varify Searchh {string} IsDisplayed {string}")
	public void varify_Searchh_is_displayed(String LoginpageFileds, String Expectedfiled) {

		if (LoginpageFileds.equalsIgnoreCase("url")) {

			ac.assertEquals(pd.url(), Expectedfiled);
			scn.log("expected condition pass" + Expectedfiled);

		}

		if (LoginpageFileds.equalsIgnoreCase("Title")) {

			ac.assertEquals(pd.Title(), Expectedfiled);
			scn.log("expected condition pass" + Expectedfiled);

		}

	}

}
