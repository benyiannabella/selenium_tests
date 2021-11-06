package org.qa_automation.tests;

import org.junit.Test;
import org.qa_automation.BaseClass;
import org.qa_automation.pageObjects.Header;

public class RegisterTest extends BaseClass {

    @Test
    public void registerTest(){

        getWebPage();
        Header header = new Header(driver);

        header.clickAccount();
        header.clickRegister();
        header.sendFirstName("test1");
        header.sendMiddleName("test2");
        header.sendLastName("test3");
        header.sendEmail("test@gmail.com");
        header.sendPW("pass123");
        header.sendAgainPW("pass123");
        header.checkSubscribe();
    }


}
