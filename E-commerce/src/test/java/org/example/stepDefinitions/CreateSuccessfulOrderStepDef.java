package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.CreateSuccessfulOrderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.example.pages.LoginPage;

import java.util.Optional;

public class CreateSuccessfulOrderStepDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    CreateSuccessfulOrderPage createSuccessfulOrderPage = new CreateSuccessfulOrderPage();
    @Given("user open browser and log iin")
    public void OpenBrowser() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButton().click();
    }

    @When("user Create successful Order")
    public void Create_successful_Order() throws InterruptedException {
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order1().click();
        Thread.sleep(3000);
        WebElement AddToCart1 = createSuccessfulOrderPage.Order2();
        new Actions(driver).clickAndHold(AddToCart1).perform();
        createSuccessfulOrderPage.Order3().click();
        Thread.sleep(10000);
        createSuccessfulOrderPage.Order4().click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order5().click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order6().click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order7().click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order8().click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order9().click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order10().click();
        Thread.sleep(5000);
    }

    @Then("user log outt")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();
    }
}
