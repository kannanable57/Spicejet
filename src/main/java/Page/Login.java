package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Projectspecification;


public class Login extends Projectspecification{
	
	@FindBy(xpath ="//div[@class='css-1dbjc4n r-1v8vaea r-eqz5dr r-1d2f490 r-u8s1d r-zchlnj r-1pozq62']")
	WebElement Login ;
	
	@FindBy(xpath="//div[text()='Email']")
    WebElement emailradiobutton;
	
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement LogInButton;
	
	//@FindBy(xpath="")
	//WebElement goToHomePage;
	
	public Login(WebDriver driver) {
		this.driver = driver;
	   PageFactory.initElements(driver, this);
	}
	
	public Login clickemailradiobutton() {
		emailradiobutton.click();	
		return this;
		
	}
	public  Login entermail(String mail){
	  email.sendKeys(mail);
	  return this;
	}   
	
	public  Login enterpass(String pass){
		  password.sendKeys(pass);
		  return this;
		}   
	
	public Homepage clickLogInButton() {
		LogInButton.click();
	   return new Homepage(driver);
	   
	}																				
   }

	
	

