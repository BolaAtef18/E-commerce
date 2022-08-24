package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchForProductPage {
    public WebElement enter_any_data (){
        return Hooks.driver.findElement(By.id("search_query_top"));
    }
    public WebElement press_Search (){
        return Hooks.driver.findElement(By.xpath("//button[@class=\"btn btn-default button-search\"]"));
    }
    public WebElement make_sure (){return Hooks.driver.findElement(By.xpath("//span[@class=\"lighter\"]"));
    }
}
