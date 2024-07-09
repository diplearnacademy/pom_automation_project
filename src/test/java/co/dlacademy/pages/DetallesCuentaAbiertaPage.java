package co.dlacademy.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DetallesCuentaAbiertaPage extends BasePage{

    @FindBy(id="newAccountId")
    WebElementFacade linkNuevaCuentaAbierta;

    public void obtenerNumeroCuenta(){
        linkNuevaCuentaAbierta.waitUntilPresent().waitUntilVisible();
        ///linkNuevaCuentaAbierta.waitUntilVisible();
        String numeroCuentaWebelement = linkNuevaCuentaAbierta.getText();
        Serenity.setSessionVariable("numeroCuenta").to(numeroCuentaWebelement);
    }
}
