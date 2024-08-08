package com.Nawy.todo.pages;

import com.Nawy.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Cart extends BasePage {
    public Cart(WebDriver driver) {super(driver);}

    @FindBy (css = ".success")
            private WebElement Product;
    @FindBy(linkText = "Apple monitor 24")
            private WebElement ProductName;
    @FindBy(css = ".btn.btn-success")
    private WebElement PlaceOrderBTN;

    @FindBy(css = "#orderModalLabel")
    private WebElement OrderTable;

    @FindBy(css = "#name")
    private WebElement OrderName;
    @FindBy(css = "#country")
    private WebElement countryName;
    @FindBy(css = "#city")
    private WebElement cityName;
    @FindBy(css = "#card")
    private WebElement cardNumber;
    @FindBy(css = "#month")
    private WebElement monthDate;
    @FindBy(css = "#year")
    private WebElement yearDate;
    @FindBy(css = "[onclick='purchaseOrder()']")
    private WebElement PurchaseBTN;
    @FindBy(linkText = "Thank you for your purchase!")
    private WebElement Sucess;

    public Cart PlaceOrder() throws InterruptedException {

        Assert.assertTrue(Product.isDisplayed());
        //Assert.assertEquals(ProductName.getText(),"Apple monitor 24");

        PlaceOrderBTN.click();
        Thread.sleep(2000);
        Assert.assertTrue(OrderTable.isDisplayed());

        OrderName.sendKeys("ss");
        countryName.sendKeys("ss");
        cityName.sendKeys("ss");
        cardNumber.sendKeys("ss");
        monthDate.sendKeys("ss");
        yearDate.sendKeys("ss");
        PurchaseBTN.click();

        //Assert.assertTrue(Sucess.isEnabled());
        //System.out.println(Sucess.getText());

        return new Cart(driver);
    }





}
