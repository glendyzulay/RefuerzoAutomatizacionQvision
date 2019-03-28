package co.com.qvision.definitions.practica_automatizacion;

import co.com.qvision.steps.practica_automatizacion.CategoriaTablaStep;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CategoriaTablaDefinition {

 @Steps CategoriaTablaStep categoriaTablaStep;

  @Cuando("^Se filtren los valores por la columna$")
  public void filtrarValores(DataTable columna) throws Exception {
    categoriaTablaStep.filtrarValores(columna.asMaps(String.class, String.class));
  }

  @Entonces("^Se verifica que el dato buscado corresponde al dato pasado por parámetro$")
  public void verificarDatoBuscado() {
    categoriaTablaStep.verificarValorFiltrado();
  }

  @Entonces("^Se verifica que se muestre el mensaje (.*)$")
  public void verificarMensajeRespuesta(String mensajeEsperado) {
    categoriaTablaStep.verificarMensajeRespuesta(mensajeEsperado);
  }
}
