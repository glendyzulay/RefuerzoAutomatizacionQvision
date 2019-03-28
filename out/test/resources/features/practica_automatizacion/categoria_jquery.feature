#language: es
Característica: Buscar y seleccionar múltiples valores

  Escenario: Verificar que se hayan seleccionado los valores enviados por parámetros
    Dado Que se requiere ingresar al menú
      | Menú Principal | Menú Secundario        |
      | Input Forms    | JQuery Select dropdown |
    Cuando Se seleccionen los valores Texas,Minnesota,Alaska
    Entonces Se verifica que se hayan seleccionado en el campo correspondiente
