package co.dlacademy.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AbrirNuevaCuentaPage extends BasePage{

    @FindBy(id="type")
    WebElementFacade selectTipoCuenta;

    @FindBy(xpath="//input[@value='Open New Account']")
    WebElementFacade botonAbrirNuevaCuenta;

    public void seleccionarTipoCuenta(String tipoCuenta){
        selectTipoCuenta.selectByVisibleText(tipoCuenta);
    }

    public void clickAbrirNuevaCuenta(){
        botonAbrirNuevaCuenta.waitUntilEnabled().waitUntilClickable();
        botonAbrirNuevaCuenta.click();
    }
}
