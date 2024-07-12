package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;




@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
    ///elegimos el feture que queremos que se ejecute
    features ="src/test/resources/features/reserve.feature",
            ///reducimos espacio al momento de leer el feature los metodos se me creen sin espacios y mayusculas y minusculas
            snippets = SnippetType.CAMELCASE,
            ///Definimos el paquete donde estan los pasos que se van a ejecutar
            glue = "stepdefinitions"
)

public class Runner {




}
