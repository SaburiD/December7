package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//Features/Addcompany.feature",
		glue = "Stepdefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-report/CRMCustomer_report_.html"}
		
		
		)




public class Runner {

}
