package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.MatchElement;
import tasks.TapIncrement;
import utils.Setup;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.*;

public class CounterStepDefinition {
    @Before
    public void StartDevice(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Patient Baptist");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(Setup.getDriver().configDriver()));
    }
    @When("User tap button")
    public void userTapButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(TapIncrement.executeAction());
    }
    @Then("Text should be display")
    public void textShouldBeDisplay() {
        System.out.println(MatchElement.getInstance());
        OnStage.theActorInTheSpotlight().should(
                seeThat(MatchElement.getInstance(),
                is(equalTo("questions.MatchElement@2e88bfab"))));
    }
}
