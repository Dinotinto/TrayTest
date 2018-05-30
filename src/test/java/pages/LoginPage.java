package pages;



import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriveManager;

import java.util.concurrent.TimeUnit;

public class LoginPage extends DriveManager {
	By login =  By.xpath("//a[@href='https://app.tray.io']");
	By username =  By.name("username");
	By password =  By.name("password");
	By loginBtn =  By.xpath("//*[@type='submit']");
	
	
	
	
	
	public void gotoUrl() throws Throwable {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://tray.io/");
		}

		public void clickHomepageLoginButton(){
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(login));
			driver.findElement(login).click();
		}
	
	public void usernameandPassword() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(username));
		driver.findElement(username).sendKeys("adeolu.oidowu@yahoo.com");
		driver.findElement(password).sendKeys("Deoluwa12");
	}
	public void clickLoginButton(){
		driver.findElement(loginBtn).click();
	}
}
