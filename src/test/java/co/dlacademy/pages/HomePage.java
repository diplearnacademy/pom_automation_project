package co.dlacademy.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.mattelsa.net/")
public class HomePage extends PageObject {
    WebDriver driver;

    By botonHombre = By.xpath("//div[@class= contains(text(),'mattelsa-slider-principal')]/descendant::a[contains(text(),'Hombre') ]");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clicEnbotonHombre(){
        driver.findElement(botonHombre).click();
    }

}
