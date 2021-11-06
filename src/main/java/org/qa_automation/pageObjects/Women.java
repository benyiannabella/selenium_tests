package org.qa_automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {

    private WebDriver driver;

    public Women(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "li.level1.nav-1-2 a")//driver.findElement(By.xpath("//li[@class = 'level1 nav-1-2']/a"))
    private WebElement newArrivals;
    @FindBy(css = "div.sort-by [title='Sort By']")
    private WebElement sort;//driver.findElement(By.xpath("//div[@class='sort-by']/select")
    @FindBy(css = "div.sort-by a")
    private WebElement sortOrder;//driver.findElement(By.xpath("//div[@class='sort-by']/a")
    @FindBy(css = "p.view-mode a.list")
    private WebElement list;//driver.findElement(By.xpath("//p[@class='view-mode']/a")
    @FindBy(css = "li.level1.nav-1-3 a")
    private WebElement topsBlouses;
    @FindBy(css = ".grid")
    private WebElement grid;


    public WebElement getNewArrivals() {
        return newArrivals;
    }

    public WebElement getSort() {
        return sort;
    }

    public WebElement getSortOrder() {
        return sortOrder;
    }

    public void clickList(){
        list.click();
    }

    public WebElement getTopsBlouses() {
        return topsBlouses;
    }

    public void clickGrid(){
        grid.click();
    }
}
