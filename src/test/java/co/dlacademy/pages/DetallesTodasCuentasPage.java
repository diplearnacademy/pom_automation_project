package co.dlacademy.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class DetallesTodasCuentasPage extends BasePage{

    @FindBy(xpath = "//table[@id='accountTable']//td//a[contains(.,'16119')]")
    WebElementFacade linkCuentaPropia;

    public void validarCuentaAbierta(){
        String variableSesionCuentaAperturada = Serenity.sessionVariableCalled("numeroCuenta");
        assertThat(variableSesionCuentaAperturada, is(equalTo(linkCuentaPropia.getText())));
    }
}
