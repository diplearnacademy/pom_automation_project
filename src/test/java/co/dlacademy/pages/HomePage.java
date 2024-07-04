package co.dlacademy.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com/travel/flights")
public class HomePage extends PageObject {

    @FindBy(xpath="//input[@aria-label='\u00BFDesde d\u00F3nde?']")
    WebElementFacade inputCiudadOrigen;

    @FindBy(xpath="//input[@aria-label='\u00BFA d\u00F3nde quieres ir?']")
    WebElementFacade inputCiudadDestino;

    public void buscarCiudadOrigen(){
        inputCiudadOrigen.type("Bogota").sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));
    }

    public void buscarCiudadDestino(){
        inputCiudadDestino.type("Pereira").sendKeys(Keys.ENTER);
    }
}
