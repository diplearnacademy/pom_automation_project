package co.dlacademy.stepdefinitions;

import co.dlacademy.pages.ArticulosPage;
import co.dlacademy.pages.CheckoutPage;
import co.dlacademy.pages.HombresPage;
import co.dlacademy.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;

public class CompraArticulosStepDefinition {

    @Page
    private HomePage homePage;

    @Page
    private HombresPage hombresPage;

    @Page
    private ArticulosPage articulosPage;

    @Page
    private CheckoutPage checkoutPage;

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
    public void seleccioneElArticulo() {
        hombresPage.seleccionarBuzo();
    }

    @And("diligencia la informacion requerida")
    public void diligenciaLaInformacionRequerida() throws InterruptedException {
        articulosPage.seleccionarTalla();
        articulosPage.agregarAlCarrito();
        articulosPage.abrirCarritoDeCompras();
        checkoutPage.procederPago();
        checkoutPage.escribirCorreo();
        checkoutPage.escribirNombre();
        checkoutPage.escribirApellido();
        checkoutPage.escribirCelular();
        checkoutPage.seleccionarTipoDocumento();
        checkoutPage.escribirNumeroDoc();
        checkoutPage.irParaEntrega();
        //Thread.sleep(10000);
    }

    @Then("los datos diligenciados son correctos")
    public void datosCorrectos() {

    }

}
