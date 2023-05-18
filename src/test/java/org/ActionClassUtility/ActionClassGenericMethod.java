package org.ActionClassUtility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassGenericMethod {
	
	

	public void sendKeysByUsingWebelemetvalue(WebDriver driver, WebElement ele, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(ele, value).perform();

	}

	public void sendKeysByUsingvalue(WebDriver driver, WebElement ele, String value) {
		Actions act = new Actions(driver);
		act.click(ele).sendKeys(value).perform();

	}
	
	public void MoveToCtionClass(WebDriver driver ,  WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}

	public void dragandDropAtionClass(WebDriver driver ,  WebElement ele,  WebElement ele2)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(ele, ele2).perform();
		
	}

	public void dragandDropCtionAClass(WebDriver driver,  WebElement ele  ,int px1, int px2)
	{
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele, px1, px2).perform();
		
	}

	
	public void scrollByUsingActionClass(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();

	}

	public void scrollByXaxisUsingActionClass(WebDriver driver, WebElement ele, int x, int y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(x, y).perform();

	}

	public void rightClickByUsingActionClass(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}

	public void doubleClickByUsingActionClass(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}

	public void clickByUsingActionClass(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).perform();
	}


	public void tab_keyByUsingActionClass(WebDriver driver) {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		
	}
	

	public void Enter_keyByUsingActionClass(WebDriver driver) {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}


}
