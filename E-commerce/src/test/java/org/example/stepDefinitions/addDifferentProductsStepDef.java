package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.example.pages.LoginPage;

public class addDifferentProductsStepDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Given("user open browser and log")
    public void OpenBrowser() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButton().click();

    }
    @When("add different products to Shopping cart")
    public void add_different_products_to_Shopping_cart() throws InterruptedException {
        Thread.sleep(5000);
        shoppingCartPage.ShoppingCart1().click();
        Thread.sleep(5000);
        WebElement AddToCart1 = shoppingCartPage.ShoppingCart2();
        new Actions(driver).clickAndHold(AddToCart1).perform();
        shoppingCartPage.ShoppingCart3().click();
        Thread.sleep(5000);
        shoppingCartPage.ShoppingCart4().click();
        Thread.sleep(5000);
        WebElement AddToCart2 = shoppingCartPage.ShoppingCart5();
        new Actions(driver).clickAndHold(AddToCart2).perform();
        shoppingCartPage.ShoppingCart6().click();
        Thread.sleep(5000);
        shoppingCartPage.ShoppingCart7().click();
        Thread.sleep(5000);
    }
    @Then("user logout successfully")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();
    }
}
