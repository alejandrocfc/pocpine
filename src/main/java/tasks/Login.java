package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import userinterfaces.HomePage;

public class Login implements Task {
    @Step("Login sin credenciales")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.LOGIN_BUTTON));
    }
    public static Login withoutCredential(){
        return Tasks.instrumented(Login.class);
    }
}
