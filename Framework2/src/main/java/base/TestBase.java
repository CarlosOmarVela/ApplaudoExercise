package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Se va a inicializar el driver
public class TestBase {
    protected static WebDriver driver = null;

    public void beforeClass(String testCaseName){
        driver = getFirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        System.out.println("Starting test case " + testCaseName);
    }

    //Inicializar el webdriver de Firefox
    public WebDriver getFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        return new FirefoxDriver();
    }

    public void afterClass(String testCaseName){
        driver.close();
        System.out.println("Test case " + testCaseName + " Finished");
    }
}
