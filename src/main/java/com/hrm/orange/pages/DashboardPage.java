package com.hrm.orange.pages;

import com.hrm.orange.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashBoard;
    @CacheLookup
    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
    WebElement userLogo;
    @CacheLookup
    @FindBy(linkText = "Logout")
    WebElement userLogout;

    //this method will click on logout
    public void setUserLogout() {
        mouseHoverToElementAndClick(userLogout);
        log.info("Mouse hover on " + userLogout.toString());
    }

    //this method wil click on profile logo
    public void setUserLogo() {
        clickOnElement(userLogo);
        log.info("Click on " + userLogo.toString());
    }

    //this method will get dashboard text
    public String getDashBoardText() {
        log.info("Get text " + dashBoard.toString());
        return getTextFromElement(dashBoard);
    }
}
