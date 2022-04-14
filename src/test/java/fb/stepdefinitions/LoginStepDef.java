package fb.stepdefinitions;

import io.cucumber.java.en.*;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import tasks.*;

public class LoginStepDef {
    @Given("{actor} open facebook login page")
    public void loadPage(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("FB LogIn"));
    }

    @When("{actor} input email and password")
    public void inputField(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();

        String email = dotenv.get("EMAIL_FB");
        String password = dotenv.get("PASSWORD_FB");

        actor.attemptsTo(
                InputField.fb("email", email),
                InputField.fb("password", password)
        );

    }

    @And("{actor} click button login")
    public void clickButton(Actor actor) throws Exception {
        actor.attemptsTo(
                //Click.on("Log In")
                ClickOn.button("FB LogIn")
        );
    }
}
