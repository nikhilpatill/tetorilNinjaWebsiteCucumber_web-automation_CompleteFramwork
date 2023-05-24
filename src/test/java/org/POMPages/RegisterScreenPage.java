
package org.POMPages;

import java.util.List;

import org.ActionClassUtility.ActionClassGenericMethod;
import org.BaseUtility.startUp;
import org.WaitUtility.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.propertiesUtility.PropertiesGeneric;
import org.testng.Reporter;

public class RegisterScreenPage {
	
	
	@FindBy(xpath="//a[@title=\"My Account\"]")
	private WebElement My_AccountTXT ;
 	

	@FindBy(xpath="//ul[@class=\"dropdown-menu dropdown-menu-right\"]/li/a[text()=\"Register\"]")
	private WebElement RegisterTxt  ;
	 	
	
	@FindBy(xpath="//input[@name=\"firstname\"]")
	private WebElement First_Name;
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	private WebElement Last_Name ;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement E_Mail ;
	
	@FindBy(xpath="//input[@name=\"telephone\"]")
	private WebElement Telephone ;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement Password ;
	
	@FindBy(xpath="//input[@name=\"confirm\"]")
	private WebElement Password_Confirm ;
	
	@FindBy(xpath="//input[@type=\"radio\" and @name=\"newsletter\"]")
	private WebElement Subscribe_radio ;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement Privacy_Policy_checkbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement Continue_btn ;
 	
	
	@FindBy(xpath="//legend[normalize-space()='Newsletter']")
	private WebElement Newsletter ;
	
	
	@FindBy(xpath="//h1[normalize-space()='Register Account']")
	private WebElement RegisterAccountTxt ;
	
	@FindBy(xpath="//a[normalize-space()='login page']")
	private WebElement login_pageTxt;
	
 	@FindBy(xpath="//b[normalize-space()='Privacy Policy']")
	private WebElement Privacy_Policy_Link;
 	
 	@FindBy(xpath="//div[text()=\"First Name must be between 1 and 32 characters!\"]")
	private WebElement First_Name_warning_message ;
 	
 	@FindBy(xpath="//div[text()=\"Last Name must be between 1 and 32 characters!\"]")
	private WebElement Last_Name_warning_message ;
 	
 	@FindBy(xpath="//div[text()=\"Telephone must be between 3 and 32 characters!\"]")
	private WebElement Telephone_warning_message ;                                          //Telephone_warning_message
 	                                                                                        //Password_warning_message
 	@FindBy(xpath="//div[text()=\"Password must be between 4 and 20 characters!\"]")        //Password_warning_message
	private WebElement Password_warning_message ;       
 	
	@FindBy(xpath="//div[text()=\"E-Mail Address does not appear to be valid!\"]")        //Password_warning_message
	private WebElement E_Mail_warning_message ;                                           //Privacy_Policy_warning_message
 	//Privacy_Policy_warning_message
 	
 	@FindBy(xpath="//div[text()=\"Warning: You must agree to the Privacy Policy!\"]")
	private WebElement Privacy_Policy_warning_message ;
 	
 	//div[text()="Warning: E-Mail Address is already registered!"]
 	@FindBy(xpath="//div[text()=\"Warning: E-Mail Address is already registered!\"]")        //Password_warning_message
	private WebElement E_Mail_warning_message_already_registered;   
 	
 	
	@FindBy(xpath="//label[@class=\"radio-inline\"]/input[@value=\"1\"]")
	private WebElement Yes_radio_btn ;
 	
	
	@FindBy(xpath="//a[text()=\"Subscribe / unsubscribe to newsletter\"]")
	private WebElement Subscribe_unsubscribe_to_newsletter ;
	
	@FindBy(xpath="//div/a[text()=\"My Account\"]")
	private WebElement My_Account ;
 	
	//div[@class="list-group"]/a[2]
	@FindBy(xpath="//div[@class=\"list-group\"]/a[2]")
	private WebElement Register_dropdownmenu ;
	
	@FindBy(xpath="//div[@class=\"list-group\"]/a[4]")
	private WebElement My_Account_dropdownmenu ;
	
	//a[@href="https://tutorialsninja.com/demo/index.php?route=account/register"and text()="Continue"]
	
	@FindBy(xpath="//a[@href=\"https://tutorialsninja.com/demo/index.php?route=account/register\"and text()=\"Continue\"]")
	private WebElement New_Customer_Continue ;
	
	
 	//----------------------------------footer section textlinks--------------------------------------
	
	//a[text()="About Us"]
	@FindBy(xpath="//a[text()=\"About Us\"]")
	private WebElement About_Us ;
	
	
	@FindBy(xpath="//a[text()=\"Delivery Information\"]")
	private WebElement Delivery_Information ;
	
	
	
	@FindBy(xpath="//a[text()=\"Privacy Policy\"]")
	private WebElement Privacy_Policy ;
	
	@FindBy(xpath="//a[text()=\"Terms & Conditions\"]")
	private WebElement Terms_Conditions ;
	
