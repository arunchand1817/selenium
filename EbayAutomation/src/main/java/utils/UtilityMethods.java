package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class UtilityMethods {

    public static void switchToWindow(int tabId, WebDriver driver) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabId));
    }
}
