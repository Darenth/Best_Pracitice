package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton() {
    }

    public static WebDriver getInstance() {
        System.out.println("DRIVER IS " + System.getProperty("testBrowser"));
        if (null == driver) {
            switch (System.getProperty("testBrowser").toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

            }
        }
        return driver;
    }

    public static void quit() {
        if (null != driver) {
            driver.quit();
        }
        driver = null;
    }
}
