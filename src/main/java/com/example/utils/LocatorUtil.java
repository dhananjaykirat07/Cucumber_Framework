package com.example.utils;

import org.openqa.selenium.By;
import java.util.Map;

public class LocatorUtil {

    public static Map<String, Map<String, String>> loadLocators(String filePath) {
        return YamlReader.readYaml(filePath);
    }

    public static By getLocator(Map<String, Map<String, String>> locators, String elementName) {
        Map<String, String> locatorMap = locators.get(elementName);
        String type = locatorMap.get("type");
        String value = locatorMap.get("value");

        switch (type) {
            case "id":
                return By.id(value);
            case "name":
                return By.name(value);
            case "css":
                return By.cssSelector(value);
            case "xpath":
                return By.xpath(value);
            // Add other types as needed
            default:
                throw new IllegalArgumentException("Locator type not supported: " + type);
        }
    }
}