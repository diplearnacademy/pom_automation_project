package co.dlacademy.steps;

import co.dlacademy.pages.DetallesPerfilPage;
import co.dlacademy.pages.DetallesTodasCuentasPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class DetallesTodasCuentasStep {

    @Page
    DetallesTodasCuentasPage detallesTodasCuentasPage;

    @Page
    DetallesPerfilPage detallesPerfilPage;

    @Step
    public void laCuentaHaSidoCreadaExitosamente(){
        detallesPerfilPage.clickParaAbrirDetallesCuentas();
        detallesTodasCuentasPage.validarCuentaAbierta();
    }
}
