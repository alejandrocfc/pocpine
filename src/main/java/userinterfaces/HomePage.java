package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://rehabi-dashboard-dev.netlify.app")
public class HomePage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Login Button").locatedBy("//button[@type='submit']");
    public static final Target ALERT_CONTENT = Target.the("Alert content").locatedBy("//div[@role='alert']");
}
