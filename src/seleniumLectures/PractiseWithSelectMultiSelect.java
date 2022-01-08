package seleniumLectures;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class PractiseWithSelectMultiSelect extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		
		WebElement ListBox= driver.findElement(By.name("cars"));
		Select Sel= new Select(ListBox);
		
		//below is way with method multiple
		
//		Select Cars=new Select(driver.findElement(By.name("cars")));
//		boolean multiple=Cars.isMultiple();
//		if(multiple==true) {
//			Cars.selectByIndex(0);
//			Cars.selectByValue("opel");
//			Cars.selectByVisibleText("Audi");
//		}
//		List<WebElement> SelCars1= Sel.getAllSelectedOptions();// get all selected option text, we store in list of WE
//		for(WebElement SelectedOptionsList: SelCars1) {
//		System.out.println(SelectedOptionsList.getText());
//	}
//		
//		List<WebElement> allCars1= Sel.getOptions(); //get all option selected text, store in List of WE
//		for (WebElement allCarsOption : allCars1) {
//		System.out.println(allCarsOption .getText());
		
		
		
		
		Sel.selectByIndex(0);
		Sel.selectByValue("opel");
		Sel.selectByVisibleText("Audi");
		Thread.sleep(5000);
		
		Sel.deselectByIndex(0); // deselect the element by index
	
		
		Thread.sleep(5000);
		
		List<WebElement> SelCars= Sel.getAllSelectedOptions();// get all selected option text, we store in list of WE
		for(WebElement SelectedOptionsList: SelCars) {
		System.out.println(SelectedOptionsList.getText());
		
		//or we can use for loop
		
		for (int i = 0; i < SelCars.size(); i++) {
			String text=SelCars.get(i).getText();
			System.out.println(text);
		}
	}
		
		List<WebElement> allCars= Sel.getOptions(); //get all option selected text, store in List of WE
		for (WebElement allCarsOption : allCars) {
		System.out.println(allCarsOption .getText());
		
	}	
		
	
		Thread.sleep(5000);
		driver.close();
		
	}

}
