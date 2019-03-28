package co.com.qvision.pages.practica_automatizacion;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CategoriaBotonSeleccionPage extends PageObject {

  @FindBy(xpath = "//*[@id='navbar-brand-centered']//*[contains(text(),'Radio Buttons Demo')]")
  private WebElementFacade mnRadioButton;

  @FindBy(xpath = "//*[@id='easycont']")
  private WebElementFacade btnOpcion;

  @FindBy(id="buttoncheck")
  private WebElementFacade btnVerificarValorChequeado;

  @FindBy(xpath = "//*[@class='radiobutton']")
  private WebElementFacade lblMensajeOpcionSeleccionada;

  private static final String DIVISOR_XPATH_OPCION= "//input[contains (@name, 'optradio') and contains(@value, '";

  public void seleccionarMenuRadioButton(){
    mnRadioButton.waitUntilClickable().click();
  }

  public void seleccionarBotonOpcion(String seleccionarOpcion){
    btnOpcion.find(By.xpath(DIVISOR_XPATH_OPCION + seleccionarOpcion + "')]")).waitUntilClickable().click();
  }

  public void seleccionarBotonValorChequeado(){
    btnVerificarValorChequeado.waitUntilClickable().click();
  }

  public String verificarMensajeOpcionSeleccionada(){
     return lblMensajeOpcionSeleccionada.getText();
  }
}
