package co.com.qvision.steps.practica_automatizacion;

import co.com.qvision.pages.practica_automatizacion.CategoriaJQueryPage;
import java.util.ArrayList;
import java.util.List;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class CategoriaJQueryStep {

  @Page CategoriaJQueryPage categoriaJQueryPage;

  private String cadenaEstados=null;

  public void seleccionarEstados(String estados){
    cadenaEstados = estados;
    categoriaJQueryPage.seleccionarMultiplesEstados(estados);
  }

  public void verificarEstadosSeleccionados(){
    List<String> listadoEstadosSeleccionados = new ArrayList<>();
    listadoEstadosSeleccionados = categoriaJQueryPage.verificarEstadosSeleccionados();

    for (String listado: listadoEstadosSeleccionados){
      listado = listado.replace("×","");
      MatcherAssert.assertThat("Los estados seleccionados no corresponden con los enviados por parámetro", cadenaEstados.contains(listado));
    }
  }
}
