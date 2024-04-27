package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Projectspecification;

public class Oneway  extends Projectspecification {

	//@FindBy(xpath="//div[@data-testid='one-way-radio-button']")
	//WebElement onewaybutton ;
	
	
	
	@FindBy(xpath="//div[text()='one way']")
	WebElement onewaybutton ;
	
	
	@FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")
	WebElement From ;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement Destination;
	
	
	@FindBy(xpath="//div[text()='Departure Date']")
	WebElement date ;
	
	
	@FindBy(xpath="(//div[text()='6'])[1]")
	WebElement Selectdate ;
	
	
	@FindBy(xpath="//div[text()='Search Flight']")
	WebElement Searchflight;

	@FindBy(xpath="(//div[text()='Continue'])[1]")
	WebElement Continue1 ;

	@FindBy(xpath="//div[@data-testid='title-contact-detail-card']")
	WebElement  Title;

	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement Firstname ;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	WebElement Lastname ;
	
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-c20mna r-poiln3 r-1enofrn r-1kfrs79 r-1g94qm0']")
	WebElement Mobilenum ;
	
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]")
	WebElement Emailaddress ;
	
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
	WebElement Cityname;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41'])[5]")
	WebElement Primarybutton ;
	
	
	//@FindBy(xpath="(//input[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	//WebElement Phonenumber ;
	
	
	
	@FindBy(xpath="//div[text()='Continue']")
	WebElement Continue2 ;
	
	
	@FindBy(xpath="//div[text()='Continue']")
	WebElement Continue3  ;
	
	@FindBy(xpath="//input[@id='card_number']")
	WebElement cardnumber ;
	
	
	@FindBy(xpath="//input[@id='name_on_card']")
	WebElement Nameofholder ;
	
	@FindBy(xpath="//input[@id='card_exp_month']")
	WebElement Expmonth ;
	
	@FindBy(xpath="//input[@id='card_exp_year']")
	WebElement Expyear ;
	
	@FindBy(xpath="//input[@id='security_code']")
	WebElement CCVnumber ;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement Proceedtopaybutton;
	
	
	
public Oneway(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}

public Oneway ClickOnewaybutton() {
    onewaybutton.click();
    return this ;
}

public  Oneway enterfrom(String from) {
	From.sendKeys (from);
	return this;
}

public  Oneway enterDestination(String to) {
	Destination.sendKeys (to);
	return this;
}

public Oneway  ClickDate() throws InterruptedException {
	date.click();
	Thread.sleep(20000);
	return this;
	}


	public Oneway  ClickSelectdate() throws InterruptedException {
		Actions ac = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Selectdate));
		ac.click(Selectdate).perform();
		return this;
	}		


public  Oneway  ClickSearchflight () {
	Searchflight.click ();
	return this;
}


//nextpage

public  Oneway  ClickContinue1( ) {
	 Continue1.click ();
	return this;
}



public  Oneway enterFirstname(String name) {
	Firstname.sendKeys (name);
	return this;
}
 

public  Oneway enterLastname(String name ) {
	 Lastname.sendKeys ();
	return this;
}

public  Oneway enterMobilenum(String num) {
	Mobilenum.sendKeys ();
	return this;
}

public  Oneway enterEmailaddress(String add ) {
	 Emailaddress.sendKeys ();
	return this;
}


public  Oneway enterCityname(String name  ) {
	Cityname.sendKeys (name);
	return this;
}

public Oneway Clickprimarybutton() {
	Primarybutton.click();
    return this ;
}

public  Oneway  Clickcontinue2( ) {
	 Continue2.click ();
	return this;
}


//Nextpage

public  Oneway  Clickcontinue3( ) {
	 Continue3.click ();
	return this;
}


//Nextpage

public  Oneway entercardnumber(String str ) {
	cardnumber.sendKeys(str);
	return this;
}
public  Oneway enterNameofholder(String name  ) {
	Nameofholder.sendKeys(name);
	return this;
}

public  Oneway enterExpmonth(String month ) {
	 Expmonth.sendKeys(month);
	return this;
}


public  Oneway enterExpyear(String year ) {
	Expyear.sendKeys( year );
	return this;
}


public  Oneway enterCCVnumber(String num ) {
    CCVnumber.sendKeys(num);
	return this;
}



public Oneway Clickproceedtopaybutton() {
	Proceedtopaybutton.click();
    return this ;
}

}




