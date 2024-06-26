package co.dlacademy.stepdefinitions;

import co.dlacademy.pages.ArticulosPage;
import co.dlacademy.pages.CheckoutPage;
import co.dlacademy.pages.HombresPage;
import co.dlacademy.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @Given("que Juan se encuentra en la pagina principal")
    public void queJuanSeEncuentraEnLaPaginaPrincipal() {
        homePage.open();
    }

    @And("el filtra la categoria {word}")
    public void elFiltraLaCategoriaQueDesea(String categoria) {
        homePage.seleccionarCategoria(categoria);
        hombresPage.seleccionarCategoriaBuzos();
    }

    @When("seleccione el articulo {string}")
    public void seleccioneElArticuloBuzo(String nombreArticulo) {
        hombresPage.seleccionarBuzo(nombreArticulo);
    }

    @And("diligencia la informacion requerida")
    public void diligenciaLaInformacionRequerida(List<Map<String, String>> infoUsuario) {
        articulosPage.seleccionarTalla();
        articulosPage.agregarAlCarrito();
        articulosPage.abrirCarritoDeCompras();
        checkoutPage.procederPago();
        checkoutPage.escribirCorreo(infoUsuario.get(0).get("correo"));
        checkoutPage.escribirNombre(infoUsuario.get(0).get("nombre"));
        checkoutPage.escribirApellido();
        checkoutPage.escribirCelular();
        checkoutPage.seleccionarTipoDocumento();
        checkoutPage.escribirNumeroDoc();
        checkoutPage.irParaEntrega();
    }

    @Then("los datos diligenciados son correctos")
    public void datosCorrectos() {

    }

}
