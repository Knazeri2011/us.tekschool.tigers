package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

// Cucumber Options:

//	We will use to setup the TestRunner class and to run our tests
//	we will use the @RunWith(Cucumber.class)
//	Cucumber Options, by using these options we can glue our features with stepDefinition methods
//	and by using other options, we can add the features,scenario, or scenario outline tag and
//	run those specific test
//	@CucumberOptions(we can use all cucumber options we need here)we use all the cucumber option inside ()

//The options in cucumber are:
//	features = we can add the path to our feature files here
//	glue = we can add the path to our stepDefinitions and those stepDefinitions will be glued to our features
//	tag = By adding the tags we will specify which features, scenario outline we want to run	
//	dryRun = If we set this to true, it will check and make sure we have stepDefinition methods
//	for each of the test steps in our feature files, but if we set this to false, then it will
//	run all of the tests that we have added the tag in feature file and to tag option in TestRunner class
//  the strict tag will mark our scenario as failed if there is not stepDefinition method available
//	monochrome = will help us to print the stepDifinition methods in clean format in the console
//	and we have to set this to true

@RunWith(Cucumber.class)
@CucumberOptions(
		// make sure when you type classpath:features, all letters are lower case
		features = "classpath:features",
		glue = "stepDefinitions",
		//tags = "@loginTest", 
				tags = "@smoke", 
		dryRun = false,
		strict = true,
		monochrome = true,
		plugin = {
				"pretty",
				"html:target/site/cucumber-pretty",
				"json:target/cucumber.json"
				},
		//if we set this to false it will not generate report for us
		        publish = true
		        )

public class TestRunner {

	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
	}
	
}
