package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.selectDifferentCategoriesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.LoginPage;

public class selectDifferentCategoriesStepDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    selectDifferentCategoriesPage selectDifferentCategoriesPage = new selectDifferentCategoriesPage();
    @Given("user open browser and navigates to login page and loginn")
    public void OpenBrowser() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButton().click();
    }
    @When("user select different categories")
    public void select_different_Categories() throws InterruptedException {
        Thread.sleep(5000);
        selectDifferentCategoriesPage.select_different_categories1().click();
        Thread.sleep(3000);
        selectDifferentCategoriesPage.select_different_categories2().click();
        Thread.sleep(5000);
        selectDifferentCategoriesPage.select_different_categories3().click();
        Thread.sleep(3000);
        selectDifferentCategoriesPage.select_different_categories4().click();
        Thread.sleep(5000);
    }
    @Then("user could logout from this page")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();

    }
}
