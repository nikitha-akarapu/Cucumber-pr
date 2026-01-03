package StepDefinations;

import Pages.AddEmployee;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Random;
import org.junit.Assert;

public class AddEmployeeStepDef {
  AddEmployee addEmployee = new AddEmployee();

  @When("user navigates to employee tab on dashboard")
  public void usernavigatestoemployeetabondashboard(){
    addEmployee.clickEmployeesTab();
  }

  @Then("user verifies employee tab")
  public void userVerifiesEmployeeTabIsDisplayed() {
    Assert.assertTrue("Employee tab is not displayed",addEmployee.isEmployeeTabDisplayed());
  }

  @When("user clicks on add employee button")
  public void userClicksOnAddEmployeeButton() {
    addEmployee.clickAddEmployeeBtn();
  }

  @When("user adds the employee")
  public void userAddsTheEmployee() {
    addEmployee.enterFirstName();
    addEmployee.enterLastName();
    addEmployee.enterEmployeeID();
    addEmployee.enterEmail();
    addEmployee.selectRole();
    addEmployee.enterPassword();
    addEmployee.enterDOB();
    addEmployee.enterJoiningDate();
    addEmployee.selectQualifications();
    addEmployee.enterDepartment();
    addEmployee.selectGender();
    addEmployee.enterMobileNumber();
    addEmployee.selectBloodGroup();
    addEmployee.enterDesignation();
    addEmployee.enterSalary();
    addEmployee.enterLocation();
    addEmployee.selectReportingTO();
    addEmployee.clickAddBtn();
  }

  @Then("user verify add employee section")
  public void userVerifyAddEmployeeSection() {
    Assert.assertTrue("Add employee section is not displayed",addEmployee.isAddEmployeeTextDisplayed());
  }

  @Then("user verify employee adds successfully")
  public void userVerifyEmployeeAddsSuccessfully() {
    Assert.assertTrue("successfully saved user text is not displayed",addEmployee.isSavedSuccessfullyTextDisplayed());
  }
}
