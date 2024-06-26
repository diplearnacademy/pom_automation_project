package co.dlacademy.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HombresPage extends BasePage {
    WebDriver driver;
    By checkBoxBuzos = By.xpath("//input[@id='category-3-buzos']");
    String imgBuzoHombre = "//img[@alt='COMODIN']/..";
    By spinner = By.xpath("//svg[contains(@class, 'icon-spinner')]");

    public HombresPage(WebDriver driver){
        this.driver = driver;
    }

    private static void waitForSpinner(WebDriver driver, By spinnerCssSelector, Duration timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(spinnerCssSelector));
    }

    public void seleccionarCategoriaBuzos(){
        waitForSpinner(driver, spinner, Duration.ofSeconds(4));
        driver.findElement(checkBoxBuzos).click();
    }

    public void seleccionarBuzo(String nombreArticulo){
        driver.findElement(setParametro(imgBuzoHombre, nombreArticulo)).click();
    }

}
