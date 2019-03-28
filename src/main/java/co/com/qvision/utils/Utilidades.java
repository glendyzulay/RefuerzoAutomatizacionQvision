package co.com.qvision.utils;

import java.util.ArrayList;
import java.util.List;

public class Utilidades {

  public List<String> transformarCadenaLista(String cadena) {
    List<String> lstCadena = new ArrayList<>();
    if (cadena != null) {
      String[] vectCadena = cadena.split(",");
      for (int i = 0; i < vectCadena.length; i++) {
        lstCadena.add(vectCadena[i]);
      }
    }
    return lstCadena;
  }
}
