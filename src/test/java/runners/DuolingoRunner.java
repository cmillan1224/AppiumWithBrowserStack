package runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/duolingo.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class DuolingoRunner {
}
