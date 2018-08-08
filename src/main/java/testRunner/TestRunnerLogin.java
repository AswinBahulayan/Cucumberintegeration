package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//src//main//java//featureFile//login.feature"
		,glue= {"stepDefinition"})

public class TestRunnerLogin {

}
