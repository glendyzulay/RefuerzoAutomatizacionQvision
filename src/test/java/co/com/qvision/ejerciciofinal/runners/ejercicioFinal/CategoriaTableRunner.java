package co.com.qvision.ejerciciofinal.runners.ejercicioFinal;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = {"src/test/resources/features/practica_automatizacion/categoria_tabla.feature"},
    glue = {"co.com.qvision.definitions"},
    tags = "@Todo"
)
public class CategoriaTableRunner {
}
