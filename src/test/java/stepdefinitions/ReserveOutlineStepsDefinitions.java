package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Data;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.TaskEnterInformation;
import task.TaskEnterInformationOutline;
import task.TaskInfoReserve;

public class ReserveOutlineStepsDefinitions {



    @Managed
    //especficamos que queremos usar el driver del browser definido en el serenity.properties
    WebDriver hisBrowser;

    @Before

    ///Antes de que se ejecuten los pasos, defino el actor y que el actor use el browser
    public void setUp(){

        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Manuel");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^the user access in the platform outline$")
    public void theUserAccessInThePlatformOutline() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/index.es.html"));

    }

    @When("^the user enter the information\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    ///el mismo runner genera el metodo con los parametros y las expresiones regulares
    public void theUserEnterTheInformation(String arg1, String arg2, String arg3) {


        ///Creamos un objeto de la clase donde estan los atributos que se van a enviar
        Data Data=new Data();

        //le pasamos los datos a los metodos
        Data.setCity(arg1);
        Data.setDateinit(arg2);
        Data.setDatefinal(arg3);


        ///llamamos la task y le pasamos por parametro el objeto con los datos

        OnStage.theActorInTheSpotlight().attemptsTo(TaskEnterInformationOutline.RegisterInformation(Data));

    }

    @Then("^user look the hotel reserve in the page outline$")
    public void userLookTheHotelReserveInThePageOutline() {

        OnStage.theActorInTheSpotlight().attemptsTo(TaskInfoReserve.InfoReserve());


    }

}
