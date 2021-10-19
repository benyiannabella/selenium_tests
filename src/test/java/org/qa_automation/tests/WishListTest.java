package org.qa_automation.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WishListTest {

    @Test
    public void addToWishlistTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.className("nav-5")).click();
        driver.findElement(By.linkText("VIEW DETAILS")).click();
        driver.findElement(By.className("link-wishlist")).click();
        driver.quit();

    }
}
