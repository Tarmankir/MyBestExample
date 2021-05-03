package ui.settings;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "featureFiles", glue = "ui/selenide")
public class CucumberRunnerSelenide extends AbstractTestNGCucumberTests {
}