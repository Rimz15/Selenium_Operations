package assertions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;


public class Test_SoftAssertion {
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void demoTest2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    String expTitle = "Facebook – log in or sign up";
	    softassert.assertEquals(expTitle, driver.getTitle());
	    WebElement emailId=driver.findElement(By.id("email"));
	    //Assert.assertTrue(emailId.isDisplayed());
	    softassert.assertFalse(emailId.isDisplayed()); //for this condition will be failed but other statemnts will execute
	    emailId.sendKeys("reemaaggarwal172@yahoo.com");
		softassert.assertAll();
		
		
		
	}

}
