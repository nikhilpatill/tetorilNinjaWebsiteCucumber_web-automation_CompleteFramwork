
package org.POMPages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.ActionClassUtility.ActionClassGenericMethod;
import org.BaseUtility.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;

public class ADDTOCartpage {

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
	
	@FindBy(xpath="//ul[@class=\"list-inline\"]/li[4]")
	private WebElement Shopping_Cart ;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]")
	private WebElement Update_ShoppingCart_click;
	
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement Update_ShoppingCart_Message;
	

	@FindBy(xpath="//a[@class='btn btn-default']")
	private WebElement Countinue_ShoppingCart;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement CheckoutBtn;
	
	@FindBy(xpath="//a[normalize-space()='Use Coupon Code']")
	private WebElement Use_Coupon_Code_txt_click;
	
	@FindBy(xpath="//body/div[@id='checkout-cart']/div[@class='row']/div[@id='content']/div[@id='accordion']/div[3]/div[1]")
	private WebElement Use_Gift_Certificate_txt_click;
	
	
	@FindBy(xpath="//input[@id='input-coupon']")
	private WebElement input_coupon_SendKey;

	@FindBy(xpath="//input[@id='input-voucher']")
	private WebElement input_voucher_SendKey;
	
	
	
	@FindBy(xpath="//input[@id='button-coupon']")
	private WebElement Applay_coupon_Btn ;
	//input[@id='button-voucher']
	@FindBy(xpath="//input[@id='button-voucher']")
	private WebElement Applay_voucher_Btn ;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement Warning_Coupon ;
	//div[@class='alert alert-danger alert-dismissible']
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement Warning_Gift;
	

	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement Warning_Coupon_blank;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement Warning_Gift_blank;
	
	//div[@class='alert alert-danger alert-dismissible']
	
	


	// Contructor

	public ADDTOCartpage(WebDriver driver)

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
	
	public void Use_Coupon_Code_txt_click()
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		Use_Coupon_Code_txt_click.click();
	}
	
	public void Use_Gift_Certificate_txt_click()
	{
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		Use_Gift_Certificate_txt_click.click();
	}
	
	
	
	
	public void CheckoutBtn_Click()
	{
		CheckoutBtn.click();
	}
	//a[normalize-space()='Use Coupon Code']
	
	
	public void Countinue_ShoppingCart_Click()
	{
		Countinue_ShoppingCart.click();
	}
	
	public void Update_ShoppingCart_click() {

		Update_ShoppingCart_click.click();

	}
	//input[@id='input-coupon']
	
	public void input_coupon_SendKey(String code) {

		input_coupon_SendKey.sendKeys(code);

	}
	
	public void input_voucher_SendKey(String code) {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(input_voucher_SendKey)); 
		wait.until(ExpectedConditions.elementToBeClickable(input_voucher_SendKey));
		input_voucher_SendKey.sendKeys(code);

	}
	
	
	
	public void Shopping_Cart_Click() {

		Shopping_Cart.click();

	}
	

	public void Applay_coupon_Btn() {

		Applay_coupon_Btn.click();

	}
	
	public void Applay_voucher_Btn() {

		Applay_voucher_Btn.click();

	}
	
	
	
	
	public String Update_ShoppingCart_Message() {

		return Update_ShoppingCart_Message.getText();

	}
	
	public String Warning_Coupon() {

		return Warning_Coupon.getText();

	}
	
	public String Warning_Coupon_blank() {

		return Warning_Coupon_blank.getText();

	}
	
	
	public String Warning_Gift_blank() {

		return Warning_Gift_blank.getText();

	}
	
	
	
	public String varify_SearchTxt() {

		return SearchTxt.getText();

	}
	

	public String Warning_Gift() {

		return Warning_Gift.getText();

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
