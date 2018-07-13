package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
class LocalDriverFactory {
    static WebDriver createInstance(String browserName) {
    	
    	WebDriver driver = null;
        if (browserName.toLowerCase().contains("firefox")) {
        	WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("internet")) {
            driver = new InternetExplorerDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("chrome")) {
        	WebDriverManager.chromedriver().setup();
        	driver = new ChromeDriver();
            return driver;
        }
        return driver;
    }
}