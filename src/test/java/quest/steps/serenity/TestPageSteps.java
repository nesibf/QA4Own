package quest.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import quest.pages.StartPage;

public class TestPageSteps extends ScenarioSteps {

    private StartPage startPage;

    @Step
    public void openStartPage() {
        startPage.checkCurrentUrl();
//        startPage.enterTestData();
    }

}
