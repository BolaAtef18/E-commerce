package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
    public WebElement ShoppingCart1 (){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
    }
    public WebElement ShoppingCart2 ( ){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
    }
    public WebElement ShoppingCart3 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
    }
    public WebElement ShoppingCart4 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
    }
    public WebElement ShoppingCart5 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
    }
    public WebElement ShoppingCart6 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]"));
    }
    public WebElement ShoppingCart7 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
    }


}
