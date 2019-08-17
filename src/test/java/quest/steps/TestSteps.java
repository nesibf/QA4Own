package quest.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import quest.steps.serenity.TestPageSteps;

public class TestSteps {

    @Steps
    private TestPageSteps testPageSteps;

    @When("the user is on the Start home page")
    public void whenTheUserIsOnTheStartHomePage() {
        testPageSteps.isOnHomePage();
        testPageSteps.verifyStartPageOpens();
    }

    @When("the user registers as '.*'")
    public void whenTheUserRegistersAsUser(final String username) {
        // TBD
    }

    @When("the user login as '.*'")
    public void whenTheUserLoginAs(final String username) {
        // TBD
    }

    @And("the user enters the '.*'")
    public void andTheUserEntersThePassword(final String password) {
        // TBD
    }

    @Then("the user verifies the Start page opens correctly")
    public void thenTheUserVerifiesTheStartPageOpensCorrectly() {
        testPageSteps.verifyStartPageOpens();
    }

    @Then("the user verifies the registration was successful")
    public void thenTheUserVerifiesTheRegistrationWasSuccessful() {
        // TBD
    }

    @Then("the user verifies the login was successful")
    public void thenTheUserVerifiesTheLoginWasSuccessful() {
        // TBD
    }

}
