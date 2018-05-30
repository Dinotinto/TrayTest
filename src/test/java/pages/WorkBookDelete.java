package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriveManager;

public class WorkBookDelete extends DriveManager {

	By hoverMenu = By.className("Menu___-LZVQO");
	By delete = By.xpath(".//*[@title='Yes']");

	public void hover() throws Throwable {
		Actions perform = new Actions(driver);
		perform.moveToElement(driver.findElement(hoverMenu)).perform();
	}
	    public void clickDeleteLink(){
	    driver.findElement(By.linkText("Delete")).click();
	}



	public void deleteWorkflowPopup() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(hoverMenu)).perform();
		WebElement delete_el = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(driver.findElement(delete)));
		delete_el.click();
	}

}
