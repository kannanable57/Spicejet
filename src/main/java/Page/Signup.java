package Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Projectspecification;




public class Signup extends Projectspecification{

	//@FindBy(xpath="//div[text()='Signup']")
	//WebElement Signup;
	
	@FindBy(xpath =" //select[@class='form-control form-select ']")
	WebElement TitleButton ;
	
	@FindBy(xpath ="//input[@id='first_name'] ")
	WebElement firstname ;
	
	@FindBy(xpath =" //input[@id='last_name']")
	WebElement lastname ;
	
	@FindBy(xpath ="//input[@id='dobDate'] ")
	WebElement dateofbirth ;
	
	
	
	@FindBy(xpath ="//input[@type='tel'] ")
	WebElement telephonenum ;
	
	@FindBy(xpath ="//input[@id='email_id']")
	WebElement emailaddress ;
	
	@FindBy(xpath ="//input[@id='new-password']")
	WebElement password ;
	
	@FindBy(xpath ="//input[@id='c-password']")
	WebElement conformpassword;
	
	
	
	@FindBy(xpath ="//input[@id='defaultCheck1']")
	WebElement checkboxButton;
	
	
	@FindBy(xpath ="//button[text()='Submit']")
	WebElement SubmitButton;
	
	
	public Signup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
	//public Signup clicksignup() {
		//Signup.click();
		//return  this;
	
	public  Signup windowhandle() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstwindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwindow.get(1));
		return this;
	}
	
	public  Signup ClickTittle() {
		 TitleButton.click();
		return this;
	}
	
	//sendkeys 
	
		public  Signup enterfirstName(String fstname) {
			firstname.sendKeys (fstname);
			return this;
		}
		
		public  Signup enterlastName(String lsname) {
			lastname.sendKeys(lsname);
			return this;
		}
        
		
		
		public  Signup Clickdateofbirth() {
			dateofbirth.click();
			return this;
		}
		
		
		public  Signup  enterdateofbirth (String datebirth) {
			dateofbirth.sendKeys(datebirth);
			return this;
		}
		
		
		public  Signup entertelephonenum(String num) {
			telephonenum.sendKeys(num);
			return this;
		}
		
		
		public  Signup  enterEmailAddress(String mail) {
			 emailaddress.sendKeys(mail);
			return this;
		}
		
		public  Signup enterpassword(String pass) {
			 password.sendKeys (pass);
			return this;
		}
		public  Signup enterconfirmpassword(String confirmpass) {
			conformpassword.sendKeys (confirmpass);
			return this;
		}
		
		public  Signup Clickcheckbox() {
			checkboxButton.click();
			return this;
		}
			public  Signup ClickSubmitButton() {
				SubmitButton.click();
				return new  Signup(driver);
			}

			
		
	}
	
	
	


	

