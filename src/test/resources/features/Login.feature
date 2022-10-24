Feature: Validate login functionality in the exito app
  @LoginSuccessful
  Scenario: As a User, Juan wants to login successful in the exito app
    Given Juan makes click on the Ingresar Button
    When He access to the exito application with email "juanpaosorio199@gmaiil.com" and Password "Bos@_3l_retaz0"
    And He allows to access device location
    Then He can login successfully on the exito application



