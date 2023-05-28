
package org.POMPages;

import java.util.ArrayList;
import java.util.List;

import org.ActionClassUtility.ActionClassGenericMethod;
import org.BaseUtility.startUp;
import org.WaitUtility.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.propertiesUtility.PropertiesGeneric;
import org.testng.Reporter;

public class SearchScreenPage {
	
	
	
	public static  WebDriver driver;
	//webElemets 
	@FindBy(xpath="//span[@class=\"input-group-btn\"]/button/i")
     private WebElement SearchBTN;
	
	@FindBy(xpath="//div[@id=\"content\"]/h1")
    private WebElement SearchTxt;
	
	
	@FindBy(xpath="//a[text()='Desktops']")
    private WebElement DesktopsLinkTxt;
	
	@FindBy(xpath="//a[text()='Components']")
    private WebElement ComponentsLinkTxt;
	
	@FindBy(xpath="	//a[text()='Laptops & Notebooks']")
    private WebElement Laptops_NotebooksTxt ;
	
	//button[@onclick="cart.add('41', '1');"]
	@FindBy(xpath="//button[@onclick=\"wishlist.add('41');\"]")
    private WebElement wishlist_add_;
	
	@FindBy(xpath="//button[@onclick=\"cart.add('41', '1');\"]")
    private WebElement ADD_TO_Cart_;
	
	//div[@class="alert alert-success alert-dismissible"]
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement ADD_TO_Cart_OR_wishlist_add_Message;
	
	
	
	@FindBy(xpath="//ul[@class=\"nav navbar-nav\"]/li[1]//ul[@class=\"list-unstyled\"]/li")
	private List<WebElement> DesktopsLinkDropdownProductName;
	
	@FindBy(xpath="//ul[@class=\"nav navbar-nav\"]/li[2]//ul[@class=\"list-unstyled\"]/li")
	private List<WebElement> Laptops_NotebooksLinkDropdownProductName;
	
	@FindBy(xpath="//ul[@class=\"nav navbar-nav\"]/li[3]//ul[@class=\"list-unstyled\"]/li")
	private List<WebElement> ComponentsLinkDropdownProductName;
	
	//select[@id="input-sort"]/*
	@FindBy(xpath="//select[@id=\"input-sort\"]/*")
	private List<WebElement> SortedByDropdownOption;
	
	//select[@id="input-sort"]/option[2]
	@FindBy(xpath="//select[@id=\"input-sort\"]/option[5]")
	private WebElement SortedPrice_High_To_Low;
	
	@FindBy(xpath="//select[@id=\"input-sort\"]/option[4]")
	private WebElement SortedPrice_Low_To_High;
	
	//select[@id="input-sort"]/option[4]
	
	@FindBy(xpath="//select[@id=\"input-sort\"]")
	private WebElement SortedBox ;
	
	@FindBy(xpath="//div[@id=\"search\"]/input[@name=\"search\"]")
	private WebElement SearchBox ;
	
	//select[@name="category_id"]
	
	@FindBy(xpath="//select[@name=\"category_id\"]")
	private WebElement CategoryBoxClick ;
	
	
	@FindBy(xpath="//select[@name=\"category_id\"]/option[5]")
	private WebElement CategoryBox4optionClick ;
	
	@FindBy(xpath="//select[@name=\"category_id\"]/option")
	private List<WebElement> CategoryBoxoption;
	
	
	
	@FindBy(xpath="//ul[@class=\"nav navbar-nav\"]/li")
	private List<WebElement> Navigation_Bar_product_option;
	

	@FindBy(xpath="//input[@id=\"input-search\"]")
	private WebElement DescriptionBox ;
	
	@FindBy(xpath="//input[@name=\"description\"]")
	private WebElement DescriptionCheckBox;
	
	@FindBy(xpath="//input[@id=\"button-search\"]")
	private WebElement DescriptionSearchBtn;
	
	//input[@id="button-search"]
	
	@FindBy(xpath="//div[@class=\"caption\"]//a")
	private List<WebElement> Search_Productes ;
	
	
	//Contructor  
	
	public SearchScreenPage(WebDriver driver)
	
	{
		  this.driver=driver;
		  
		  PageFactory.initElements(driver,this);
	}
	

	
	
	//action methods ()
	

