package seleniumLectures;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class MakeMyTripwithxpath2 extends Utilities{

	public static void main(String[] args) throws InterruptedException {

	LaunchBrowser("https://www.makemytrip.com/");
	WebElement from= driver.findElement(By.xpath("//span[text()='From']"));
	from.click();
	WebElement cityFrom= driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-16']"));
	cityFrom.click();
	
	Actions action= new Actions(driver);
	
	WebElement to= driver.findElement(By.xpath("//span[text()='To']"));
	to.click();
	WebElement cityTo= driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-1-item-5']"));
	scrollDownPage();	
	cityTo.click();
		
      
      
	Thread.sleep(3000);
	driver.close();
     
	

}}
