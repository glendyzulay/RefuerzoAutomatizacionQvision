package co.com.qvision.pages.practica_automatizacion;

import co.com.qvision.utils.Utilidades;
import java.util.ArrayList;
import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CategoriaJQueryPage extends PageObject {

  @FindBy(xpath = "//div[@class='panel-body']//select[contains(@class,'multiple')]")
  private WebElementFacade multiSelectEstados;

  @FindBy(xpath = "//span[@class='selection']//span[contains(@class,'multiple')]//li")
  private List<WebElementFacade> listaEstadosSeleccionados;

  Utilidades utilidades = new Utilidades();

  private List<String> lstEstados = null;

  public void seleccionarMultiplesEstados(String estados) {
    lstEstados = utilidades.transformarCadenaLista(estados);
    for (String estado : lstEstados) {
      WebElementFacade estadoSeleccionar = multiSelectEstados.find(By.xpath("//option[contains(.,'" + estado + "')]"));
      estadoSeleccionar.click();
    }
  }

  public List<String> verificarEstadosSeleccionados() {
    List<String> lstEstadosSeleccionados = new ArrayList<>();
    for (WebElementFacade estadoSeleccionado : listaEstadosSeleccionados) {
      lstEstadosSeleccionados.add(estadoSeleccionado.getText());
    }
    return lstEstadosSeleccionados;
  }
}
