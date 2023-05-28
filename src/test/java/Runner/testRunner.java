package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.*;




@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="src/test/resourse/org.Feature/ADDTOCart.feature",
		
		glue={ "org/StepDefination" },
		
		
		plugin= {"pretty", "html:target/html_Report/Cucumber.html",
				           "junit:target/xml_Report/Cucumber.xml",
		                   "json:target/Json_Report/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/FailedtestRunner.txt"
		},                           
		
		
		dryRun=false,
		
	tags="@nikhil"
		
	
		
		
		)










public class testRunner {
	
	
	
	

}
