package com.ea.SpringBasic.libraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@Configuration
public class WebDriverLibrary {

    public WebDriver driver;

    @Bean
    public WebDriver getChromeDriver() {

        if (driver == null){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver");
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(TimeUnit.SECONDS.toSeconds(5), TimeUnit.SECONDS);
        }
        return driver;
    }

    /*@Bean
    public WebDriver getFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

     */

}
