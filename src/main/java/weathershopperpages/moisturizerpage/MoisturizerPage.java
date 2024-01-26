package weathershopperpages.moisturizerpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import weathershopperpages.driver.DriverManager;
import weathershopperpages.productpage.ProductPage;

import java.util.ArrayList;
import java.util.List;

import static weathershopperpages.productpage.ProductPageUI.*;

public class MoisturizerPage extends ProductPage {
    private WebDriver driver;
    public static DriverManager driverManager;

    public MoisturizerPage(){
        driverManager= DriverManager.getInstance();
        this.driver=driverManager.getDriver();
//        driver.get("https://weathershopper.pythonanywhere.com/moisturizer");
    }

    public List<String> ProductWithAnIngredient (String productIngredient){
        List<WebElement> products=driver.findElements(All_Products);
        List<String> newList=new ArrayList<>();
        for(int i=0; i<products.size(); i++){
            List<WebElement>list=products.get(i).findElements(Product_Name);
            String productName=list.get(0).getText();
            if(productName.toLowerCase().contains(productIngredient)){
                newList.add(productName);
            }
        }
        return newList;
    }
}