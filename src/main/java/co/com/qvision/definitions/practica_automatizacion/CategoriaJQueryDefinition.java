package co.com.qvision.definitions.practica_automatizacion;

import co.com.qvision.steps.practica_automatizacion.CategoriaJQueryStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CategoriaJQueryDefinition {

  @Steps CategoriaJQueryStep categoriaJQueryStep;

  @Cuando("^Se seleccionen los valores (.*)$")
  public void seleccionarEstados(String estados)  {
    categoriaJQueryStep.seleccionarEstados(estados);
  }

  @Entonces("^Se verifica que se hayan seleccionado en el campo correspondiente$")
  public void verificarEstadosSeleccionados()  {
    categoriaJQueryStep.verificarEstadosSeleccionados();
  }
}
