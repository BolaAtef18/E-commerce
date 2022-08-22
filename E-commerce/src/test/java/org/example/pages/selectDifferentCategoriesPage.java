package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectDifferentCategoriesPage {
    public WebElement select_different_categories1POM (WebDriver driver){
        By select_different_categories1= (By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
        WebElement select_different_categories1Ele = driver.findElement(select_different_categories1);
        return  select_different_categories1Ele;
    }
    public WebElement select_different_categories2POM (WebDriver driver){
        By select_different_categories2 = (By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
        WebElement select_different_categories2Ele = driver.findElement(select_different_categories2);
        return  select_different_categories2Ele;
    }
    public WebElement select_different_categories3POM (WebDriver driver){
        By select_different_categories3 = (By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
        WebElement select_different_categories3Ele = driver.findElement(select_different_categories3);
        return  select_different_categories3Ele;
    }
    public WebElement select_different_categories4POM (WebDriver driver){
        By select_different_categories4 = (By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
        WebElement select_different_categories4Ele = driver.findElement(select_different_categories4);
        return  select_different_categories4Ele;
    }
}
