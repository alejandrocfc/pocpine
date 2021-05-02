package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import utils.Setup;

public class CounterStepDefinition {
    @Before
    public void StartDevice(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Patient Baptist");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(Setup.getDriver().configDriver()));
    }
    @When("User tap button")
    public void userTapButton() {

    }
    @Then("Text should be display {int}")
    public void textShouldBeDisplay(Integer int1) {
    }
}
