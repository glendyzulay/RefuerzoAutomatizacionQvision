package co.com.qvision.pages.practica_automatizacion;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CategoriaListaDesplegablePage extends PageObject {

  @FindBy(xpath = "//*[@id='select-demo']")
  private WebElementFacade listaDesplegable;

  @FindBy(xpath ="//*[@class='selected-value']")
  private WebElementFacade lblDiaSeleccionado;

  public void seleccionarDia(String dia){
    listaDesplegable.selectByVisibleText(dia);
  }

  public String verificarMensajeDiaSeleccionado(){
    return listaDesplegable.getText();
  }
}
