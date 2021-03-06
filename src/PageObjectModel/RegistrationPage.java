package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	
		WebDriver driver;
		By email= By.id("email");
		By Password=By.id("pass");

		//Created a constructor
		RegistrationPage(WebDriver d)
		{
		driver=d;
		}
		
		public void enterEmail(String Email){
			driver.findElement(email).sendKeys(Email);
		}
		
		

}
