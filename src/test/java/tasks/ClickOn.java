package tasks;

import fb.pageobjects.LoginPageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import orange_hrm.pageobject.HRMLoginPageObject;
import orange_hrm.pageobject.HRMPIMPageObject;





public class ClickOn {

    public static Performable employeeList() {
        return Task.where("{0} click first employee",
                Click.on(HRMPIMPageObject.FIRST_EMPLOYEE_LIST)
        );
    }

    public static Performable checkbox() {
        return Task.where("{0} click checkbox on first employee",
                Click.on(HRMPIMPageObject.FIRST_EMPLOYEE_CHECKBOX)
        );
    }

    public static Performable button(String buttonType) throws Exception{
        Target button;

        switch(buttonType) {
            case "FB LogIn":
                button = LoginPageObject.LOGIN_BUTTON;
                break;
            case "HRM Login":
                button = HRMLoginPageObject.LOGIN_BUTTON;
                break;
            case "Add":
                button = HRMPIMPageObject.ADD_BUTTON;
                break;
            case "Save":
                button = HRMPIMPageObject.SAVE_BUTTON;
                break;
            case "Edit":
                button = HRMPIMPageObject.EDIT_BUTTON;
                break;
            case "Delete":
                button = HRMPIMPageObject.DELETE_BUTTON;
                break;
            case "Ok":
                button = HRMPIMPageObject.OK_BUTTON;
                break;
            case "Search":
                button = HRMPIMPageObject.SEARCH_BUTTON;
                break;
            default:
                throw new Exception("There is no button type" + buttonType);
        }
        return Task.where("{0} click" + buttonType + "button",
                Click.on(button));
    }

}
