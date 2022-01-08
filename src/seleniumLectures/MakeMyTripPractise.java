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

public class MakeMyTripPractise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sahar\\eclipse-workspace\\seleniumLectures\\folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement RadioButton = driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		Boolean Displayed = RadioButton.isDisplayed();
		Boolean Enabled = RadioButton.isEnabled();
		Boolean Selected = RadioButton.isSelected();
		System.out.println(Displayed);
		System.out.println(Enabled);
		System.out.println(Selected);
		RadioButton.click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2));

		WebElement from = driver
				.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']//span[text()='From']"));
		from.click();

//        WebElement cityfrom= driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-16']"));
//        cityfrom.click();

		List<String> Cities = new ArrayList<String>();

		for (int i = 1; i <= 20; i++) {
			WebElement cityfrom = driver.findElement(By.xpath("//ul[@role='listbox']//li[" + i + "]//div//div//p[1]"));
			// i number then we get only on city , if 2 then another city, that is why we use i to
			// get all the cities
			Cities.add(cityfrom.getText());
			System.out.println("CityFrom" + cityfrom.getText());

		} String StrCityFrom="Chicago, US";
		String tempfrom="";
		
		for (String Strfrom: Cities) {
			if(Strfrom.equalsIgnoreCase(StrCityFrom)) {
				tempfrom=Strfrom;
			}}
			WebElement sendtext=driver.findElement(By.xpath("//input[@placeholder='From']"));
			sendtext.sendKeys(tempfrom);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul//li[@id='react-autowhatever-1-section-0-item-0']")));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-autowhatever-1-section-0-item-0")));
			//WebElement SelectCityFrom= driver.findElement(By.xpath("//ul//li[@id='react-autowhatever-1-section-0-item-0']"));
			WebElement SelectCityFrom= driver.findElement(By.xpath("react-autowhatever-1-section-0-item-0"));
		    SelectCityFrom.click();
		
		

//        System.out.println(Cities);

//        WebElement to=driver.findElement(By.xpath("//div[@class='fsw_inputBox searchToCity inactiveWidget ']//span[text()='To']"));
//      to.click();
//      
//      List<String> CitiesTo= new ArrayList<String>();
//      for (int i = 1; i <=20; i++) {
//    	  WebElement CityTo= driver.findElement(By.xpath("//ul[@role='listbox']//li["+i+"]//p[1]"));
//		System.out.println("Cityto "+ CityTo.getText());}

		Thread.sleep(4000);
		driver.close();

	

}}
