package seleniumLectures;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class PractiseWithSelectGetText extends Utilities{

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("http://tek-school.com/retail/");
		

		WebElement tablets= driver.findElement(By.linkText("Tablets"));
		tablets.click();
		
		WebElement DropDown= driver.findElement(By.id("input-sort"));// xpath for the box of dropdown
		
		Select Sel = new Select(DropDown);  // select class 
		Sel.selectByVisibleText("Default"); // option of by visisble text, we get first element
		
		//WebElement FirstFile= Sel.getFirstSelectedOption(); // justin case we want to print firstelement
		//System.out.println("First ELement "+ FirstFile);
		
		List<WebElement> ListOfOptions= Sel.getOptions();// store all options in list of elements
		for (WebElement WebElement:ListOfOptions) { // use for each loop to get the text of all options
			System.out.println(WebElement.getText());			
		}
		
        Thread.sleep(6000);
		
		driver.close();
		
				
				
		
		
		
		
		

			
		
		
		
		
		

	}

}
