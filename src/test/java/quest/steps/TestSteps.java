package quest.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import quest.steps.serenity.TestPageSteps;

public class TestSteps {

    @Steps
    private TestPageSteps testPageSteps;

    @When("the user is on the Start home page")
    public void whenTheUserIsOnTheStartHomePage() {
        testPageSteps.openStartPage();
    }

    @Then("the user verifies the Start page opens correctly")
    public void thenTheUserVerifiesTheStartPageOpensCorrectly() {
        testPageSteps.openStartPage();
    }

}
