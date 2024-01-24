package weathershopperpages.paymentmodal;

import org.openqa.selenium.By;

public class PaymentUI {
    public static final By Frame = By.xpath("//iframe[@name='stripe_checkout_app']");
    public static final By Email = By.xpath("//input[@id='email']");
    public static final By CardNumber = By.xpath("//input[@id='card_number']");
    public static final By ExpiryDate = By.xpath("//input[@id='cc-exp']");
    public static final By Cvc = By.xpath("//input[@id='cc-csc']");
    public static final By ZipCode = By.xpath("//input[@name='zip']");
    public static final By ConfirmPayment = By.xpath("//span[@class='iconTick']");
    public static final By SuccessHeading = By.xpath("//h2[contains(.,'SUCCESS')]");


}
