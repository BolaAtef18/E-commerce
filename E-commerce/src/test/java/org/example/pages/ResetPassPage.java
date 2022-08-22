package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPassPage {
    public WebElement open_personal_infoPOM (WebDriver driver){
        By open_personal_info = (By.xpath("//a[@href=\"http://automationpractice.com/index.php?controller=identity\"]"));
        WebElement open_personal_infoEle = driver.findElement(open_personal_info);
        return  open_personal_infoEle;
    }
    public WebElement old_passwdPOM (WebDriver driver){
        By old_passwd = (By.id("old_passwd"));
        WebElement old_passwdEle = driver.findElement(old_passwd);
        return  old_passwdEle;
    }
    public WebElement passwdPOM (WebDriver driver){
        By passwd = (By.id("passwd"));
        WebElement passwdEle = driver.findElement(passwd);
        return  passwdEle;
    }
    public WebElement confirmationPOM (WebDriver driver){
        By confirmation = (By.id("confirmation"));
        WebElement confirmationEle = driver.findElement(confirmation);
        return  confirmationEle;
    }
    public WebElement press_savePOM (WebDriver driver){
        By press_save = (By.xpath("//button[@class=\"btn btn-default button button-medium\"]"));
        WebElement press_saveEle = driver.findElement(press_save);
        return  press_saveEle;
    }
    public WebElement make_surePOM (WebDriver driver){
        By make_sure = (By.xpath("//p[@class=\"alert alert-success\"]"));
        WebElement make_sureEle = driver.findElement(make_sure);
        return  make_sureEle;
    }
}
