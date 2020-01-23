package com.weborders.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class )
@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = "com/weborders/stepdefinitions",
        dryRun = false,
//        tags = "@view_all_orders",
//        tags = "login",
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class CucumberRunner {

}
