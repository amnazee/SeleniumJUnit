package junittests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import weathershopperpages.homepage.HomePage;

public class FirstTest {
    private WebDriver driver;
    public HomePage homePage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        System.out.println("hello");
        driver=new ChromeDriver();
        homePage=new HomePage(driver);
    }

    @Test
    public void myTest(){
        driver.get("https://weathershopper.pythonanywhere.com/");
        homePage.SelectCategory();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("After");
    }
}
