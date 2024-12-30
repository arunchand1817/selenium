package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    WebDriver driver;

    @FindBy(xpath = "//span[text()='Add to cart']")
    private WebElement addToCart;

    @FindBy(css = "#gh-cart-n")
    private WebElement cart;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToCart() {
        addToCart.click();
    }

    public int getCartValue() {
        return Integer.parseInt(cart.getText());
    }

}
