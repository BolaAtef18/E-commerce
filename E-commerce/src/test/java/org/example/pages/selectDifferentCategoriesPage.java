package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectDifferentCategoriesPage {
    public WebElement select_different_categories1 (){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
    }
    public WebElement select_different_categories2 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
    }
    public WebElement select_different_categories3 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
    }
    public WebElement select_different_categories4 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
    }
}
