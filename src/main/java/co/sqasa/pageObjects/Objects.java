package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;

public class Objects extends PageObject {
    @FindBy(id="datepicker")
    private WebElementFacade inputDatePicker;

    @FindBy(id="ui-datepicker-div")
    private WebElementFacade number15;

    @FindBy(id="ui-icon ui-icon-circle-triangle-e")
    private WebElementFacade buttonNext;

    @FindBy(id="ui-state-default")
    private WebElementFacade number10;
    public void seleccionarFechaActual(){
        evaluateJavascript("window.scrollTo({ top: arguments[0].getBoundingClientRect().top + window.scrollY});", inputDatePicker);
        inputDatePicker.click();
    }
    public void seleccionarDia15(){
        evaluateJavascript("window.scrollTo({ top: arguments[0].getBoundingClientRect().top + window.scrollY});", number15);
        number15.click();
    }

    public void siguienteMes(){
        evaluateJavascript("window.scrollTo({ top: arguments[0].getBoundingClientRect().top + window.scrollY});", buttonNext);
        buttonNext.click();
    }

    public void seleccionarDia10(){
        evaluateJavascript("window.scrollTo({ top: arguments[0].getBoundingClientRect().top + window.scrollY});", number10);
        number10.click();
    }

    public void openWeb() {
        openUrl("https://jqueryui.com/datepicker/https://jqueryui.com/datepicker/");
    }

    public void validarValorEnCampoDate(){
        EnsureFieldVisible.ensureThat(input_datepicker).equals()
    }
}