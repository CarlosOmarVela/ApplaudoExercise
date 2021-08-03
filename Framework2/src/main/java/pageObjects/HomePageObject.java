package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
    WebDriver driver =  null;

    public HomePageObject(WebDriver driver){
        this.driver = driver;
    }

    public WebElement get_Search_text_box(){
        return driver.findElement(By.id("search_query_top"));
    }
    public WebElement get_Search_Button(){
        return driver.findElement(By.cssSelector("li.ajax_block_product:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)"));
    }
    public WebElement get_Wrong_Search(){
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/p"));
    }
}
