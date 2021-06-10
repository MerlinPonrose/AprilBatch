@Amazon
Feature: Amazon validation

Background:
Given User launches the browser and open demosite URL "https://www.amazon.in/"
When I enter Username and Password 
And I click sigin button
And I verify HomePage is displayed


@Regression @Smoke
Scenario: Verification in Amazon
Given User launches the browser and open demosite URL "https://www.amazon.in/"
Then User verify page title is "Online Shopping site in India"

Scenario: Vaidate cart is empty in Amazon
And I click cart icon
Then I validate cart is empty

Scenario: Add Product to cart
When I enter product in search box
And I select product
And I click add to cart
And I click cart icon
Then I validate cart is not empty
