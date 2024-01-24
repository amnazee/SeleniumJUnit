package weathershopperpages.homepage;

import org.openqa.selenium.By;

public class HomePageUI {
    public static final By Temperature=By.xpath("//span[@id='temperature']");
    public static final By Moisturizer_Button=By.xpath("(//button[contains(@class, 'btn-primary')])[1]");
    public static final By Sunscreen_Button=By.xpath("(//button[contains(@class, 'btn-primary')])[2]");
//    public static final By Category_Button=By.xpath("//button[contains(text(),\"moisturizer\")]");
}
