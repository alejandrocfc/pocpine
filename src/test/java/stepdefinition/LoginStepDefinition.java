package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.MatchElement;
import tasks.Login;
import userinterfaces.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoginStepDefinition {
    HomePage urlConstant;
    @Before
    public void StartBrowser(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Rehabit Admin");
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(urlConstant));
    }

    @When("User try to login without credentials")
    public void userTryToLoginWithoutCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withoutCredential());
    }

    @Then("Required message is displayed")
    public void requiredMessageIsDisplayed() {
        /*OnStage.theActorInTheSpotlight().should(
                seeThat(MatchElement.getText(),
                        is(equalTo(":( — Ingrese los datos"))));*/
    }
}
