package quest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://test.fast.weown.com/own/platform")
public class LoginPage extends PageObject {

    private static final int LOADELEMENT = 5;

    @FindBy(id = "testdata")
    private WebElementFacade inputTestData;

    @FindBy(id = "spinButton")
    private WebElementFacade buttonSpin;

    @FindBy(id = "winbox")
    private WebElementFacade winboxValue;


}
