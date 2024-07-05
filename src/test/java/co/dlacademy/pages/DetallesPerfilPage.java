package co.dlacademy.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DetallesPerfilPage extends BasePage{

    @FindBy(xpath = "//h2//following-sibling::ul//a[contains(.,'Open New')]")
    WebElementFacade linkAbrirNuevaCuenta;

    @FindBy(xpath = "//h2//following-sibling::ul//a[contains(.,'Over')]")
    WebElementFacade linkDetallesCuentas;

    public void clickParaAbrirNuevaCuenta(){
        linkAbrirNuevaCuenta.click();
    }

    public void clickParaAbrirDetallesCuentas(){
        linkDetallesCuentas.click();
    }
}
