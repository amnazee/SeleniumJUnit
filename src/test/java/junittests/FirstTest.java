package junittests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import weathershopperpages.driver.DriverManager;
import weathershopperpages.moisturizerpage.MoisturizerPage;
import weathershopperpages.productpage.ProductPage;

@Execution(ExecutionMode.CONCURRENT)
public class FirstTest {

    @BeforeEach
    public void setUp(){
        System.out.println("Before Each");
    }

    @Test
    public void firstTest(){
        ProductPage productPage=new ProductPage();
        System.out.println(productPage.selectProductsInPriceRange(215,465));
    }

    @Test
    public void secondTest(){
        MoisturizerPage moisturizerPage=new MoisturizerPage();
        String productIngredient="almond";
        System.out.println(moisturizerPage.ProductWithAnIngredient(productIngredient));
    }
    @AfterEach
    public void tearDown(){
        DriverManager.quit();
    }
}