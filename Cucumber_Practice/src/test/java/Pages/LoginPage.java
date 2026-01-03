package Pages;

import Utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {

  private By emailID = By.cssSelector("#userEmail");
  private By password = By.cssSelector("#userPassword");
  private By loginBtn = By.xpath("//button[@type='submit']");
  private By dashboardTxt = By.xpath(
      "//*[contains(@class,'main-container')]//*[text()='Dashboard']");
  private By welcomeTxt = By.xpath("//*[@class='welcomeMessage']");

  public void enterEmail(String email) {
    waitUntilTheElementIsDisplayed(emailID);
    driver.findElement(emailID).sendKeys(email);
  }

  public void enterPassword(String pwd) {
    waitUntilTheElementIsDisplayed(password);
    driver.findElement(password).sendKeys(pwd);
  }

  public void clickLoginBtn() {
    waitUntilTheElementIsDisplayed(loginBtn);
    driver.findElement(loginBtn).click();
  }

  public boolean isUserDashboardDisplayed() {
    waitUntilTheElementIsDisplayed(dashboardTxt);
    return driver.findElement(dashboardTxt).isDisplayed();
  }

  public String getWelcomePageTxt() {
    waitUntilTheElementIsDisplayed(welcomeTxt);
    return driver.findElement(welcomeTxt).getText();
  }


}
