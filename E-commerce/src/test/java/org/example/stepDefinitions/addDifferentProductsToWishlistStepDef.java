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
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
        Thread.sleep(5000);
    }
    @When("user add different products to Wishlist")
    public void add_different_products_to_Wishlist() throws InterruptedException {
        Thread.sleep(5000);
        wishlistPage.Wishlist1POM(driver).click();
        Thread.sleep(5000);
        WebElement AddToCart1 = wishlistPage.Wishlist2POM(driver);
        new Actions(driver).clickAndHold(AddToCart1).perform();
        wishlistPage.Wishlist3POM(driver).click();
        Thread.sleep(10000);
        wishlistPage.Wishlist4POM(driver).click();
        Thread.sleep(5000);
        WebElement AddToCart2 = wishlistPage.Wishlist5POM(driver);
        new Actions(driver).clickAndHold(AddToCart2).perform();
        wishlistPage.Wishlist6POM(driver).click();
        Thread.sleep(10000);
        wishlistPage.Wishlist7POM(driver).click();
        Thread.sleep(5000);
    }
    @Then("user can logout and success")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
