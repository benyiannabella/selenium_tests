package org.qa_automation.testCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class SortByPriceAscTest {

    @Test
    public void sortByPriceAscendingTest() {

        String text = "Pants & Denim";

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement mainMenu = driver.findElement(By.cssSelector("#header-nav li.level0.nav-1.first.parent"));
        WebElement subMenu = driver.findElement(By.cssSelector("li.level1.nav-1-3 a"));
        Actions action = new Actions(driver);
        action.moveToElement(mainMenu).perform();
        action.moveToElement(subMenu).click().perform();

        Select select = new Select(driver.findElement(By.cssSelector(".sort-by select")));
        select.selectByVisibleText("Price");

        WebElement ascend = driver.findElement(By.cssSelector(".sort-by a"));
        if (ascend.getText().equals("Set Ascending Direction")) {
            ascend.click();
        }

        WebElement grid = driver.findElement(By.cssSelector(".grid"));
        if (!grid.isSelected()) {
            grid.click();
        }
        driver.quit();
    }

    @Test
    public void sortByPriceAscendingListTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement mainMenu = driver.findElement(By.xpath("//li[@class='level0 nav-1 first parent']"));
        WebElement subMenu = driver.findElement(By.xpath("//li[@class='level1 nav-1-3']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        actions.moveToElement(subMenu).click().perform();

        Select select = new Select(driver.findElement(By.xpath("//select[@title='Sort By']")));
        select.selectByVisibleText("Price");

        WebElement ascend = driver.findElement(By.xpath("//div[@class='sort-by']/a"));
        if(ascend.getText().equals("Set Ascending Direction")){
            ascend.click();
        }

        WebElement list = driver.findElement(By.cssSelector(".list"));
        list.click();

        driver.quit();
    }

}