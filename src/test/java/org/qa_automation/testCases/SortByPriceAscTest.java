package org.qa_automation.testCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.qa_automation.BaseClass;

import java.util.concurrent.TimeUnit;


public class SortByPriceAscTest extends BaseClass {

    @Test
    public void sortByPriceAscendingTest() {

        getWebPage();

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

    }

    @Test
    public void sortByPriceAscendingListTest() {
        getWebPage();

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


    }

}