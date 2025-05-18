package browserFactory;

public abstract class DriverManager {

	 
		protected static final ThreadLocal<WebDriver> driver new ThreadLocal<WebDriver>(); 

		protected String driverPath; 

		 //protected String alt BrowserFilepath:

		

		 protected String host;

		 protected String browserVersion:

		 protected Boolean selenoidEnableVNC;

		 protected Boolean selenoidOrSeleniumGridEnableVideo:

		 protected Boolean privateBrowsing: 

		protected Boolean headlessBrowsing:
        protected String videoName:

		protected SessionId sessionId:
		 public abstract void stopService();

		protected abstract void startService();

		protected abstract void createDriver();

		protected abstract void createRemoteDriver() throws MalformedURLException:

		protected abstract void createSauceDriver() throws MalformedURLException:

		protected abstract void createSelenoidDriver() throws MalformedURLException:

		protected ConfigFileReader configFile:

		protected String typeOfApplication;

		protected static BrowserMobProxyServer praxyServer:
		protected static Proxy proxy:
		protected Boolean burpPzoxy: 
		protected Boolean seleniumProxy:
		protected Boolean accept InsecureCerts:
}
	
	
}
