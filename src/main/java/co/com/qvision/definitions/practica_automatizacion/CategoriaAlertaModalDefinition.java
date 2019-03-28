package co.com.qvision.definitions.practica_automatizacion;

import co.com.qvision.steps.practica_automatizacion.CategoriaAlertaModalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CategoriaAlertaModalDefinition {

  @Steps CategoriaAlertaModalStep categoriaAlertaModalStep;

  @Cuando("^Se digite el texto (.*)$")
  public void digitarTexto(String textoParametro)  {
    categoriaAlertaModalStep.digitarTexto(textoParametro);
  }

  @Entonces("^Se verifica el texto ingresado$")
  public void verificarTextoIngresado()  {

  }
}
