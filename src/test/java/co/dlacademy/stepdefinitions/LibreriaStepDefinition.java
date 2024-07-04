package co.dlacademy.stepdefinitions;

import co.dlacademy.pages.GooglePage;
import co.dlacademy.pages.InicioPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;

public class LibreriaStepDefinition {

    @Page
    InicioPage inicioPage;

    @Page
    GooglePage googlePage;

    @Given("el usuario esta en la pagina")
    public void elUsuarioEstaEnLaPagina()  {
        inicioPage.open();
    }

    @When("quiere manipular el menu hamburguesa")
    public void quiereManipularElMenuHamburguesa()  {
        inicioPage.abrirMenuHamburguesa();
    }

    @Then("debe expandir el menu del iframe")
    public void debeExpandirElMenuDelIframe() {
    }

    @Given("el usuario esta en la pagina pestanas")
    public void elUsuarioEstaEnLaPaginaPestanas()  {

    }

    @When("busca en google")
    public void buscarGoogle() throws InterruptedException {
        inicioPage.abrirNuevaPestana();
        googlePage.buscarEnGoogle();
        inicioPage.abrirMenuLateral();
    }

    @When("disparamos el alert")
    public void dispararAlert() throws InterruptedException {
        inicioPage.abrirAlerta();
        inicioPage.aceptarAlert();
    }

    @Then("debe regresar a la pagina inicial")
    public void regresarInicial() {
    }

}
