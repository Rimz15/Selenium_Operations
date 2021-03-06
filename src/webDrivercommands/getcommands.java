package webDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcommands {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdrver.firefox.marionette", value);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		String actual = driver.getTitle();
		System.out.println(actual);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String text = driver.findElement(By.xpath("//div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td")).getText();
		System.out.println(text);
		driver.close();
		

}
}
