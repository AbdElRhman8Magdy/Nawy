package com.Nawy.todo.pages;

import com.Nawy.todo.base.BasePage;
import com.Nawy.todo.base.utils.ConfigUtils;
import com.Nawy.todo.base.utils.UserUtils;
import com.Nawy.todo.objects.User;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;


public class LoginPage extends BasePage {
    public String getAuth() {
        return Auth;
    }

    String Auth;

    @Step("aaddded description mannually to Load loging page and login")
    public LoginPage Load(){
        driver.get(ConfigUtils.GetInstance().ReturnBaseURL());
        return this;
   }

   public LoginPage(WebDriver driver) {
       super(driver);
   }

    @FindBy(css = "#login2")
    private WebElement LoginBTN;
    @FindBy(css = "#loginusername")
    private WebElement UserNameInput;
    @FindBy (css = "#loginpassword")
    private WebElement PasswordInput;
    @FindBy(css = "[onclick='logIn()']")
    private WebElement SubmitButton;
    @FindBy(css = "#signin2")
    private WebElement SignupBtn;
    @FindBy(css = "#logout2")
    private WebElement LogOutBTN;


@Step
    public HomePage login (String email, String password) throws IOException, InterruptedException {
    LoginBTN.click();

    UserNameInput.sendKeys(email);
    PasswordInput.sendKeys(password);
    SubmitButton.click();
    Thread.sleep(500);
    Assert.assertEquals(LogOutBTN.isDisplayed(),false);

    return new HomePage(driver,Auth);

}
    @Step
    public CATEGORIES loginAddCategoris (String email, String password) throws IOException, InterruptedException {
        LoginBTN.click();

        UserNameInput.sendKeys(email);
        PasswordInput.sendKeys(password);
        System.out.println(email+"\n"+password);
        Assert.assertTrue(SubmitButton.isDisplayed());
        SubmitButton.click();
        Thread.sleep(500);
        Assert.assertEquals(LogOutBTN.isDisplayed(),false);

        return new CATEGORIES(driver);
    }
    @Step
    public HomePage loginAndLogout (String email, String password) throws IOException, InterruptedException {
        LoginBTN.click();

        UserNameInput.sendKeys(email);
        PasswordInput.sendKeys(password);
        SubmitButton.isDisplayed();
        SubmitButton.click();
        Thread.sleep(500);
LogOutBTN.isDisplayed();
        Assert.assertEquals(LogOutBTN.isDisplayed(),false);
        LogOutBTN.click();
       // Alert alert = Wait.until(ExpectedConditions.alertIsPresent());

        Thread.sleep(500);
        Assert.assertEquals(LogOutBTN.isDisplayed(),false);

        return new HomePage(driver,Auth);

    }

    public void login(User registerBody) {

        User RegisterBody =  UserUtils.GenerateRndmUserNAme();
        System.out.println("ssss .."+registerBody);
//        LoginBTN.click();
//        UserNameInput.sendKeys(RegisterBody);

    }
}

