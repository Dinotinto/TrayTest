package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriveManager;

import java.sql.DriverManager;

public class Dash extends DriveManager {
	DriveManager dashPage = new DriveManager();

	By backToDash= By.xpath("//a[@href='/']");

	public void dashBoard()throws Throwable{
		dashPage.waitForElement(5000);
		driver.findElement(backToDash).click();
	}
}
