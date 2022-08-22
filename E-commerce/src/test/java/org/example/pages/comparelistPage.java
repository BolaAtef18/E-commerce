package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comparelistPage {
    public WebElement comparelist1POM (WebDriver driver){
        By comparelist1 = (By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
        WebElement comparelist1Ele = driver.findElement(comparelist1);
        return  comparelist1Ele;
    }
    public WebElement comparelist2POM (WebDriver driver){
        By comparelist2 = (By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        WebElement comparelist2Ele = driver.findElement(comparelist2);
        return  comparelist2Ele;
    }
    public WebElement comparelist3POM (WebDriver driver){
        By comparelist3 = (By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a"));
        WebElement comparelist3Ele = driver.findElement(comparelist3);
        return  comparelist3Ele;
    }
    public WebElement comparelist4POM (WebDriver driver){
        By comparelist4 = (By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
        WebElement comparelist4Ele = driver.findElement(comparelist4);
        return  comparelist4Ele;
    }
    public WebElement comparelist5POM (WebDriver driver){
        By comparelist5 = (By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[3]/div[2]"));
        WebElement comparelist5Ele = driver.findElement(comparelist5);
        return  comparelist5Ele;
    }
}
