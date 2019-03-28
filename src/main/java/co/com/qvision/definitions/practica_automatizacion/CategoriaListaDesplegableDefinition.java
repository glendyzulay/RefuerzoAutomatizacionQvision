package co.com.qvision.definitions.practica_automatizacion;

import co.com.qvision.steps.practica_automatizacion.CategoriaListaDesplegableStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CategoriaListaDesplegableDefinition {

  @Steps CategoriaListaDesplegableStep categoriaListaDesplegableStep;

  @Cuando("^Se seleccione el día (.*)$")
  public void seleccionarDia(String dia) {
    categoriaListaDesplegableStep.seleccionarDia(dia);
  }

  @Entonces("^Se verifica que corresponda con el día (.*)$")
  public void verificarDiaSeleccionado(String diaParametro) {
    categoriaListaDesplegableStep.verificarMensajeDiaSeleccionado(diaParametro);
  }
}
