package doximo.org;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoBasepra {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();

	}
	
	public static void launchurl(String url) {
		driver.get(url);

	}
	
	public static void types(WebElement element,String name) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
//      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOf(element));
//		element.clear();
		element.sendKeys(name);

	}
	
	public static void btnLogn(WebElement e) {
		e.click();

	}
	
	public static void quit() {
		driver.quit();

	}

}
