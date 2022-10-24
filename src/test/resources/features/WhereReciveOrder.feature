Feature: Validate select city functionality on the Exito application
  @ReciveYourOrderOptionS
  Scenario: As a user Juan wants to choose the delivery city for your orders
    Given Juan makes click on the how do you want to receive your order option
    And He select buy and collect option
    When He select a city "Pereira"
    And He select a store "Exito Pereira Victoria"
    Then The system allows He makes click on the Continuar button
