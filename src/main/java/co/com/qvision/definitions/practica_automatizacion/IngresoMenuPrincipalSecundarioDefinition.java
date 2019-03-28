package co.com.qvision.definitions.practica_automatizacion;

import co.com.qvision.steps.practica_automatizacion.IngresoMenuPrincipalSecundarioStep;
import cucumber.api.DataTable;
import cucumber.api.java.es.Dado;
import java.io.IOException;
import net.thucydides.core.annotations.Steps;

public class IngresoMenuPrincipalSecundarioDefinition {

  @Steps
  IngresoMenuPrincipalSecundarioStep ingresoMenuPrincipalSecundarioStep;

  @Dado("^Que se requiere ingresar al menú$")
  public void seleccionarMenuPrincipal(DataTable nombresMenu) throws IOException {
    ingresoMenuPrincipalSecundarioStep.abrirPagina();
    ingresoMenuPrincipalSecundarioStep.ingresarMenuPrincipalSecundario(nombresMenu.asMaps(String.class, String.class));
  }
}
