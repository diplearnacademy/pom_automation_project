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
    public void AutenticacionOrange(){
        //IMPLEMENTACION CON SELENIUM USANDO DRIVER
        //System.setProperties("webdriver.chrome.driver", "C://tools//chromedriver.exe");

        //ARRANGE
        String username = "test";
        String password = "test123";
        //WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/loginPortal.html");

        WebElement inputUsername = driver.findElement(By.id("login_text"));
        WebElement inputPassword = driver.findElement(By.id("login_password"));
        WebElement buttonLogin = driver.findElement(By.id("login_btn"));

        //ACT
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);

        //ASSERT
        assertEquals("LOGIN", buttonLogin.getText());
        //driver.close();
    }

    @Test
    public void AutenticacionOrangeDos(){
        //IMPLEMENTACION CON SELENIUM USANDO DRIVER
        //System.setProperties("webdriver.chrome.driver", "C://tools//chromedriver.exe");

        //ARRANGE
        String username = "test";
        String password = "test123";
        //WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/loginPortal.html");

        //ACT
        driver.findElement(By.id("login_text")).sendKeys(username);
        driver.findElement(By.id("login_passwordas")).sendKeys(password);

        //ASSERT
        assertEquals("LOGIN", driver.findElement(By.id("login_btn")).getText());
        //driver.close();
    }

    @AfterEach
    public void configuracionFinal(){
        driver.close();
    }
}
