package ui.settings;

import io.cucumber.testng.AbstractTestNGCucumberTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "featureFiles", glue = "pages")
public class CucumberRunner extends AbstractTestNGCucumberTest {
}