#language: es
@Todo
Característica: Seleccionar un dato de la tabla al hacer uso de los filtros y verificar que el dato filtrado corresponde
  al pasado por parámetro

  @busquedaExitosa
  Escenario: Verificar que el dato filtrado corresponde al dato pasado por parámetro
    Dado Que se requiere ingresar al menú
      | Menú Principal | Menú Secundario   |
      | Table          | Table Data Search |
    Cuando Se filtren los valores por la columna
      | Status   |
      | deployed |
    Entonces Se verifica que el dato buscado corresponde al dato pasado por parámetro

  @busquedaFallida
  Escenario: Verificar que el filtro aplicado no arroja resultados
    Dado Que se requiere ingresar al menú
      | Menú Principal | Menú Secundario   |
      | Table          | Table Data Search |
    Cuando Se filtren los valores por la columna
      | Status |
      | Glendy |
    Entonces Se verifica que se muestre el mensaje No results found