package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.filterWithColorPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.LoginPage;

public class filterWithColorStepDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    filterWithColorPage filterWithColorPage = new filterWithColorPage();
    @Given("user open browser and navigates to login page and log")
    public void OpenBrowser() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButton().click();
    }
    @When("user select color")
    public void filter_with_color() throws InterruptedException {
        Thread.sleep(5000);
        filterWithColorPage.select_color1().click();
        Thread.sleep(3000);
        filterWithColorPage.select_color2().click();
        Thread.sleep(5000);
        filterWithColorPage.click_on().click();
        Thread.sleep(5000);
    }
    @Then("user logout")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();

    }

}
