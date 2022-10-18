package com.NcinoTask.stepDefinitions;

import com.NcinoTask.pages.AmazonArsenalHomeKitPage;
import com.NcinoTask.pages.AmazonBagePage;
import com.NcinoTask.pages.AmazonBasketPage;
import com.NcinoTask.utilities.BrowserUtils;
import com.NcinoTask.utilities.ConfigurationReader;
import com.NcinoTask.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AmazonStepDefinitions {

    AmazonBagePage amazonBagePage = new AmazonBagePage();
    AmazonArsenalHomeKitPage amazonArsenalHomeKitPage = new AmazonArsenalHomeKitPage();
    AmazonBasketPage amazonBasketPage = new AmazonBasketPage();


    @Given("that I am on the Amazon Homepage")
    public void that_i_am_on_the_amazon_homepage() {

        String expectedPageTitle = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";
        String actualPageTitle = Driver.getDriver().getTitle();
        System.out.println("Page title : " + expectedPageTitle);
        Assert.assertTrue("User on the WRONG Page!!!", actualPageTitle.equals(expectedPageTitle));

        amazonBagePage.amazonContinueWithoutAcceptingCookieLink.click();

    }

    @When("I search for an item on Amazon")
    public void i_search_for_an_item_on_amazon() {

        amazonBagePage.amazonSearchBox.sendKeys("Arsenal home kit");
        amazonBagePage.amazonSearchButton.click();
        amazonBagePage.amazonSearchButton.click();
    }


    @And("I am on the item page")
    public void i_am_on_the_item_page() {

        String expectedPageTitle = "Amazon.co.uk : Arsenal home kit";
        String actualPageTitle = Driver.getDriver().getTitle();
        System.out.println("Page title : " + expectedPageTitle);
        Assert.assertTrue("User on the WRONG Page!!!", actualPageTitle.equals(expectedPageTitle));
    }

    @And("I select the item")
    public void i_select_the_item() {

        amazonArsenalHomeKitPage.selectItem();
    }

    @And("I click Add to Basket")
    public void i_click_add_to_basket() {

        Select size = new Select(amazonArsenalHomeKitPage.amazonSizeSelect);
        size.selectByIndex(2);

        BrowserUtils.sleep(3);

        amazonArsenalHomeKitPage.addToCartButton.click();

        BrowserUtils.sleep(3);

    }


    @And("I can see the item in the basket")
    public void i_can_see_the_item_in_the_basket() {

        amazonBagePage.amazonBasket.click();

        Assert.assertTrue(amazonArsenalHomeKitPage.arsenalHomeKit.isDisplayed());
    }

    @And("I increase the quantity to {int}")
    public void i_increase_the_quantity_to(Integer quantity) {

        amazonBasketPage.amazonQuantityDropDown.click();

        amazonBasketPage.increaseItemCount(quantity);



        BrowserUtils.sleep(3);

    }

    @Then("I can see the correct subtotal")
    public void i_can_see_the_correct_subtotal() {

        String expectedSubtotal = "£147.94";
        String actualSubtotal = amazonBasketPage.amazonPriceVerification.getText();

        System.out.println("The subtotal is: "+actualSubtotal+" ");

        Assert.assertEquals(expectedSubtotal,actualSubtotal);
    }


}


