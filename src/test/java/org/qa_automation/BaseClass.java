package org.qa_automation;

import jdk.internal.org.objectweb.asm.Handle;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.qa_automation.pageObjects.Header;

public class BaseClass {

    protected WebDriver driver;

    @Before
    public void setup(){
        String browser = System.getProperty("browser", "chrome");
        driver = DriverFactory.getWebDriver(browser);
    }

    @After
    public void closeDriver(){
        driver.quit();
    }

    public void getWebPage(){
        driver.get(AppConfig.getApplicationPath());
    }


}

