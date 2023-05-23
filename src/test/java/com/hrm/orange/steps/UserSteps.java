package com.hrm.orange.steps;

import com.hrm.orange.pages.AddUserPage;
import com.hrm.orange.pages.HomePage;
import com.hrm.orange.pages.LoginPage;
import com.hrm.orange.pages.ViewSystemUsersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class UserSteps {
    @Given("^Login to Application$")
    public void loginToApplication() throws InterruptedException {
        Thread.sleep(500);
        new LoginPage().setUserName("Admin");
        new LoginPage().setPassword("admin123");
        new LoginPage().setLogIn();
    }

    @And("^Verify \"([^\"]*)\" Text$")
    public void verifyText(String expected) throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(new ViewSystemUsersPage().getAddUser(),expected,"Add user is not displayed");
    }

    @And("^enter Username$")
    public void enterUsername() throws InterruptedException {
        Thread.sleep(500);
        new AddUserPage().setUserName("Odis .Adalwin");
    }

    @And("^enter password$")
    public void enterPassword() throws InterruptedException {
        Thread.sleep(500);
        new AddUserPage().setPassword("Admin@123");
    }

    @And("^enter Confirm Password$")
    public void enterConfirmPassword() {
        new AddUserPage().setConfirmPassword("Admin@123");
    }

    @Then("^verify message \"([^\"]*)\"$")
    public void verifyMessage(String expected) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new AddUserPage().getSuccessfullySavedText(),expected,"User is not added");
    }

    @And("^click On Admin Tab$")
    public void clickOnAdminTab() {
        new HomePage().setAdmin();
    }

    @When("^click On Add button$")
    public void clickOnAddButton() {
        new AddUserPage().clickOnAddButton();
    }

    @And("^click On Save Button$")
    public void clickOnSaveButton() {
        new AddUserPage().setSave();
    }

    @When("^Select User Role Admin$")
    public void selectUserRoleAdmin() {
        new AddUserPage().setUserRole();
    }

    @And("^Select status Disable$")
    public void selectStatusDisable() {
        new AddUserPage().selectStatusFromDropDown();
    }

    @And("^Verify this \"([^\"]*)\" Text$")
    public void verifyThisText(String expected) {
        Assert.assertEquals(new ViewSystemUsersPage().getSystemUserText(),expected,"System user text is not displayed");
    }

    @And("^enter Employee Name$")
    public void enterEmployeeName() throws InterruptedException {
        Thread.sleep(1000);
        new AddUserPage().setEmployeeName("Odis");
    }

    @And("^Select User Role$")
    public void selectUserRole() {

    }

    @And("^Select Status$")
    public void selectStatus() {
        new AddUserPage().selectStatusFromDropDown();
    }

    @And("^Click on Search Button$")
    public void clickOnSearchButton() {
        new ViewSystemUsersPage().setSearch();
    }

    @Then("^Verify the User should be in Result list\\.$")
    public void verifyTheUserShouldBeInResultList() {
        Assert.assertEquals(new ViewSystemUsersPage().getUsernamePresentText(),"Odis .Adalwin","User is not present in list");
    }

    @When("^Enter Username to search$")
    public void enterUsernameToSearch() {
       new ViewSystemUsersPage().setUserName("Odis .Adalwin");
    }

    @When("^Click on Check box$")
    public void clickOnCheckBox() {
        new ViewSystemUsersPage().clickOnCheckBox();
    }

    @And("^Click on Delete Button$")
    public void clickOnDeleteButton() {
        new ViewSystemUsersPage().clickDeleteButton();
    }

    @And("^Popup will display and Click on Ok Button on Popup$")
    public void popupWillDisplayAndClickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnPop();
    }

    @Then("^verify delete message \"([^\"]*)\"$")
    public void verifyDeleteMessage(String expected) throws InterruptedException {
       Assert.assertEquals(new ViewSystemUsersPage().getSuccessfulDeleteText(),expected,"User is not deleted");
    }

    @Then("^verify no record message \"([^\"]*)\"$")
    public void verifyNoRecordMessage(String expected){
        Assert.assertEquals(new AddUserPage().getNoRecordFoundText(),expected,"User is found");
    }
}
