package step_deffination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "featureFile",
		dryRun = false,
		glue = "step_deffination",
		
		plugin = {"pretty",
		  "html:target/cucumber.html",
		  "json:target/cucumber.json"
		},
		 tags = "@Regression"
		)



public class TestRunner1 extends AbstractTestNGCucumberTests
{

	
	
}
