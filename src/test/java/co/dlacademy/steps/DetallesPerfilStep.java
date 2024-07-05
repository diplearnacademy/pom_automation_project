package co.dlacademy.steps;

import co.dlacademy.pages.DetallesPerfilPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class DetallesPerfilStep {

    @Page
    DetallesPerfilPage detallesPerfilPage;

    @Step
    public void abrirUnaNuevaCuenta(){
        detallesPerfilPage.clickParaAbrirNuevaCuenta();
    }

}
