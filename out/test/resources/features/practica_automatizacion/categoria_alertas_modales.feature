#language: es
Característica: Ingresar un texto en un campo y verificar el texto ingresado

  Escenario: Verificar que el texto ingresado sea el mismo enviado por parámetro
    Dado Que se requiere ingresar al menú
      | Menú Principal  | Menú Secundario   |
      | Alerts & Modals | Javascript Alerts |
    Cuando Se digite el texto Refuerzo Automatización
    Entonces Se verifica el texto ingresado
