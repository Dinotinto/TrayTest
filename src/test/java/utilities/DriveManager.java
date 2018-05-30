package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriveManager {
	
		public static WebDriver driver;
			
			public void startSession(String browser){
				if (driver == null) {
					if (browser.equalsIgnoreCase("firefox")) {
						System.setProperty("webdriver.gecko.driver", "//Users//Dinotinto//bin//geckodriver");
						driver = new FirefoxDriver();
					}
				}
				
			}
			
				public void tearDown() {
					driver.quit();
					driver = null;
				
			}



			public void waitForElement(int num) throws InterruptedException {
				Thread.sleep(num);

			}
			
		}
