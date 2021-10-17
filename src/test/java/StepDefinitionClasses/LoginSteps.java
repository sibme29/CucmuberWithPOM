package StepDefinitionClasses;

import PageObjectRepository.CloudVoteHomePage;
import PageObjectRepository.CloudVoteLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginSteps {
    public WebDriver driver1;
    public  WebDriverWait wait;
@Before
    public void OpenBrowser()
{
    String ProjectPath= System.getProperty("user.dir");
    System.out.println("Path = " + ProjectPath);
    System.setProperty("webdriver.chrome.driver", ProjectPath+"/src/Drivers/chromedriver.exe");
    driver1 = new ChromeDriver();
    driver1.manage().window().maximize();
    wait=new WebDriverWait(driver1,60);
}
    @Given("Open CloudVote")
    public void open_cloud_vote() throws InterruptedException {
       driver1.get("https://cloudvotestagingtemp.azurewebsites.net/");
       Thread.sleep(2000);
    }
    @Then("CloudVote has Launched Successfully")
    public void cloud_vote_has_launched_successfully() {
        wait.until(ExpectedConditions.visibilityOf(CloudVoteLoginPage.UserEmail(driver1)));
      Assert.assertTrue(CloudVoteLoginPage.UserEmail(driver1).isDisplayed());
    }
    @When("^Entered (.*)and (.*)$")
    public void entered_shumas3_yopmail_com_and_qwe123(String Username,String Password) {
    CloudVoteLoginPage.UserEmail(driver1).sendKeys(Username);
    CloudVoteLoginPage.UserPassword(driver1).sendKeys(Password);

    }
    @When("Click on Login Button")
    public void click_on_login_button() {
    CloudVoteLoginPage.LoginButton(driver1).click();
    }
    @Then("Verify Login Successful")
    public void verify_login_successful() {
    wait.until(ExpectedConditions.visibilityOf(CloudVoteHomePage.MySubscription(driver1)));

    }
    @After
    public  void CloseBrowser()
    {
        driver1.quit();
    }

}
