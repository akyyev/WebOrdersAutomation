package com.weborders.stepdefinitions;

import com.weborders.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook {

    @Before
    public void start(){
        System.out.println("-------------------");
        System.out.println("Start testing");
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void teardown(){
        Driver.close();
        System.out.println("End of the Test");
        System.out.println("-------------------");
    }




}
