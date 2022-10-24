Feature: validate send payment functionality on the eriBank application

  @PaymentSuccessful
  Scenario: As a user Juan wants to make a payment successfully on the exito application
    Given Juan has pending products to pay
    When He makes click on the pay button
    And He checks the payment information
    And He makes click on the continue button
    Then The system allows He to select the payment method

