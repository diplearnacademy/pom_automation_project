package co.dlacademy.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class DetallesTodasCuentasPage extends BasePage{

    @FindBy(xpath = "//table[@id='accountTable']//td//a[contains(.,'16119')]")
    WebElementFacade linkCuentaPropia;


    @FindBy(id = "accountTable")
    WebElementFacade tablaCuentas;

    public void validarCuentaAbierta(){
        String variableSesionCuentaAperturada = Serenity.sessionVariableCalled("numeroCuenta");
        List<WebElementFacade> cuentasUsuario = tablaCuentas.thenFindAll("//tbody//td//a");
        boolean cuentaExiste =false;
        for (int i=0; i <= cuentasUsuario.size(); i++){
            if(variableSesionCuentaAperturada.equals(cuentasUsuario.get(i).getText())){
                System.out.println("cuenta "+ cuentasUsuario.get(i).getText());
                cuentaExiste = true;
                break;
            }else{
                cuentaExiste = false;
            }
        }
        assertThat(cuentaExiste, is(equalTo(true)));
    }
}
