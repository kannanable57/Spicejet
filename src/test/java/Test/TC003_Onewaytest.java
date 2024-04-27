package Test;

import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Homepage;
import Page.Oneway;

public class TC003_Onewaytest extends Projectspecification {
	
	@Test	
	public void Onewaytest ()  throws Throwable {
		
		
		Oneway obj1 = new Oneway (driver);
		
		
	obj1.ClickOnewaybutton()
		.enterDestination("Chennai")
	    .ClickDate()
	    .ClickSelectdate()
	    .ClickSearchflight()
	    .ClickContinue1( )
	    .enterFirstname("Marikannan")
	    .enterLastname("Kannan")
	    .enterMobilenum("9159592031")
	    .enterEmailaddress("kannanable57@gmail.com")
	    .Clickprimarybutton()
	    .Clickcontinue2()
	    .Clickcontinue3()
	    .entercardnumber("4591150231414285")
	    .enterNameofholder("kannan")
	    .enterExpmonth("june")
	    .enterExpyear("2024")
	    .enterCCVnumber("077")
	    .Clickproceedtopaybutton();
	    
	
	
    if(driver.getCurrentUrl().contentEquals("")) {
		
		System.out.println("PASS  : Flight booking is successful");
		
	}else {
		
		System.out.println("Fail  : Flight booking is  unsuccessful");
	}
	
	
	
	
	    
}
}