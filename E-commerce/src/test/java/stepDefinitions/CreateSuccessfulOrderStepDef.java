package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;

public class CreateSuccessfulOrderStepDef {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();

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
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]")).click();
        Thread.sleep(3000);
        WebElement AddToCart1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        new Actions(driver).clickAndHold(AddToCart1).perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("cgv")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
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
