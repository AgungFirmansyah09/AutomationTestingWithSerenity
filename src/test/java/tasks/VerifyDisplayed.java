package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orange_hrm.pageobject.HRMPIMPageObject;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerifyDisplayed {
    public static Performable element(String elemenType) throws Exception {
        Target element;
        switch(elemenType){
            case "Employee List":
                element = HRMPIMPageObject.RESULT_TABLE;
                break;
            case "Personal Detail":
                element = HRMPIMPageObject.PERSONAL_DETAIL;
                break;
            case "No Employee":
                element = HRMPIMPageObject.NO_EMPLOYEE;
                break;
            default:
                throw new Exception("There is no element type:" + elemenType);
        }

        WaitUntil.the(element, isVisible()).forNoMoreThan(25).seconds();

        return Task.where("{0} verify element is displayed",
                Ensure.that(element)
                .isDisplayed()
        );
    }
}
