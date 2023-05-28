
package org.POMPages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.ActionClassUtility.ActionClassGenericMethod;
import org.BaseUtility.startUp;
import org.WaitUtility.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;

public class CheckOutpage {

	public static WebDriver driver;
	// webElemets
	@FindBy(xpath = "//span[@class=\"input-group-btn\"]/button/i")
	private WebElement SearchBTN;

	@FindBy(xpath = "//div[@id=\"content\"]/h1")
	private WebElement SearchTxt;

	@FindBy(xpath = "//a[@title=\"My Account\"]")
	private WebElement My_AccountTXT;

	@FindBy(id = "input-email")
	private WebElement username;

	@FindBy(id = "input-password")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement submit;
	
	@FindBy(xpath="//a[text()=\"Login\"]")
	private WebElement LoginTXT ;
	
	//a[@title='Checkout']//i[@class='fa fa-share']
	
	@FindBy(xpath="//a[@title='Checkout']//i[@class='fa fa-share']")
	private WebElement CheackOut_Btn;
	

	@FindBy(xpath="//a[@class='accordion-toggle collapsed']")
	private WebElement Billing_DetailsTxt_click ;
	
	//input[@value='existing']
	@FindBy(xpath="//input[@value='existing']")
	private WebElement existing_addressRadio_Btn ;
	
	@FindBy(xpath="//input[@id='button-payment-address']")
	private WebElement Billing_Continue_Btn ;
	
	@FindBy(xpath="//input[@id='button-shipping-address']")
	private WebElement Delivery_Continue_Btn ;
	
	//input[@id='button-shipping-method']
	
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement Delivery_method_Continue_Btn ;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement Terms_Conditions_check_Box ;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement payment_method_Continue_Btn ;
	//input[@id='button-confirm']
	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement Conform_order_Btn ;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement order_placed_Continue ;
	
	@FindBy(xpath="//div[@id=\"search\"]/input[@name=\"search\"]")
	private WebElement SearchBox ;
	
	@FindBy(xpath="//button[@onclick=\"cart.add('41', '1');\"]")
    private WebElement ADD_TO_Cart_;
	
	@FindBy(xpath="//span[@class=\"input-group-btn\"]/button/i")
    private WebElement SearchBTN1;
	
	
	
	
	

	// Contructor

	public CheckOutpage(WebDriver driver)

	{
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	public void My_AccountTXT_Clickk()
	{
		My_AccountTXT.click();
	}
	
	public void  LoginTXT_Click()
	{
		LoginTXT.click();
	}
	
	
	
	

	public void varify_Login_UsernameFiled_Sendkays(String value) {
		username.sendKeys(value);

	}

	public void varify_Login_password_Sendkays(String value) {

		password.sendKeys(value);

	}

	public void varify_Login_Click() {

		submit.click();

	}
	
	public void CheackOut_Btn() {

		CheackOut_Btn.click();

	}
	
	
	public void varify_SearchBox_Sendkays(String value)
 	{
		SearchBox.sendKeys(value);
		
 		
 	}
	
	public void SearchBTN()
	{
		SearchBTN1.click();
	}
	
	
	public void ADD_TO_Cart_Click()
	{
		ADD_TO_Cart_.click();
	}
	
	
	public void Billing_Continue_Btn() {

		WaitGenericMethod wait=new WaitGenericMethod();
		wait.waitForClickableByType(driver, 15, "xpath", "//input[@id='button-payment-address']");
		Billing_Continue_Btn.click();

	}
	
	public void Delivery_Continue_Btn() {

		Delivery_Continue_Btn.click();

	}
	
	public void Delivery_method_Continue_Btn() {

		Delivery_method_Continue_Btn.click();

	}
	
	public void Terms_Conditions_check_Box() {

		Terms_Conditions_check_Box.click();

	}
	public void payment_method_Continue_Btn() {

		payment_method_Continue_Btn.click();

	}
	
	public void order_placed_Continue() {

		order_placed_Continue.click();

	}
	
	
	
	public void Conform_order_Btn() {

		Conform_order_Btn.click();

	}
	
	//input[@id='button-confirm']
	
	//input[@name='agree']
	
	
	
	
	public void Billing_DetailsTxt_click() {

		
		Billing_DetailsTxt_click.click();

	}
	
	
	public void existing_addressRadio_Btn() {
		// TODO Auto-generated method stub
		existing_addressRadio_Btn.click();
	}
	
	
	
	

	public void SearchBTN_Click() {
		SearchBTN.click();
	}

	public String url() {
		return driver.getCurrentUrl();
	}

	public String Title() {
		return driver.getTitle();
	}

	public void varify_TabKeyclick() {
		ActionClassGenericMethod ac = new ActionClassGenericMethod();
		ac.tab_keyByUsingActionClass(driver);

	}

	public void varify_EnterKeyclick() {
		ActionClassGenericMethod ac = new ActionClassGenericMethod();
		ac.Enter_keyByUsingActionClass(driver);

	}








}
