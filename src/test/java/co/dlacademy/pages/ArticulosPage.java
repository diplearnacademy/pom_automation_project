package co.dlacademy.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ArticulosPage extends PageObject {
    WebDriver driver;
    By tallaArticulo = By.xpath("//span[contains(.,'Talla')]/..//following-sibling::div//div[@role='button' and contains(.,'M')]");
    By buttonAgregarCarrito = By.xpath("//span[contains(.,'Agregar a la bolsa')]");
    By linkAbrirCarrito = By.xpath("//a[@href='/checkout/#/cart']");
    public ArticulosPage(WebDriver driver){
        this.driver = driver;
    }

    public void seleccionarTalla(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(tallaArticulo).click();
    }

    public void agregarAlCarrito(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement botonAgregarCarrito = driver.findElement(buttonAgregarCarrito);
        wait.until(ExpectedConditions.visibilityOf(botonAgregarCarrito));
        botonAgregarCarrito.click();
    }

    public void abrirCarritoDeCompras(){
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(linkAbrirCarrito).click();
    }
}
