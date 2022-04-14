package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import orange_hrm.pageobject.HRMLoginPageObject;
import orange_hrm.pageobject.HRMPIMPageObject;

public class InputText {
    public static Performable onField(String fieldType, String value) throws Exception
    {
        Target field;
        switch(fieldType){
            case "HRM username":
                field = HRMLoginPageObject.USERNAME_FIELD;
                break;
            case "HRM password":
                field = HRMLoginPageObject.PASSWORD_FIELD;
                break;
            case "first Name":
                field = HRMPIMPageObject.FIRST_NAME_FIELD;
                break;
            case "last Name":
                field = HRMPIMPageObject.LAST_NAME_FIELD;
                break;
            case "edit Middle Name":
                field = HRMPIMPageObject.EDIT_MIDDLE_NAME_FIELD;
                break;
            case "employee Name":
                field = HRMPIMPageObject.EMPLOYEE_NAME;
                break;
            default:
                throw new Exception("There is no field type" + fieldType);
        }

        return Task.where("{0} input: '"+ value +"'",
                Enter.theValue(value)
                        .into(field)
                );
    }
}

