package co.dlacademy.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import static co.dlacademy.utils.Constantes.COMODIN;

public class BasePage extends PageObject {
    public By setParametro(String xpath, String parametro){
        String nuevoXpath = xpath.replace(COMODIN, parametro);
        return By.xpath(nuevoXpath);
    }
}
