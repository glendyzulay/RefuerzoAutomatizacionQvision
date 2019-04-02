package co.com.qvision.steps.practica_automatizacion;

import co.com.qvision.pages.practica_automatizacion.CategoriaCajaTextoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class CategoriaCajaTextoStep {

  @Page CategoriaCajaTextoPage categoriaCajaTextoPage;

  @Step
  public void diligenciarTexto(String palabra){
    categoriaCajaTextoPage.escribirMensaje(palabra);
    categoriaCajaTextoPage.mostrarMensaje();
  }

  @Step
  public void verificarMensaje(String palabraParametro){
    String palabraEscrita = categoriaCajaTextoPage.etiquetaMensaje();
    MatcherAssert.assertThat("La palabra por parámetro es diferente a la palabra escrita", palabraEscrita.equalsIgnoreCase(palabraParametro));
  }

  @Step
  public void diligenciarNumeros(String numero1, String numero2){
   categoriaCajaTextoPage.digitarValorA(numero1);
   categoriaCajaTextoPage.digitarValorB(numero2);
  }

  @Step
  public void verificarSuma(String valorSuma){
    categoriaCajaTextoPage.obtenerTotal();
    String suma = categoriaCajaTextoPage.resultadoSuma();
    MatcherAssert.assertThat("El resultado de la suma es diferente", suma.equals(valorSuma));
  }
}
