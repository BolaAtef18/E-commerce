package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.LoginPage;

public class ResgistrationStepDefinitions {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "naxiki1190@ukgent.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    RegPage regPage = new RegPage();

    @Given("user open browser and navigates to registrate page")
    public void OpenBrowser()  {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }
    @When("enter valid email and press on create account")
    public void Reg() throws InterruptedException {

        Thread.sleep(3000);
        login.signinButtonPOM(driver).click();
        regPage.createEmailPOM(driver).sendKeys(Email);
        regPage.submitCreateButtonPOM(driver).click();
        Thread.sleep(10000);
    }
    @And("enter valid data and press on Register")
            public void enter_data() throws InterruptedException {
        regPage.firstnamePOM(driver).sendKeys("bola");
        regPage.lastnamePOM(driver).sendKeys("atef");
        regPage.passwordPOM(driver).sendKeys(oldpass);
        regPage.daysPOM(driver).sendKeys("18");
        regPage.monthsPOM(driver).sendKeys("June");
        regPage.yearsPOM(driver).sendKeys("1993");
        regPage.address1POM(driver).sendKeys("cairo");
        regPage.cityPOM(driver).sendKeys("cairo");
        regPage.statePOM(driver).sendKeys( "Alabama");
        regPage.postcodePOM(driver).sendKeys( "11511");
        regPage.mobilePOM(driver).sendKeys("01298767878");
        regPage.aliasPOM(driver).clear();
        regPage.aliasPOM(driver).sendKeys("cairo");
        regPage.submitAccountPOM(driver).click();
        Thread.sleep(5000);
    }
    @Then("user could logout from Registration page")
    public void user_close_browser() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
