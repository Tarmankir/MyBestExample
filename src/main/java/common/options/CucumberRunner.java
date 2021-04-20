package common.options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "featureFiles", glue = "pages")
public class CucumberRunner extends AbstractTestNGCucumberTests {
}