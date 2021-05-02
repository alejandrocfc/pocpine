package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/counter.feature", glue = "stepdefinition", snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CounterRunner {

}
