package com.Nawy.todo.pages;

import com.Nawy.todo.base.BasePage;
import com.Nawy.todo.base.object.user;
import com.Nawy.todo.base.utils.ConfigUtils;
import com.Nawy.todo.base.utils.UserUtils;
import com.Nawy.todo.objects.User;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }




    @FindBy(css = "#sign-username")
    private WebElement FrstName;

    @FindBy(css = "#sign-password")
    private WebElement Pss;

    @FindBy(css = "[onclick=\"register()\"]")
    private WebElement SubmitButton;
    @FindBy(css = "#signin2")
    private WebElement SignupBtn;
    @FindBy(partialLinkText = "user")
    private WebElement Alert;




    //instead of run each test individually let's add last step to return to next test
    @Step

   public CATEGORIES Register (String frstname, String password){



        FrstName.sendKeys(frstname);

        Pss.sendKeys(password);

        SubmitButton.click();

        return new CATEGORIES(driver);
    }
@Step
public RegisterPage LoadRegister(){
    driver.get(ConfigUtils.GetInstance().ReturnBaseURL());
    return this;
}
    @Step
    public LoginPage RegisterHome (String frstname, String password) throws InterruptedException {
        SignupBtn.click();
        FrstName.sendKeys(frstname);

        Pss.sendKeys(password);

        SubmitButton.click();
//        org.openqa.selenium.Alert alert = wait().until(ExpectedConditions.alertIsPresent());
//        System.out.println(Alert.getText());
Thread.sleep(1100);
      //  driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
//Alert.submit();
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        org.openqa.selenium.Alert alert = ;
        return new LoginPage(driver);
    }










    @Step
    public user APIRegister(String userName, String password){
        User RegisterBody =  UserUtils.GenerateRndmUserNAme();

return new user();

    }


}
