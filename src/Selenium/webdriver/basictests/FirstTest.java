package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest  {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdrver.firefox.marionette", value);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String expected = "Facebook – log in or sign up";
		String actual = driver.getTitle();
		System.out.println(actual);
		if(expected.equals(actual)==true) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
	
		}
		
		
		
		

	}


