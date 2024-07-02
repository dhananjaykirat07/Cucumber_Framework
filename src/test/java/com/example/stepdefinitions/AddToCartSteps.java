package com.example.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.example.pages.HomePage;
import com.example.utils.DriverFactory;

import io.cucumber.java.en.Then;

public class AddToCartSteps {
	
	private WebDriver driver;
	private HomePage homePage;
	
	public AddToCartSteps() {
		this.driver = DriverFactory.getDriver();
		this.homePage = new HomePage(driver);
	}

	@Then("user added a product to cart")
	public void user_added_a_product_to_cart() {
	     homePage.clickOnaddtoCartButton();
	}
}
