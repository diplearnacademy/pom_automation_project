package co.dlacademy.steps;

import co.dlacademy.pages.HomePage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeStep {

    @Page
    HomePage homePage;

    @Step
    public void abrirGoogleFlights(){
        homePage.open();
    }

    @Step
    public void buscarVueloNacional(){
        homePage.buscarCiudadOrigen();
        homePage.buscarCiudadDestino();
    }

    @Step
    public void buscarVueloInternacional(){
        homePage.buscarCiudadOrigen();
        homePage.buscarCiudadDestino();
    }

}
