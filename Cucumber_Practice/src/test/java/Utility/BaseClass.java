package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

  public static WebDriver driver;
  Wait<WebDriver> wait = new FluentWait<>(driver)
      .withTimeout(Duration.ofSeconds(30))
      .pollingEvery(Duration.ofSeconds(1))
      .ignoring(NoSuchElementException.class);

  @Before
  public void launchBrowser() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();

//    Alert alert =  wait.until(ExpectedConditions.alertIsPresent());
//    alert.dismiss();
  }

  @After
  public void quitBrowser() {
//    driver.quit();
  }

  public void waitUntilTheElementIsDisplayed(By locator) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    System.out.println("waited for thr locator:"+locator);
  }

  public void waitForFewMilliSeconds(int milliSeconds)  {
    try {
      Thread.sleep(milliSeconds);
    }catch (InterruptedException e){
      System.out.print("Exception caught");
    }
  }

  public boolean isElementNotDisplayed(int timeout,By locator) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
      System.out.println("This locator is not displayed:"+locator);
      return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    } catch (Exception e) {
      return false;
    }
  }

  public static String getRandomAlphabetic(int length) {
    String characters = "abcdefghijklmnopqrstuvwxyz";
    StringBuilder result = new StringBuilder();
    Random random = new Random();

    for (int i = 0; i < length; i++) {
      result.append(characters.charAt(random.nextInt(characters.length())));
    }

    return result.toString();
  }


}
