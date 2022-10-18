package com.NcinoTask.pages;

import com.NcinoTask.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonArsenalHomeKitPage extends AmazonBagePage {

    @FindBy(xpath = "//img[contains(@alt,'AFC Arsenal London 17/18 Home Kit')]")
    public WebElement arsenalHomeKit;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartButton;

    public void selectItem(){
        Driver.getDriver().findElement(By.xpath("//img[@alt='AFC Arsenal London 17/18 Home Kit Replica Shirt']")).click();
    }

    @FindBy(xpath = "//select[@name=\"dropdown_selected_size_name\"]")
    public WebElement amazonSizeSelect;



}
