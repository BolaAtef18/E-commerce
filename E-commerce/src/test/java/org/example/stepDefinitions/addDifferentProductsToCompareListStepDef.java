package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Given("user open browser and log in")
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

    @When("user add different products to compare list")
    public void add_different_products_to_compare_list() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]")).click();
        Thread.sleep(5000);
        WebElement AddToCart1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        new Actions(driver).clickAndHold(AddToCart1).perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a")).click();
        Thread.sleep(5000);
        WebElement AddToCart2 = this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
        new Actions(driver).clickAndHold(AddToCart2).perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[3]/div[2]")).click();
        Thread.sleep(5000);
    }
    @Then("user can log out")
    public void user_close_browser() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
