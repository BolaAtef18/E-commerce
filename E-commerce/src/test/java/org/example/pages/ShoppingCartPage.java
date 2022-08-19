package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
    public WebElement ShoppingCart1POM (WebDriver driver){
        By ShoppingCart1 = (By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
        WebElement ShoppingCart1Ele = driver.findElement(ShoppingCart1);
        return ShoppingCart1Ele;
    }
    public WebElement ShoppingCart2POM (WebDriver driver){
        By ShoppingCart2 = (By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        WebElement ShoppingCart2Ele = driver.findElement(ShoppingCart2);
        return  ShoppingCart2Ele;
    }
    public WebElement ShoppingCart3POM (WebDriver driver){
        By ShoppingCart3 = (By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
        WebElement ShoppingCart3Ele = driver.findElement(ShoppingCart3);
        return  ShoppingCart3Ele;
    }
    public WebElement ShoppingCart4POM (WebDriver driver){
        By ShoppingCart4 = (By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
        WebElement ShoppingCart4Ele = driver.findElement(ShoppingCart4);
        return  ShoppingCart4Ele;
    }
    public WebElement ShoppingCart5POM (WebDriver driver){
        By ShoppingCart5 = (By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
        WebElement ShoppingCart5Ele = driver.findElement(ShoppingCart5);
        return  ShoppingCart5Ele;
    }
    public WebElement ShoppingCart6POM (WebDriver driver){
        By ShoppingCart6 = (By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]"));
        WebElement ShoppingCart6Ele = driver.findElement(ShoppingCart6);
        return  ShoppingCart6Ele;
    }
    public WebElement ShoppingCart7POM (WebDriver driver){
        By ShoppingCart7 = (By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
        WebElement ShoppingCart7Ele = driver.findElement(ShoppingCart7);
        return  ShoppingCart7Ele;
    }


}
