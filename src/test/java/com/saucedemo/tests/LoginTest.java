package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLogin() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        Assert.assertEquals(new InventoryPage(driver).getTitle(), "Products");
    }
}
