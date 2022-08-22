package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchForProductPage {
    public WebElement enter_any_dataPOM (WebDriver driver){
        By enter_any_data = (By.id("search_query_top"));
        WebElement enter_any_dataEle = driver.findElement(enter_any_data);
        return  enter_any_dataEle;
    }
    public WebElement press_SearchPOM (WebDriver driver){
        By press_Search = (By.xpath("//button[@class=\"btn btn-default button-search\"]"));
        WebElement press_SearchEle = driver.findElement(press_Search);
        return  press_SearchEle;
    }
    public WebElement make_surePOM (WebDriver driver){
        By make_sure = (By.xpath("//span[@class=\"lighter\"]"));
        WebElement make_sureEle = driver.findElement(make_sure);
        return  make_sureEle;
    }
}
