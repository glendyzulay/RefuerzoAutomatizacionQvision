package co.com.qvision.pages.practica_automatizacion;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CategoriaTablaPage extends PageObject {

  @FindBy(id = "task-table-filter")
  private WebElementFacade txtFiltro;

  @FindBy(id= "task-table")
  private WebElementFacade tablaResultados;

  @FindBy(xpath="//*[@id=\"task-table\"]//tr[@class='filterTable_no_results']")
  private WebElementFacade lblMensajeResultado;

  private String filtroParametro;

  public void filtrarRegistro(String filtro){
    filtroParametro = filtro;
    typeInto(txtFiltro,filtroParametro);
  }

  public String verificarValorFiltrado(){
    return tablaResultados.find(By.xpath("//tr//td[contains(.,'" + filtroParametro + "')]")).getText();
  }

  public String verificarMensajeRespuesta() {
    return lblMensajeResultado.getText();
  }
}
