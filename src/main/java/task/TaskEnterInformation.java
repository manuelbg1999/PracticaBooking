package task;

import interactions.WaitElement;
import model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.interactions.internal.MouseAction;
import userinterfaces.HomePage;

public class TaskEnterInformation implements Task {


    Data Data;

    public TaskEnterInformation(model.Data data) {
        Data = data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        ///le damos una espera

        actor.attemptsTo(WaitElement.untilAppears(HomePage.CloseButton));
        actor.attemptsTo(Click.on(HomePage.CloseButton));


        actor.attemptsTo(Enter.theValue(Data.getCity()).into(HomePage.InputCity));
        actor.attemptsTo(Enter.keyValues(Keys.ARROW_DOWN).into(HomePage.InputCity));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(HomePage.InputCity));






        String DateInit="//span[@aria-label='"+Data.getDateinit()+"']";

        HomePage.InputDateInit= Target.the("texto")
                .locatedBy(DateInit);


        String DateFinal="//span[@aria-label='"+Data.getDatefinal()+"']";


        HomePage.InputDatefinal= Target.the("texto")
                .locatedBy(DateFinal);


         System.out.println(DateInit);
         System.out.println(DateFinal);


       actor.attemptsTo(WaitElement.untilAppears(HomePage.InputDateInit));
        actor.attemptsTo(Click.on(HomePage.InputDateInit));
       actor.attemptsTo(WaitElement.untilAppears(HomePage.InputDatefinal));
        actor.attemptsTo(Click.on(HomePage.InputDatefinal));



        actor.attemptsTo(WaitElement.untilAppears(HomePage.ButtonPerson));

        actor.attemptsTo(Click.on(HomePage.ButtonPerson));

        actor.attemptsTo(WaitElement.untilAppears(HomePage.Adult));

        ///actor.attemptsTo(WaitElement.untilAppears(HomePage.Room));

        ///


        actor.attemptsTo(Click.on(HomePage.Adult));

        actor.attemptsTo(WaitElement.untilAppears(HomePage.Kids));
        actor.attemptsTo(Click.on(HomePage.Kids));
        actor.attemptsTo(Click.on(HomePage.Kids));

        ///Espero que aparezcan las edades
        actor.attemptsTo(WaitElement.untilAppears(HomePage.Age1));
        actor.attemptsTo(WaitElement.untilAppears(HomePage.Age2));


        actor.attemptsTo(Click.on(HomePage.Age1));
        actor.attemptsTo(Enter.keyValues(Keys.ARROW_DOWN).into(HomePage.Age1));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(HomePage.Age1));


        actor.attemptsTo(Click.on(HomePage.Age2));
        actor.attemptsTo(Enter.keyValues(Keys.ARROW_DOWN).into(HomePage.Age2));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(HomePage.Age2));



        ///le doy click en habitaciones

       actor.attemptsTo(WaitElement.untilAppears(HomePage.Room));
        actor.attemptsTo(Click.on(HomePage.Room));



        actor.attemptsTo(WaitElement.untilAppears(HomePage.ButtonOk));


        actor.attemptsTo(Click.on(HomePage.ButtonOk));



        actor.attemptsTo(WaitElement.untilAppears(HomePage.ButtonSearch));


        actor.attemptsTo(Click.on(HomePage.ButtonSearch));


        actor.attemptsTo(WaitElement.untilAppears(HomePage.ButtonFilter));


        actor.attemptsTo(Click.on(HomePage.ButtonFilter));


        actor.attemptsTo(WaitElement.untilAppears(HomePage.Filter));


        actor.attemptsTo(Click.on(HomePage.Filter));


        actor.attemptsTo(WaitElement.untilAppears(HomePage.Star));


        actor.attemptsTo(Click.on(HomePage.Star));

        actor.attemptsTo(WaitElement.untilAppears(HomePage.Star4));


        actor.attemptsTo(Click.on(HomePage.Star4));


        actor.attemptsTo(WaitElement.untilAppears(HomePage.Star5));


        actor.attemptsTo(Click.on(HomePage.Star5));



    }


    public static TaskEnterInformation RegisterInformation(Data List) {
        return Tasks.instrumented(TaskEnterInformation.class, List);

    }
}
