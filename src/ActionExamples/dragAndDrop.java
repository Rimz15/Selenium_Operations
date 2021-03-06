package ActionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().window().maximize();
	    Actions act = new Actions(driver);
	    WebElement source= driver.findElement(By.xpath("//*[@id=\"box1\"]"));
	    WebElement destination= driver.findElement(By.xpath("//*[@id=\"box103\"]"));
	    //act.clickAndHold(source).moveToElement(destination).release().build().perform();
	    act.dragAndDrop(source, destination).build().perform();
	    driver.quit();
	   

}
}
