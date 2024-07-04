Feature: Busqueda de vuelos
  Yo como viajero frecuente
  Quiero buscar mis vuelos
  Para realizar viajes de negocios


  Scenario:Buscar vuelo local exitoso
    Given que Juan se encuentra en la pagina principal
    When filtra el vuelo que desea realizar
    Then obtiene los resultados con mejores precios

  Scenario:Buscar vuelo internacional exitoso
    Given que Juan se encuentra en la pagina principal
    When filtra el vuelo internacional que desea realizar
    Then obtiene los resultados con mejores precios