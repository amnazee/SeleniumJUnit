package weathershopperpages.paymentmodal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import weathershopperpages.cartpage.CartPageUI;

import static weathershopperpages.paymentmodal.PaymentUI.*;

public class PaymentPage {
    private WebDriver driver;
    public PaymentPage(WebDriver driver){
        this.driver=driver;
    }

    public void completePayment(){
        driver.findElement(CartPageUI.PayButton).click();
        driver.switchTo().frame(0);
        driver.findElement(Email).sendKeys("amnazeeshann21@gmail.com");
        driver.findElement(CardNumber).sendKeys("4242 4242 4242 4242");
        driver.findElement(ExpiryDate).sendKeys("02/24");
        driver.findElement(Cvc).sendKeys("123");
        driver.findElement(ConfirmPayment).click();
    }
}
