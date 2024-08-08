package com.Nawy.todo.pages;

import com.Nawy.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Product extends BasePage {
    public Product(WebDriver driver) {super(driver);}
    @FindBy (css = ".name")
    private WebElement ProductName;

    @FindBy(linkText = "Add to cart")
    private WebElement AddToCartBTN;
    @FindBy(css = "#cartur")
    private WebElement CartBTN;



    public Cart AddToCart() throws InterruptedException {
        Assert.assertTrue(ProductName.isDisplayed());
        Assert.assertEquals(ProductName.getText(),"Apple monitor 24");
        Assert.assertTrue(AddToCartBTN.isDisplayed());
        AddToCartBTN.click();
        //CartBTN.click();
        Thread.sleep(3100);

        driver.switchTo().alert().accept();
        CartBTN.click();


return new Cart(driver);
    }


}

