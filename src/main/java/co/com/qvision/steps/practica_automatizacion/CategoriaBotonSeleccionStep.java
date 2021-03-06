package co.com.qvision.steps.practica_automatizacion;

import co.com.qvision.pages.practica_automatizacion.CategoriaBotonSeleccionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class CategoriaBotonSeleccionStep {

  @Page CategoriaBotonSeleccionPage categoriaBotonSeleccionPage;

  @Step
  public void seleccionarOpcion(String seleccionarOpcion){
    categoriaBotonSeleccionPage.seleccionarBotonOpcion(seleccionarOpcion);
  }

  @Step
  public void verificarOpcionSeleccionada(String opcionEsperada){
    categoriaBotonSeleccionPage.seleccionarBotonValorChequeado();
    MatcherAssert.assertThat("No se seleccionó la opción correcta", categoriaBotonSeleccionPage.verificarMensajeOpcionSeleccionada().contains(opcionEsperada));
  }
}
