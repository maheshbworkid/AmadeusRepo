package com.qa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	/**
	 * This is reading a config.properties file
	 * @return
	 */
	public Properties init_prop() {
		prop=new Properties();
		try{
			
			FileInputStream ip=new FileInputStream("C:\\Users\\MABIRADA\\Myworkspace\\TestAutomationPractice\\src\\test\\resources\\com\\qa\\config\\config.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		return prop;
	}
	
}
