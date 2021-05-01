package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CounterStepDefinition {
    @When("User tap button")
    public void userTapButton() {
    }
    @Then("Text should be display {int}")
    public void textShouldBeDisplay(Integer int1) {
    }
}
