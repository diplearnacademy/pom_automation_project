package co.dlacademy.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HombresPage extends PageObject {

    WebDriver driver;

    By checkBoxBuzos = By.xpath("//div[@title='Buzos']");
    By imgCamisaOversize = By.xpath("//img[@alt='Buzo Hoodie Marfil Oso']/..");
    public HombresPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickcheckBoxBuzos(){

        driver.findElement(checkBoxBuzos).click();
    }


    public void clickimgCamisaOversize(){
        driver.findElement(imgCamisaOversize).click();
    }
}
