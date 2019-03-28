#language: es
Característica: Seleccionar un checkbox y validar que se muestre un texto.

  Escenario: Verificar que se muestre un texto al seleccionar un checkbox
    Dado Que se requiere ingresar al menú
      | Menú Principal | Menú Secundario |
      | Input Forms    | Checkbox Demo   |
    Cuando Se seleccione el checkbox correspondiente
    Entonces Se muestra el texto Success - Check box is checked
