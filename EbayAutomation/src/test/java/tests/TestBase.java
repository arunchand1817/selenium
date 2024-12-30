package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.HomePage;
import pageObjects.ShoppingCartPage;

public class TestBase {

    public WebDriver driver;
    public static final String BASE_URL = "https://www.ebay.com/";
    HomePage homePage;
    ShoppingCartPage shoppingCartPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
