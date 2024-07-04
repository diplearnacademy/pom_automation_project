Feature: Implementar libreria de acciones para Serenity

  @Manual
  Scenario: Manipular un Iframe
    Given el usuario esta en la pagina
    When quiere manipular el menu hamburguesa
    Then debe expandir el menu del iframe

  @Manual
  Scenario: Cambiar pestana
    Given el usuario esta en la pagina
    When busca en google
    Then debe regresar a la pagina inicial



  Scenario: Interactuar con Alert
    Given el usuario esta en la pagina
    When disparamos el alert
    Then debe regresar a la pagina inicial