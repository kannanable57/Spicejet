package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Projectspecification;



public class Homepage extends Projectspecification {

	@FindBy(xpath="//div[text()='Signup']")
	WebElement Signup;


   @FindBy(xpath="//div[text()='Login']")
    WebElement Login;


















public Homepage(WebDriver driver) {
    this.driver = driver;
PageFactory.initElements(driver, this);    
}

public Signup clickSignup() {
	Signup.click();
	return new Signup (driver); 
}
    


public Login  clickLogin()  { 
   Login.click();
    return new Login (driver);
   
}



}