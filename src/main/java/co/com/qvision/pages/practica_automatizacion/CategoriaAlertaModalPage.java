package co.com.qvision.pages.practica_automatizacion;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CategoriaAlertaModalPage extends PageObject {

  @FindBy(xpath="//*[@id='easycont']//div[@class='panel-body']//button[contains(.,'Click for Prompt Box')]")
  private WebElementFacade btnCajaTexto;

  @FindBy(id="prompt-demo")
  private WebElementFacade lblTextoResultado;

  public void seleccionarBoton() {
    btnCajaTexto.waitUntilClickable().click();
  }

  public void digitarTexto(String textoParametro) {
    getDriver().switchTo().alert().sendKeys(textoParametro);
    getDriver().switchTo().alert().accept();
  }

  public String verificarTextoResultado(){
    return lblTextoResultado.getText();
  }
}
