package seleniumLectures;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PractiseDropdownWithNoSelect extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("https://www.amazon.com/");
		
		WebElement bestSellers = driver.findElement(By.linkText("Best Sellers"));
		//WebElement books = driver.findElement(By.linkText("Books"));
		//books.click();
		bestSellers.click();
		
		//List<WebElement> allItems= driver.findElements(By.xpath("//a[text()='Amazon Devices & Accessories']"));
		List<WebElement> allItems= driver.findElements(By.xpath("//div[@role='group']//following-sibling::div"));
		//List<WebElement> allItems= driver.findElements(By.xpath("//div[@class='left_nav browseBox']//ul//li"));
		//List<WebElement> allItems= driver.findElements(By.xpath("//div[@class='left_nav browseBox']//self::ul"));
		//List<WebElement> allItems= driver.findElements(By.xpath("//div[@class='left_nav browseBox']//following-sibling::ul"));
		//List<WebElement> allItems= driver.findElements(By.xpath("//div[@class='left_nav browseBox']//descendant::ul"));
		//List<WebElement> allItems= driver.findElements(By.xpath("//div[@class='left_nav browseBox']//child::ul"));
		//List<WebElement> allItems= driver.findElements(By.xpath("//div[@class='left_nav browseBox']//perceding-siblings::ul"));
		List<String> Items= new ArrayList<String>();
		for (int i = 0; i < allItems.size(); i++) {
			Items.add(allItems.get(i).getText());
			System.out.print(","+ allItems.get(i).getText());}	
		System.out.println();
		System.out.println(Items);
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		}
		
		

	}


