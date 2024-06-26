Feature: Compra de articulos en Mattelsa
  Yo como usuario de Mattelsa
  Quiero agregar articulos al carrito
  Para realizar una compra


  Scenario Outline:Comprar Buzo para hombre exitoso
    Given que Juan se encuentra en la pagina principal
    And el filtra la categoria Hombre
    When seleccione el articulo "Buzo Hoodie Marfil Oso"
    And diligencia la informacion requerida
      | correo   | nombre   | apellido   | celular   | tipoDoc   | numDocumento   |
      | <correo> | <nombre> | <apellido> | <celular> | <tipoDoc> | <numDocumento> |
    Then los datos diligenciados son correctos
    Examples:
      | correo          | nombre | apellido  | celular    | tipoDoc   | numDocumento |
      | juan@juan.com   | Juan   | Fernandez | 3003003032 | cedulaCOL | 1045427855   |
      | daniel@juan.com | Daniel | Zabala    | 3003003032 | cedulaCOL | 1045427855   |
      | iveth@juan.com  | Iveth  | Zapata    | 3003003032 | cedulaCOL | 1045427855   |


  @Pending
  Scenario:Comprar Buzo para hombre exitoso
    Given que Juan se encuentra en la pagina principal
    And el filtra la categoria Hombre
    When seleccione el articulo "Buzo Hoodie Marfil Oso"
    And diligencia la informacion requerida
      | correo        | nombre | apellido  | celular    | tipoDoc   | numDocumento |
      | juan@juan.com | Juan   | Fernandez | 3003003032 | cedulaCOL | 1045427855   |
    Then los datos diligenciados son correctos

  @Pending
  Scenario:Comprar articulo para hombre exitoso
    Given que el usuario se encuentra en la pagina principal
    #And el filtra la categoria que desea
    When seleccione el articulo
    And diligencia la informacion requerida
    Then los datos diligenciados son correctos