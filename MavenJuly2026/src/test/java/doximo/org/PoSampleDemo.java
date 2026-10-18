package doximo.org;

import org.openqa.selenium.WebElement;

public class PoSampleDemo extends PoBaseClass{

	public static void main(String[] args) {
		LaunchBrowser();
		
		maximizeWindow();
		
		loadUrl("https://www.demoblaze.com/");
		
		PojaBaseClassDemo l=new PojaBaseClassDemo();
		
		clk(l.getLogIn());
		
		typevals(l.getTxtUser(),"yoga123");
		
		typevals(l.getPassWord(),"Yoga@123");
		
		clk(l.getClk().get(0));

	}

}
