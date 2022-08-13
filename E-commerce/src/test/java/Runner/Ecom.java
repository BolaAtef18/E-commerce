package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Ecom {
    WebDriver driver = null;
    String oldpass = "12345";

    //please change the Email
    String Email = "dokomi3441@5k2u.com";
    String newpass = "12345";
    LoginPage login = new LoginPage();



    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Test
    public void Reg() throws InterruptedException {


        Thread.sleep(3000);
        login.signinButtonPOM(driver).click();
        driver.findElement(By.id("email_create")).sendKeys(Email);
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(10000);
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

    @Test
    public void Login() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
        Thread.sleep(5000);


    }

    @Test
    public void ResetPass() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?controller=identity\"]")).click();
        driver.findElement(By.id("old_passwd")).sendKeys(oldpass);
        driver.findElement(By.id("passwd")).sendKeys(newpass);
        driver.findElement(By.id("confirmation")).sendKeys(newpass);
        driver.findElement(By.xpath("//button[@class=\"btn btn-default button button-medium\"]")).click();
        String actualResult = driver.findElement(By.xpath("//p[@class=\"alert alert-success\"]")).getText();
        String expectedResult = "Your personal information has been successfully updated.";
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(5000);

    }

    @Test
    public void search_for_product() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
        Thread.sleep(5000);
        driver.findElement(By.id("search_query_top")).sendKeys("T-SHIRT");
        driver.findElement(By.xpath("//button[@class=\"btn btn-default button-search\"]")).click();
        Thread.sleep(3000);
        String actualResult = driver.findElement(By.xpath("//span[@class=\"lighter\"]")).getText();
        String expectedResult = "\"T-SHIRT\"";
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(5000);

    }

    @Test
    public void select_different_Categories() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();
        Thread.sleep(5000);

    }

    @Test
    public void filter_with_color() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("layered_id_attribute_group_13")).click();
        Thread.sleep(5000);
    }

    @Test
    public void select_different_tags() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
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

    @Test
    public void add_different_products_to_Shopping_cart() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]")).click();
        Thread.sleep(3000);
        WebElement AddToCart1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        new Actions(driver).clickAndHold(AddToCart1).perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
        Thread.sleep(5000);
        WebElement AddToCart2 = this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
        new Actions(driver).clickAndHold(AddToCart2).perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
        Thread.sleep(5000);
    }

    @Test
    public void add_different_products_to_Wishlist() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]")).click();
        Thread.sleep(5000);
        WebElement AddToCart1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        new Actions (driver).clickAndHold(AddToCart1).perform();
        driver.findElement(By.xpath("//a[@class=\"addToWishlist wishlistProd_1\"]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@class=\"fancybox-item fancybox-close\"]")).click();
        Thread.sleep(5000);
        WebElement AddToCart2 = this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
        new Actions(driver).clickAndHold(AddToCart2).perform();
        driver.findElement(By.xpath("//a[@class=\"addToWishlist wishlistProd_3\"]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@class=\"fancybox-item fancybox-close\"]")).click();
        Thread.sleep(5000);
    }

    @Test
    public void add_different_products_to_compare_list() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]")).click();
        Thread.sleep(5000);
        WebElement AddToCart1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        new Actions (driver).clickAndHold(AddToCart1).perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a")).click();
        Thread.sleep(5000);
        WebElement AddToCart2 = this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
        new Actions(driver).clickAndHold(AddToCart2).perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[3]/div[2]")).click();
        Thread.sleep(5000);
    }

    @Test
    public void Create_successful_Order() throws InterruptedException {
        Thread.sleep(5000);
        login.signinButtonPOM(driver).click();
        Thread.sleep(5000);
        login.EmailPOM(driver).sendKeys( Email);
        login.passwordPOM(driver).sendKeys( oldpass);
        login.buttonPOM(driver).click();
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

    @AfterTest
    public void user_close_browser() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
