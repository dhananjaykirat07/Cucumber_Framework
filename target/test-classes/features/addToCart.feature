Feature: Add To Cart

  @smoketest1
  Scenario: Adding a aproduct to cart
    Given user is on login page
    And user enters valid credentials
    Then user is navigated to the home page
    And user added a product to cart
