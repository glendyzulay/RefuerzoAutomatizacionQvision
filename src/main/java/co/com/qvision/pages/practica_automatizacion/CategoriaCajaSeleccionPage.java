package co.com.qvision.pages.practica_automatizacion;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CategoriaCajaSeleccionPage extends PageObject {

  @FindBy(xpath = "//*[@id='navbar-brand-centered']//*[contains(text(),'Input Forms')]")
  private WebElementFacade mnInputForms;

  @FindBy(xpath = "//*[@id='navbar-brand-centered']//*[contains(text(),'Checkbox Demo')]")
  private WebElementFacade mnCheckBox;

  @FindBy(id= "isAgeSelected")
  private WebElementFacade chkCajaChequeo;

  @FindBy(id="txtAge")
  private WebElementFacade lblCajaChequeo;

  public void seleccionarMenuInputForms(){
    mnInputForms.waitUntilClickable().click();
  }

  public void seleccionarMenuCheckbox(){ mnCheckBox.click();}

  public void seleccionarCajaChequeo() {
    chkCajaChequeo.click();
  }

  public String verificarMensajeCajaChequeo() {
    String mensajeCajaChequeo = lblCajaChequeo.getText();
    return mensajeCajaChequeo;
  }
}
