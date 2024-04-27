package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.Utility;


public class Projectspecification  extends Utility {
	@BeforeMethod
	public  void  browserLaunch() {

		launch();
	}
		
		@AfterMethod 
		public void closeBrowser() {
			
			//Browserclose();
		}
}
