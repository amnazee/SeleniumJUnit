package weathershopperpages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Scanner;

import static weathershopperpages.homepage.HomePageUI.*;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void NavigateTo(String productType){
        WebElement button=driver.findElement(By.xpath("//button[contains(text(), '" + productType + "')]"));
        button.click();
    }
}
