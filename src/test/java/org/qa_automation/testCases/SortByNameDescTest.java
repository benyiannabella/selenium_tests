package org.qa_automation.testCases;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.qa_automation.BaseClass;
import org.qa_automation.pageObjects.Header;
import org.qa_automation.pageObjects.Women;

import java.util.concurrent.TimeUnit;

public class SortByNameDescTest extends BaseClass {

    @Test
    public void sortByNameDescTest(){

        getWebPage();

        Header header = new Header(driver);
        Women women = new Women(driver);

        Actions actions = new Actions(driver);
        actions.moveToElement(header.getWomenMenu()).perform();
        actions.moveToElement(women.getNewArrivals()).click().perform();

        Select name = new Select(women.getSort());
        name.selectByVisibleText("Name");

        if(women.getSortOrder().getText().equals("Set Descending Direction")){
            women.getSortOrder().click();
        }

        women.clickGrid();
    }
}
