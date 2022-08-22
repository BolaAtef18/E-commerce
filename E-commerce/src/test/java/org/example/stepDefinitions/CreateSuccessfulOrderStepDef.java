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
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys(Email);
        login.passwordPOM(driver).sendKeys(oldpass);
        login.buttonPOM(driver).click();
        Thread.sleep(5000);
    }

    @When("user Create successful Order")
    public void Create_successful_Order() throws InterruptedException {
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order1POM(driver).click();
        Thread.sleep(3000);
        WebElement AddToCart1 = createSuccessfulOrderPage.Order2POM(driver);
        new Actions(driver).clickAndHold(AddToCart1).perform();
        createSuccessfulOrderPage.Order3POM(driver).click();
        Thread.sleep(10000);
        createSuccessfulOrderPage.Order4POM(driver).click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order5POM(driver).click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order6POM(driver).click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order7POM(driver).click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order8POM(driver).click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order9POM(driver).click();
        Thread.sleep(5000);
        createSuccessfulOrderPage.Order10POM(driver).click();
        Thread.sleep(5000);
    }

    @Then("user log outt")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
