#language: es
Característica: Seleccionar la opción "Female" y verificar que el radio button con ese valor se haya seleccionado.

  Escenario: Verificar que se haya seleccionado la opción "Female"
    Dado Que se requiere ingresar al menú
      | Menú Principal | Menú Secundario    |
      | Input Forms    | Radio Buttons Demo |
    Cuando Se seleccione la opción Female
    Entonces Se verifica que se haya seleccionado el botón con valor Female
