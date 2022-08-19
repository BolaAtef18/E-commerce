package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectDifferentTagsPage {
    public WebElement select_different_tags1POM (WebDriver driver){
        By select_different_tags1 = (By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
        WebElement select_different_tags1Ele = driver.findElement(select_different_tags1);
        return  select_different_tags1Ele;
    }
    public WebElement select_different_tags2POM (WebDriver driver){
        By select_different_tags2 = (By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
        WebElement select_different_tags2Ele = driver.findElement(select_different_tags2);
        return  select_different_tags2Ele;
    }
    public WebElement select_different_tags3POM (WebDriver driver){
        By select_different_tags3 = (By.id("layered_id_attribute_group_1"));
        WebElement select_different_tags3Ele = driver.findElement(select_different_tags3);
        return  select_different_tags3Ele;
    }
    public WebElement select_different_tags4POM (WebDriver driver){
        By select_different_tags4 = (By.id("layered_id_feature_5"));
        WebElement select_different_tags4Ele = driver.findElement(select_different_tags4);
        return  select_different_tags4Ele;
    }
    public WebElement select_different_tags5POM (WebDriver driver){
        By select_different_tags5 = (By.id("layered_id_feature_11"));
        WebElement select_different_tags5Ele = driver.findElement(select_different_tags5);
        return  select_different_tags5Ele;
    }
    public WebElement select_different_tags6POM (WebDriver driver){
        By select_different_tags6 = (By.id("layered_id_feature_17"));
        WebElement select_different_tags6Ele = driver.findElement(select_different_tags6);
        return  select_different_tags6Ele;
    }
}
