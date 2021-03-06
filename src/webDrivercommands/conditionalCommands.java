package webDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalCommands {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement uname=driver.findElement(By.name("email"));
		WebElement pwd=driver.findElement(By.name("pass"));
		if((uname.isDisplayed()) && (uname.isEnabled())){
			uname.sendKeys("mercury");
			}
		if((pwd.isDisplayed()) && (pwd.isEnabled())){
			pwd.sendKeys("mercury");
			}
		System.out.println(driver.findElement(By.xpath("//*[@id='u_0_6']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id='u_0_7']")).isSelected());
		if(driver.findElement(By.xpath("//*[@id='u_0_6']")).isSelected()==false) {
			driver.findElement(By.xpath("//*[@id='u_0_6']")).click();
		}
		

}
}
