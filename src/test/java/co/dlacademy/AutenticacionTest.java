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
    WebDriver driver;

    @BeforeEach
    public void configuracionInicial(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void AutenticacionOrange() {
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
    }

    @Test
    public void AutenticacionOrangeDos(){
        //IMPLEMENTACION CON SELENIUM USANDO DRIVER
        //System.setProperties("webdriver.chrome.driver", "C://tools//chromedriver.exe");

        //ARRANGE
        String username = "test";
        String password = "test123";
        driver.get("https://www.automationtesting.co.uk/loginPortal.html");

        //ACT
        driver.findElement(By.id("login_text")).sendKeys(username);
        driver.findElement(By.id("login_password")).sendKeys(password);

        //ASSERT
        assertEquals("LOGIN", driver.findElement(By.id("login_btn")).getText());
    }

    @AfterEach
    public void configuracionFinal(){
        driver.close();
    }
}