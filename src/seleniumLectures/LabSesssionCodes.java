package seleniumLectures;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class LabSesssionCodes {

	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(20))
	.pollingEvery(Duration.ofSeconds(2));
	//we need to click 
	WebElement from = driver.findElement(By.xpath("//div[starts-with(@class,'fsw_inputBox searchCity')]//child::span[text()='From']"));
	from.click();
	//select from destination
	List<String> listOfCities = new ArrayList<String>();
	for (int i = 1; i <= 20; i++) {
	WebElement cityFrom = driver.findElement(By.xpath("//ul[@role='listbox']//li["+i+"]//div//div//p[1]"));
	listOfCities.add(cityFrom.getText());
	}
	System.out.println(listOfCities);
	String strCityFrom = "Chicago, US";
	String tempFrom = "";
	for(String strFrom : listOfCities) {
	if(strFrom.equalsIgnoreCase(strCityFrom)) {
	tempFrom = strFrom;
	}
	}
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From']")));
	WebElement sendTextFrom = driver.findElement(By.xpath("//input[@placeholder='From']"));
	sendTextFrom.sendKeys(tempFrom);
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("react-autowhatever-1-section-0-item-0")));

}}
