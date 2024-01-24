package weathershopperpages.productpage;

import org.openqa.selenium.WebDriver;

import static weathershopperpages.productpage.ProductPageUI.Add_To_Cart_Button;
import static weathershopperpages.productpage.ProductPageUI.Cart_Button;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }

    public void selectProducts(){
        driver.findElement(Add_To_Cart_Button).click();
        driver.findElement(Cart_Button).click();
    }
}
