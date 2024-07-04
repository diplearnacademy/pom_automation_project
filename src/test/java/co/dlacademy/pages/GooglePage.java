package co.dlacademy.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage {

    @FindBy(xpath = "//textarea[@aria-label='Buscar']")
    WebElementFacade inputGoogle;

    public void buscarEnGoogle(){
        cambiarPestana();
        inputGoogle.type("Automatizacion");
    }
}
