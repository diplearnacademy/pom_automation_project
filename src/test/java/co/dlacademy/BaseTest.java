package co.dlacademy;

import co.dlacademy.utils.InitialConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    protected WebDriver driver;

    public void setUp() {
        String driverType = InitialConfiguration.get("driver");
        switch (driverType) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser, Check parameter you sent: " + driverType);
        }

        String environment = InitialConfiguration.get("environment");
        String baseUrl = InitialConfiguration.get("url." + environment);
        driver.get(baseUrl);
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
