package co.dlacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutenticacionTest {

    @Test
    public void AutenticacionOrange(){
        //IMPLEMENTACION CON SELENIUM USANDO DRIVER
        //System.setProperties("webdriver.chrome.driver", "C://tools//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement inputUsername = driver.findElement(By.ByName.name("username"));
        WebElement inputPassword = driver.findElement(By.name("password"));
        WebElement buttonLogin = driver.findElement(By.className("login-button"));

        inputUsername.sendKeys("Admin");
        inputPassword.sendKeys("admin123");
        buttonLogin.click();
    }
}
