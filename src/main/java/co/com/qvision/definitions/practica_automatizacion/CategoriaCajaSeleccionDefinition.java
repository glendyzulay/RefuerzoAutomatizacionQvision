package co.com.qvision.definitions.practica_automatizacion;

import co.com.qvision.steps.practica_automatizacion.CategoriaCajaSeleccionStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CategoriaCajaSeleccionDefinition {

  @Steps
  CategoriaCajaSeleccionStep categoriaCajaSeleccionStep;

  @Cuando("^Se seleccione el checkbox correspondiente$")
  public void seleccionarCheckBox() {
    categoriaCajaSeleccionStep.seleccionarCajaChequeo();
  }

  @Entonces("^Se muestra el texto (.*)$")
  public void verificarMensaje(String mensaje) {
    categoriaCajaSeleccionStep.verificarMensajeCajaChequeo(mensaje);
  }
}
