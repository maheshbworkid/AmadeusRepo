package com.qa.apphooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigReader configreader;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() {
		configreader=new ConfigReader();
		prop=configreader.init_prop();
		
	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browserName=prop.getProperty("browser");
		driverfactory=new DriverFactory();
		driver=driverfactory.initialize_driver(browserName);
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.close();
	}
	
	@After(order=1)
	public void tearDown(Scenario sc) {
		if(sc.isFailed()) {
			String screenShotName=sc.getName().replaceAll(" ", "_");
			byte[] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcepath, "image/png", screenShotName);
			
		}
	}
}
