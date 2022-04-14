package tasks;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import fb.pageobjects.LoginPageObject;
import orange_hrm.pageobject.HRMLoginPageObject;
import orange_hrm.pageobject.HRMPIMPageObject;

public class NavigateTo {
    public static Performable theURL(String urlType) throws Exception {
        Class url;
        switch(urlType){
            case "FB LogIn":
                url = LoginPageObject.class;
                break;
            case "HRM Login":
                url = HRMLoginPageObject.class;
                break;
            case "HRM Employee List":
                url = HRMPIMPageObject.class;
                break;
            default:
                throw new Exception("There is no url" + urlType);
        }
        return Task.where("{0} access the login url",
            Open.browserOn().the(url));
    }

}
