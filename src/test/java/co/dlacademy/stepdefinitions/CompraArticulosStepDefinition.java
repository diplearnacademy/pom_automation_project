package co.dlacademy.stepdefinitions;

import co.dlacademy.pages.HombresPage;
import co.dlacademy.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

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
        homePage.clickEnCategoriaHombre();
        hombresPage.seleccionarCategoriaBuzos();

    }
    @When("seleccione el articulo")
    public void seleccioneElArticulo() throws InterruptedException {
        hombresPage.seleccionarBuzo();
        Thread.sleep(10000);
    }
    @And("diligencia la informacion requerida")
    public void diligenciaLaInformacionRequerida() {

    }
    @Then("la compra sera exitosa")
    public void laCompraSeraExitosa() {

    }

}
