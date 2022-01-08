package seleniumLectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PractiseWithSelect extends Utilities{

	public static void main(String[] args) throws InterruptedException {
		
		LaunchBrowser("http://tek-school.com/retail/");
		WebElement tablets= driver.findElement(By.linkText("Tablets"));
		tablets.click();
		
		WebElement DropDown= driver.findElement(By.id("input-sort"));
		Select dropSel= new Select(DropDown);
		
		//dropSel.selectByIndex(0); //1st way by index
		dropSel.selectByVisibleText("Name (Z - A)");//second way by visible text
		//dropSel.selectByValue(null); //third way with value if available and unique
		
		
		
		WebElement DropDown2= driver.findElement(By.id("input-limit"));
		Select dropSel2= new Select(DropDown2);
		dropSel2.selectByVisibleText("50");
		
		//we can use below way to we write and xpath for select class and then /option we can use value, text or or 
		//index [2] like below 
		//driver.findElement(By.xpath("//Select[@id='input-limit']/option[text()='50']"));
		//driver.findElement(By.xpath("//Select[@id='input-limit']/option[2]"));
		//driver.findElement(By.xpath("//Select[@id='input-limit']/option[@value='']")); if available not unique for this ex
			
		
		
		
		
		Thread.sleep(6000);
		
		driver.close();

	}

}
