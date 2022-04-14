package orange_hrm.stepdefinitions;
import io.cucumber.java.en.*;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.InputText;
import tasks.NavigateTo;
import tasks.ClickOn;

public class OrangeStepDef {
    @Given("{actor} open Orange HRM login page")
    public void loadHRMLoginPage( Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("HRM Login"));
    }

    @When("{actor} input username and password")
    public void inputCredential(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();

        String username = dotenv.get("USERNAME_HRM");
        String password = dotenv.get("PASSWORD_HRM");

        actor.attemptsTo(
                InputText.onField("HRM username", username),
                InputText.onField("HRM password", password)
        );
    }

    @And("{actor} click login button")
    public void ClickLoginButton(Actor actor) throws Exception{
        actor.attemptsTo(
                ClickOn.button("HRM Login")
        );
    }

    @Then("{actor} can login successfuly")
    public void ValidateLoginSuccess(Actor actor) {
        actor.attemptsTo(
            Ensure.thatTheCurrentPage().currentUrl().contains("/index.php/dashboard")
        );
    }
}
