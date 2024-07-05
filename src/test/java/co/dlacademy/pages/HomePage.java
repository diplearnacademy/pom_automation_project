package co.dlacademy.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[contains(.,'Register')]")
    WebElementFacade linkRegistro;

    public void abrirPaginaRegistro(){
        linkRegistro.click();
    }
}
