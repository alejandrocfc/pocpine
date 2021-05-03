package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.HomePage;

public class MatchElement implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return "asdasdasdasd";
    }

    public static MatchElement getInstance(){
        return new MatchElement();
    }
}
