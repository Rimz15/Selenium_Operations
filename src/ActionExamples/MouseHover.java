package ActionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class MouseHover {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://smallbizclub.com/technology/ecommerce/12-hover-features-your-b2c-site-is-looking-for/");
	    driver.manage().window().maximize();
	    Actions act = new Actions(driver);
	    WebElement Leadership= driver.findElement(By.xpath("//*[@id=\"menu-item-17146\"]/a/span"));
	    WebElement communication= driver.findElement(By.xpath("//*[@id=\"menu-item-46022\"]/a/span"));
	    act.moveToElement(Leadership).build().perform();
	    act.moveToElement(communication).click().build().perform();
	    //code optimization can use one statement
//	    act.moveToElement(Leadership).moveToElement(communication).click().build().perform();

}
}