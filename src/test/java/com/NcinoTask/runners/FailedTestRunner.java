package com.NcinoTask.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(


        glue = {"com/NcinoTask/stepdefinitions", "com/NcinoTask/failedTestHooks"},
        features = "@target/rerun.txt"

)
public class FailedTestRunner {

}
