package co.dlacademy.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

import static net.thucydides.model.matchers.BeanMatchers.the;
import static org.hamcrest.MatcherAssert.assertThat;
import static net.thucydides.core.pages.components.HtmlTable.rowsFrom;
import static net.thucydides.core.pages.components.HtmlTable.filterRows;
import static org.hamcrest.Matchers.*;


public class DetallesTodasCuentasPage extends BasePage{

    @FindBy(xpath = "//table[@id='accountTable']")
    WebElementFacade table;

    public void validarCuentaAbierta(){
        String variableSesionCuentaAperturada = Serenity.sessionVariableCalled("numeroCuenta");
        rowsFrom(table);
        String data = filterRows(table,the("Account",is(variableSesionCuentaAperturada))).get(0).getText().split(" ")[0];
        assertThat(data, is(equalTo(variableSesionCuentaAperturada)));
    }
}
