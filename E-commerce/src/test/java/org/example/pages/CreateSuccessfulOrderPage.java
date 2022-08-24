package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.Handler;

public class CreateSuccessfulOrderPage {
    public WebElement Order1 (){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
    }
    public WebElement Order2 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
    }
    public WebElement Order3 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
    }
    public WebElement Order4 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
    }
    public WebElement Order5 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
    }
    public WebElement Order6 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
    }
    public WebElement Order7 (){
        return Hooks.driver.findElement(By.id("cgv"));
    }
    public WebElement Order8 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
    }
    public WebElement Order9 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
    }
    public WebElement Order10 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
    }
}
