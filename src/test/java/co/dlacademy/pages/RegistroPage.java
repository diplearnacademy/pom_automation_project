package co.dlacademy.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RegistroPage extends BasePage{

    @FindBy(id = "customer.firstName")
    WebElementFacade inputNombre;

    @FindBy(id = "customer.lastName")
    WebElementFacade inputApellido;

    @FindBy(id = "customer.address.street")
    WebElementFacade inputDireccion;

    @FindBy(id = "customer.address.city")
    WebElementFacade inputCiudad;

    @FindBy(id = "customer.address.state")
    WebElementFacade inputEstado;

    @FindBy(id = "customer.address.zipCode")
    WebElementFacade inputPostal;

    @FindBy(id = "customer.phoneNumber")
    WebElementFacade inputTelefono;

    @FindBy(id = "customer.ssn")
    WebElementFacade inputSsnId;

    @FindBy(id = "customer.username")
    WebElementFacade inputApodo;

    @FindBy(id = "customer.password")
    WebElementFacade inputClave;

    @FindBy(id = "repeatedPassword")
    WebElementFacade inputClaveRepetida;

    @FindBy(xpath = "//input[@value='Register']")
    WebElementFacade botonRegistrar;

    public void ingresarNombre(){
        inputNombre.type("Juan");
    }

    public void ingresarApellido(){
        inputApellido.type("Fernandez");
    }

    public void ingresarDireccion(){
        inputDireccion.type("Cll 77");
    }

    public void ingresarCiudad(){
        inputCiudad.type("Sabaneta");
    }

    public void ingresarEstado(){
        inputEstado.type("Antioquia");
    }

    public void ingresarPostal(){
        inputPostal.type("002200");
    }

    public void ingresarTelefono(){
        inputTelefono.type("323232323");
    }

    public void ingresarSsnId(){
        inputSsnId.type("ABC");
    }

}
