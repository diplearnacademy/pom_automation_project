Feature: Implementar libreria de acciones para Serenity

  Scenario: Interactuar con Alert
    Given el usuario esta en la pagina
    When disparamos el alert
    Then debe regresar a la pagina inicial