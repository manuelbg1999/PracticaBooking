package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import model.Data;
import task.TaskEnterInformation;
import task.TaskInfoReserve;

import java.util.List;

public class ReserveStepsDefinitions {

    @Managed
    //especficamos que queremos usar el driver del browser definido en el serenity.properties
    WebDriver hisBrowser;

    @Before

    ///Antes de que se ejecuten los pasos, defino el actor y que el actor use el browser
    public void setUp(){

        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^the user access in the platform$")
    public void theUserAccessInThePlatform() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/index.es.html"));

    }


    @When("^the user enter the information$")
    public void theUserEnterTheInformation(List<Data> list) {
        ///Creamos un objeto
        Data Data;

        //le damos valor al objeto con la lista que le pasamos con los datos del datatable
        Data=list.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(TaskEnterInformation.RegisterInformation(Data));
    }

    @Then("^user look the hotel reserve in the page$")
    public void userLookTheHotelReserveInThePage() {

        OnStage.theActorInTheSpotlight().attemptsTo(TaskInfoReserve.InfoReserve());

    }

}
