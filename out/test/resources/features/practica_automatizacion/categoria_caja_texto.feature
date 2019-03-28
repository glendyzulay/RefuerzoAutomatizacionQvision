#language: es
@Completo
Característica: Ingresar valores en campos de texto.

  @textoSimple
  Escenario: Verificar que la palabra digitada sea igual a la que llega por parámetro
    Dado Que se requiere ingresar al menú
      | Menú Principal | Menú Secundario  |
      | Input Forms    | Simple Form Demo |
    Cuando Se digita la palabra Amor
    Entonces La palabra digitada es igual a la palabra Perro

  @sumaDosCampos
  Escenario: Verificar que al ingresar dos valores la suma sea correcta
    Dado Que se requiere ingresar al menú
      | Menú Principal | Menú Secundario  |
      | Input Forms    | Simple Form Demo |
    Cuando Se digitan los valores 5 y 9
    Entonces La suma debe ser igual a 14



