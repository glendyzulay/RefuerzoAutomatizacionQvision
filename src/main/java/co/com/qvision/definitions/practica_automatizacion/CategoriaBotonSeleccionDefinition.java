package co.com.qvision.definitions.practica_automatizacion;

import co.com.qvision.steps.practica_automatizacion.CategoriaBotonSeleccionStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CategoriaBotonSeleccionDefinition {

  @Steps CategoriaBotonSeleccionStep categoriaBotonSeleccionStep;

  @Cuando("^Se seleccione la opción (.*)$")
  public void seleccionarOpcion(String seleccionarOpcion)  {
    categoriaBotonSeleccionStep.seleccionarOpcion(seleccionarOpcion);
  }

  @Entonces("^Se verifica que se haya seleccionado el botón con valor (.*)$")
  public void verificarOpcionSeleccionada(String opcionEsperada)  {
    categoriaBotonSeleccionStep.verificarOpcionSeleccionada(opcionEsperada);
  }
}
