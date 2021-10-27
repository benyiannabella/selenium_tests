package org.qa_automation.testCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.qa_automation.AppConfig;

import java.util.concurrent.TimeUnit;

public class SortByNameAscTest {

    @Test
    public void sortByNameAscListTest(){

        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.get(AppConfig.getApplicationPath());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement mainMenu = driver.findElement(By.cssSelector("li.level0.nav-1.first.parent"));
        WebElement sunMenu = driver.findElement(By.cssSelector("li.level1.nav-1-2 a"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        actions.moveToElement(sunMenu).click().perform();

        Select name = new Select(driver.findElement(By.cssSelector("div.sort-by [title='Sort By']")));
        name.selectByVisibleText("Name");

        WebElement asc = driver.findElement(By.cssSelector("div.sort-by a"));
        if(asc.getText().equals("Set Ascending Direction")){
            asc.click();
        }

        WebElement list = driver.findElement(By.cssSelector("p.view-mode a.list"));
        list.click();

        driver.quit();
    }
}
