package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By user = By.id("user-name");
    private final By pass = By.id("password");
    private final By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver) { this.driver = driver; }

    public void login(String username, String password) {
        driver.findElement(user).sendKeys(username);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(loginBtn).click();
    }
}
