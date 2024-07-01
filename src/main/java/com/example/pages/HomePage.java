package com.example.pages;

import org.openqa.selenium.WebDriver;
import com.example.utils.LocatorUtil;
import java.util.Map;

public class HomePage {
    WebDriver driver;
    Map<String, Map<String, String>> locators;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.locators = LocatorUtil.loadLocators("locators/HomePageLocators.yaml");
    }

    public boolean isDisplayed() {
        // Implement logic to verify the home page is displayed
        // For example, checking the presence of a specific element
        return driver.findElement(LocatorUtil.getLocator(locators, "some_element")).isDisplayed();
    }
}