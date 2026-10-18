package doximo.org;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();

	}
	
	public static void logurl(String url) {
		driver.get(url);

	}
	
	public static void WindowsMaximize() {
		driver.manage().window().maximize();

	}
	
	public static void  typevalue(WebElement element,String name) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(name);

	}
	
	public static void login(WebElement e) {
		e.click();

	}
	
	public static void quit() {
		driver.quit();

	}

}
