package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.LoginPage;

public class ResgistrationStepDefinitions {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "naxiki1190@ukgent.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    RegPage regPage = new RegPage();

    @Given("user open browser and navigates to registrate page")
    public void OpenBrowser() throws InterruptedException {
        Thread.sleep(3000);
        login.signinButton().click();
    }
    @When("enter valid email and press on create account")
    public void Reg() throws InterruptedException {


        regPage.createEmail().sendKeys(Email);
        regPage.submitCreateButton().click();
        Thread.sleep(10000);
    }
    @And("enter valid data and press on Register")
            public void enter_data() throws InterruptedException {
        regPage.firstname().sendKeys("bola");
        regPage.lastname().sendKeys("atef");
        regPage.password().sendKeys(oldpass);
        regPage.days().sendKeys("18");
        regPage.months().sendKeys("June");
        regPage.years().sendKeys("1993");
        regPage.address1().sendKeys("cairo");
        regPage.city().sendKeys("cairo");
        regPage.state().sendKeys( "Alabama");
        regPage.postcode().sendKeys( "11511");
        regPage.mobile().sendKeys("01298767878");
        regPage.alias().clear();
        regPage.alias().sendKeys("cairo");
        regPage.submitAccount().click();
        Thread.sleep(5000);
    }
    @Then("user could logout from Registration page")
    public void user_close_browser() throws InterruptedException {
        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();

    }
}
