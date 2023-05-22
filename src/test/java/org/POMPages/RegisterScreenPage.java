
package org.POMPages;

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
 	//--------------------------------------------------------------------------
	
	

	
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
	
	
	
	

	public void varify_Continue_btn_Click()
 	{
 		
		Continue_btn.click();
		
 	}
	
	
	
	
	
	
	
	
		
 	
 	
 
}
