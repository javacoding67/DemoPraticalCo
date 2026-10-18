package doximo.org;

import org.openqa.selenium.WebElement;

public class SampleMain extends Base{

	public static void main(String[] args) {
		launchBrowser();
		
		WindowsMaximize();
		
		logurl("https://www.demoblaze.com/");
		
		PlainObject l=new PlainObject();
		login(l.getLogIn());
		
		typevalue(l.getTxtUser(),"yoga123");
		
		typevalue(l.getPassWord(),"Yoga@123");
		
		login(l.getClkUser().get(0));
		

	}

}
