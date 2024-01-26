Feature: Realizar compra

  Background:
    Given thah user is in homepage
    When clicking in log in option
    And writting credentials
      | user      | password      |
      | EliteUser | Colombia.2020 |
    Then User will be able to see user profile succesfully

    @CompraExitosa
    Scenario: realizar compra producto
      When cuando selecciono el producto y lo adicciono al carrito de compras
      And lleno la informacion de registro
      Then visualizo mensaje de compra exitosa