package com.ea.SpringBasic.runner;

import io.cucumber.spring.CucumberContextConfiguration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/java/com/ea/SpringBasic/feature"},
        plugin = {"json:target/cucumber.json", "pretty"},
        glue = "com.ea.SpringBasic.steps"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
