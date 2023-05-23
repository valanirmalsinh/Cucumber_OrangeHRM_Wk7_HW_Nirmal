package com.hrm.orange.pages;

import com.hrm.orange.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addUser;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text--after'][1]/i")
    WebElement userRole;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement adminRole;
    @CacheLookup
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    WebElement status;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement userName;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='oxd-select-option'])[3]/span")
    WebElement statusDisable;
    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement save;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancel;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-autocomplete-option']/span")
    WebElement userSelection;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-toast-content oxd-toast-content--success']/p[2]")
    WebElement successfullySavedText;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='No Records Found']")
    WebElement noRecordFoundMessage;


    // this method will send text to username
    public void setUserName(String uname) {
        sendTextToElement(userName, uname);
        log.info("Enter user name : " + userName.toString());
    }

    //this method will click on add button
    public void clickOnAddButton() {
        clickOnElement(addUser);
        log.info("Click add user : " + addUser.toString());
    }

    //this method will click on save button
    public void setSave() {
        clickOnElement(save);
        log.info("Click on save : " + save.toString());
    }

    //this method will click on cancel button
    public void setCancel() {
        clickOnElement(cancel);
        log.info("Click on cancel : " + cancel.toString());
    }

    //this method will send keys to confirm the password
    public void setConfirmPassword(String confirmpass) {
        sendTextToElement(confirmPassword, confirmpass);
        log.info("Send text : " + confirmPassword.toString());
    }

    //this method will send the keys to the password filed
    public void setPassword(String pass) {
        sendTextToElement(password, pass);
        log.info("Send text : " + password.toString());
    }

    //this method will select the status
    public void selectStatusFromDropDown() {
        clickOnElement(status);
        clickOnElement(statusDisable);
        log.info("Select status : " + status.toString());

    }

    //this method will send the name to employee name field
    public void setEmployeeName(String name) throws InterruptedException {
        sendTextToElement(employeeName, name);
        Thread.sleep(1000);
        clickOnElement(userSelection);
        log.info("Send text : " + employeeName.toString());
    }

    //this method will select the user role
    public void setUserRole() {
        clickOnElement(userRole);
        clickOnElement(adminRole);
        log.info("Set role : " + adminRole.toString());
    }

    public String getSuccessfullySavedText() throws InterruptedException {
        log.info("Get text : " + successfullySavedText.toString());
        Thread.sleep(1000);
        return  getTextFromElement(successfullySavedText);
    }

    public String getNoRecordFoundText(){
        log.info("Get text : " + noRecordFoundMessage.toString());
        return getTextFromElement(noRecordFoundMessage);
    }
}
