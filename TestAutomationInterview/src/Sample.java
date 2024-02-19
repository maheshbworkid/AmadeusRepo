qimport java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {

	 
	public static void main(String[] args) throws IOException {
		
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\MABIRADA\\Myworkspace\\TestAutomationInterview\\drivers\\chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("file:///C:/Users/MABIRADA/Downloads/Testhtml.html");
	List<WebElement> elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(elements.size());
	driver.findElement(By.xpath("(//input[@type='checkbox'])position() mod 2 =1")).click();
//	for( WebElement element:elements)
//	{
//		element.click();
//	}
//	for(int i=elements.size()-1; i>=0; i--) {
//		elements.get(i).click();
//	}
//	
//
//	for( WebElement element:elements)
//	{
//		element[]
//	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement	tablecount1=driver.findElement(By.xpath("//div"));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		List<WebElement>	tablecount=driver.findElements(By.xpath("//div"));
//	
//	int ans=tablecount.size();
//	System.out.println(ans);
//	List<WebElement> rowcount=driver.findElements(By.xpath("//table//tr"));
//	int ans1=rowcount.size();
//	System.out.println(ans1);
//	List<WebElement> colcount=driver.findElements(By.xpath("//table[1]//tr[1]//td"));
//	int ans2=colcount.size();
//	System.out.println(ans2);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	try{
		String expectedTitle="traversiing concept";
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		System.out.println("pass");
	}
	catch(Exception e){
		System.out.println("fail");
	}
	
	JavascriptExecutor jse=(JavascriptExecutor)driver.executeScript("window.open()");
	driver.get("https://www.google.com");
	Set<String> allwhs=driver.getWindowHandles();
	int count=allwhs.size();
	System.out.println("no of tabs" + count);
	for(String whs:allwhs) {
		System.out.println(whs);
		driver.switchTo().window(whs).close();
	}
//	FirefoxProfile profile=new FirefoxProfile();
//	String key="browser.helperApss.neverAsk.SaveToDisk";
//	String value="applications/zip";
//	profile.setPreference(key, value);
//	ChromeDriver driver1= new ChromeDriver();
//	driver.switchTo().window(value);
	
//	
//	Alert alert = new Alert();
//	alert.accept();
//	alert.dismiss();
	//driver.findelement(By.name("file")).sendkeys(""file name");
	
//	Actions actions=new Actions(driver);
//	actions.moveToElement(element).perform();
//	actions.dragAndDrop(src,  dest);
//	actions.contextClick(link).perform();
//	actions.doubleClick().perform();
//	actions.sendKeys(Keys.ENTER).click()actions.build()actions.perform()	;
//	driver.switchTo().frame(0);
//	driver.switchTo().defaultContent()
//driver.switchTo().parentFrame();	
//	
//	
		
//		List<WebElement> element=driver.findElements(By("//a"));
//		int ans=element.size();
//		System.out.println(ans);
////	for(WebElement text:element) {
//		System.out.println(text.getText());
//		TakesScreenshot t=(TakesScreenshot) driver;
//		File srcfile=t.getScreenshotAs(OutputType.FILE);
//		File destfile=new File("C://Users//MABIRADA//Myworkspace//TestAutomationInterview//screenshots//traverse.png");
//		FileHandler.copy(srcfile, destfile);
		/*
		 *WebElement menu= driver.findElement(By.xpath());
		 *Actions actions=new Actions(driver);
		 *actions.moveToElement(menu).perform();
		 *driver.findElement(By.xpath()).click();
		 *
		 *
		 *WebElement drag=driver.findElement(By.xpath());
		 *WebElement drop=driver.findElement(By.xpath());
		 *Actions action=new Actions(driver);
		 *action.dragAndDrop(drag,drop).perform();
		 *
		 *
		 *WebDriver driver=new ChromeDriver();
		 *driver.get();
		 *
		 *
		 * 
		 * 
		 * 
		 */
	}
	
	}

