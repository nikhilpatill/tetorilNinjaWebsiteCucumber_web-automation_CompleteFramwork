package org.WaitUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitGenericMethod {
	
	
	
	
	
	public void isAlertpresent(WebDriver driver, long time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

	}


	public void waitUrlContains(WebDriver driver, long time ,String name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(name));

	}

	public void waitTitleContains(WebDriver driver, long time ,String name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(name));

	}

	
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
	
	public boolean waitForattributeTobe(WebDriver driver, WebElement ele, String attribute, String maxvalue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		 wait.until(ExpectedConditions.attributeToBe(ele, attribute, maxvalue));
		 return true;
        
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


}
