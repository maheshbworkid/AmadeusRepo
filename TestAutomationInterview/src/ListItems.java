import java.awt.Window;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListItems {
public static void main(String[] args) {
	String key="webdriver.chrome.driver";
	String value="C:\\Users\\MABIRADA\\Myworkspace\\TestAutomationInterview\\drivers\\chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MABIRADA/Downloads/Testhtml.html");
	WebElement listbox = driver.findElement(By.id("mtr"));
	Select select=new Select(listbox);
	List<WebElement> alloptions=select.getOptions();
	System.out.println(alloptions.size());
	for(int i=0; i<alloptions.size(); i++) {
		select.selectByIndex(i);
	}
	
	ArrayList <String> al=new ArrayList<String>();
	for(WebElement option:alloptions) {
		String text=option.getText();
		al.add(text);
	}
	

	for (String newtext:al) {
		System.out.println(newtext);
	}
	
   ArrayList <String> al2=new ArrayList<String>(al);
   Collections.sort(al2);
   if(al2.equals(al)) {
	   System.out.println("sorted");
   }
   System.out.println("not sorted");
	
	TreeSet<String> t1=new TreeSet<String>();
	for(WebElement each:alloptions) {
		String text=each.getText();
		t1.add(text);
	}
	
	for(String values:t1) {
		System.out.println(values);
	}
	
	HashSet<String> h1=new HashSet<String>(al);
	System.out.println(h1.size());
	System.out.println(al.size());
	if(al.size()==h1.size()) {
		System.out.println("It does not duplicates");
	}
	System.out.println("It have duplicates");
	
	for(WebElement everytext:alloptions)
	{
	String text2=everytext.getText();
	
   if(!h1.add(text2)) {
	  System.out.println(text2); 
   }
	}
	/*
	 * Actions action=new Actions(driver);
	 * action.contextclick(link).perform();
	 * Robot r=new Robot();
	 * r.keypress(KeyEvent.VK_T);
	 * action.doubleclick(menu).perform();
	 * 
	 * 
	 * 
	 * 
	 */
	
//	Alert alert=driver.switchTo().alert();
//	System.out.println(alert.getText());
//	alert.accept();
//	alert.dismiss();
	
	//we cannot move we cannot inspect alert pop up and confirmation popup
	/*Hidden division popup - We can inspect , move a
	 * color
	 * Fileupload popup: we can move this popup but we cannot inspect the popup
	 * Sendkeys(); should be use fpr browse button and \\ absolute path should be provided
	 * driver.findElement(By.id("Browse")).sendKeys("filepath");
	 *type=file;
	 *FileDownload:
	 *setpreference method of FirefoxProfile class
	 *FirefoxProfile profile=new FirefoxProfile();
	 *String key="browser.helperApps.neverAsk.SaveToDisk";
	 *String value="application/zip";
	 *profile.setpreference(key,value);
	 *WebDriver driver=new FirefoxDriver(profile);
	 *driver.get();
	 *driver.findelements(By.id()).click();
	 *
	 *
	 *
	 *
	 * 
	 * 
	 * 
	 */
	JavascriptExecutor jsp=(JavascriptExecutor)driver.executeScript("window.open()");
	Set<String> windowhandles=driver.getWindowHandles();
	for(String windowhandle:windowhandles) {
		System.out.println(windowhandle);
		
	}
	
	
	
}
}
