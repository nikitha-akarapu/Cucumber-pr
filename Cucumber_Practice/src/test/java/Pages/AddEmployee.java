package Pages;

import Utility.BaseClass;
import Utility.ExcelReader;
import java.util.Random;
import org.openqa.selenium.By;

public class AddEmployee extends BaseClass {

  private By employeesTab = By.xpath(
      "//*[@class='nav-item-icon']/following-sibling::*[text()='Employees']");
  private By addEmployeeBtn = By.xpath("//button[text()='Add Employee']");
  private By txtFirstName = By.xpath("//input[@name='firstName']");
  private By txtLastName = By.xpath("//input[@name='lastName']");
  private By txtId = By.xpath("//input[@name='id']");
  private By txtEmail = By.xpath("//input[@name='email']");
  private By sltRole = By.xpath("//select[@id='role']");
  private By txtPassword = By.xpath("//input[@name='password']");
  private By txtDOB = By.xpath("//input[@name='dob']");
  private By txtJoinigDate = By.xpath("//input[@name='joiningDate']");
  private By sltqualification = By.xpath("//select[@id='qualifications']");
  private By txtDepartment = By.xpath("//input[@name='department']");
  private By sltGender = By.xpath("//select[@id='gender']");
  private By txtMobile = By.xpath("//input[@name='mobileNumber']");
  private By sltBllodGrp = By.xpath("//select[@id='bloodGroup']");
  private By txtDesignation = By.xpath("//input[@name='designation']");
  private By txtSalary = By.xpath("//input[@name='salary']");
  private By txtLocation = By.xpath("//input[@name='location']");
  private By sltReportingTo = By.xpath("//*[@id='reportingTo']");
  private By employee = By.xpath("//*[@class='page-header-container']//*[text()='Employees']");
  private By addEmployee = By.xpath("//*[@class='modal-heading']");
  private By addBtn = By.xpath("//button[text()='Add']");
  private By txtSavedSuccessfully = By.xpath("//*[text()='Saved Successfully']");


  public void clickEmployeesTab() {
    waitUntilTheElementIsDisplayed(employeesTab);
    driver.findElement(employeesTab).click();
  }

  public boolean isEmployeeTabDisplayed() {
    waitUntilTheElementIsDisplayed(employee);
    return driver.findElement(employee).isDisplayed();
  }

  public void clickAddEmployeeBtn() {
    waitUntilTheElementIsDisplayed(addEmployeeBtn);
    driver.findElement(addEmployeeBtn).click();
  }

  public boolean isAddEmployeeTextDisplayed() {
    waitUntilTheElementIsDisplayed(addEmployee);
    return driver.findElement(addEmployee).isDisplayed();
  }

  public void enterFirstName() {
    String firstName = ExcelReader.getData("FirstName");
    waitUntilTheElementIsDisplayed(txtFirstName);
    driver.findElement(txtFirstName).sendKeys(BaseClass.getRandomAlphabetic(5)+firstName);
  }

  public void enterLastName() {
    String lastName = ExcelReader.getData("LastName");
    waitUntilTheElementIsDisplayed(txtLastName);
    driver.findElement(txtLastName).sendKeys(getRandomAlphabetic(5)+lastName);
  }

  public void enterEmployeeID() {
    String employeeID = ExcelReader.getData("EmployeeID");
    waitUntilTheElementIsDisplayed(txtId);
    driver.findElement(txtId).sendKeys(employeeID+getRandomAlphabetic(5));
  }

  public void enterEmail() {
    String email = ExcelReader.getData("Email");
    waitUntilTheElementIsDisplayed(txtEmail);
    driver.findElement(txtEmail).sendKeys(email+getRandomAlphabetic(5)+"@gmail.com");
  }

  public void selectRole() {
    String role = ExcelReader.getData("Role");
    By element = By.xpath("//select[@id='role']//option[text()='" + role + "']");
    waitUntilTheElementIsDisplayed(sltRole);
    driver.findElement(sltRole).click();
    waitUntilTheElementIsDisplayed(element);
    driver.findElement(element).click();
  }

