package settings;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "featureFiles", glue = "ui/cucumber/selenium")
public class CucumberRunnerSelenium extends AbstractTestNGCucumberTests {
}