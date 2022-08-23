package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistPage {
    public WebElement Wishlist1 (){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
    }
    public WebElement Wishlist2 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
    }
    public WebElement Wishlist3 (){
        return Hooks.driver.findElement(By.xpath("//a[@class=\"addToWishlist wishlistProd_1\"]"));
    }
    public WebElement Wishlist4 (){
        return Hooks.driver.findElement(By.xpath("//a[@class=\"fancybox-item fancybox-close\"]"));
    }
    public WebElement Wishlist5 (){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
    }
    public WebElement Wishlist6 (){
        return Hooks.driver.findElement(By.xpath("//a[@class=\"addToWishlist wishlistProd_3\"]"));
    }
    public WebElement Wishlist7 (){
        return Hooks.driver.findElement(By.xpath("//a[@class=\"fancybox-item fancybox-close\"]"));
    }
}
