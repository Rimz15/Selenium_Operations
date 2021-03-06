package EncodeAndDecode;

import org.apache.commons.net.util.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWithEncryptedPassword {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("reemaaggarwal172@yahoo.com");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(decodedvalue("dGVzdDEyMw=="));
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

	}
	static String decodedvalue(String Password){
		byte[] decoded=Base64.decodeBase64(Password);
		return(new String(decoded));
		
	}
	
	

}
