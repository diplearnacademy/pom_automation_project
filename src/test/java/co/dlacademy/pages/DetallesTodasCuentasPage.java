package co.dlacademy.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class DetallesTodasCuentasPage extends BasePage{

    @FindBy(xpath = "//table[@id='accountTable']/tbody/tr/td/a")
    List<WebElementFacade> linkCuentaPropia;

    public void validarCuentaAbierta(){

        boolean flag = false;
        int rowSize =linkCuentaPropia.size();
        String variableSesionCuentaAperturada = Serenity.sessionVariableCalled("numeroCuenta");
        for(int i = 0; i <= rowSize; i++) {
            if (variableSesionCuentaAperturada.equals(Target.the("Numeros de cuenta").locatedBy("//table[@id='accountTable']/tbody/tr['"+i+"']/td/a")))
            {
                flag =true;
                break;
            }else{
                System.out.println("No corresponder al número de cuenta");
            }
        }
        Assert.assertTrue(flag);
    }
}
