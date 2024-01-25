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
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
        driver.findElement(Email).sendKeys("amnazeeshann21@gmail.com");
        String cardNumber="4242 4242 4242 4242";
        for(int i = 0; i < cardNumber.length(); i++){
            String cardNumChar = String.valueOf(cardNumber.charAt(i));
            driver.findElement(CardNumber).sendKeys(cardNumChar);
        }
        driver.findElement(ExpiryDate).sendKeys("02/24");
        driver.findElement(Cvc).sendKeys("123");
        driver.findElement(ConfirmPayment).click();
    }
}