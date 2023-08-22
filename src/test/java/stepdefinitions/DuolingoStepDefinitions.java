package stepdefinitions;


import com.screenplay.questions.LoginQuestion;
import com.screenplay.task.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.*;

public class DuolingoStepDefinitions {

    @Given("^the \"([^\"]*)\" wants to login to duolingo$")
    public void theWantsToLoginToDuolingo(String actor) {
        theActorCalled(actor).entersTheScene();
        theActorInTheSpotlight().attemptsTo(Login.goTo());
    }

    @When("^enter your credentials$")
    public void enterYourCredentials() {
        theActorInTheSpotlight().attemptsTo(Credentials.enter());
    }

    @Then("^you see your account screen$")
    public void youSeeYourAccountScreen() {
        theActorInTheSpotlight().should(
                seeThat("Ya existe una cuenta", LoginQuestion.checkDescription() ,
                        either(equalTo("You already have an existing profile"))
                                .or(equalTo("Looks like your account was created with Google!"))));
    }
}
