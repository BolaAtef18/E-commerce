package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class searchForProductDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();

    @Given("user open browser and navigates to login page and logiin")
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

    @When("enter any data on search filed")
    public void search_for_product() throws InterruptedException {
        driver.findElement(By.id("search_query_top")).sendKeys("T-SHIRT");
    }

    @And("press Search")
    public void press_Search() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class=\"btn btn-default button-search\"]")).click();
        Thread.sleep(3000);
    }

    @And("make sure the search success")
    public void make_sure() throws InterruptedException {
        String actualResult = driver.findElement(By.xpath("//span[@class=\"lighter\"]")).getText();
        String expectedResult = "\"T-SHIRT\"";
        //Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(5000);

    }

    @Then("user could logout from the search page")
    public void user_close_browser() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
