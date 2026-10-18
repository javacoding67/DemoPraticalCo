package doximo.org;

import org.openqa.selenium.WebElement;

public class MainDemoPra extends demoBasepra{

	public static void main(String[] args) {
		launchBrowser();
		
		maximizeWindow();
		
		launchurl("https://www.demoblaze.com/");
		
		PojoDemoPra l=new PojoDemoPra();
		
		btnLogn(l.getLogIn());
		
		types(l.getTxtUser(),"yoga123");
		
		types(l.getPassWord(),"Yoga@123");
		
		btnLogn(l.getClk().get(0));

	}

}
