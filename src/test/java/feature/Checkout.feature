Feature: Adding the product to the cart and doing some operations
	@Addcart
  Scenario Outline: Adding the product to the cart
   Given User is on GreenCart Landing page
    When User searched with shortname '<name>' and extrated the actual name of product
    And Add "3" items of the selected product to cart
    Then User proceeds to checkout and validate the  '<name>' item in checkout page
		And verify user has ability to enter promo code and place the order
		Examples: 
		|name|
		|tom|