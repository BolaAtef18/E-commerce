package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("layered_id_attribute_group_1")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("layered_id_feature_5")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("layered_id_feature_11")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("layered_id_feature_17")).click();
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
