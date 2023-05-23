package com.hrm.orange.steps;

import com.hrm.orange.pages.DashboardPage;
import com.hrm.orange.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^Enter username$")
    public void enterUsername() {
        new LoginPage().setUserName("Admin");
    }

    @And("^Enter password$")
    public void enterPassword() {
        new LoginPage().setPassword("admin123");
    }

    @And("^Click on Login Button$")
    public void clickOnLoginButton() {
        new LoginPage().setLogIn();
    }

    @Then("^Verify \"([^\"]*)\" Message$")
    public void verifyMessage(String expected) {
        Assert.assertEquals(new DashboardPage().getDashBoardText(),expected,"Login not successful");
    }

    @When("^Launch the application$")
    public void launchTheApplication() {
    }

    @Then("^Verify Logo is Displayed$")
    public void verifyLogoIsDisplayed() {
        Assert.assertTrue(new LoginPage().logoIsPresent());
    }

    @Given("^I am on login page$")
    public void iAmOnLoginPage() {
    }

    @And("^Click on User Profile logo$")
    public void clickOnUserProfileLogo() {
        new DashboardPage().setUserLogo();
    }

    @And("^Mouse hover on Logout and click$")
    public void mouseHoverOnLogoutAndClick() {
        new DashboardPage().setUserLogout();
    }

    @And("^Verify the text \"([^\"]*)\" is displayed$")
    public void verifyTheTextIsDisplayed(String expected) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new LoginPage().setLogInPanelText(),"Login","Logout not successful");
    }
}
