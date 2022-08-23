package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class filterWithColorPage {
    public WebElement select_color1 (){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
    }
    public WebElement select_color2 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
    }
    public WebElement click_on (){
        return Hooks.driver.findElement(By.id("layered_id_attribute_group_13"));
    }
}
