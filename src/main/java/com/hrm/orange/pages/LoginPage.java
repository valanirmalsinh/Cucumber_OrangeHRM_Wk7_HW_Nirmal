package com.hrm.orange.pages;

import com.hrm.orange.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
  private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
  public LoginPage() {
    PageFactory.initElements(driver, this);
  }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement logIn;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
    WebElement hrLogo;
    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement logInPanelText;

    //this method will verify if the logo is present or not
  public boolean logoIsPresent(){
    log.info("Logo is displayed " + hrLogo.toString());
    return hrLogo.isDisplayed();
  }
    public String setLogInPanelText() throws InterruptedException {
      //log.info("Get text " + logInPanelText.toString());
      Thread.sleep(1000);
        return getTextFromElement(logInPanelText);
    }
    //this method will get the log in text
    public void setLogIn(){
        clickOnElement(logIn);
      log.info("Click on " + logIn.toString());
    }
    //this method will send the username in the username field
    public void setUserName(String name) {
        sendTextToElement(userName, name);
      log.info("Send text " + userName.toString());
    }

    //this method will send the password in the password filed
    public void setPassword(String pass) {
        sendTextToElement(password, pass);
      log.info("Send text " + password.toString());
    }
}
