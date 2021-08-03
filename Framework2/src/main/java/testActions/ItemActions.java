package testActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.ItemObject;

import org.openqa.selenium.JavascriptExecutor;

public class ItemActions {
    protected WebDriver driver = null;
    ItemObject itemObject = null;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public ItemActions(WebDriver driver){
        this.driver = driver;
    }
    public void clickAddToCart(){
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\'add_to_cart\']")).click();
            Thread.sleep(2000);
            //MEnsaje de error, mensaje esperado, WebElement actual mandando el mensaje con getText()
            Assert.assertEquals("Message is Not displayed","Product successfully added to your shopping cart",driver.findElement(By.cssSelector(".layer_cart_product > h2:nth-child(2)")).getText());
            System.out.println("Step 05: Pass");
        }catch (Exception e){
            System.out.println("Step 04: fail");
            System.out.println(e);
        }
    }
    public void clickProceedToCheckOut(){
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a")).click();
            Assert.assertTrue("Not added to cart",driver.findElement(By.cssSelector("#cart_title")).isDisplayed());
            System.out.println("Step 13: pass");
        }catch (Exception e){
            System.out.println("Step 13: fail");
            System.out.println(e);
        }
    }
    public void clickContinueShopping(){
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")).click();
            Assert.assertTrue("Not added to cart",driver.findElement(By.xpath("//*/h3[contains(text(),'Data sheet')]")).isDisplayed());
            System.out.println("Step 06: pass");
        }catch (Exception e){
            System.out.println("Step 06: fail");
            System.out.println(e);
        }
    }
    public void enterCart(){
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a")).click();
            Assert.assertEquals("SHOPPING-CART SUMMARY\n" +
                    "Your shopping cart contains: 1 Product",driver.findElement(By.id("cart_title")).getText());
            System.out.println("Step 07: pass");
        }catch (Exception e){
            System.out.println("exception = " + e);
            System.out.println("Step 07: fail");
        }
    }
    public void deleteItem(){
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*/table/tbody/tr/td[7]/div/a")).click();
            Assert.assertFalse(driver.findElement(By.xpath("//*[@id='center_column']/p")).isDisplayed());
            System.out.println("Step 08: pass");
            driver.findElement(By.id("header_logo")).click();
        }catch (Exception e){
            System.out.println("e = " + e);
            System.out.println("Step 08: fail");
            driver.findElement(By.id("header_logo")).click();
        }
    }
    public void scrollPage(){
        try {
            WebElement Element = driver.findElement(By.linkText("My orders"));
            js.executeScript("arguments[0].scrollIntoView();", Element);
        }catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
