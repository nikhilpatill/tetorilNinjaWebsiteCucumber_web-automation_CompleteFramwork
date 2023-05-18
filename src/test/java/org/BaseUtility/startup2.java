package org.BaseUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class startup2 {
	
	public void waitForPresenceOfByType(WebDriver driver, long time, String type, String Webelement) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		if (type.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Webelement)));
		} else if (type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Webelement)));
		} else if (type.equalsIgnoreCase("css selector")) {

			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Webelement)));
		} else if (type.equalsIgnoreCase("tagname")) {

			wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(Webelement)));
		}

		else if (type.equalsIgnoreCase("tagname")) {

			wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(Webelement)));
		}

	}


  public void waitForClickableByType(WebDriver driver, long time, String type, String Webelement) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		if (type.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Webelement)));
		} else if (type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id(Webelement)));
		} else if (type.equalsIgnoreCase("css selector")) {

			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Webelement)));
		} else if (type.equalsIgnoreCase("tagname")) {

			wait.until(ExpectedConditions.elementToBeClickable(By.tagName(Webelement)));
		}

		else if (type.equalsIgnoreCase("tagname")) {

			wait.until(ExpectedConditions.elementToBeClickable(By.tagName(Webelement)));
		}

	}

	public void waitForclickableWebElement(WebDriver driver, long time, String type, String Webelement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		if (type.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Webelement))));
		} else if (type.equalsIgnoreCase("cssLocator")) {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(Webelement))));
		} else if (type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(Webelement))));
		} else if (type.equalsIgnoreCase("classname")) {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className(Webelement))));

		} else if (type.equalsIgnoreCase("tagname")) {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.tagName(Webelement))));
		}

	}

	public void waitForInvisiblityWebElement(WebDriver driver, long time, String type, String Webelement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		if (type.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(Webelement))));
		} else if (type.equalsIgnoreCase("cssLocator")) {
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(Webelement))));
		} else if (type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id(Webelement))));
		} else if (type.equalsIgnoreCase("classname")) {
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.className(Webelement))));

		} else if (type.equalsIgnoreCase("tagname")) {
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.tagName(Webelement))));
		}

	}

	public void waitForInVisibilityByType(WebDriver driver, long time, String type, String Webelement) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		if (type.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Webelement)));
		} else if (type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(Webelement)));
		} else if (type.equalsIgnoreCase("css selector")) {

			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Webelement)));
		} else if (type.equalsIgnoreCase("tagname")) {

			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName(Webelement)));
		}

		else if (type.equalsIgnoreCase("tagname")) {

			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName(Webelement)));
		}

	}

	public void waitForVisibilityByType(WebDriver driver, long time, String type, String Webelement) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(Webelement))));
		if (type.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Webelement)));
		} else if (type.equalsIgnoreCase("cssselector")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Webelement)));
		} else if (type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Webelement)));
		} else if (type.equalsIgnoreCase("classname")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(Webelement)));
		}
	}

	public void waitForVisibilityWebElement(WebDriver driver, long time, String type, String Webelement) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(Webelement))));
		if (type.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Webelement))));
		} else if (type.equalsIgnoreCase("cssselector")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(Webelement))));
		} else if (type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(Webelement))));
		} else if (type.equalsIgnoreCase("classname")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(Webelement))));
		}
	}

	public WebDriver startUp2(String url, String type)
	{
		
		WebDriver   driver=null;
		
		if(type.equalsIgnoreCase("ch")||type.equalsIgnoreCase("chrome"))
		{
			//launch the chrome browser 
		
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("start-maximized");
			 driver = new ChromeDriver(option);
			
		}
		else if(type.equalsIgnoreCase("ff")|| type.equalsIgnoreCase("firefox"))
		{
			
			FirefoxOptions option =new FirefoxOptions();
			option.addArguments("start-maximized");
			  driver =new FirefoxDriver();
		}
		else if(type.equalsIgnoreCase("ed")||type.equalsIgnoreCase("Edge") )
		{
			  EdgeOptions optin =new EdgeOptions();
			  optin.addArguments("start-maximized");
			    driver =new EdgeDriver();
			  
			  
			  
		}
		
	   driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(url);	
		return driver;
		
	}
	

}
