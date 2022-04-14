package tasks;

import fb.pageobjects.CheckPoinPageObject;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Collection;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TheMessage {
    public static Question<Collection<String>> displayed(){
        WaitUntil.the(CheckPoinPageObject.ERROR_MESSAGE, isVisible()).forNoMoreThan(100).seconds();
        return Text.ofEach(CheckPoinPageObject.ERROR_MESSAGE).describedAs("the display");
    }
}
