#language: es
Característica: Seleccionar un día a la semana de la lista desplegable y verificar que el día seleccionado corresponda al enviado

  Escenario: Verificar que el día enviado corresponda al día seleccionado
    Dado Que se requiere ingresar al menú
      | Menú Principal | Menú Secundario      |
      | Input Forms    | Select Dropdown List |
    Cuando Se seleccione el día Sunday
    Entonces Se verifica que corresponda con el día Sunday
