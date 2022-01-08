package seleniumLectures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		LaunchBrowser("https://www.amazon.com/");
		WebElement bestSeller = driver.findElement(By.linkText("Best Sellers"));
		WebElement textBox= driver.findElement(By.id("twotabsearchtextbox"));
		sendKeys(textBox," Best Laptops");
		// scrollDownPage();
		
		driver.close();

	}

	public static void Screenshots(String filename) throws IOException {

		String path = ".\\screenshots";
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path + filename + ".png"));
	}

	public static void LaunchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);

	}

	public static void ClickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void Highlight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", element);

	}

	public static void highlightElementBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'", element);
	}

	public static void highlightandborder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow')", element);

	}
	public static void scrollDownPage() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void sendKeys(WebElement element, String value) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+value+"'",element);
	}
	
	
	
	
	
}
