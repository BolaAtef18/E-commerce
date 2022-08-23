package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comparelistPage {
    public WebElement comparelist1 (){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
    }
    public WebElement comparelist2 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
    }
    public WebElement comparelist3 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a"));
    }
    public WebElement comparelist4 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
    }
    public WebElement comparelist5 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[3]/div[2]"));
    }
}
