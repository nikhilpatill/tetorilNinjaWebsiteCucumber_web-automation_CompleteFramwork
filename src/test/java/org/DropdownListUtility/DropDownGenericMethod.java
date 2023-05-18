package org.DropdownListUtility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownGenericMethod {
	public String DefaultOptionSelecteInDDL(WebElement ele) {
		Select option = new Select(ele);
		return option.getFirstSelectedOption().getText();

	}

	public List<WebElement> AlloptiinsOptionSelecteInDDL(WebElement ele) {
		Select option = new Select(ele);
		return option.getOptions();
	}

	public int NumberOfDataInDDL(WebElement ele) {
		Select option = new Select(ele);
		return option.getOptions().size();

	}


}
