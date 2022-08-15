package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        driver.findElement(By.id("email_create")).sendKeys(Email);
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(10000);
    }
    @And("enter valid data and press on Register")
            public void enter_data() throws InterruptedException {
        driver.findElement(By.id("customer_firstname")).sendKeys("bola");
        driver.findElement(By.id("customer_lastname")).sendKeys("atef");
        driver.findElement(By.id("passwd")).sendKeys(oldpass);
        driver.findElement(By.id("days")).sendKeys("18");
        driver.findElement(By.id("months")).sendKeys("June");
        driver.findElement(By.id("years")).sendKeys("1993");
        driver.findElement(By.id("address1")).sendKeys("cairo");
        driver.findElement(By.id("city")).sendKeys("cairo");
        driver.findElement(By.id("id_state")).sendKeys( "Alabama");
        driver.findElement(By.id("postcode")).sendKeys( "11511");
        driver.findElement(By.id("phone_mobile")).sendKeys("01298767878");
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("cairo");
        driver.findElement(By.id("submitAccount")).click();
        Thread.sleep(5000);
    }
    @Then("user could logout from Registration page")
    public void user_close_browser() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
