package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ResetPassPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.LoginPage;


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
        Thread.sleep(5000);
        login.signinButton().click();
    }
    @When("open personal info")
    public void ResetPass() throws InterruptedException {
        resetPassPage.open_personal_info().click();
    }
    @And("enter old password and new password and press save")
            public void enter_data() {
        resetPassPage.old_passwd().sendKeys(oldpass);
        resetPassPage.passwd().sendKeys(newpass);
        resetPassPage.confirmation().sendKeys(newpass);
        resetPassPage.press_save().click();
    }
    @And("make sure the password change")
            public void make_sure() throws InterruptedException {
        String actualResult = resetPassPage.make_sure().getText();
        String expectedResult = "Your personal information has been successfully updated.";
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(5000);
    }
    @Then("user could logout from the reset page")
    public void user_close_browser() throws InterruptedException {
        login.close().click();
        Thread.sleep(5000);
        Hooks.driver.quit();

    }

}
