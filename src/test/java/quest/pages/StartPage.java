package quest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://test.fast.weown.com/own/platform")
public class StartPage extends PageObject {

    private static final int LOADELEMENT = 5;

    @FindBy(id = "#platform-landing-page-login-button")
    private WebElementFacade buttonLogin;

    @FindBy(id = "#platform-landing-page-register-button")
    private WebElementFacade buttonRegister;


    public void clickButtonLogin() {
        buttonLogin.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void clickButtonRegister() {
        buttonRegister.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void checkCurrentUrl() {
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals("https://test.fast.weown.com/own/platform", currentUrl);
    }

}
