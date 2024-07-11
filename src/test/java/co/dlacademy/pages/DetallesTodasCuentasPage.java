package co.dlacademy.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class DetallesTodasCuentasPage extends BasePage{

   /* @FindBy(xpath = "//table[@id='accountTable']//td//a[contains(.,'14121')]")*/
   public WebElementFacade mapeo (String id){
       String xpath = "//table[@id='accountTable']//td//a[contains(.,'"+id+"')]";
       return find(By.xpath(xpath));
   }
    WebElementFacade linkCuentaPropia;

    public void validarCuentaAbierta(){
        String variableSesionCuentaAperturada = Serenity.sessionVariableCalled("numeroCuenta");
        linkCuentaPropia = mapeo(variableSesionCuentaAperturada);
        assertThat(variableSesionCuentaAperturada, is(equalTo(linkCuentaPropia.getText())));
    }
}
