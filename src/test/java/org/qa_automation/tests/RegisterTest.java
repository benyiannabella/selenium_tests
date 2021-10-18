package org.qa_automation.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    @Test
    public void registerTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.linkText("ACCOUNT")).click();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.name("firstname")).sendKeys("Annabella");
        driver.findElement(By.id("middlename")).sendKeys("Cz");
        driver.findElement(By.name("lastname")).sendKeys("Benyi");
        driver.findElement(By.name("email")).sendKeys("test@email.com");
        driver.findElement(By.className("validate-password")).sendKeys("test123*");
        driver.findElement(By.className("validate-cpassword")).sendKeys("test123*");
        driver.findElement(By.id("is_subscribed")).click();

        driver.quit();
    }


}
