package junittests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
}
