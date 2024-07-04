package co.dlacademy.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

//@DefaultUrl("https://www.automationtesting.co.uk/iframes.html")
//@DefaultUrl("https://www.automationtesting.co.uk/browserTabs.html")
@DefaultUrl("https://www.automationtesting.co.uk/popups.html")
public class InicioPage extends BasePage {
    String paginaInicial = getDriver().getWindowHandle();

    @FindBy(xpath = "//a[@href='#sidebar']")
    WebElementFacade menuHamburguesa;

    @FindBy(xpath = "//iframe[@src='index.html']")
    WebElementFacade iframe;

    @FindBy(xpath = "//input[@value='Open Tab']")
    WebElementFacade buttonOpenTab;

    @FindBy(xpath = "//button[@onclick='alertTrigger()']")
    WebElementFacade buttonTriggerAlert;

    public void abrirMenuHamburguesa(){
        cambiarIframe(iframe);
        menuHamburguesa.click();
        regresarDelFrame();
    }

    public void abrirNuevaPestana(){
        buttonOpenTab.click();
    }

    public void abrirAlerta(){
        buttonTriggerAlert.click();
    }

    public void abrirMenuLateral(){
        regresarPaginaInicial(paginaInicial);
        menuHamburguesa.click();
    }
}
