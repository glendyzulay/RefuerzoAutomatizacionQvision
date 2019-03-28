package co.com.qvision.definitions.practica_automatizacion;

import co.com.qvision.steps.practica_automatizacion.CategoriaCajaTextoStep;
import co.com.qvision.steps.practica_automatizacion.IngresoMenuPrincipalSecundarioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CategoriaFormularioCajasTextoDefinition {

  @Steps
  CategoriaCajaTextoStep categoriaCajaTextoStep;

  private String palabraParametro;

 @Cuando("^Se digita la palabra (.*)$")
  public void digitarPalabra(String palabraEscrita) {
    categoriaCajaTextoStep.diligenciarTexto(palabraEscrita);
  }

  @Entonces("^La palabra digitada es igual a la palabra (.*)$")
  public void verificarPalabras(String palabraParametro) {
    categoriaCajaTextoStep.verificarMensaje(palabraParametro);
  }

  @Cuando("^Se digitan los valores (\\d+) y (\\d+)$")
  public void digitarNumeros(String numero1, String numero2) {
    categoriaCajaTextoStep.diligenciarNumeros(numero1, numero2);
  }

  @Entonces("^La suma debe ser igual a (\\d+)$")
  public void verificarSuma(String valorSuma) {
    categoriaCajaTextoStep.verificarSuma(valorSuma);
  }
}
