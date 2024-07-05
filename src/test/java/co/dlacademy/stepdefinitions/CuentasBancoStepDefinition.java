package co.dlacademy.stepdefinitions;

import co.dlacademy.steps.HomeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CuentasBancoStepDefinition {

    @Steps
    HomeStep homeStep;

    @Given("que el usuario esta en la pagina del banco")
    public void queElUsuarioEstaEnLaPaginaDelBanco() {
        homeStep.abrirRegistroBanco();
    }

    @And("realiza el registro como nuevo usuario")
    public void realizaElRegistroComoNuevoUsuario() {
    }

    @When("abre una cuenta de {word}")
    public void abreUnaCuenta() {
    }

    @Then("el deberia de ver su cuenta creada de manera exitosa")
    public void elDeberiaDeVerSuCuentaCreadaDeManeraExitosa() {
    }

}
