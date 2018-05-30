package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriveManager;

public class WorkFlow extends DriveManager {

	By Workflow= By.xpath("//a[@href='/create']");
	By WorkflowName= By.name("name");
	By crtWorkflow= By.xpath("//*[@title='Create']");
	
	public void clickWork() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Workflow));
		driver.findElement(Workflow).click();
	}

	public void sendkeysToworkflow() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(WorkflowName));
		driver.findElement(WorkflowName).sendKeys("MyWorkflow");
	}

	public void clickCrtWorkflow() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(crtWorkflow));
		driver.findElement(crtWorkflow).click();
	}
}


