package weathershopperpages.productpage;

import org.openqa.selenium.By;

public class ProductPageUI {
    public static final By All_Products=By.xpath("//div[@class='text-center col-4']");
    public static final By Product_Name=By.xpath(".//p[@class='font-weight-bold top-space-10']");
    public static final By Product_Price=By.xpath("//p[contains(text(),'Price: ')]");
    public static final By Add_To_Cart_Button=By.xpath("//button[@class='btn btn-primary']");
    public static final By Cart_Button=By.xpath("//button[contains(.,'Cart')]");
    public static final By Cart_Value=By.xpath("//span[@id='cart']");
    public static final By Heading=By.xpath("//h2");
}