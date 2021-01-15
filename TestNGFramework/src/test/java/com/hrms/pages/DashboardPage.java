package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage{

    @FindBy(id = "welcome")
    WebElement welcomeMessage;

    @FindBy(linkText = "PIM")
    public WebElement PIMButton;

    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmployeeBtn;

    public DashboardPage() {
        PageFactory.initElements(CommonMethods.driver, this);
    }
}