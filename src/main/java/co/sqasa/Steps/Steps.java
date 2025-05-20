package steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.co.sqasa.pageObjects.Objects;
public class Steps {

    @Page
    Objects objects;

    @Step("Abrir pagina principal")
    public void openWeb(){
        objects.openWeb();
    }
    @Step("Clic en el campo de texto date")
    public void clicInputDate(){objects.seleccionarFechaActual();}
    @Step("Seleccionar dia numero 15")
    public void clicnumber15(){
        objects.seleccionarDia15();
    }
    @Step("Navegar siguiente mes")
    public void clicSiguienteMes(){
        objects.siguienteMes();
    }
    @Step("Seleccionar dia numero 15")
    public void clicnumber10(){
        objects.seleccionarDia10();
    }
    @Step("Validar campo de texto")
    public void validacion(){
        objects.validarValorEnCampoDate();
    }
}