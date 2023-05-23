package com.hrm.orange.pages;

import com.hrm.orange.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUserText;
    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUserText;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement userName;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]//div[2]/i")
    WebElement userRollDown;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    WebElement statusDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement search;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement reset;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement admin;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Enabled']")
    WebElement enableOption;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Delete Selected']")
    WebElement delete;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card']/div/div[2]/div")
    WebElement usernameText;
    @CacheLookup
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]")
    WebElement checkbox;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement popUp;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-toast-content oxd-toast-content--success']/p[2]")
    WebElement deleteMessage;
    //this method will click on the pop
    public void clickOnPop(){
        clickOnElement(popUp);
        log.info("Click on " + popUp.toString());
    }

    //this method will click on the check bo
    public void clickOnCheckBox() {
        clickOnElement(checkbox);
        log.info("Click on " + checkbox.toString());
    }

    //this method will get the username text
    public String getUsernamePresentText() {
        log.info("Get text " + usernameText.toString());
        return getTextFromElement(usernameText);
    }

    //this method will delete the record
    public void clickDeleteButton() {
        clickOnElement(delete);
        log.info("Click on " + delete.toString());
    }

    //this method will click on reset button
    public void setReset() {
        clickOnElement(reset);
        log.info("Click on " + reset.toString());
    }

    //this method will click on search'
    public void setSearch() {
        clickOnElement(search);
        log.info("Click on " + search.toString());
    }

    //this method will select the status
    public void setStatusDropDown() {
        clickOnElement(statusDropDown);
        clickOnElement(enableOption);
        log.info("Click on " + enableOption.toString());
    }

    //this method will send keys to employee field
    public void setEmployeeName(String name) {
        sendTextToElement(employeeName, name);
        log.info("Send text " + employeeName.toString());
    }

    //this method will select the role from user roll down
    public void selectAdminOptionFromDropDown() {
        clickOnElement(userRollDown);
        clickOnElement(admin);
        log.info("Click on " + admin.toString());
    }

    //this method will send the keys to username filed
    public void setUserName(String uName) {
        sendTextToElement(userName, uName);
        log.info("Send text " + userName.toString());
    }

    //this method will click on add button
    public String getAddUser() {
        log.info("Get text " + addUserText.toString());
        return getTextFromElement(addUserText);
    }

    //this method will get the system user text
    public String getSystemUserText() {
        log.info("Get text " + systemUserText.toString());
        return getTextFromElement(systemUserText);
    }

    public String getSuccessfulDeleteText() throws InterruptedException {
        Thread.sleep(500);
        log.info("Get text " + deleteMessage.toString());
        return getTextFromElement(deleteMessage);
    }
}
