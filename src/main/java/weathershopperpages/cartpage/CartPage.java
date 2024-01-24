package weathershopperpages.cartpage;

import org.openqa.selenium.WebDriver;

import static weathershopperpages.cartpage.CartPageUI.Total;

public class CartPage {
    //verify if the items in the cart are those that were selected and then click on the pay button

    private WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver=driver;
    }

    public void isRightProduct(){
        String total=driver.findElement(Total).getText();
    }
}
