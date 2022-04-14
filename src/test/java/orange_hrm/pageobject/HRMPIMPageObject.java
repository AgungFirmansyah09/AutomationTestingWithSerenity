package orange_hrm.pageobject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList")
public class HRMPIMPageObject extends PageObject {
    // Read Employee -- Begin
    public static Target RESULT_TABLE = Target.the("employee result table")
        .locatedBy("#resultTable");

    public static Target FIRST_EMPLOYEE_LIST = Target.the("first employee list")
            .locatedBy("(//*[@href='/index.php/pim/viewEmployee/empNumber/'])[1]");

    public static Target FIRST_EMPLOYEE_CHECKBOX = Target.the("first employee checkbox")
            .locatedBy("//td/*[@type='checkbox']");
    //Read Employee -- End

    //Add Employee -- Begin
    public static Target ADD_BUTTON = Target.the("aad button")
            .locatedBy("#btnAdd");

    public static Target FIRST_NAME_FIELD = Target.the("frist name field")
            .locatedBy("firstName");

    public static Target LAST_NAME_FIELD = Target.the("last name field")
            .locatedBy("lastName");

    public static Target SAVE_BUTTON = Target.the("aad button")
            .locatedBy("#btnSave");

    public static Target PERSONAL_DETAIL = Target.the("personal detail")
            .locatedBy("//div[@id='pdMainContainer']/div/h1");
    //Add Employee -- End

    //Search Employee -- Begin
    public static Target EMPLOYEE_NAME = Target.the("employee name")
            .locatedBy("#empsearch_employee_name_empName");

    public static Target SEARCH_BUTTON = Target.the("search button")
            .locatedBy("#searchBtn");
    //Search Employee -- End



    //Update Employee -- Begin
    public static Target EDIT_BUTTON = Target.the("save button")
            .locatedBy("#btnSave");

    public static Target EDIT_MIDDLE_NAME_FIELD = Target.the("edit middle name field")
            .locatedBy("#personal_txtEmpMiddleName");
    //Update Employee -- End


    //Delete Employee -- Begin
    public static Target DELETE_BUTTON = Target.the("delete button")
            .locatedBy("#btnDelete");

    public static Target OK_BUTTON = Target.the("ok button")
            .locatedBy("#dialogDeleteBtn");

    public static Target NO_EMPLOYEE = Target.the("no employee")
            .locatedBy("#//*[txt()='No Records Found']");
    //Delete Employee -- End








}
