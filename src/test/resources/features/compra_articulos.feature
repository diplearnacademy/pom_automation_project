Feature: Compra de articulos en Mattelsa
  Yo como usuario de Mattelsa
  Quiero agregar articulos al carrito
  Para realizar una compra

  Scenario:Comprar articulo para hombre exitoso
    Given que el usuario se encuentra en la pagina principal
    And el filtra la categoria que desea
    When seleccione el articulo
    And diligencia la informacion requerida
    Then los datos diligenciados son correctos