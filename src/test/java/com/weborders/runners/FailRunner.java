package com.weborders.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class )
@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = "com/weborders/stepdefinitions",
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",
        }
)
public class FailRunner {
}
