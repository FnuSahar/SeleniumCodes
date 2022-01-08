package seleniumLectures;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class ActionClass {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement SearchBar = driver.findElement(By.id("twotabsearchtextbox"));
			Actions action = new Actions(driver);
			action.moveToElement(SearchBar)
			.keyDown(SearchBar,Keys.SHIFT)
			.sendKeys(SearchBar," Selenium")
			.keyDown(SearchBar, Keys.SHIFT)
			.build().perform();
			
			Thread.sleep(3000);
			driver.close();
		}

	}



