package org.qa_automation.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qa_automation.BaseClass;


public class WishListTest extends BaseClass {

    @Test
    public void addToWishlistTest() {

        getWebPage();

        driver.findElement(By.className("nav-5")).click();
        driver.findElement(By.linkText("VIEW DETAILS")).click();
        driver.findElement(By.className("link-wishlist")).click();

    }
}
