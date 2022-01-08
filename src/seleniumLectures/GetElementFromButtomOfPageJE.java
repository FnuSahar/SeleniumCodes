package seleniumLectures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetElementFromButtomOfPageJE extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		
		
		LaunchBrowser("https://www.makemytrip.com/");
		
		WebElement facebook= driver.findElement(By.xpath("//a[@href='https://www.facebook.com/makemytrip/']"));
		Thread.sleep(3000);
		//ClickWithJSE(facebook); //click with on f icon in the bottom of the page with utility class method
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scroll down 
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].click()",facebook);// click without utility class
		
		
	      
		Thread.sleep(3000);
		driver.close();
	     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
