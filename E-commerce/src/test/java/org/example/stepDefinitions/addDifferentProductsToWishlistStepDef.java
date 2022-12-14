package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.WishlistPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.example.pages.LoginPage;

public class addDifferentProductsToWishlistStepDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    WishlistPage wishlistPage = new WishlistPage();
    @Given("user open browser and login")
    public void OpenBrowser() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButton().click();
    }
    @When("user add different products to Wishlist")
    public void add_different_products_to_Wishlist() throws InterruptedException {
        Thread.sleep(5000);
        wishlistPage.Wishlist1().click();
        Thread.sleep(5000);
        WebElement AddToCart1 = wishlistPage.Wishlist2();
        new Actions(driver).clickAndHold(AddToCart1).perform();
        wishlistPage.Wishlist3().click();
        Thread.sleep(10000);
        wishlistPage.Wishlist4().click();
        Thread.sleep(5000);
        WebElement AddToCart2 = wishlistPage.Wishlist5();
        new Actions(driver).clickAndHold(AddToCart2).perform();
        wishlistPage.Wishlist6().click();
        Thread.sleep(10000);
        wishlistPage.Wishlist7().click();
        Thread.sleep(5000);
    }
    @Then("user can logout and success")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();
    }
}
