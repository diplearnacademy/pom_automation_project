package co.dlacademy.stepdefinitions;

import co.dlacademy.steps.HomeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class BusquedaVuelosStepDefinition {

    @Steps
    HomeStep homeStep;

    @Given("que Juan se encuentra en la pagina principal")
    public void queElUsuarioSeEncuentraEnLaPaginaPrincipal() {
        homeStep.abrirGoogleFlights();
    }


    @When("filtra el vuelo que desea realizar")
    public void seleccioneElArticuloBuzo( ) {
        homeStep.buscarVueloNacional();
    }

    @When("filtra el vuelo internacional que desea realizar")
    public void seleccioneElArticuloBuzoS( ) {
        homeStep.buscarVueloInternacional();
    }


    @Then("obtiene los resultados con mejores precios")
    public void datosCorrectos() {

    }

}
