Feature: Comprar articulo en la plataforma de compras

  Scenario: Comprar articulos
    Given que Juan ingresa a la platorma de compras
    When busque un articulo para comprar
    And llene el formulario y termine la compra
    Then la compra sera exitosa