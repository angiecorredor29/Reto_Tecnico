package co.sqasa.StepDef;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import co.sqasa.pageObjects.Objects;
import co.sqasa.steps.Steps;

public class TestStepDefinition {
    @Steps
    Objects objetcs;
    Steps steps;
    @Given("el usuario abre la pagina principal de JQuery Datepicker")
    public void paginaPrincipal() {

        steps.openWeb();
    }
    @Given("el usuario se encuentra en la pagina de JQuery Datepicker")
    public void usuarioEnPaginaPrincipal() {
        steps.openWeb();
    }
    @When("el usuario hace clic en el campo date")
    public void usuarioHaceClicEnCampoDate() {

        steps.clicInputDate();
    }
    @When("el usuario selecciona el dia 15 del mes actual")
    public void usuarioSeleccionaFecha15() {

        steps.clicnumber15();
    }
    @Then("el usuario debera visualizar la fecha en el campo date")
    public void usuarioVisualizaFechaEnCampoDate() {
        steps.validacion();
    }
    @When("el usuario navega hasta el proximo mes en el calendario")
    public void usuarioNavegaSiguienteMes() {

        steps.clicSiguienteMes();
    }

    @When("el usuario selecciona el dia 10 del proximo mes")
    public void usuarioSeleccionDia10() {

        steps.clicnumber10();
    }

    @When("el usuario intenta ingresar una fecha manualmente en el campo date")
    public void usuarioIngresaFechaManualmente() {

    }

    @Then("el usuario debera visualizar que no es posible digitar la fecha manualmente")
    public void usuarioValidaQueNoEsPosibleIngresoFechaManualmente() {
    }
}
