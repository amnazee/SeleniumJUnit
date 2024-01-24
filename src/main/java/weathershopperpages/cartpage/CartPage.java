package weathershopperpages.cartpage;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import static weathershopperpages.cartpage.CartPageUI.*;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver=driver;
    }

    public void CheckCart(){
        String total=driver.findElement(Total).getText();
        String price=driver.findElement(SelectedProduct).getText();
        int productPrice=Integer.parseInt(price);
        int parsedValue = Integer.parseInt(total.split("\\s+")[2]);
        Assert.assertEquals(productPrice,parsedValue);
        driver.findElement(PayButton).click();
        driver.switchTo().frame(0);
    }
}
