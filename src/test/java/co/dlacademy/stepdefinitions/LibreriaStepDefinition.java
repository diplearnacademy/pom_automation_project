package co.dlacademy.stepdefinitions;

import co.dlacademy.pages.InicioPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;

public class LibreriaStepDefinition {

    @Page
    InicioPage inicioPage;


    @Given("el usuario esta en la pagina")
    public void elUsuarioEstaEnLaPagina()  {
        inicioPage.open();
    }

    @When("disparamos el alert")
    public void dispararAlert() {
        inicioPage.abrirAlerta();
        inicioPage.aceptarAlert();
    }

    @Then("debe regresar a la pagina inicial")
    public void regresarInicial() {
    }

}
