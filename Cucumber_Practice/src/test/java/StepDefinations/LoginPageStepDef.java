package StepDefinations;

import Pages.LoginPage;
import Utility.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageStepDef {
  LoginPage loginPage = new LoginPage();

  @When("user launches url")
  public void userLaunchesUrl() {
    BaseClass.driver.get(" https://dev.urbuddi.com");
  }

  @When("user enters {string} and {string}")
  public void userEntersAnd(String email, String password) {
    loginPage.enterEmail(email);
    loginPage.enterPassword(password);
    loginPage.clickLoginBtn();
  }


  @Then("user in navigates to dashboard page")
  public void userInNavigatesToDashboardPage() {
    Assert.assertTrue("user dashboard is not displayed",loginPage.isUserDashboardDisplayed());
  }

  @Then("login page is displayed {string}")
  public void loginPageIsDisplayed(String welcomePageTxt) {
    String actualWelcomePageTxt = loginPage.getWelcomePageTxt();
    Assert.assertEquals(welcomePageTxt,actualWelcomePageTxt);

  }

}
