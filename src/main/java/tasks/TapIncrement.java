package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import userinterfaces.HomePage;

public class TapIncrement implements Task {
    @Step("Incrementar Botón")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.FLOATING_BUTTON));
    }
    public static TapIncrement executeAction(){
        return Tasks.instrumented(TapIncrement.class);
    }
}
