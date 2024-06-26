package co.dlacademy.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.mattelsa.net/")
public class HomePage extends PageObject {

    WebDriver driver;
    By botonCategoriaHombre = By.xpath("//div[contains(@class,'slider-principal')]//a[contains(.,'Hombre')]");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickEnCategoriaHombre(){
      driver.findElement(botonCategoriaHombre).click();
    }

}
