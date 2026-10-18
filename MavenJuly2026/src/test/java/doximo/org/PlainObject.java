package doximo.org;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlainObject extends Base {
	
	public PlainObject() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="login2")
	private WebElement logIn;

	@FindBy(id="loginusername")
	private WebElement txtUser;
	
	@FindBy(id="loginpassword")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@onclick='logIn()']")
	private List<WebElement>clkUser;

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public List<WebElement> getClkUser() {
		return clkUser;
	}
	
}
