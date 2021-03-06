package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		for(int i =5;i>=1;i--) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			String m = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(m.equals("October")) {
				driver.findElement(By.linkText("19")).click();
				break;
			}
			
			
		}

	}

}
