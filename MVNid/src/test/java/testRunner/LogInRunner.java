package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/feature/login.feature",
		glue = {"stepDefinitions"}, //runs all the classes on  stepDefinitions
		tags = "not @ignore"
		)

public class LogInRunner extends AbstractTestNGCucumberTests {

}
