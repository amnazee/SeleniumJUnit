package weathershopperpages.productpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import weathershopperpages.moisturizerpage.MoisturizerPage;
import weathershopperpages.sunscreen.SunscreenPage;

import java.util.ArrayList;
import java.util.List;

import static weathershopperpages.productpage.ProductPageUI.*;

public class ProductPage {
    public WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }

    public List<String> selectProductsInPriceRange(int minPrice, int maxPrice){
        List<WebElement> products = driver.findElements(All_Products);
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            List<WebElement> list = products.get(i).findElements(By.xpath("*"));
            String productPrice = list.get(2).getText().substring(list.get(2).getText().length() - 3);
            int prodPrice = Integer.parseInt(productPrice);
            String productName = list.get(1).getText();
            if (prodPrice > minPrice && prodPrice < maxPrice) {
                newList.add(productName);
            }
        }
        return newList;
    }
}
