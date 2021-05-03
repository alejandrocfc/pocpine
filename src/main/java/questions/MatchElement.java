package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.HomePage;

public class MatchElement implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.ALERT_CONTENT).viewedBy(actor).asString();
    }

    public static MatchElement getText(){
        return new MatchElement();
    }
}
