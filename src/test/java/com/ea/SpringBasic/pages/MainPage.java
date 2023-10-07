package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@ConditionalOnProperty(name = "env", havingValue = "qa")
public class MainPage extends BasePage {

    //field dependency injection
    @Autowired
    private HomePage homePage;
    @Autowired
    private LoginPage loginPage;


    //Constructor dependency injection
//    public MainPage(LoginPage loginPage, HomePage homePage){
//        this.homePage = homePage;
//        this.loginPage = loginPage;
//    }


    public void performLogin(){
        homePage.ClickLogin();
        loginPage.Login("admin", "password");
        loginPage.ClickLogin();
    }
}
