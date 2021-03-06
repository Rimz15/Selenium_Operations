package alertpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchbetweenalerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	    //switch to alert
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().dismiss();
	    System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
	    driver.findElement(By.xpath("//div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
	    driver.switchTo().alert().sendKeys("Reema");
	    driver.switchTo().alert().accept();
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText());
	    driver.close();
	    

	}

}
