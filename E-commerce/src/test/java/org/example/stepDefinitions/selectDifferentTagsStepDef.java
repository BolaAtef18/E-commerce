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
    @When("select different tags")
    public void select_different_tags() throws InterruptedException {
        Thread.sleep(5000);
        selectDifferentTagsPage.select_different_tags1POM(driver).click();
        Thread.sleep(3000);
        selectDifferentTagsPage.select_different_tags2POM(driver).click();
        Thread.sleep(5000);
        selectDifferentTagsPage.select_different_tags3POM(driver).click();
        Thread.sleep(5000);
        selectDifferentTagsPage.select_different_tags4POM(driver).click();
        Thread.sleep(5000);
        selectDifferentTagsPage.select_different_tags5POM(driver).click();
        Thread.sleep(5000);
        selectDifferentTagsPage.select_different_tags6POM(driver).click();
        Thread.sleep(5000);
    }
    @Then("user can logout")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]")).click();
        Thread.sleep(5000);
        driver.quit();

    }

}
