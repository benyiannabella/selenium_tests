package org.qa_automation.testCases;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SortByNameDescTest {

    @Test
    public void sortByNameDescTest(){

        System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement mainMenu = driver.findElement(By.xpath("//li[@class = 'level0 nav-1 first parent']"));
        WebElement subMenu = driver.findElement(By.xpath("//li[@class = 'level1 nav-1-2']/a"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        actions.moveToElement(subMenu).click().perform();

        Select name = new Select(driver.findElement(By.xpath("//div[@class='sort-by']" +
                "/select")));
        name.selectByVisibleText("Name");

        WebElement desc = driver.findElement(By.xpath("//div[@class='sort-by']/a"));
        if(desc.getText().equals("Set Descending Direction")){
            desc.click();
        }

        WebElement list = driver.findElement(By.xpath("//p[@class='view-mode']/a"));
        list.click();

        driver.quit();
    }
}
