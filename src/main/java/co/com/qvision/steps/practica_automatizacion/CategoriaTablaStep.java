package co.com.qvision.steps.practica_automatizacion;

import co.com.qvision.pages.practica_automatizacion.CategoriaTablaPage;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class CategoriaTablaStep {

  @Page CategoriaTablaPage categoriaTablaPage;

  private String filtroParametro;
  private static final String FILTRO= "Status";

  @Step
  public void filtrarValores(List<Map<String, String>> nombreFiltro) throws IOException {
    for (Map<String, String> filtro: nombreFiltro){
      filtroParametro = filtro.get(FILTRO);
      categoriaTablaPage.filtrarRegistro(filtro.get(FILTRO));
    }
  }

  @Step
  public void verificarValorFiltrado(){
    String filtroAplicado= categoriaTablaPage.verificarValorFiltrado();
    MatcherAssert.assertThat("El filtro aplicado corresponde con el filtro enviado por parámetro", filtroAplicado.equalsIgnoreCase(filtroParametro));
  }

  @Step
  public void verificarMensajeRespuesta(String mensajeEsperado) {
    String mensajeRespuesta = categoriaTablaPage.verificarMensajeRespuesta();
    MatcherAssert.assertThat("El mensaje arrojado coincide con el esperado", mensajeRespuesta.equalsIgnoreCase(mensajeEsperado));
  }
}
