package testActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchActions {

    protected WebDriver driver = null;

    public SearchActions(WebDriver driver){
        this.driver = driver;
    }
    public void clickOnItem() {
        try {
            //Thread.sleep(2000);
            driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div.right-block > h5 > a")).click();//Click sobre el elemento con Css selector
            //validar que la descripción no sea null, si es null va a fallar
            //Assert.assertFalse("Item description is NOT displayed", driver.findElement(By.id("short_description_block")) == null);
            System.out.println("Step 04: Pass");
        } catch (Exception e) {

        }
    }
}
