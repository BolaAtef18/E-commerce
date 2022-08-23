package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebElement signinButton (){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?controller=my-account\"]"));
    }
    public WebElement Email (){
        return Hooks.driver.findElement(By.id("email"));
    }
    public WebElement password (){
        return Hooks.driver.findElement(By.id("passwd"));
    }
    public WebElement button (){
        return Hooks.driver.findElement(By.id("SubmitLogin"));
    }
    public WebElement close(){return Hooks.driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]"));}
}