  public void enterPassword() {
    String password = ExcelReader.getData("Password");
    waitUntilTheElementIsDisplayed(txtPassword);
    driver.findElement(txtPassword).sendKeys(password);
  }

  public void enterDOB() {
    String dateOfBirth = ExcelReader.getData("DateOfBirth");
    waitUntilTheElementIsDisplayed(txtDOB);
    driver.findElement(txtDOB).sendKeys(dateOfBirth);
  }

  public void enterJoiningDate() {
    String joiningDate = ExcelReader.getData("JoiningDate");
    waitUntilTheElementIsDisplayed(txtJoinigDate);
    driver.findElement(txtJoinigDate).sendKeys(joiningDate);
  }

  public void selectQualifications() {
    String qualification = ExcelReader.getData("Qualification");
    By element = By.xpath("//select[@id='qualifications']//option[text()='" + qualification + "']");
    waitUntilTheElementIsDisplayed(sltqualification);
    driver.findElement(sltqualification).click();
    waitUntilTheElementIsDisplayed(element);
    driver.findElement(element).click();
  }

  public void enterDepartment() {
    String department = ExcelReader.getData("Department");
    waitUntilTheElementIsDisplayed(txtDepartment);
    driver.findElement(txtDepartment).sendKeys(department);
  }

  public void selectGender() {
    String gender = ExcelReader.getData("Gender");
    By element = By.xpath("//select[@id='gender']//option[text()='" + gender + "']");
    waitUntilTheElementIsDisplayed(sltGender);
    driver.findElement(sltGender).click();
    waitUntilTheElementIsDisplayed(element);
    driver.findElement(element).click();
  }

  public void enterMobileNumber() {
    String mobileNumber = ExcelReader.getData("MobileNumber");
    waitUntilTheElementIsDisplayed(txtMobile);
    driver.findElement(txtMobile).sendKeys(mobileNumber);
  }

  public void selectBloodGroup() {
    String bloodGroup = ExcelReader.getData("BloodGroup");
    By element = By.xpath("//select[@id='bloodGroup']//option[text()='" + bloodGroup + "']");
    waitUntilTheElementIsDisplayed(sltBllodGrp);
    driver.findElement(sltBllodGrp).click();
    waitUntilTheElementIsDisplayed(element);
    driver.findElement(element).click();
  }

  public void enterDesignation() {
    String designation = ExcelReader.getData("Designation");
    waitUntilTheElementIsDisplayed(txtDesignation);
    driver.findElement(txtDesignation).sendKeys(designation);
  }

  public void enterSalary() {
    String salary = ExcelReader.getData("Salary");
    waitUntilTheElementIsDisplayed(txtSalary);
    driver.findElement(txtSalary).sendKeys(salary);
  }

  public void enterLocation() {
    String location = ExcelReader.getData("Location");
    waitUntilTheElementIsDisplayed(txtLocation);
    driver.findElement(txtLocation).sendKeys(location);
  }

  public void selectReportingTO() {
    String reportingTo = ExcelReader.getData("ReportingTo");
    By element = By.xpath("//select[@id='reportingTo']//option[text()='" + reportingTo + "']");
    waitForFewMilliSeconds(30000);
    waitUntilTheElementIsDisplayed(sltReportingTo);
    driver.findElement(sltReportingTo).click();
//    if (isElementNotDisplayed(5, element)) {
//      System.out.println("Inside if loop the element is not displayed");
//      for (int i = 0; i < 3; i++) {
//        System.out.println("Inside for loop");
//        driver.findElement(sltReportingTo).click();
//        if(isElementNotDisplayed(5, element)){
//          System.out.println("Inside break if loop");
//          break;
//        }
//      }
//    }
    waitForFewMilliSeconds(10000);
    waitUntilTheElementIsDisplayed(element);
    driver.findElement(element).click();
  }

  public void clickAddBtn() {
    waitUntilTheElementIsDisplayed(addBtn);
    driver.findElement(addBtn).click();
  }

  public boolean isSavedSuccessfullyTextDisplayed() {
    waitUntilTheElementIsDisplayed(txtSavedSuccessfully);
    return driver.findElement(txtSavedSuccessfully).isDisplayed();
  }

}
