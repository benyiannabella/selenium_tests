package org.qa_automation.testCases;

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


public class SortByPriceAscTest extends BaseClass {

    @Test
    public void sortByPriceAscendingTest() {

        getWebPage();
        Header header = new Header(driver);
        Women women = new Women(driver);

        Actions action = new Actions(driver);
        action.moveToElement(header.getWomenMenu()).perform();
        action.moveToElement(women.getTopsBlouses()).click().perform();

        Select select = new Select(women.getSort());
        select.selectByVisibleText("Price");

        if (women.getSortOrder().getText().equals("Set Ascending Direction")) {
            women.getSortOrder().click();
        }

        women.clickGrid();
    }

    @Test
    public void sortByPriceAscendingListTest() {
        getWebPage();
        Header header = new Header(driver);
        Women women = new Women(driver);

        Actions actions = new Actions(driver);
        actions.moveToElement(header.getWomenMenu()).perform();
        actions.moveToElement(women.getTopsBlouses()).click().perform();

        Select select = new Select(women.getSort());
        select.selectByVisibleText("Price");

        if(women.getSortOrder().getText().equals("Set Ascending Direction")){
            women.getSortOrder().click();
        }

        women.clickList();
    }

}