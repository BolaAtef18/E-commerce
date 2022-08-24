package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebElement;


public class LoginStepDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();

    @Given("user open browser and navigates to login page")
    public void open() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButton().click();
    }
    @When("user enter valid username and password")

    public void Login() throws InterruptedException {
        Thread.sleep(5000);
       login.signinButton().click();
        Thread.sleep(5000);
        login.Email().sendKeys( Email);
        login.password().sendKeys( oldpass);
        Thread.sleep(5000);




    }
    @And("user click on login button")
    public void press_on_login_button() throws InterruptedException {
        Thread.sleep(5000);
        login.button().click();

    }

    @Then("user could logout")
    public void user_close_browser() throws InterruptedException {

        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();

    }


}
