package ui.settings;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "featureFiles", glue = "ui/selenium/pages")
public class CucumberRunnerSelenium extends AbstractTestNGCucumberTests {
}