Feature: Validate that the exito application allows to the users to make a purchases successfully
  @ShoppingCart
  Scenario: as a user Juan wants to make a purchase of a tv on the exito app
    When Juan searches for a product "Televisor" in the search bar of the app
    And He aggregate the product to the shopping cart
    Then He can validate the product cost