package doximo.org;

import java.time.Duration;
import java.util.Date;

import org.jspecify.annotations.Nullable;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassADemo {
	
	
	@Test
	public void tc1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("login2"));
		element.click();
		
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	     WebElement txtUser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		txtUser.sendKeys("yoga123");
		
		
		String attribute = txtUser.getAttribute("value");
		
		Assert.assertEquals("verify", "yoga123", attribute);
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
	     WebElement txtpass = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
	     txtpass.sendKeys("Yoga@123");
		
		String attribute2 = txtpass.getAttribute("value");
		
		Assert.assertEquals("verifypass", "Yoga@123",attribute2);
		
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
		
		
		String title = driver.getTitle();
		boolean contains = title.contains("STORE");
		Assert.assertTrue(contains);
		
		
		
		
	

	}
	
	
}	

	
		
	

