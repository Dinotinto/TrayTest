package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriveManager;

public class LogOut extends DriveManager {

By toggleButton = By.id("userToggle");
By signOut = By.linkText("Log Out");


public void logOut() throws Throwable {
    Actions performAction = new Actions(driver);
    performAction.moveToElement(driver.findElement(toggleButton)).perform();
    WebElement toggleButton_el = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(toggleButton));
    toggleButton_el.click();
    driver.findElement(signOut).click();
    }
}