	@FindBy(xpath="//a[text()=\"Contact Us\"]")
	private WebElement Contact_Us ;
	
	@FindBy(xpath="//a[text()=\"Returns\"]")
	private WebElement Returns ;
	
	@FindBy(xpath="//a[text()=\"Site Map\"]")
	private WebElement Site_Map  ;
	
	@FindBy(xpath="//a[text()=\"Brands\"]")
	private WebElement Brands ;
	
	@FindBy(xpath="//a[text()=\"Gift Certificates\"]")
	private WebElement Gift_Certificates  ;
	
	@FindBy(xpath="//a[text()=\"Affiliate\"]")
	private WebElement Affiliate ;
	
	
	

	
	//Contructor  
	
	public RegisterScreenPage(WebDriver driver)
	
	{
		  this.driver=driver;
		  
		  PageFactory.initElements(driver,this);
	}
	

	
	
	//action methods ()
	
	public void Continue_btn_Click()
	{
		Continue_btn.click();
	}
	
	public void Subscribe_radio_Click()
	{
		
		Subscribe_radio.click();
	}
	

	public static  WebDriver driver;
	//webElemets 
	public void My_AccountTXT()
	{
		 My_AccountTXT.click();
	}
	
	public void  RegisterTXT()
	{
		RegisterTxt.click();
	}
	public String   NewsletteTxtr()
	{
		return Newsletter.getText();
	}
	
 	
 	public String varify_Register_Title()
 	{
 		return  driver.getTitle();
 		
 	}
 	
	
 	public String varify_Register_Url()
 	{
 		return driver.getCurrentUrl();
 		
 	}
 	
	
 	public boolean varify_Register_First_NameFiled_ISDisplayed()
 	{
 		return First_Name.isDisplayed();
 	}
 	
 	public boolean varify_Register_Last_NameFiled_ISDisplayed()
 	{
 		return Last_Name.isDisplayed();
 	}
 	public boolean varify_Register_E_MailFiled_ISDisplayed()
 	{
 		return E_Mail.isDisplayed();
 	}
 	public boolean varify_Register_TelephoneFiled_ISDisplayed()
 	{
 		return Telephone.isDisplayed();
 	}
 	public boolean varify_Register_PasswordFiled_ISDisplayed()
 	{
 		return Password.isDisplayed();
 	}
 	public boolean varify_Register_Password_ConfirmFiled_ISDisplayed()
 	{
 		return Password_Confirm.isDisplayed();
 	}
 	
 	
 	public  String varify_Register_First_NameFiled_placeholder_ISDisplayed()
 	{
 		return First_Name.getAttribute("placeholder");
 	}
 	
 	public  String varify_Register_Last_NameFiled_placeholder_ISDisplayed()
 	{
 		return Last_Name.getAttribute("placeholder");
 	}
 	public  String varify_Register_E_MailFiled_placeholde_ISDisplayed()
 	{
 		return E_Mail.getAttribute("placeholder");
 	}
 	public  String varify_Register_TelephoneFiled_placeholde_ISDisplayed()
 	{
 		return Telephone.getAttribute("placeholder");
 	}
 	public  String varify_Register_PasswordFiled_placeholde_ISDisplayed()
 	{
 		return Password.getAttribute("placeholder");
 	}
 	public  String varify_Register_Password_ConfirmFiled_placeholde_ISDisplayed()
 	{
 		return Password_Confirm.getAttribute("placeholder");
 	}
 	
 
 	public  void varify_Register_First_NameFiled_Sendkays(String value)
 	{
 		First_Name.sendKeys(value);
 	}
 	
 	public  void varify_Register_Last_NameFiledSendkays(String value)
 	{
 		 Last_Name.sendKeys(value);
 	}
 	public  void varify_Register_E_MailFiledSendkays(String value)
 	{
 		 E_Mail.sendKeys(value);
 	}
 	public  void varify_Register_TelephoneFiled_Sendkays(String value)
 	{
       Telephone.sendKeys(value);
 	}
 	public void varify_Register_PasswordFiled_Sendkays(String value)
 	{
 		 Password.sendKeys(value);
 	}
 	public void varify_Register_Password_ConfirmFiled_Sendkays(String value)
 	{
 		 Password_Confirm.sendKeys(value);
 	}
 	
 	
	
 
	



	public boolean varify_Continue_btn_btnFiled_ISDisplayed()
 	{
	      return Continue_btn.isDisplayed();   
 	}
	
	
	
	public String varify_Privacy_Policy_Link()
	{
		
		 return Privacy_Policy_Link.getText();
		
	}
	
	

	public void Privacy_Policy_checkbox_()
	{
		
		Privacy_Policy_checkbox.click();
		
	}
	
	
	
	
	public String varify_RegisterAccountTxt()
	{
		
		return RegisterAccountTxt.getText();
		
	}
	
	public String varify_login_pageTxt()
	{
		
		return login_pageTxt.getText();
		
	}
	
