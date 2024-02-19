package practiceTestNG;

import org.junit.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestOne {

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Running before suite");
	}
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("Running before suite");
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("Running before test");
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("Running after test");
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Running before class");
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("Running before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Running before method");
	}
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("Running after method");
	}
	
	
	
	
}
