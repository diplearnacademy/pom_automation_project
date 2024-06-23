package co.dlacademy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutenticacionTest {
    @Test
    public void AutenticacionOrange() {

        //Arrange
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/loginPortal.html");

        WebElement inputUsername = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement inputPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement buttonLogin = driver.findElement(By.id("login_btn"));

        //Act
        inputUsername.sendKeys("test");
        inputPassword.sendKeys("test123");
        buttonLogin.click();


        //Assert
        assertEquals("LOGIN",buttonLogin.getText());
        driver.close(); // cierra instancia
        //driver.quit(); //cierra todas las intancias.
    }

    @Test
    public void AutenticacionOrangeDos() {

        //Arrange
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/loginPortal.html");

        WebElement inputUsername = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement inputPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement buttonLogin = driver.findElement(By.id("login_btn"));

        //Act
        inputUsername.sendKeys("test");
        inputPassword.sendKeys("test123");
        buttonLogin.click();


        //Assert
        assertEquals("LOGIN",buttonLogin.getText());
        driver.close(); // cierra instancia
        //driver.quit(); //cierra todas las intancias.
    }
}