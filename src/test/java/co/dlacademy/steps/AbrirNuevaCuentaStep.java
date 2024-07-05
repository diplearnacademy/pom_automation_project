package co.dlacademy.steps;

import co.dlacademy.pages.AbrirNuevaCuentaPage;
import co.dlacademy.pages.DetallesCuentaAbiertaPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class AbrirNuevaCuentaStep {
    @Page
    AbrirNuevaCuentaPage abrirNuevaCuentaPage;

    @Page
    DetallesCuentaAbiertaPage detallesCuentaAbiertaPage;

    @Step
    public void abrirUnaCuentaAhorros(String tipoCuenta) throws InterruptedException {
        abrirNuevaCuentaPage.seleccionarTipoCuenta(tipoCuenta);
        abrirNuevaCuentaPage.clickAbrirNuevaCuenta();
        detallesCuentaAbiertaPage.obtenerNumeroCuenta();
    }
}
