package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateSuccessfulOrderPage {
    public WebElement Order1POM (WebDriver driver){
        By Order1 = (By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
        WebElement Order1Ele = driver.findElement(Order1);
        return  Order1Ele;
    }
    public WebElement Order2POM (WebDriver driver){
        By Order2 = (By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        WebElement Order2Ele = driver.findElement(Order2);
        return  Order2Ele;
    }
    public WebElement Order3POM (WebDriver driver){
        By Order3 = (By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
        WebElement Order3Ele = driver.findElement(Order3);
        return  Order3Ele;
    }
    public WebElement Order4POM (WebDriver driver){
        By Order4 = (By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        WebElement Order4Ele = driver.findElement(Order4);
        return Order4Ele;
    }
    public WebElement Order5POM (WebDriver driver){
        By Order5 = (By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
        WebElement Order5Ele = driver.findElement(Order5);
        return Order5Ele;
    }
    public WebElement Order6POM (WebDriver driver){
        By Order6 = (By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
        WebElement Order6Ele = driver.findElement(Order6);
        return  Order6Ele;
    }
    public WebElement Order7POM (WebDriver driver){
        By Order7 = (By.id("cgv"));
        WebElement Order7Ele = driver.findElement(Order7);
        return  Order7Ele;
    }
    public WebElement Order8POM (WebDriver driver){
        By Order8 = (By.xpath("//*[@id=\"form\"]/p/button/span"));
        WebElement Order8Ele = driver.findElement(Order8);
        return  Order8Ele;
    }
    public WebElement Order9POM (WebDriver driver){
        By Order9 = (By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
        WebElement Order9Ele = driver.findElement(Order9);
        return  Order9Ele;
    }
    public WebElement Order10POM (WebDriver driver){
        By Order10 = (By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
        WebElement Order10Ele = driver.findElement(Order10);
        return  Order10Ele;
    }
}
