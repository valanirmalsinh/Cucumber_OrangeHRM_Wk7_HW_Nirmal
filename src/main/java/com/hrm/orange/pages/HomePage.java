package com.hrm.orange.pages;

import com.hrm.orange.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
    WebElement admin;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
    WebElement pIM;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Leave']")
    WebElement leave;

    //this method will click on the search
    public void setSearch() {
        clickOnElement(search);
        log.info("Click on " + search.toString());
    }

    //this method will click on admin
    public void setAdmin() {
        clickOnElement(admin);
        log.info("Click on " + admin.toString());
    }

    //this method will click on the PIM
    public void setUpIM() {
        clickOnElement(pIM);
        log.info("Click on " + pIM.toString());
    }

    //this method will click on leave
    public void setLeave() {
        clickOnElement(leave);
        log.info("Click on " + leave.toString());
    }
}
