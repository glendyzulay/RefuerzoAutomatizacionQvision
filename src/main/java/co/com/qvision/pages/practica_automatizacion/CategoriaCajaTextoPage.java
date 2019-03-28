package co.com.qvision.pages.practica_automatizacion;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CategoriaCajaTextoPage extends PageObject {

  @FindBy(id = "user-message")
  private WebElementFacade txtIngresarMensajeSimple;

  @FindBy(xpath = "//*[@id='get-input']/button")
  private WebElementFacade btnMostrarMensaje;

  @FindBy(id = "sum1")
  private WebElementFacade txtIngresarValorA;

  @FindBy(id = "sum2")
  private WebElementFacade txtIngresarValorB;

  @FindBy(xpath = "//*[@id='gettotal']/button")
  private WebElementFacade btnObtenerTotal;

  @FindBy(id = "display")
  private WebElementFacade lblMensaje;

  @FindBy(id = "displayvalue")
  private WebElementFacade lblresultadoSuma;

  public void escribirMensaje(String palabra) {
    txtIngresarMensajeSimple.clear();
    txtIngresarMensajeSimple.sendKeys(palabra);
  }

  public void mostrarMensaje() {
    btnMostrarMensaje.waitUntilClickable().click();
  }

  public String etiquetaMensaje() {
    String mensaje;
    return mensaje = lblMensaje.getText();
  }

  public void digitarValorA(String numero1) {
    txtIngresarValorA.clear();
    txtIngresarValorA.sendKeys(numero1);
  }

  public void digitarValorB(String numero2) {
    txtIngresarValorB.clear();
    txtIngresarValorB.sendKeys(numero2);
  }

  public void obtenerTotal() {
    btnObtenerTotal.waitUntilClickable().click();
  }

  public String resultadoSuma() {
    String resultado = lblresultadoSuma.getText();
    return resultado;
  }
}
