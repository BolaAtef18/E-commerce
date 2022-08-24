package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPage {
    public WebElement createEmail (){
        return Hooks.driver.findElement(By.id("email_create"));
    }
    public WebElement submitCreateButton (){
        return Hooks.driver.findElement(By.id("SubmitCreate"));
    }
    public WebElement firstname ( ){
        return Hooks.driver.findElement(By.id("customer_firstname"));
    }
    public WebElement lastname (){
        return Hooks.driver.findElement(By.id("customer_lastname"));
    }
    public WebElement password (){
        return Hooks.driver.findElement(By.id("passwd"));
    }
    public WebElement days (){
        return Hooks.driver.findElement(By.id("days"));
    }
    public WebElement months (){
        return Hooks.driver.findElement(By.id("months"));
    }
    public WebElement years (){
        return Hooks.driver.findElement(By.id("years"));
    }
    public WebElement address1 (){
        return Hooks.driver.findElement(By.id("address1"));
    }
    public WebElement city (){
        return Hooks.driver.findElement(By.id("city"));
    }
    public WebElement state (){
        return Hooks.driver.findElement(By.id("id_state"));
    }
    public WebElement postcode (){
        return Hooks.driver.findElement(By.id("postcode"));
    }
    public WebElement mobile (){
        return Hooks.driver.findElement(By.id("phone_mobile"));
    }
    public WebElement alias (){
        return Hooks.driver.findElement(By.id("alias"));
    }
    public WebElement submitAccount (){
        return Hooks.driver.findElement(By.id("submitAccount"));
    }
}
