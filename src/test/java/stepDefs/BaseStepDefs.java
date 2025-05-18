package stepDefs;

import browserFactory.DriverManager;
import cucumberUtilities.hooks.Hooks;
import dataProviders.ConfigFileReader;

public abstract class BaseStepDefs {
	
	
	protected DriverManager driverManager;
	protected ConfigFileReader configFile;
	
	public BaseStepDef () throws Thowable{
		
		//configFile = Hooks.getconfigFile();
	}
	

}
