package doximo.org;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PoBaseClass {
	
	public static WebDriver driver;
	
	public static void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();

	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void loadUrl(String Url) {
		driver.get(Url);

	}
	
	public static void typevals(WebElement elemt,String name) {
		
//       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOf(elemt));
//		elemt.clear();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(elemt));
		elemt.clear();
		elemt.sendKeys(name);

	}
	
	public static void clk(WebElement e) {
		e.click();

	}

}
