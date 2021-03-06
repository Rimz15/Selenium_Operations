package assertions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Test1 {

	@Test
	public void demoTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    String expTitle = "Facebook – log in or sign up";
	    Assert.assertEquals(expTitle, driver.getTitle());
	    WebElement emailId=driver.findElement(By.id("email"));
	    Assert.assertTrue(emailId.isDisplayed());
	    //Assert.assertFalse(emailId.isDisplayed()); //for this condition will be failed
	    emailId.sendKeys("reemaaggarwal172@yahoo.com");
	    Thread.sleep(2000);
	    driver.close();
	   
	}
}