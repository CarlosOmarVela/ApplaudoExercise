package TestCases;

import base.TestBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testActions.HomePageActions;
import testActions.ItemActions;
import testActions.SearchActions;

public class Test_Case_01 extends TestBase {

    private String testCaseName = this.getClass().getSimpleName();

    @Before
    public void beforeTest() {
        System.out.println("Running before test");
        beforeClass(testCaseName);
    }

    @Test
    public void testMain(){
        System.out.println("Running during test");

        HomePageActions homePage = new HomePageActions(driver);
        SearchActions searchActions = new SearchActions(driver);
        ItemActions itemActions = new ItemActions(driver);

        System.out.println("Step 01-> Ingresar a la página http://automationpractice.com/index.php");
        homePage.validarURL();
        System.out.println("Step 02-> Set a product in search text box");
        homePage.setProduct();
        System.out.println("Step 03-> Click in Search button");
        homePage.clickSearchButton();
        System.out.println("Step 04-> Click in one item");
        searchActions.clickOnItem();
        System.out.println("Step 05 -> Click in 'Add to cart' button");
        itemActions.clickAddToCart();
        System.out.println("Step 06 -> Continue shopping");
        itemActions.clickContinueShopping();
        System.out.println("Step 07 -> Enter Cart");
        itemActions.enterCart();
        System.out.println("Step 08 -> Delete Item");
        itemActions.deleteItem();
        System.out.println("Step 09-> Set a invalid name in search text box");
        homePage.setInvalidProduct();
        System.out.println("Step 10-> Click in Search button");
        homePage.clickSearchButtonInvalidItem();
        System.out.println("Step 11-> Set a valid item in search text box");
        homePage.setProduct();
        System.out.println("Step 12-> Click in Search button");
        homePage.clickSearchButton();
        System.out.println("Step 13-> Click in one item");
        searchActions.clickOnItem();
        System.out.println("Step 14 -> Click in 'Add to cart' button");
        itemActions.clickAddToCart();
        System.out.println("Step 15 -> Click in 'Proceed to checkout' button");
        itemActions.clickProceedToCheckOut();
        System.out.println("Step 16 -> Scroll page until find 'Store Information'");
        itemActions.scrollPage();
    }

    @After
    public void afterTest(){
        System.out.println("Running after test");
        afterClass(testCaseName);
    }
}
