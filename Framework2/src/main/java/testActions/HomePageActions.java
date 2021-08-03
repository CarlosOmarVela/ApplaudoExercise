package testActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePageObject;

public class HomePageActions {
    protected WebDriver driver = null;
    HomePageObject homePageObject = null;

    public HomePageActions(WebDriver driver){
        this.driver = driver;
        homePageObject = new HomePageObject(driver);
    }
    public void validarURL(){
        if (driver.getTitle().equals("My Store")){//Verifica si el título de la página es igual a lo que queremos
            System.out.println("Step 01: pass");
        }else{
            System.out.println("Step 01: fail");
        }
    }
    public void setProduct(){
        try {
            homePageObject.get_Search_text_box().clear();
            homePageObject.get_Search_text_box().sendKeys("Dress");//Escribimos sobre el elemento encontrado
            System.out.println("Step 02: pass");
        }catch(Exception e) {
            System.out.println("Step 02: fail");
            System.out.println(e);
        }
    }
    public void setInvalidProduct(){
        try {
            homePageObject.get_Search_text_box().clear();
            homePageObject.get_Search_text_box().sendKeys("edwdwed");//Escribimos sobre el elemento encontrado
            System.out.println("Step 09: pass");
        }catch(Exception e) {
            System.out.println("Step 09: fail");
            System.out.println(e);
        }
    }
    public void clickSearchButton(){
        try {
            driver.findElement(By.name("submit_search")).click();//Hacemos clic sobre el botón buscar
            //Assert 01, Mensaje por si no pasa, que va a buscar, isDisplayed nos regresa un valor booleano
            Assert.assertTrue("Search result list is NOT displayed",homePageObject.get_Search_Button().isDisplayed());
            System.out.println("Step 03: pass");
        }catch (Exception e){
            System.out.println("Step 03: fail");
            System.out.println(e);
        }
    }
    public void clickSearchButtonInvalidItem(){
        try {
            driver.findElement(By.name("submit_search")).click();//Hacemos clic sobre el botón buscar
            //Assert 01, Mensaje por si no pasa, que va a buscar, isDisplayed nos regresa un valor booleano
            Assert.assertTrue("Search result list is NOT displayed",homePageObject.get_Wrong_Search().isDisplayed());
            System.out.println("Step 10: pass");
        }catch (Exception e){
            System.out.println("Step 10: fail");
            System.out.println(e);
        }
    }
}
