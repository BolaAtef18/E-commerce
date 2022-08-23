package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.selectDifferentTagsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.LoginPage;

public class selectDifferentTagsStepDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    selectDifferentTagsPage selectDifferentTagsPage = new selectDifferentTagsPage();

    @Given("user open browser and navigates to login page & log")
    public void OpenBrowser() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButton().click();
    }
    @When("select different tags")
    public void select_different_tags() throws InterruptedException {
        Thread.sleep(5000);
        selectDifferentTagsPage.select_different_tags1().click();
        Thread.sleep(3000);
        selectDifferentTagsPage.select_different_tags2().click();
        Thread.sleep(5000);
        selectDifferentTagsPage.select_different_tags3().click();
        Thread.sleep(5000);
        selectDifferentTagsPage.select_different_tags4().click();
        Thread.sleep(5000);
        selectDifferentTagsPage.select_different_tags5().click();
        Thread.sleep(5000);
        selectDifferentTagsPage.select_different_tags6().click();
        Thread.sleep(5000);
    }
    @Then("user can logout")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();

    }

}
