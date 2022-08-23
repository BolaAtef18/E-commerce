package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPassPage {
    public WebElement open_personal_info (){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?controller=identity\"]"));
    }
    public WebElement old_passwd (){
        return Hooks.driver.findElement(By.id("old_passwd"));
    }
    public WebElement passwd (){
        return Hooks.driver.findElement(By.id("passwd"));
    }
    public WebElement confirmation (){
        return Hooks.driver.findElement(By.id("confirmation"));
    }
    public WebElement press_save (){
        return Hooks.driver.findElement(By.xpath("//button[@class=\"btn btn-default button button-medium\"]"));
    }
    public WebElement make_sure (){
        return Hooks.driver.findElement(By.xpath("//p[@class=\"alert alert-success\"]"));
    }
}
