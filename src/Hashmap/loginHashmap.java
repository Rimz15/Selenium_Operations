package Hashmap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginHashmap {
	
	static HashMap<String, String>logindata(){
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("x", "reemaaggarwal172@yahoo.com@mercury");
		hm.put("y", "reemaaggarwal32@yahoo.com@mercury");
		hm.put("z", "reemaaggarwal17@yahoo.com@mercury");
		return hm;
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    String credentials=logindata().get("x");
	    String arr[]=credentials.split("@");
	    driver.findElement(By.id("email")).sendKeys(arr[0]);
	    driver.findElement(By.id("pass")).sendKeys(arr[1]);
	   

	}

}
