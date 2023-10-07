package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HomePage extends BasePage{

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(how = How.LINK_TEXT, using = "Employee Details")
    WebElement lnkEmployeeDetails;
    public void ClickLogin(){
        lnkLogin.click();
        System.out.println("Click the home page login");
    }

    public void ClickEmployeeList(){
        lnkEmployeeList.click();
    }

    public Boolean isEmployeeDetailsExist(){
        return lnkEmployeeDetails.isDisplayed();
    }
}