	// warning message 
	 //Telephone_warning_message
     //Password_warning_message
       //Password_warning_message
       //Privacy_Policy_warning_message

	
	public String varify_First_Name_warning_message()
	{
		
		return First_Name_warning_message.getText() ;  //Last_Name_warning_message
		
	}
	
	public String varify_Last_Name_warning_message()
	{
		
		return Last_Name_warning_message.getText();
		
	}
	public String varify_Telephone_warning_message()
	{
		
		return Telephone_warning_message.getText();
		
	}
	public String varify_Password_warning_message()
	{
		
		return Password_warning_message.getText();
		
	}
	public String varify_E_Mail_warning_message()
	{
		
		return E_Mail_warning_message.getText();
		
	}
	public String varify_Privacy_Policy_warning_message()
	{
		
		return Privacy_Policy_warning_message.getText();
		
	}
	
	public String varify_E_Mail_warning_message_already_registered()
	{
		
		return E_Mail_warning_message_already_registered.getText();
		
	}
	
	
	
	
	
	
	
	

	public void varify_Continue_btn_Click()
 	{
 		
		Continue_btn.click();
		
 	}
	
	public void  varify_login_pageLink_click()
	{
          login_pageTxt.click();  // Yes_radio_btn 
		
	}
	
	
	
	public void  varify_Yes_radio_btn_click()
	{
		Yes_radio_btn .click();  
		
	}
	

	public void  varify_Subscribe_unsubscribe_to_newsletter_click()
	{
		Subscribe_unsubscribe_to_newsletter .click();  
		
	}
	
	public void  varify_My_Account_click()
	{
		My_Account.click();  
		
	}
	
	public void  varify_My_Account_dropdownmenu_click()
	{
		My_Account_dropdownmenu.click();  
		
	}
	
	
	
	public void  varify_Register_dropdownmenu_click()
	{
		Register_dropdownmenu .click();  
		
	}
	
	public void  varify_New_Customer_Continue_click()
	{
		New_Customer_Continue.click();  
		
	}
	

	public void  actionclass_TabKey_click()
	{
		ActionClassGenericMethod ac=new ActionClassGenericMethod();
		
		ac.tab_keyByUsingActionClass(driver);
		 
		
	}
	

	public void  actionclass_EnterKey_click()
	{
		ActionClassGenericMethod ac=new ActionClassGenericMethod();
		
		ac.Enter_keyByUsingActionClass(driver);
		 
		
	}
	
/*	About_Us, Delivery , Privacy ,Policy Terms & Conditions ,Customer Service  ,Contact Us ,Returns ,Site Map 
	Brands
	Gift Certificates
	Affiliate
	Specials
	
	*/

	public void About_Us_click()
	{
		
		WebElement scoll= driver.findElement(By.tagName("html"));
		scoll.sendKeys(Keys.PAGE_DOWN);
		About_Us.click();	 
		
	}

	public void  Delivery_Informationlink_click()
	{
		WebElement scoll= driver.findElement(By.tagName("html"));
		scoll.sendKeys(Keys.PAGE_DOWN);
		 Delivery_Information.click();	 
		
	}

	public void  Terms_Conditionslink_click()
	{
		WebElement scoll= driver.findElement(By.tagName("html"));
		scoll.sendKeys(Keys.PAGE_DOWN);
		Terms_Conditions.click();	 
		
	}

	public void  Privacy_Policylink_click()
	{
		WebElement scoll= driver.findElement(By.tagName("html"));
		scoll.sendKeys(Keys.PAGE_DOWN);
		Privacy_Policy.click();	 
		
	}

	public void  Contact_Uslink_click()
	{
		WebElement scoll= driver.findElement(By.tagName("html"));
		scoll.sendKeys(Keys.PAGE_DOWN);
		Contact_Us.click();
		
	}

	public void  Returnslink_click()
	{
		WebElement scoll= driver.findElement(By.tagName("html"));
		scoll.sendKeys(Keys.PAGE_DOWN);	 
		Returns.click();
	}

	public void  Site_Maplink_click()
	{
		WebElement scoll= driver.findElement(By.tagName("html"));
		scoll.sendKeys(Keys.PAGE_DOWN);
		Site_Map.click();	 
		
	}

	public void  Brandslink_click()
	{
		WebElement scoll= driver.findElement(By.tagName("html"));
		scoll.sendKeys(Keys.PAGE_DOWN); 
		Brands.click();
	}

	public void  Gift_Certificateslink_click()
	{
		WebElement scoll= driver.findElement(By.tagName("html"));
		scoll.sendKeys(Keys.PAGE_DOWN);	 
		Gift_Certificates.click();
	}

	public void  Affiliatelink_click()
	{
		WebElement scoll= driver.findElement(By.tagName("html"));
		scoll.sendKeys(Keys.PAGE_DOWN);
		Affiliate.click(); 
		
	}

	
	
	
	
	
	
	
	
	
	
		
 	
 	
 
}
