package weathershopperpages.cartpage;

import org.openqa.selenium.By;

public class CartPageUI {
    public static final By Total= By.xpath("//p[@id='total']");
    public static final By PayButton=By.xpath("//button[@class='stripe-button-el']");
    public static final By SelectedProduct=By.xpath("//div//table[@class='table table-striped']//tbody//tr//td[2]");
}
