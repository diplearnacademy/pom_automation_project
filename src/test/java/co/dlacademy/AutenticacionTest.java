package co.dlacademy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutenticacionTest extends BaseTest{

    @BeforeEach
    public void configuracionInicial(){
        setUp();
    }

    @Test
    public void AutenticacionOrange(){
        String username = "test";
        String password = "test123";

        WebElement inputUsername = driver.findElement(By.id("login_text"));
        WebElement inputPassword = driver.findElement(By.id("login_password"));
        WebElement buttonLogin = driver.findElement(By.id("login_btn"));

        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);

        assertEquals("LOGIN", buttonLogin.getText());
    }

    @AfterEach
    public void configuracionFinal(){
        driver.quit();
    }
}
