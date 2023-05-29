package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private Driver(){

    }

    public static WebDriver driver;

    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    //       driver=new OperaDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "microsoft":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();


            }
        }
        driver.manage().window().maximize();
        //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}