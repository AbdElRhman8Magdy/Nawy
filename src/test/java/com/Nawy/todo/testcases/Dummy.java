package com.Nawy.todo.testcases;

import com.Nawy.todo.API.RegisterAPI;
import com.Nawy.todo.API.TaskAPI;
import com.Nawy.todo.base.BaseTest;
import com.Nawy.todo.base.utils.ConfigUtils;
import com.Nawy.todo.base.utils.UserUtils;
import com.Nawy.todo.objects.User;
import com.Nawy.todo.pages.CATEGORIES;
import com.Nawy.todo.pages.LoginPage;
import com.Nawy.todo.pages.RegisterPage;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.Nawy.todo.base.utils.UserUtils.getRandomString;

public class Dummy extends BaseTest {



        @Test(enabled = false)
    public void Signup() throws IOException {
            LoginPage loginPage = new LoginPage(getDriver());
            User RegisterBody =  UserUtils.GenerateRndmUserNAme();
            loginPage.Load().login(RegisterBody);
            RegisterAPI registerAPI = new RegisterAPI();
          registerAPI.register(loginPage);

            TaskAPI taskAPI = new TaskAPI();
            taskAPI.AddTask();

        }

        @Test
    public void RegisterWeb_Login() throws IOException, InterruptedException {
            RegisterPage registerPage = new RegisterPage(getDriver());

            String UserName = "Magdy"+getRandomString(6,true,true) + "@gmail.com";
            String UserPass = "Magdy"+getRandomString(6,true,true) ;

            registerPage.LoadRegister().RegisterHome(UserName, UserPass);

            LoginPage loginPage = new LoginPage(getDriver());
            loginPage.login(UserName,
                    UserPass);



        }

    @Test
    public void Login() throws IOException, InterruptedException {
        RegisterPage registerPage = new RegisterPage(getDriver());

        registerPage.LoadRegister();


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(ConfigUtils.GetInstance().ReturnEmail(),
                ConfigUtils.GetInstance().ReturnPassword());


    }
    @Test
    public void Logout() throws IOException, InterruptedException {
        RegisterPage registerPage = new RegisterPage(getDriver());

        registerPage.LoadRegister();


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginAndLogout(ConfigUtils.GetInstance().ReturnEmail(),
                ConfigUtils.GetInstance().ReturnPassword());
    }

    @Test
    public void LoginCategoris() throws IOException, InterruptedException {
        RegisterPage registerPage = new RegisterPage(getDriver());

        registerPage.LoadRegister();


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.
                loginAddCategoris(ConfigUtils.GetInstance().ReturnEmail(),
                        ConfigUtils.GetInstance().ReturnPassword());

        CATEGORIES categories = new CATEGORIES(getDriver());
        categories
                .CATEGORIES()
                .SelectCategory()
                .AddToCart()
                .PlaceOrder();


    }
}

