package Test;

import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Homepage;
import Page.Signup;


public class TC001_Signuptest extends Projectspecification {

	
@Test	
public void Signuptest()  throws Throwable {
	
	
Homepage obj1 = new Homepage (driver);
	
	
obj1.clickSignup()

.windowhandle()

	.ClickTittle()
	
	//.enterTittle("Mr")
	
	.enterfirstName("Marikannan")
	
	.enterlastName("Kannan")
	
	.Clickdateofbirth()
	
	.enterdateofbirth("01-06-1986")
	
	 .entertelephonenum("9159592031")
	
	.enterEmailAddress("kannanable57@gmail.com")
	
    .enterpassword("Kumar@1986")
    
    .enterconfirmpassword("Kumar@1986")
    
    .Clickcheckbox()
     
    .ClickSubmitButton();
 
 
}
	
	
}
	
	
	

