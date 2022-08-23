package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.comparelistPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.example.pages.LoginPage;

public class addDifferentProductsToCompareListStepDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    comparelistPage comparelistPage = new comparelistPage();

    @Given("user open browser and log in")
    public void OpenBrowser() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButton().click();
    }

    @When("user add different products to compare list")
    public void add_different_products_to_compare_list() throws InterruptedException {
        Thread.sleep(5000);
        comparelistPage.comparelist1().click();
        Thread.sleep(5000);
        WebElement AddToCart1 = comparelistPage.comparelist2();
        new Actions(driver).clickAndHold(AddToCart1).perform();
        comparelistPage.comparelist3().click();
        Thread.sleep(5000);
        WebElement AddToCart2 = comparelistPage.comparelist4();
        new Actions(driver).clickAndHold(AddToCart2).perform();
        comparelistPage.comparelist5().click();
        Thread.sleep(5000);
    }
    @Then("user can log out")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();
    }
}
