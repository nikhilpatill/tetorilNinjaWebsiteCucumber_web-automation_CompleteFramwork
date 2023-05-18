
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

public class LoginScreenPage {
	
	public static  WebDriver driver;
	//webElemets 
	@FindBy(xpath="//input[@name=\"username\"]")
     private WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password ;
	
	
 	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement submit ;
	
	@FindBy(xpath="//img[@alt=\"orangehrm-logo\"]")
	private List<WebElement> lobo ;
	

 	@FindBy(xpath="//h6[text()=\"Dashboard\"]")
	private WebElement dashboadTxt ;


 	@FindBy(xpath="//h5[text()=\"Login\"]")
	private WebElement LoginTxt ;

	
	//Contructor  
	
	public LoginScreenPage(WebDriver driver)
	
	{
		  this.driver=driver;
		  
		  PageFactory.initElements(driver,this);
	}
	

	
	
	//action methods ()
 	
 	public String varify_Login_Title()
 	{ return  driver.getTitle();
 		
 	}
 	
	
 	public String varify_Login_Url()
 	{
 		return driver.getCurrentUrl();
 		
 	}
 	
	
 	public boolean varify_Login_UsernameFiled_ISDisplayed()
 	{
 		return username.isDisplayed();
 	}
 	
	public String varify_Login_passwordFiled_placeholder_ISDisplayed()
 	{
 		return password.getAttribute("placeholder");
 		
 	
 	}
 
 	
 	public String varify_Login_UsernameFiled_placeholder_ISDisplayed()
 	{
 		return username.getAttribute("placeholder");
 		
 	
 	}
 
	
	public void varify_Login_UsernameFiled_Sendkays(String value)
 	{
 		 username.sendKeys(value);
		
 		
 	}
	
	
 	public boolean varify_Login_PasswordFiled_ISDisplayed()
 	{

 		return  password.isDisplayed();  
 		
 		
 	}
 	
	
 	public void varify_Login_PasswordFiled_sendKeys(String value)
 	{
      
          password.sendKeys(value);
 	
 	}
	



	public boolean varify_Login_btnFiled_ISDisplayed()
 	{
	      return submit.isDisplayed();   
 	}
	
	public String varify_Login_DhashBoadTxt_()
	{
		
		WaitGenericMethod wait =new WaitGenericMethod();
		wait.waitForInvisiblityWebElement(driver, 20, "xpath", "dashboadTxt");
		return dashboadTxt.getText();
		
	}
	
	public String varify_Login_LoginTxt_()
	{
		
		return LoginTxt.getText();
		
	}
	
	

	public void varify_Login_Click()
 	{
 		
		    submit.click();
		
 	}
	
	public void varify_tab_Kay()
 	{
		//ActionClassGenericMethod ac=new ActionClassGenericMethod();
 		//ac.tab_keyByUsingActionClass(driver);
		  Actions act = new Actions(driver);
		  act.sendKeys(Keys.TAB).perform();
 	}
	
	public void varify_send_Kay(String value)
 	{
		//ActionClassGenericMethod ac=new ActionClassGenericMethod();
 		//ac.tab_keyByUsingActionClass(driver);
		  Actions act = new Actions(driver);
		  act.sendKeys().perform();
 	}
	
	
	
	
	public void varify_Enter_kay()
 	{
		ActionClassGenericMethod ac=new ActionClassGenericMethod();
 		
		  ac.Enter_keyByUsingActionClass(driver);
 	}
	
	
	
	public boolean varify_Login_lobo()
 	{
 		for(int i=0;i<2;i++)
 		{
 			if(!lobo.get(i).isDisplayed())
 			{
 				return false;
 				
 			}
 			
 		}
 		
 		return true ;
		 
		
 	}
 	
 
}
