package orange_hrm.pageobject;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class HRMLoginPageObject extends PageObject {

    public static Target USERNAME_FIELD= Target.the("email field")
            .locatedBy("#txtUsername");

    public static Target PASSWORD_FIELD= Target.the("password field")
            .locatedBy("#txtPassword");

    public static Target LOGIN_BUTTON= Target.the("login button")
            .locatedBy("#btnLogin");

}