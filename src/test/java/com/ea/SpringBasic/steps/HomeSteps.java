package com.ea.SpringBasic.steps;

import com.ea.SpringBasic.models.TestUserDetails;
import com.ea.SpringBasic.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HomeSteps {

    @Autowired
    private LoginPage loginPage;
    @Autowired
    private TestUserDetails testUserDetails;
    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        //List<String> data = table.asList();
        loginPage.Login(testUserDetails.getUserDetails().getUsername(), testUserDetails.getUserDetails().getPassword());
    }
}
