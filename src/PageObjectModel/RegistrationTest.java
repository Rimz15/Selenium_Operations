package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

	
	@Test
	
	public void verifyfacebook() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		RegistrationPage2 page  = new RegistrationPage2(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    if(page.email.isDisplayed()){
	    	page.enterEmail("reemaaggarwal172@yahoo.com");	    }
	    else{
	    	System.out.println("fail");	
	    }
	    driver.close();
	}
}