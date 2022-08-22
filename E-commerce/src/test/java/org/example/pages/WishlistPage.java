package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistPage {
    public WebElement Wishlist1POM (WebDriver driver){
        By Wishlist1 = (By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]"));
        WebElement Wishlist1Ele = driver.findElement(Wishlist1);
        return  Wishlist1Ele;
    }
    public WebElement Wishlist2POM (WebDriver driver){
        By Wishlist2 = (By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        WebElement Wishlist2Ele = driver.findElement(Wishlist2);
        return  Wishlist2Ele;
    }
    public WebElement Wishlist3POM (WebDriver driver){
        By Wishlist3 = (By.xpath("//a[@class=\"addToWishlist wishlistProd_1\"]"));
        WebElement Wishlist3Ele = driver.findElement(Wishlist3);
        return  Wishlist3Ele;
    }
    public WebElement Wishlist4POM (WebDriver driver){
        By Wishlist4 = (By.xpath("//a[@class=\"fancybox-item fancybox-close\"]"));
        WebElement Wishlist4Ele = driver.findElement(Wishlist4);
        return  Wishlist4Ele;
    }
    public WebElement Wishlist5POM (WebDriver driver){
        By Wishlist5 = (By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
        WebElement Wishlist5Ele = driver.findElement(Wishlist5);
        return  Wishlist5Ele;
    }
    public WebElement Wishlist6POM (WebDriver driver){
        By Wishlist6 = (By.xpath("//a[@class=\"addToWishlist wishlistProd_3\"]"));
        WebElement Wishlist6Ele = driver.findElement(Wishlist6);
        return  Wishlist6Ele;
    }
    public WebElement Wishlist7POM (WebDriver driver){
        By Wishlist7 = (By.xpath("//a[@class=\"fancybox-item fancybox-close\"]"));
        WebElement Wishlist7Ele = driver.findElement(Wishlist7);
        return  Wishlist7Ele;
    }
}
