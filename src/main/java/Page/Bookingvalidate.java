package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Projectspecification;

public class Bookingvalidate extends Projectspecification {

	
	//flight status
	
	////div[text()='Flight Status']
	//@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-19h5ruw r-1j3t67a r-1w50u8q r-ah5dr5 r-1otgn73 r-1mdsvnl']")
	//WebElement Booknowbutton ;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1v8vaea r-eqz5dr r-1d2f490 r-u8s1d r-zchlnj r-1pozq62']")
	WebElement Bookyourcharterbutton;
	
	@FindBy(xpath="//select[@id='ctl00_mainContent_ddlCashlessOrigin']")
	WebElement  Origin;
	
	@FindBy(xpath="//select[@id='ctl00_mainContent_ddlCashlessDestination']")
	WebElement Destination ;
	
	@FindBy(xpath="//input[@id='txtCashlessDatePicker']")
	WebElement  Departuredate;
	
	@FindBy(xpath="//input[@id='txtCashlessReturnDatePicker']")
	WebElement  Returndate;
	
	@FindBy(xpath="//input[@id='txtCashlessPaxCount']")
	WebElement  Noofperson;
	
	@FindBy(xpath="//input[@id='txtPDName']")
	WebElement Psgname ;
	
	@FindBy(xpath="//input[@id='txtPDEmail']")
	WebElement Email ;
	
	//Checkin
	
	@FindBy(xpath="//input[@id='txtPDMobileNumber']")
	WebElement MobileNumber ;
	
	
	@FindBy(xpath="//input[@id='txtPDCity']")
	WebElement  Cityname;
	
	@FindBy(xpath="//input[@id='txtPDTravelAgency']")
	WebElement Agencyname;
	
	@FindBy(xpath="//input[@id='txtPDLocation']")
	WebElement Location ;
	
	@FindBy(xpath="//input[@id='txtPDRemarks']")
	WebElement Remark ;
	
	@FindBy(xpath="//input[@id='btnCharterFlightSubmit']")
	WebElement Submit ;


	
	
	//@FindBy(xpath="")
	//WebElement  ;
	
	//@FindBy(xpath="")
	//WebElement  ;
	
	
	
	
	
	public Bookingvalidate(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

	//public Bookingvalidate ClickBooknowbutton() {
	//	 Booknowbutton.click();
	 //   return this ;
	
	public Bookingvalidate Clickbookyourcharterbutton() {
		Bookyourcharterbutton.click();
		    return this;
	}

	public Bookingvalidate  enterorigin(String origin) {
		Origin.sendKeys (origin);
		return this;
	}

	public  Bookingvalidate    enterdestination(String destination) {
		Destination.sendKeys (destination);
		return this;
	}

	public   Bookingvalidate  enterdeparturedate (String date) {
		Departuredate.sendKeys (date);
		return this;
		}
	
	public   Bookingvalidate  enterreturndate (String date) {
		 Returndate.sendKeys (date);
		return this;
		}
	
	public   Bookingvalidate  enternoofperson (String count) {
		Noofperson.sendKeys (count);
		return this;
		}
	
	public   Bookingvalidate  enterpsgname (String name) {
		 Psgname.sendKeys (name);
		return this;
		}
	
	
	public   Bookingvalidate  enteremail (String mail ) {
		 Email.sendKeys (mail);
		return this;
		}
	
	public   Bookingvalidate  entermobileNumber (String number ) {
		MobileNumber.sendKeys (number);
		return this;
		}
	
	public   Bookingvalidate  entercityname (String name) {
		 Cityname.sendKeys (name);
		return this;
		}
	
	public   Bookingvalidate  enteragencyname (String name) {
		Agencyname.sendKeys (name);
		return this;
		}
	
	public   Bookingvalidate  enterlocation (String name) {
		 Location.sendKeys (name);
		return this;
		}
	
	public   Bookingvalidate  enterRemark (String name) {
		 Remark.sendKeys (name);
		return this;
		}
	
	//public   Bookingvalidate  enter (String name) {
		// .sendKeys (name);
		//return this;
		//}
	
	
	
	
	
	public  Bookingvalidate  Clicksubmit() {
		Submit.click();
	    return this ;
	}
	
	
	
	
}



