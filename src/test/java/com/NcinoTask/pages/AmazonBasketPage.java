package com.NcinoTask.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonBasketPage extends AmazonBagePage {


    @FindBy(xpath = "//span[@class=\"a-button-text a-declarative\"]")
    public WebElement amazonQuantityDropDown;

    @FindBy(linkText = "2")
    public WebElement amazonDropdownQuantityInput;

    @FindBy(xpath = "(//span[@class=\"a-size-medium a-color-base sc-price sc-white-space-nowrap\"])[1]")
    public WebElement amazonPriceVerification;





}
