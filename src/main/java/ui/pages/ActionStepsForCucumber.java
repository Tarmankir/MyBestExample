package ui.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ui.pagesSelenide.FeedbackPage;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ActionStepsForCucumber {

    private FeedbackPage feedbackPage;
    private WebDriver driver;

    @Given("Open site")
    public void getSite() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        feedbackPage = initElements(driver, FeedbackPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://habr.com/ru/feedback/");
    }

    @When("Click list options")
    public void clickList() {
        new FeedbackPage().listOptionTake();
    }

    @And("Enter email")
    public void emailIn() {
        new FeedbackPage().emailFieldTake();
    }

    @Then("Enter massage")
    public void massageIn() {
        new FeedbackPage().massageFieldTake();
    }
}