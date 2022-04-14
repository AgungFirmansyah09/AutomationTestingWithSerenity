package tasks;

import fb.pageobjects.LoginPageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class InputField {
    public static Performable fb(String credType, String credential) throws Exception{
        Target field;

        switch(credType){
            case "email":
                field = LoginPageObject.EMAIL_FIELD;
                break;
            case "password":
                field = LoginPageObject.PASSWORD_FIELD;
                break;
            default:
                throw new Exception("There is no credential type" + credType);
        }

        return Task.where("{0} input credential: '" + credential + "'",
                Enter.theValue(credential)
                .into(field)
        );
    }
}
