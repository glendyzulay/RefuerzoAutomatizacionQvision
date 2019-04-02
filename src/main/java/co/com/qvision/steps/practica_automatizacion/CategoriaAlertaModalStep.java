package co.com.qvision.steps.practica_automatizacion;

import co.com.qvision.pages.practica_automatizacion.CategoriaAlertaModalPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class CategoriaAlertaModalStep {

  @Page CategoriaAlertaModalPage categoriaAlertaModalPage;

  private String textoEnviado;

  @Step
  public void digitarTexto(String textoParametro) {
    textoEnviado = textoParametro;
    categoriaAlertaModalPage.seleccionarBoton();
    categoriaAlertaModalPage.digitarTexto(textoParametro);
  }

  @Step
  public void verificarMensajeResultado(){
    String textoResultado = categoriaAlertaModalPage.verificarTextoResultado();
    MatcherAssert.assertThat("El parámetro enviado corresponde al texto diligenciado", textoResultado.contains(textoEnviado));
  }
}
