package quest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import quest.config.Constants;

import java.util.concurrent.TimeUnit;

public class StartPage extends PageObject {

    @FindBy(id = "#platform-landing-page-login-button")
    private WebElementFacade buttonLogin;

    @FindBy(id = "#platform-landing-page-register-button")
    private WebElementFacade buttonRegister;

    @FindBy(id = "#platform-landing-page-facebook-register-button > img")
    private WebElementFacade buttonFacebook;

    @FindBy(id = "#platform-landing-page-google-register-button > img")
    private WebElementFacade buttonGoogle;


    public void clickButtonLogin() {
        buttonLogin.withTimeoutOf(Constants.LOADELEMENT, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void clickButtonRegister() {
        buttonRegister.withTimeoutOf(Constants.LOADELEMENT, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void checkCurrentUrl(final String url) {
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(url, currentUrl);
    }

    public void elementsAreVisible() {
        try {
            Thread.sleep(3000);
            buttonLogin.withTimeoutOf(Constants.LOADELEMENT, TimeUnit.SECONDS).isVisible();
            buttonRegister.withTimeoutOf(Constants.LOADELEMENT, TimeUnit.SECONDS).isVisible();
            buttonFacebook.withTimeoutOf(Constants.LOADELEMENT, TimeUnit.SECONDS).isVisible();
            buttonGoogle.withTimeoutOf(Constants.LOADELEMENT, TimeUnit.SECONDS).isVisible();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
