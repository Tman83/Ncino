package com.NcinoTask.stepDefinitions;

import com.NcinoTask.utilities.BrowserUtils;
import com.NcinoTask.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setupScenarioForLogins(){

        Driver.getDriver().get("https://www.amazon.co.uk/");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();

    }


    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value


        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        BrowserUtils.sleep(2);
        Driver.closeDriver();
        BrowserUtils.sleep(2);


    }

}
