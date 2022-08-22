package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPage {
    public WebElement createEmailPOM (WebDriver driver){
        By createEmail = (By.id("email_create"));
        WebElement createEmailELe = driver.findElement(createEmail);
        return createEmailELe;
    }
    public WebElement submitCreateButtonPOM (WebDriver driver){
        By submitCreateButton = (By.id("SubmitCreate"));
        WebElement submitCreateButtonEle = driver.findElement(submitCreateButton);
        return submitCreateButtonEle;
    }
    public WebElement firstnamePOM (WebDriver driver){
        By firstname = (By.id("customer_firstname"));
        WebElement firstnameEle = driver.findElement(firstname);
        return firstnameEle;
    }
    public WebElement lastnamePOM (WebDriver driver){
        By lastname = (By.id("customer_lastname"));
        WebElement lastnameEle = driver.findElement(lastname);
        return lastnameEle;
    }
    public WebElement passwordPOM (WebDriver driver){
        By password = (By.id("passwd"));
        WebElement passwordEle = driver.findElement(password);
        return  passwordEle;
    }
    public WebElement daysPOM (WebDriver driver){
        By days = (By.id("days"));
        WebElement daysEle = driver.findElement(days);
        return  daysEle;
    }
    public WebElement monthsPOM (WebDriver driver){
        By months = (By.id("months"));
        WebElement monthsEle = driver.findElement(months);
        return  monthsEle;
    }
    public WebElement yearsPOM (WebDriver driver){
        By years = (By.id("years"));
        WebElement yearsEle = driver.findElement(years);
        return  yearsEle;
    }
    public WebElement address1POM (WebDriver driver){
        By address1 = (By.id("address1"));
        WebElement address1Ele = driver.findElement(address1);
        return  address1Ele;
    }
    public WebElement cityPOM (WebDriver driver){
        By city = (By.id("city"));
        WebElement cityEle = driver.findElement(city);
        return  cityEle;
    }
    public WebElement statePOM (WebDriver driver){
        By state = (By.id("id_state"));
        WebElement stateEle = driver.findElement(state);
        return  stateEle;
    }
    public WebElement postcodePOM (WebDriver driver){
        By postcode = (By.id("postcode"));
        WebElement postcodeEle = driver.findElement(postcode);
        return  postcodeEle;
    }
    public WebElement mobilePOM (WebDriver driver){
        By mobile = (By.id("phone_mobile"));
        WebElement mobileEle = driver.findElement(mobile);
        return  mobileEle;
    }
    public WebElement aliasPOM (WebDriver driver){
        By alias  = (By.id("alias"));
        WebElement aliasEle = driver.findElement(alias);
        return  aliasEle;
    }
    public WebElement submitAccountPOM (WebDriver driver){
        By submitAccount = (By.id("submitAccount"));
        WebElement submitAccountEle = driver.findElement(submitAccount);
        return  submitAccountEle;
    }
}
