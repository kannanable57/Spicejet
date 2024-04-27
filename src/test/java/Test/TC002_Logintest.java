package Test;

import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Homepage;
import Page.Login;



public class TC002_Logintest extends Projectspecification{
	@Test
	public void LoginTest() {
	  
	Homepage obj1	=new Homepage(driver);
	    
	obj1.clickLogin()
	
	.clickemailradiobutton()
	
	.entermail("kannanablle57@gmail.com")
	
	.enterpass("Kumar@1986")
	
	.clickLogInButton();
	
}
}