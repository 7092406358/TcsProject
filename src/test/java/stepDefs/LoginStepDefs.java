package stepDefs;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;


public class LoginStepDefs extends BaseStepDefs  {

	String url ="https://www.linkedin.com/login";
	WebDriver driver;
	Properties prop;
	
    LoginPage loginPage;

public LoginStepDefs() throws Throwable{
	loginPage = new LoginPage(driverManager);
    }
   
   


	@Given("I log into linkedin application")
	
	 public void loginApplication() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get(url);
        System.out.println("welcome");
        loginPage.enterLoginDetails();   
          
	}
	
	
}
