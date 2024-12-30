package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ShoppingCartPage;
import utils.UtilityMethods;

import static utils.Constants.CART_MISMATCH_ERROR;

public class AddToCartTest extends TestBase {

    @Test
    public void test() {
        homePage = new HomePage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
        homePage.enterTextInSearchBox("Book");
        homePage.search();
        homePage.clickOnFirstBook();
        UtilityMethods.switchToWindow(1, driver);
        shoppingCartPage.addToCart();
        int actualCartValue = shoppingCartPage.getCartValue();
        Assert.assertEquals(actualCartValue, 1, CART_MISMATCH_ERROR);
    }

}
