package com.NcinoTask.pages;

import com.NcinoTask.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBagePage {

    public AmazonBagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Continue")
    public WebElement amazonContinueWithoutAcceptingCookieLink;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement amazonSearchBox;

    @FindBy(id ="nav-search-submit-button")
    public WebElement amazonSearchButton;

    @FindBy(id = "nav-cart-text-container")
    public WebElement amazonBasket;





}
