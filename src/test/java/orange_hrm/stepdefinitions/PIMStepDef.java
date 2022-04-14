package orange_hrm.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import orange_hrm.pageobject.HRMPIMPageObject;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;
import tasks.VerifyDisplayed;

public class PIMStepDef {
    // Read Employee -- Begin
    @And("{actor} access employee list")
    public void AccessEmployeeList(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("HRM Employee List"));
    }

    @Then("{actor} can new employee list result")
    public void ListResult(Actor actor) throws Exception {
        actor.attemptsTo(
            VerifyDisplayed.element("Employee List")
        );
    }
    // Read Employee -- End

    //Search Employee -- Begin
    @And("{actor} search for new employee")
    public void SearchEmployee(Actor actor) throws Exception {
        actor.attemptsTo(
                InputText.onField("employee Name","Agung Firmansyah"),
                ClickOn.button("Search")
        );

    }
    //Search Employee -- End

    //Add Employee -- Begin
    @When("{actor} add new employee with required field only")
    public void AddEmployee(Actor actor) throws Exception{
        actor.attemptsTo(
                ClickOn.button("Add"),
                InputText.onField("first Name", "Agung"),
                InputText.onField("last Name", "Firmansyah"),
                ClickOn.button("Save")
        );
        
    }

    @Then("{actor} can see my personal Detail")
    public void PersonalDetail(Actor actor) throws Exception{
        actor.attemptsTo(VerifyDisplayed.element("Personal Details"));
        
    }
    //Add Employee -- End


    //Update Employee -- Begin
    @When("{actor} update new employee's middle name")
    public void UpdateEmployee(Actor actor) throws Exception {
        actor.attemptsTo(
            ClickOn.employeeList(),
            ClickOn.button("Edit"),
            InputText.onField("edit Middle Name","Firmansyah"),
            ClickOn.button("Save")
        );


    }

    @Then("{actor} can see the Personal Detail has changed")
    public void UpdatedEmployee(Actor actor){
        actor.attemptsTo(
                Ensure.that(HRMPIMPageObject.EDIT_MIDDLE_NAME_FIELD).value().isEqualTo("Firmansyah")
        );
        
    }
    //Update Employee -- End

    //Delete Employee -- Begin
    @And("{actor} delete new employee")
    public void DeleteEmployee(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.checkbox(),
                ClickOn.button("Delete"),
                ClickOn.button("Ok")
        );
    }

    @Then("{actor} can't see delete employee on list")
    public void iCanTSeeDeleteEmployeeOnList(Actor actor) throws Exception{
        actor.attemptsTo(
                VerifyDisplayed.element("No Employee")
        );
    }
    //Delete Employee -- End
}
