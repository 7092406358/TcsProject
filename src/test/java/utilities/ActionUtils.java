
package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browserFactory.DriverManager;

public class ActionUtils  {

	
	private static WebDriver driver;
	
	public void sendKeys(Keys enter) {
		
	}

	
	public ActionUtils(DriverManager driverManager) {
		super(driverManager);
		driver =driverManager.getDriver();
	}
	public void sendKeys(WebElement userNameTextBox, String userName, int timeout) {
		// TODO Auto-generated method stub
		
	}
	
}
