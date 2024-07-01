package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.example.utils.LocatorUtil;
import java.util.Map;

public class LoginPage {
	WebDriver driver;
	Map<String, Map<String, String>> locators;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.locators = LocatorUtil.loadLocators("locators/LoginPageLocators.yaml");
	}

	public WebElement getUsernameField() {
		return driver.findElement(LocatorUtil.getLocator(locators, "username_field"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(LocatorUtil.getLocator(locators, "password_field"));
	}

	public WebElement getLoginButton() {
		return driver.findElement(LocatorUtil.getLocator(locators, "login_button"));
	}

	public boolean homePageDisplayed() {
		boolean status = false;
		if (driver.findElement(LocatorUtil.getLocator(locators, "homePageTitle")).isDisplayed()) {
			status = true;
		}
		return status;
	}

	// Other methods to interact with the login page
}