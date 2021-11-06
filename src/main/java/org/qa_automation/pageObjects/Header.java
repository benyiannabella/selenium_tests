package org.qa_automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "ACCOUNT")
    private WebElement account;
    @FindBy(linkText = "Register")
    private WebElement register;
    @FindBy(name = "firstname")
    private WebElement firstName;
    @FindBy(id = "middlename")
    private WebElement middleName;
    @FindBy(name = "lastname")
    private WebElement lastName;
    @FindBy(name = "email")
    private WebElement email;
    @FindBy(className = "validate-password")
    private WebElement validPW;
    @FindBy(className = "validate-cpassword")
    private WebElement againValidPW;
    @FindBy(id = "is_subscribed")
    private WebElement subscribe;

    public void clickAccount() {
         account.click();
    }

    public void clickRegister() {
        register.click();
    }

    public void sendFirstName(String text) {
         firstName.sendKeys(text);
    }

    public void sendMiddleName(String text) {
         middleName.sendKeys(text);
    }

    public void sendLastName(String text) {
         lastName.sendKeys(text);
    }

    public void sendEmail(String text) {
         email.sendKeys(text);
    }

    public void sendPW(String text) {
         validPW.sendKeys(text);
    }

    public void sendAgainPW(String text) {
         againValidPW.sendKeys(text);
    }


    public void checkSubscribe() {
        subscribe.click();
    }
}
