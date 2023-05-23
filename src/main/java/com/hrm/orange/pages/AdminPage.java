package com.hrm.orange.pages;

import com.hrm.orange.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[1]")
    WebElement userManagement;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
    WebElement job;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")
    WebElement organisation;

}
