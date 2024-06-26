package co.dlacademy.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

public class CheckoutPage extends PageObject {

    WebDriver driver;

    By buttonProcederPago = By.id("cart-to-orderform");
    By inputCorreo = By.id("client-email");
    By inputNombre = By.id("client-first-name");
    By inputApellido = By.id("client-last-name");
    By inputCelular = By.id("client-phone");
    By selectTipoDoc = By.id("client-doc-type");
    By inputNumeroDocumento = By.id("client-new-document");
    By buttonIrEntrega = By.id("go-to-shipping");
    By labelCorreo = By.className("client-profile-email");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void procederPago() {
        driver.findElement(buttonProcederPago).click();
    }

    public void escribirCorreo() {
        driver.findElement(inputCorreo).sendKeys("juan@juan.com");
    }

    public void escribirNombre() {
        driver.findElement(inputNombre).sendKeys("Juan");
    }

    public void escribirApellido() {
        driver.findElement(inputApellido).sendKeys("Fernandez");
    }

    public void escribirCelular() {
        driver.findElement(inputCelular).sendKeys("3003003032");
    }

    public void escribirNumeroDoc() {
        driver.findElement(inputNumeroDocumento).sendKeys("1045427855");
    }

    public void irParaEntrega() {
        driver.findElement(buttonIrEntrega).click();
    }

    public void seleccionarTipoDocumento() {
        WebElement slctTipoDoc = driver.findElement(selectTipoDoc);
        Select seleccionarDocumento = new Select(slctTipoDoc);
        seleccionarDocumento.selectByValue("cedulaCOL");
    }

    public void validarCorreo() {
        //ASERSION CON JUNIT
        // assertEquals("juan@juan.com", driver.findElement(labelCorreo).getText());
        //ASERSION CON HAMCREST
        assertThat("juan@juan.com", is(equalTo(driver.findElement(labelCorreo).getText())));
    }
}
