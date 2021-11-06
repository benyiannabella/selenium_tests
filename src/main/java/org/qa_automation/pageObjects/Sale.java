package org.qa_automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sale {

    private WebDriver driver;

    public Sale(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "VIEW DETAILS")
    private WebElement viewDetails;
    @FindBy(className = "link-wishlist")
    private WebElement wishList;

    public void clickViewDetails(){
        viewDetails.click();
    }

    public void clickWishList(){
        wishList.click();
    }

}
