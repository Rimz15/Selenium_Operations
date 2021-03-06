package Headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlUnitheadless {
	
	public static void main(String[] args) throws InterruptedException {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("headless");
		String actual = driver.getTitle();
		System.out.println(actual);
		
	}
	}


