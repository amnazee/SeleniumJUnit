package weathershopperpages.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class DriverManager {
    private static DriverManager instance;
    private WebDriver driver;

    private DriverManager() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public static DriverManager getInstance() {
        if(instance==null){
           instance=new DriverManager();
        }
        return instance;
    }
    public WebDriver getDriver() {
        return driver;
    }

    public static void quit()
    {
        instance.driver.quit();
        instance=null;
    }
}
