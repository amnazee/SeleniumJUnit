package junittests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import weathershopperpages.cartpage.CartPage;
import weathershopperpages.homepage.HomePage;
import weathershopperpages.paymentmodal.PaymentPage;
import weathershopperpages.productpage.ProductPage;

import java.util.Scanner;

public class FirstTest {
    private WebDriver driver;
    public HomePage homePage;
    public PaymentPage paymentPage;
    public ProductPage productPage;
    public CartPage cartPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        System.out.println("hello");
        driver=new ChromeDriver();
        driver.get("https://weathershopper.pythonanywhere.com/");
        homePage=new HomePage(driver);
        paymentPage=new PaymentPage(driver);
        cartPage=new CartPage(driver);
        productPage=new ProductPage(driver);
    }

    @Test
    public void firstTest(){
        homePage.NavigateTo("moisturizer");
        productPage.selectProducts();
        cartPage.CheckCart();
        paymentPage.completePayment();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("After");
    }
}
