package co.com.qvision.steps.practica_automatizacion;

import co.com.qvision.pages.practica_automatizacion.CategoriaListaDesplegablePage;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;


public class CategoriaListaDesplegableStep {

  @Page CategoriaListaDesplegablePage categoriaListaDesplegablePage;

  public void seleccionarDia(String dia){
    categoriaListaDesplegablePage.seleccionarDia(dia);
  }

  public void verificarMensajeDiaSeleccionado(String diaParametro){
    String diaSeleccionado = categoriaListaDesplegablePage.verificarMensajeDiaSeleccionado();
    MatcherAssert
            .assertThat("El día seleccionado es diferente al enviado por parámetro", diaSeleccionado.contains(diaParametro));
  }
}
