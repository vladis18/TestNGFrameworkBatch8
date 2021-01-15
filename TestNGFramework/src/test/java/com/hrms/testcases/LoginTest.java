package com.hrms.testcases;

import com.hrms.pages.DashboardPage;
import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends CommonMethods {

    @Test
    public void adminLogin() {
        LoginPage login = new LoginPage();
        sendText(login.usernameBox, ConfigsReader.getPropertyValue("username"));
        sendText(login.passwordBox, ConfigsReader.getPropertyValue("password"));
        click(login.loginBtn);
        //validation
        DashboardPage dashboardPage = new DashboardPage();
       // Assert.assertTrue(dashboardPage.welcomeMessage.isDisplayed(), "Welcome message is NOT dispalyed");
    }
        @DataProvider
        public Object[][] invalidData() {
            Object[][] data = {{"Admin", "123", "Invalid credentials"},
            { "Admin1", "Hu@hrm123", "Invalid credentials"},
            { "Admin", "", "Password Cannot be empty" },
            { "Admin", "", "Username Cannot be empty"}};
            return data;
    }
}