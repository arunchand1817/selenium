package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//input[@type='text'][1]")
    private WebElement searchBox;

    @FindBy(xpath = "//input[@value='Search']")
    private WebElement searchButton;

    @FindBys(@FindBy(xpath = "//*[starts-with(@id,'item')]/div/div[2]/a/div/span"))
    private List<WebElement> books;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterTextInSearchBox(String text) {
        searchBox.sendKeys(text);
    }

    public void search() {
        searchButton.click();
    }

    public void clickOnFirstBook() {
        books.get(0).click();
    }


}
