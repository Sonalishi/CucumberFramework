Feature: Desktop Functionality for nopCommerce site
  
  As a user I want to select desktop types from nopCommerce site

  Background:
    Given I am on Desktop page

  Scenario Outline: Add to Cart
    When User click on product <product name>
    Then User should get full page information of <product name>
    When User click on Add to cart button
    Then Product should add to cart successfully.

    Examples: 
      | product name           |
      | Digital Storm VANQUISH |
