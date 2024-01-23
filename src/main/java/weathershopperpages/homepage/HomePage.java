package weathershopperpages.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void SelectCategory(){
        WebElement temperatureElement=driver.findElement(HomePageUI.Temperature);
        String tempText=temperatureElement.getText().substring(0,temperatureElement.getText().length()-2).trim();
        int temp=Integer.parseInt(tempText);
        if(temp>19){
            driver.findElement(HomePageUI.Sunscreen_Button).click();
        }
        else {
            driver.findElement(HomePageUI.Moisturizer_Button).click();
        }
    }
}
