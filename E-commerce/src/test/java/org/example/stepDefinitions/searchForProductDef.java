package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.searchForProductPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.LoginPage;

public class searchForProductDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    searchForProductPage searchForProductPage = new searchForProductPage();

    @Given("user open browser and navigates to login page and logiin")
    public void OpenBrowser() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButton().click();
    }

    @When("enter any data on search filed")
    public void search_for_product() throws InterruptedException {
        searchForProductPage.enter_any_data().sendKeys("T-SHIRT");
    }

    @And("press Search")
    public void press_Search() throws InterruptedException {
        searchForProductPage.press_Search().click();
        Thread.sleep(3000);
    }

    @And("make sure the search success")
    public void make_sure() throws InterruptedException {
        String actualResult = searchForProductPage.make_sure().getText();
        String expectedResult = "\"T-SHIRT\"";
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(5000);

    }

    @Then("user could logout from the search page")
    public void user_close_browser() throws InterruptedException {
        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();

    }
}
