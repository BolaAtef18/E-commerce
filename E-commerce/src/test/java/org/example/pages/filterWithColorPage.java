package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class filterWithColorPage {
    public WebElement select_color1POM (WebDriver driver){
        By select_color1 = (By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
        WebElement select_color1Ele = driver.findElement(select_color1);
        return  select_color1Ele;
    }
    public WebElement select_color2POM (WebDriver driver){
        By select_color2 = (By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
        WebElement select_color2Ele = driver.findElement(select_color2);
        return  select_color2Ele;
    }
    public WebElement click_onPOM (WebDriver driver){
        By click_on = (By.id("layered_id_attribute_group_13"));
        WebElement click_onEle = driver.findElement(click_on);
        return  click_onEle;
    }
}
