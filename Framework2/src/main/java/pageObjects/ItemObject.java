package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemObject {
    WebDriver driver =  null;

    public ItemObject(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getCartSelect(){
        return driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a"));
    }
    public WebElement getDeleteItem(){
        return driver.findElement(By.id("5_19_0_0"));
    }
}
