package ActionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	    driver.manage().window().maximize();
	    Actions act = new Actions(driver);
	    WebElement rightClick= driver.findElement(By.xpath("//div/section/div/div/div/p/span"));
	    WebElement copy= driver.findElement(By.xpath("//ul/li[3]/span"));
	    act.contextClick(rightClick).build().perform();
	    copy.click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    driver.close();
	    

	}

}
