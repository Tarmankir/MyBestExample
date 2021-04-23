package common.options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featureFiles", glue = "src/main/java/ui/selenium/pages")
public class CucumberRunner extends AbstractTestNGCucumberTests {
}