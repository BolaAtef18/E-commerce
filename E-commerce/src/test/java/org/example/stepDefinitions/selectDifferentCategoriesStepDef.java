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
    @When("user select different categories")
    public void select_different_Categories() throws InterruptedException {
        Thread.sleep(5000);
        selectDifferentCategoriesPage.select_different_categories1POM(driver).click();
        Thread.sleep(3000);
        selectDifferentCategoriesPage.select_different_categories2POM(driver).click();
        Thread.sleep(5000);
        selectDifferentCategoriesPage.select_different_categories3POM(driver).click();
        Thread.sleep(3000);
        selectDifferentCategoriesPage.select_different_categories4POM(driver).click();
        Thread.sleep(5000);
    }
    @Then("user could logout from this page")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
