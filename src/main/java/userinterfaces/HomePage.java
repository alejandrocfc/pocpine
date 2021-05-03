package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target FLOATING_BUTTON = Target.the("floatingButton").locatedBy("//android.widget.Button[@content-desc='Increment']");
    public static final Target TEXT_INCREMENT = Target.the("text increment").locatedBy("(//android.view.View[@content-desc='You have pushed the button this many times:'])[2]");
}
