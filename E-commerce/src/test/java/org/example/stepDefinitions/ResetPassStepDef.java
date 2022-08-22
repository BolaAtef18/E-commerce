package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ResetPassPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.LoginPage;
import org.testng.Assert;


public class ResetPassStepDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();
    ResetPassPage resetPassPage = new ResetPassPage();
    @Given("user open browser and navigates to login page and login")
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
    @When("open personal info")
    public void ResetPass() throws InterruptedException {
        resetPassPage.open_personal_infoPOM(driver).click();
    }
    @And("enter old password and new password and press save")
            public void enter_data() {
        resetPassPage.old_passwdPOM(driver).sendKeys(oldpass);
        resetPassPage.passwdPOM(driver).sendKeys(newpass);
        resetPassPage.confirmationPOM(driver).sendKeys(newpass);
        resetPassPage.press_savePOM(driver).click();
    }
    @And("make sure the password change")
            public void make_sure() throws InterruptedException {
        String actualResult = resetPassPage.make_surePOM(driver).getText();
        String expectedResult = "Your personal information has been successfully updated.";
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(5000);
    }
    @Then("user could logout from the reset page")
    public void user_close_browser() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]")).click();
        Thread.sleep(5000);
        driver.quit();

    }

}
