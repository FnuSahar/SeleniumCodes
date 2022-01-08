package seleniumLectures;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExpediaPractiseFlight extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		
	LaunchBrowser("https://www.cheapoair.com/flights/booknow/cheap-flight-tickets?fpaffiliate=coa-google-competitor&fpsub=&utm_campaign=competitors_exact_atlas&utm_term=cheapflights&utm_term_id=kwd-13370376&utm_source={google}&utm_medium={cpc}&device=c&fpprice=&campaignID=938819657&adgroupId=55268788748&gclid=EAIaIQobChMItZuep_eT9QIVhOazCh3fFwKPEAAYASAAEgIljvD_BwE");
	
	String optiontoselect= "Barcelona ";
	
	int count=0;
	
	WebElement from= driver.findElement(By.id("from0"));
	clickWithJS();
	sendKeys(from, "BCN");
	
	List<WebElement> Cities= driver.findElements(By.xpath("//ul[@class='suggestion-box__list autoSuggest__list']//child::li"));
	
	for (WebElement webElement : Cities) {
		String currentoption= webElement.getText();
		if (currentoption.contains(optiontoselect)) {
			webElement.click();
			break;
		}
		
		
	}
		
	
	 
		 
			
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

	private static void clickWithJS() {
		// TODO Auto-generated method stub
		
	}

}
