package task;

import interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.HomePage;

public class TaskInfoReserve implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(WaitElement.untilAppears(HomePage.Texto));

        String txt = Text.of(HomePage.Texto).viewedBy(actor).asString();

        System.out.println(txt);


    }


    public static TaskInfoReserve InfoReserve(){
        return Tasks.instrumented(TaskInfoReserve.class);
    }
}
