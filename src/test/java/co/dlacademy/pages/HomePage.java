package co.dlacademy.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.mattelsa.net/")
public class HomePage extends BasePage {

    WebDriver driver;
    String botonCategoriaHombre = "//div[contains(@class,'slider-principal')]//a[contains(.,'COMODIN')]";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void seleccionarCategoria(String categoria){
      driver.findElement(setParametro(botonCategoriaHombre, categoria)).click();
    }
}
