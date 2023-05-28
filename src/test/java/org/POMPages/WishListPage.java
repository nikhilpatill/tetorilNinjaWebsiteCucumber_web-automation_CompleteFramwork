
package org.POMPages;


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

import io.cucumber.java.en.Then;

public class WishListPage {

	public static WebDriver driver;
	// webElemets
	@FindBy(xpath = "//span[@class=\"input-group-btn\"]/button/i")
	private WebElement SearchBTN;

	@FindBy(xpath = "//div[@id=\"content\"]/h1")
	private WebElement SearchTxt;

	@FindBy(xpath="//a[@title=\"My Account\"]")
	private WebElement My_AccountTXT ;
 	
	@FindBy(id="input-email")
    private WebElement username;
	
	@FindBy(id="input-password")
	private WebElement password ;
	
	@FindBy(id="//td[@class=\"text-left\"][1]")
	private List<WebElement> Wich_List_Product_Name ;
	
	@FindBy(id="//td[@class=\"text-left\"][2]")
	private List<WebElement> Wich_List_Model_Name;
	
	@FindBy(id="//td[@class=\"text-right\"][1]")
	private List<WebElement> Wich_List_Produc_Stock;
	
	//div[@class="list-group"]/a
	
	@FindBy(id="//div[@class=\"list-group\"]/*")
	private List<WebElement> Wich_List_RightSide_product;
	
	
	@FindBy(id="//td[@class=\"text-right\"][2]")
	private List<WebElement> Wich_List_Product_Unit_Price;
	
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement submit ;
	
	//a[text()="Continue"]
	@FindBy(xpath="//button[@onclick=\"wishlist.add('41');\"]")
    private WebElement wishlist_add_;
	

	@FindBy(xpath="//a[text()=\"Continue\"]")
	private WebElement ContinueBTN ;
 	
	@FindBy(xpath="//a[text()=\"Login\"]")
	private WebElement LoginTXT ;
	
	@FindBy(xpath="//div[@id=\"search\"]/input[@name=\"search\"]")
	private WebElement SearchBox ;
	
	@FindBy(xpath="//span[@class=\"input-group-btn\"]/button/i")
    private WebElement SearchBTN1;
	
	@FindBy(xpath="//button[@onclick=\"cart.add('41');\"]")
    private WebElement Wish_List_product_ADD_TO_Cart;
	
	//button[@onclick="cart.add('41');"]

	@FindBy(xpath = "//span[text()=\"Wish List (2)\"]")
	private WebElement Wish_List;

	@FindBy(xpath = "//div[@class=\"caption\"]//a")
	private List<WebElement> Search_Productes;

	// Contructor

	public WishListPage(WebDriver driver)

	{
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// action methods ()
	
	
	public void varify_SearchBox_Sendkays(String value)
 	{
		SearchBox.sendKeys(value);
		
 		
 	}
	
	public void SearchBTN_Click1()
	{
		SearchBTN1.click();
	}
	
	
public void WishList_add_Click() {
		
		wishlist_add_.click();
	}
	
	
	
	
	public void My_AccountTXT_Click()
	{
		My_AccountTXT.click();
	}
	
	public void  LoginTXT_Click()
	{
		LoginTXT.click();
	}
	public void  ContinueBTN_Click()
	{
		ContinueBTN.click();
	}
	
	public void  Wish_List_product_ADD_TO_Cart_Click()
	{
		Wish_List_product_ADD_TO_Cart.click();
	}
	
	
	public ArrayList<String> Wich_List_Product_Name()
	{
		startUp sb =new startUp();
		
	return	sb.getAllTextFromList(Wich_List_Product_Name);
		
	
		
	}
	
	public ArrayList<String> Wich_List_Model_Name()
	{
		startUp sb =new startUp();
		
	return	sb.getAllTextFromList(Wich_List_Model_Name);
		
		
	}
	
	public ArrayList<String>Wich_List_RightSide_functionality_Menu()
	{
		startUp sb =new startUp();
		
	driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
	return	sb.getAllTextFromList2(Wich_List_RightSide_product);
		
	
	}
	
	
	public int Wich_List_RightSide_functionality_Menu_count()
	{
		List<WebElement> products= Wich_List_RightSide_product;
		return products.size();

		
	}

	
	
	
	
	
	public ArrayList<String> Wich_List_Produc_Stock()
	{
		startUp sb =new startUp();
		return sb.getAlltabNames(Wich_List_Produc_Stock);
		
	}
	
	
	

	public ArrayList<String> Wich_List_Product_Unit_Price() {
		startUp sb =new startUp();
		return sb.getAlltabNames(Wich_List_Product_Unit_Price);
	}
	
	
	
	public void varify_Login_UsernameFiled_Sendkays(String value)
 	{
 		 username.sendKeys(value);
		
 		
 	}
	
	
 	public void varify_Login_password_Sendkays(String value)
 	{

 		 password.sendKeys(value);
 		
 		
 	}
	
	public void varify_Login_Click()
 	{
 		
		    submit.click();
		
 	}
	
	

	
	
	
	

	public String varify_SearchTxt() {

		return SearchTxt.getText();

	}

	public void SearchBTN_Click() {
		SearchBTN.click();
	}

	public void Wish_List_Click() {
		Wish_List.click();
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

	public int varify_SearchBox_DisplayProducts() {

		List<WebElement> products = Search_Productes;
		return products.size();

	}


	
	

}
