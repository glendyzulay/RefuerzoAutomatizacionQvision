package co.com.qvision.steps.practica_automatizacion;

import co.com.qvision.pages.practica_automatizacion.CategoriaCajaTextoPage;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class CategoriaCajaTextoStep {

  @Page CategoriaCajaTextoPage categoriaCajaTextoPage;

  public void diligenciarTexto(String palabra){
    categoriaCajaTextoPage.escribirMensaje(palabra);
    categoriaCajaTextoPage.mostrarMensaje();
  }

  public void verificarMensaje(String palabraParametro){
    String palabraEscrita = categoriaCajaTextoPage.etiquetaMensaje();
    MatcherAssert.assertThat("La palabra por parámetro es diferente a la palabra escrita", palabraEscrita.equalsIgnoreCase(palabraParametro));
  }

  public void diligenciarNumeros(String numero1, String numero2){
   categoriaCajaTextoPage.digitarValorA(numero1);
   categoriaCajaTextoPage.digitarValorB(numero2);
  }

  public void verificarSuma(String valorSuma){
    categoriaCajaTextoPage.obtenerTotal();
    String suma = categoriaCajaTextoPage.resultadoSuma();
    MatcherAssert.assertThat("El resultado de la suma es diferente", suma.equals(valorSuma));
  }
}
