package pages;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import browserFactory.DriverManager;
import page.BasePage;
import utilities.ActionUtils;
import utilities.Log;
import utilities.StringUtils;

public class LoginPage extends BasePage {

   String userName, password;
	
  //xpath list 	
   @FindBy(id ="username")	
    public WebElement userNameTextBox;

   @FindBy(id ="password")	
    public WebElement passwordTextBox;
	//WebDriver driver = driverManager.getDriver();
   // private ActionUtils actionUtils;
    int timeout = 60;
	
    //constructor to intialize the loginpage with driver manager
    public LoginPage(DriverManager driverManager) throws Throwable{
	super (driverManager);	
	 // actionUtils = new ActionUtils(driverManager);
   }

  // String username ;	
   //Retrieves the config properties file 	
	
 
    public Properties getConfigFile() {
    	BufferedReader reader;
    	String configPath =
    	   System.getProperty("user.dir") + "//configs//Configuration.properties";
    	try {
    	reader =new BufferedReader(new InputStreamReader(new FileInputStream(configPath), "Cp1252"));
    	Properties localProperties = new Properties();
    	localProperties.load(reader);
    	reader.close();
    	return localProperties;
    	} catch (IOException e) {
    	//Log.error(e.toString());
    	throw new RuntimeException("Issue Loading configuration" + configPath);
    	} 
    	}
    	
    
	
	public void enterLoginDetails()
	{
		System.out.println("enteered");
		userName =  getConfigFile().getProperty("PEGA_USER_NAME");
		System.out.println(userName);
		/*password =

				(System.getProperty("PEGA_PASSWORD") != null)

				? StringUtils.base64ToString(System.getProperty("PEGA_PASSWORD"))

				: StringUtils.base64ToString(getConfigFile().getProperty("PEGA_PASSWORD"));

				if (userName == null && password == null) {

				throw new RuntimeException("Please specify login details of the application");
	            }*/
				//actionUtils.sendKeys(userNameTextBox, userName, timeout);

				//actionUtils.sendKeys (passwordTextBox, password, timeout);
		
	
}}
