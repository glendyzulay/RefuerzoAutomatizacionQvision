package co.com.qvision.steps.practica_automatizacion;

import co.com.qvision.pages.practica_automatizacion.IngresoMenuPrincipalSecundarioPage;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.fluentlenium.core.annotation.Page;

public class IngresoMenuPrincipalSecundarioStep {

  @Page
  IngresoMenuPrincipalSecundarioPage ingresoMenuPrincipalSecundarioPage;

  public void abrirPagina(){ ingresoMenuPrincipalSecundarioPage.open();}

  public void ingresarMenuPrincipalSecundario(List<Map<String, String>> nombresMenu) throws IOException {
    for (Map<String, String> nombreIngresoMenu : nombresMenu)
    {
      ingresoMenuPrincipalSecundarioPage.seleccionarMenuPrincipal(nombreIngresoMenu.get("Menú Principal"));
      ingresoMenuPrincipalSecundarioPage.seleccionarMenuSecundario(nombreIngresoMenu.get("Menú Secundario"));
    }
  }
}
