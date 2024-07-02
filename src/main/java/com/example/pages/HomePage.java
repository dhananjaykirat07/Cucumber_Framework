package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.utils.LocatorUtil;
import java.util.Map;

public class HomePage {
    WebDriver driver;
    Map<String, Map<String, String>> locators;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.locators = LocatorUtil.loadLocators("locators/HomePageLocators.yaml");
    }
    
    private WebElement element(String locatorName) {
		return driver.findElement(LocatorUtil.getLocator(locators, locatorName));
    }

	public void clickOnaddtoCartButton() {
		element("addToCartButton").click();
	}
}