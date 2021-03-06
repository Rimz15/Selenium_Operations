package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage2 {
	
	WebDriver driver;
	
	RegistrationPage2(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
	
//	@FindBy(how=How.ID,using="email") //Syntax1
//	WebElement email;
	
	@FindBy(id = "email") //Syntax2
	WebElement email;
	
	public void enterEmail(String Email){
		email.sendKeys(Email);
	}
	
}
