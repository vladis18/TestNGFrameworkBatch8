package com.hrms.testcases;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.DashboardPage;
import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import org.testng.annotations.Test;

public class AddEmployeeTest extends CommonMethods {

    @Test
    public void addEmployee() {
        //login to the hrms
        LoginPage login = new LoginPage();
        login.login(ConfigsReader.getPropertyValue("username"), ConfigsReader.getPropertyValue("password"));
        //navigate to add employee page
        DashboardPage dash = new DashboardPage();
        jsClick(dash.PIMButton);
        jsClick(dash.addEmployeeBtn);
        //add employee
        AddEmployeePage addEmp = new AddEmployeePage(driver);
        sendText(addEmp.firstNameTextBox, "Daria");
        sendText(addEmp.lastNameTextbox, "Denchuk");
        click(addEmp.saveButton);
        //validation
        //assertion
    }

}