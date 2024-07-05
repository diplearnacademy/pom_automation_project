package co.dlacademy.steps;

import co.dlacademy.pages.RegistroPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class RegistroStep {

    @Page
    RegistroPage registroPage;

    @Step
    public void registrarUsuarioNuevo(){
        registroPage.ingresarNombre();
        registroPage.ingresarApellido();
        registroPage.ingresarDireccion();
        registroPage.ingresarCiudad();
        registroPage.ingresarEstado();
        registroPage.ingresarPostal();
        registroPage.ingresarTelefono();
        registroPage.ingresarSsnId();
        registroPage.ingresarApodo();
        registroPage.ingresarClave();
        registroPage.ingresarClaveRepetida();
        registroPage.clickParaRegistrarUsuario();
    }
}
