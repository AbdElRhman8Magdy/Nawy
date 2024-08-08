package com.Nawy.todo.pages;

import com.Nawy.todo.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CATEGORIES extends BasePage {
    public CATEGORIES(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#cat")
    private WebElement Categories;
    @FindBy(linkText = "Monitors")
    private WebElement Monitors;
    @FindBy(partialLinkText = "Apple monitor")
    private WebElement AppleMonitor;




    @Step
    public CategoriesDetails CATEGORIES (){
        Assert.assertTrue(Categories.isDisplayed());
       // Monitors.click();
        Assert.assertTrue(Monitors.isDisplayed());
        System.out.println(Monitors.getText());
        Monitors.click();
        return new  CategoriesDetails(driver);
    }


}