	public String varify_SearchTxt()
	{
		
		return SearchTxt.getText();
		
	}
	
	public String ADD_TO_Cart_OR_wishlist_add_Message()
	{
		
		return ADD_TO_Cart_OR_wishlist_add_Message.getText();
		
	}
	
	
	
	public void SearchBTN_Click()
	{
		SearchBTN.click();
	}
	
	
	
	public void ADD_TO_Cart_Click()
	{
		ADD_TO_Cart_.click();
	}
	
	
	
	

	public void WishList_add_Click() {
		
		wishlist_add_.click();
	}
	
	
	public void CategoryBoxClick_Click()
	{
		CategoryBoxClick.click();
	}
	

	public void CategoryBox4optionClick()
	{
		CategoryBox4optionClick.click();
	}
	
	
	
	
	
	
	
	public ArrayList<String> CategoryBoxoptionName()
	{
		startUp sb=new startUp();
		return sb.getAlltabNames(CategoryBoxoption);
		
	}
	
	public void DesktopsLinkTxt()
	{
		ActionClassGenericMethod ac =new ActionClassGenericMethod();
		ac.MoveToCtionClass(driver, DesktopsLinkTxt);
		
	}
	
	public void ComponentsLinkTxt()
	{
		ActionClassGenericMethod ac =new ActionClassGenericMethod();
		ac.MoveToCtionClass(driver, ComponentsLinkTxt);
		
	}
	
	public void Laptops_NotebooksLinkTxt()
	{
		ActionClassGenericMethod ac =new ActionClassGenericMethod();
		ac.MoveToCtionClass(driver, Laptops_NotebooksTxt);
		
	}
	
	
	
	public ArrayList<String> Navigation_Bar_product_Name()
	{
		startUp sb=new startUp();
		
		return sb.getAlltabNames(Navigation_Bar_product_option);
		
	}
	
	

	public ArrayList<String> DesktopsLinkDropdownProductName()
	{
		startUp sb=new startUp();
		
		return sb.getAlltabNames(DesktopsLinkDropdownProductName);
		
	}
	
	public ArrayList<String> Laptops_NotebooksLinkDropdownProductName()
	{
		startUp sb=new startUp();
		
		return sb.getAlltabNames(Laptops_NotebooksLinkDropdownProductName);
		
	}
	
	
	public ArrayList<String> ComponentsLinkDropdownProductName()
	{
		startUp sb=new startUp();
		
		return sb.getAlltabNames(ComponentsLinkDropdownProductName);
		
	}

	public ArrayList<String> SortedByDropdownOption()
	{
		startUp sb=new startUp();
		
		return sb.getAlltabNames(SortedByDropdownOption);
		
	}
	
	
	
	public String url()
	{
		return driver.getCurrentUrl();
	}
	
	public String Title()
	{
		return driver.getTitle();
	}
	


	public void DescriptionCheckBox_Click()
	{
		DescriptionCheckBox.click();
	}
	
	public void DescriptionSearchBtn_Click()
	{
		DescriptionSearchBtn.click();
	}
	
	public void SortedBox_Click()
	{
		SortedBox.click();
	}
	
	public void SortedPrice_High_To_Low()
	{
		SortedPrice_High_To_Low.click();
	}
	
	public void SortedPrice_Low_To_High()
	{
		SortedPrice_Low_To_High.click();
	}
	
	
	
	
	public void varify_DescriptionBox_Sendkays(String value)
 	{
		DescriptionBox.sendKeys(value);
		
 		
 	}
	
	public void varify_SearchBox_Sendkays(String value)
 	{
		SearchBox.sendKeys(value);
		
 		
 	}
	
	
	public void varify_TabKeyclick()
 	{
		ActionClassGenericMethod ac =new ActionClassGenericMethod();
		ac.tab_keyByUsingActionClass(driver);
		
 		
 	}
	
	public void varify_EnterKeyclick()
 	{
		ActionClassGenericMethod ac =new ActionClassGenericMethod();
		ac.Enter_keyByUsingActionClass(driver);
		
 		
 	}
	

	public int varify_SearchBox_DisplayProducts()
 	{
		
		List<WebElement> products= Search_Productes;
		return products.size();
	
		
 	}







	
	
	
	
	
 
	
 	
 
}
