package co.dlacademy.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HombresPage extends PageObject {
    WebDriver driver;

    By checkBoxBuzos = By.xpath("//input[@id='category-3-buzos']");
    By imgBuzoHombre = By.xpath("//img[@alt='Buzo Hoodie Marfil Oso']/..");

    public HombresPage(WebDriver driver){
        this.driver = driver;
    }

    public void seleccionarCategoriaBuzos(){
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ///wait.until(ExpectedConditions.elementToBeClickable(checkBoxBuzos));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        if(driver.findElement(checkBoxBuzos).isDisplayed()){
            driver.findElement(checkBoxBuzos).click();
        }else{
            System.out.println("Hola");
        }


    }

    public void seleccionarBuzo(){
        driver.findElement(imgBuzoHombre).click();
    }

}
