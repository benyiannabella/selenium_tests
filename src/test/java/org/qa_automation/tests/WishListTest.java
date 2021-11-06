package org.qa_automation.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.qa_automation.BaseClass;
import org.qa_automation.pageObjects.Header;
import org.qa_automation.pageObjects.Sale;


public class WishListTest extends BaseClass {

    @Test
    public void addToWishlistTest() {

        getWebPage();
        Header header = new Header(driver);
        Sale sale = new Sale(driver);

        header.clickSale();
        sale.clickViewDetails();
        sale.clickWishList();

    }
}
