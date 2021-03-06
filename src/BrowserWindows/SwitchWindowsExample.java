package BrowserWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		String title=driver.getTitle();
		System.out.println(title);
		Set <String> s = driver.getWindowHandles();
		for(String i : s) {
			String t= driver.switchTo().window(i).getTitle();
			System.out.println(t);
			if(t.contains("Sakinalium | Home")) {
				driver.close();
			}
			
		}
		
		

	}

}
