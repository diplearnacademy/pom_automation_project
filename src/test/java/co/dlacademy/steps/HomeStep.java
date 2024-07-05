package co.dlacademy.steps;

import co.dlacademy.pages.HomePage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeStep {

    @Page
    HomePage homePage;

    @Step
    public void abrirLoginBanco(){
        homePage.open();
    }

    @Step
    public void abrirRegistroBanco(){
        homePage.maximizarNavegador();
        homePage.open();
        homePage.abrirPaginaRegistro();
    }
}
