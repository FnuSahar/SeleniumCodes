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

public class MakeMyTripwithxpath extends Utilities{

	public static void main(String[] args) throws InterruptedException {

	LaunchBrowser("https://www.makemytrip.com/");
		
		WebElement from= driver.findElement(By.xpath("//span[text()='From']"));
		from.click();
		WebElement cityFrom= driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']"));
		cityFrom.click();
		WebElement to= driver.findElement(By.xpath("//span[text()='To']"));
		to.click();
		WebElement cityTo= driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-3']"));
		cityTo.click();
		WebElement datefrom = driver.findElement(By.xpath("//div[@aria-label='Wed Jan 05 2022']"));
		datefrom.click();
		WebElement Date= driver.findElement(By.xpath("//p[@class='latoBlack font12 greyText lineHeight16']"));
		Date.click();
        WebElement dateto= driver.findElement(By.xpath("//div[@aria-label='Thu Feb 10 2022']"));
        dateto.click();
        WebElement travelers= driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom5']"));
        travelers.click();
        WebElement Adult= driver.findElement(By.xpath("//li[@data-cy='adults-1']"));
        Adult.click();
        WebElement child= driver.findElement(By.xpath("//li[@data-cy='children-1']"));
        child.click();
        WebElement infant= driver.findElement(By.xpath("//li[@data-cy='infants-1']"));
        infant.click();
        WebElement classtype= driver.findElement(By.xpath("//li[@data-cy='travelClass-2']"));
        classtype.click();
        WebElement apply= driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']"));
        apply.click();
        WebElement Search= driver.findElement(By.xpath("//a[text()='Search']"));
        Search.click();
      
      
	Thread.sleep(3000);
	driver.close();
     
	

}}
