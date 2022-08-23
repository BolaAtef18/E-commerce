package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectDifferentTagsPage {
    public WebElement select_different_tags1 (){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
    }
    public WebElement select_different_tags2 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
        }
    public WebElement select_different_tags3 (){
        return Hooks.driver.findElement(By.id("layered_id_attribute_group_1"));
    }
    public WebElement select_different_tags4 (){
        return Hooks.driver.findElement(By.id("layered_id_feature_5"));
    }
    public WebElement select_different_tags5 (){
        return Hooks.driver.findElement(By.id("layered_id_feature_11"));
    }
    public WebElement select_different_tags6 (){
        return Hooks.driver.findElement(By.id("layered_id_feature_17"));
    }
}
