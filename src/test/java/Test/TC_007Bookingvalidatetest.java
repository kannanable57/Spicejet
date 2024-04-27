package Test;

import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Bookingvalidate;
import Page.Homepage;

public class TC_007Bookingvalidatetest extends Projectspecification {

	@Test	
	public void Bookingvalidatetest ()  throws Throwable {
		
		
		Bookingvalidate obj1 = new  Bookingvalidate(driver);
		
		
	
	//obj1.ClickBooknowbutton()
	obj1.Clickbookyourcharterbutton()	
	.enterdestination("Chennai")
	.enterorigin("Delhi")
	.enterdeparturedate("26-4-2024")
	.enterreturndate("29-4-2024")
	.enternoofperson("1")
	.enterpsgname("marikannan")
	.enteremail("kannanable57@gmail.com")
	.entermobileNumber("9159592031")
	.entercityname("Madurai")
	.enteragencyname("TVLS")
	.enterlocation("Madurai")
	.enterRemark("Thankyou for conformation booking")
	.Clicksubmit();
	
	if(driver.getCurrentUrl().contentEquals("https://corporate.spicejet.com/Charterlanding.aspx?Status=1")) {
		
		System.out.println("PASS  : Flight booking is successful");
		
	}else {
		
		System.out.println("Fail  : Flight booking is  unsuccessful");
	}
	}
	
	
}
