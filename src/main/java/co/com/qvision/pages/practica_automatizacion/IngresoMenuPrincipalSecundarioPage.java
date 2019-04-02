package co.com.qvision.pages.practica_automatizacion;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.seleniumeasy.com/test/")
public class IngresoMenuPrincipalSecundarioPage extends PageObject {

  @FindBy(id = "navbar-brand-centered")
  private WebElementFacade contenedorMenu;

  public void seleccionarMenuPrincipal(String nombreMenuPrincipal){
    contenedorMenu.findElement(By.xpath("//*[contains(text(),'"+ nombreMenuPrincipal + "')]")).click();
  }

  public void seleccionarMenuSecundario(String nombreMenuSecundario){
    contenedorMenu.findElement(By.xpath("//*[contains(text(),'" + nombreMenuSecundario + "')]")).click();
  }
}
