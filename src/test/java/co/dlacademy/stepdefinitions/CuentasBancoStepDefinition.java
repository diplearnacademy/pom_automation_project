package co.dlacademy.stepdefinitions;

import co.dlacademy.steps.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CuentasBancoStepDefinition {

    @Steps
    HomeStep homeStep;

    @Steps
    RegistroStep registroStep;

    @Steps
    DetallesPerfilStep detallesPerfilStep;

    @Steps
    AbrirNuevaCuentaStep abrirNuevaCuentaStep;

    @Steps
    DetallesTodasCuentasStep detallesTodasCuentasStep;

    @Given("que el usuario esta en la pagina del banco")
    public void queElUsuarioEstaEnLaPaginaDelBanco() {
        homeStep.abrirRegistroBanco();
    }

    @And("realiza el registro como nuevo usuario")
    public void realizaElRegistroComoNuevoUsuario() throws InterruptedException {
        registroStep.registrarUsuarioNuevo();
    }

    @When("abre una cuenta de {word}")
    public void abreUnaCuenta(String tipoCuenta) throws InterruptedException {
        detallesPerfilStep.abrirUnaNuevaCuenta();
        abrirNuevaCuentaStep.abrirUnaCuentaAhorros(tipoCuenta);
    }

    @Then("el deberia de ver su cuenta creada de manera exitosa")
    public void elDeberiaDeVerSuCuentaCreadaDeManeraExitosa() {
        detallesTodasCuentasStep.laCuentaHaSidoCreadaExitosamente();
    }

}
