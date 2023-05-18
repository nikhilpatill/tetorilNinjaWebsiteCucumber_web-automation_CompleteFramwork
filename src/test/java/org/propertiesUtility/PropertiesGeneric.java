package org.propertiesUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesGeneric {

	
	public String getPropertiesData(String key)
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\accelaration\\workspace2\\Cucumber_myPractice_Nikhil\\resources\\org\\PropertyFile\\Config.properties");
			Properties pop =new Properties();
			pop.load(fis);
			String value=pop.getProperty(key);
            return value;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
	}
	
	
}
