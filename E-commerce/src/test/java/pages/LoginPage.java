package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebElement signinButtonPOM (WebDriver driver){
        By signinButton = (By.xpath("//a[@href=\"http://automationpractice.com/index.php?controller=my-account\"]"));
        WebElement signinButtonEle = driver.findElement(signinButton);
        return signinButtonEle;
    }
    public WebElement EmailPOM (WebDriver driver){
        By Email = (By.id("email"));
        WebElement EmailEle = driver.findElement(Email);
        return EmailEle;
    }
    public WebElement passwordPOM (WebDriver driver){
        By password = (By.id("passwd"));
        WebElement passwordEle = driver.findElement(password);
        return passwordEle;
    }
    public WebElement buttonPOM (WebDriver driver){
        By Button = (By.id("SubmitLogin"));
        WebElement ButtonEle = driver.findElement(Button);
        return ButtonEle;
    }
}
