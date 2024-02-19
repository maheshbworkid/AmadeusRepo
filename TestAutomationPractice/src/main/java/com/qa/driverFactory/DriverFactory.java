package com.qa.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
	/**
	 * this method is used to initialize the thread local driver on basis of given browser 
	 * @param browser
	 * @return
	 */
	
	
	public WebDriver initialize_driver(String browser){
		System.out.println("browser value is" + browser);
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MABIRADA\\Myworkspace\\TestAutomationPractice\\drivers\\chromedriver.exe");
			tldriver.set(new ChromeDriver());
			
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Please pass the proper browser value name: " + browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/**
	 * 
	 * this is used to get the driver with threalocal
	 * @return
	 */
	
	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}
	
}