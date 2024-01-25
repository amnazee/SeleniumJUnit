package junittests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import weathershopperpages.cartpage.CartPage;
import weathershopperpages.homepage.HomePage;
import weathershopperpages.moisturizerpage.MoisturizerPage;
import weathershopperpages.paymentmodal.PaymentPage;
import weathershopperpages.productpage.ProductPage;
import weathershopperpages.sunscreen.SunscreenPage;

@Execution(ExecutionMode.CONCURRENT)
public class FirstTest {
    private WebDriver driver;
    public HomePage homePage;
    public PaymentPage paymentPage;
    public ProductPage productPage;
    public CartPage cartPage;
    public MoisturizerPage moisturizerPage;
    public SunscreenPage sunscreenPage;

    public DriverManager driverManager;
    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver=new ChromeDriver();
        homePage=new HomePage(driver);
        paymentPage=new PaymentPage(driver);
        cartPage=new CartPage(driver);
        productPage=new ProductPage(driver);
        moisturizerPage=new MoisturizerPage(driver);
        sunscreenPage=new SunscreenPage(driver);
    }

    @Test
    public void firstTest(){
        driver.get("https://weathershopper.pythonanywhere.com/moisturizer");
        String productIngredient="almond";
        System.out.println(moisturizerPage.ProductWithAnIngredient(productIngredient));
    }

    @Test
    public void secondTest(){
//        driver.get("https://weathershopper.pythonanywhere.com/moisturizer");
          System.out.println(driverManager.getDriver());
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("After");
    }
}