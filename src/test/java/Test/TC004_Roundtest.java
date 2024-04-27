package Test;

import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Homepage;
import Page.Roundtrip;

public class TC004_Roundtest extends Projectspecification  {

	public class TC003_Roundtest extends Projectspecification {
		
		@Test	
		public void Roundtest ()  throws Throwable {
			
			
		Roundtrip obj1 = new Roundtrip (driver);
			
		obj1.ClickRoundbtripbutton()
		.enterDestination("Chennai")
	    .ClickDeparturedate()
	    .enterSelectdate("10-05-2024")
	    . ClickReturnDate()
	    .enterSelectdate1("15-05-2024")
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
			
			
		
		
	}
	}
	
	
}
