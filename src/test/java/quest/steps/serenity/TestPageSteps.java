package quest.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quest.config.Constants;
import quest.config.EnvironmentConfiguration;
import quest.pages.StartPage;

public class TestPageSteps extends ScenarioSteps {

    private Logger logger = LoggerFactory.getLogger(TestPageSteps.class);

    @Steps
    private StartPage startPage;


    @Step
    public void isOnHomePage() {
        try {
            startPage.openAt(EnvironmentConfiguration.getValue(Constants.START_URL));
        } catch (Exception e) {
            getDriver().navigate().refresh();
            logger.info("*** Problem opening page, trying again " + e.getMessage());
            startPage.openAt(EnvironmentConfiguration.getValue(Constants.START_URL));
        }
    }

    @Step
    public void verifyStartPageOpens() {
        startPage.checkCurrentUrl(EnvironmentConfiguration.getValue(Constants.START_URL));
        startPage.elementsAreVisible();
    }

}
