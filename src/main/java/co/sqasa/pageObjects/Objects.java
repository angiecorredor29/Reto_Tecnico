package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;

public class Objects extends PageObject {
    @FindBy(id="datepicker")
    private WebElementFacade input_datepicker;

    @FindBy(id="ui-datepicker-div")
    private WebElementFacade date_number15;

    public void openOrder() {
        openUrl("https://jqueryui.com/datepicker/https://jqueryui.com/datepicker/");
    }

    public void seleccionarFechaCalendario(){
        evaluateJavascript("window.scrollTo({ top: arguments[0].getBoundingClientRect().top + window.scrollY});", input_datepicker);
        input_datepicker.click();
    }

    public void seleccionarDia(){
        evaluateJavascript("window.scrollTo({ top: arguments[0].getBoundingClientRect().top + window.scrollY});", date_number15);
        date_number15.click();
    }

    public void validarValorEnCampoDate(){
        EnsureFieldVisible.ensureThat(input_datepicker).equals()
    }
}