package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	public static WebDriver driver;	
	public String excelFile;
	public void launch() {
		
	driver = new ChromeDriver()	;
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void Browserclose() {
		
		driver.close();
	}
	
}
