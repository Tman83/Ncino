package com.NcinoTask.pages;

import com.NcinoTask.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonBasketPage extends AmazonBagePage {


    @FindBy(xpath = "//span[@class=\"a-button-text a-declarative\"]")
    public WebElement amazonQuantityDropDown;

    @FindBy(xpath = "(//span[@class=\"a-size-medium a-color-base sc-price sc-white-space-nowrap\"])[1]")
    public WebElement amazonPriceVerification;

    //Created a method which allows produt quantity to be used dynamically if needed.
    public void increaseItemCount(Integer quantity){
        Driver.getDriver().findElement(By.xpath("//*[@aria-labelledby='quantity_" + quantity + "']")).click();
    }







}
