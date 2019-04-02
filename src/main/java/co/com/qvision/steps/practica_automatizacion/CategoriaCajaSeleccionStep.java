package co.com.qvision.steps.practica_automatizacion;

import co.com.qvision.pages.practica_automatizacion.CategoriaCajaSeleccionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class CategoriaCajaSeleccionStep {

  @Page CategoriaCajaSeleccionPage categoriaCajaSeleccionPage;

  @Step
  public void seleccionarCajaChequeo() {
    categoriaCajaSeleccionPage.seleccionarCajaChequeo();
  }

  @Step
  public void verificarMensajeCajaChequeo(String mensaje) {
    String mensajeMostrado = categoriaCajaSeleccionPage.verificarMensajeCajaChequeo();
    MatcherAssert.assertThat("No se muestra el mensaje correcto", mensaje.equalsIgnoreCase(mensajeMostrado));
  }

}
