package co.dlacademy.stepdefinitions;

import co.dlacademy.pages.HombresPage;
import co.dlacademy.pages.HomePage;
import io.cucumber.java.en.*;
import org.fluentlenium.core.annotation.Page;

public class CompraArticulosStepDefinition {
    @Page
    private HomePage homePage;
    @Page
    private HombresPage hombresPage;
    @Given("que el usuario se encuentra en la pagina principal")
    public void queElUsuarioSeEncuentraEnLaPaginaPrincipal() {
        homePage.open();


    }
    @And("el filtra la categoria que desea")
    public void elFiltraLaCategoriaQueDesea() {
        homePage.clicEnbotonHombre();
        hombresPage.clickcheckBoxBuzos();

    }
    @When("seleccione el articulo")
    public void seleccioneElArticulo() {
        hombresPage.clickimgCamisaOversize();

    }
    @And("diligencia la informacion requerida")
    public void diligenciaLaInformacionRequerida() {

    }
    @Then("la compra sera exitosa")
    public void laCompraSeraExitosa() {

    }
}
