package com.Nawy.todo.pages;

import com.Nawy.todo.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CategoriesDetails extends BasePage {

    public CategoriesDetails(WebDriver driver){
        super(driver);
    }


    @FindBy (partialLinkText = "Apple monitor")
            private WebElement AppleMonitor;




    @Step
    public Product SelectCategory(){
        Assert.assertTrue(AppleMonitor.isDisplayed());
        AppleMonitor.click();
        return new Product(driver);
    }

}

