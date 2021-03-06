package ActionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/resizable/");
	    driver.manage().window().maximize();
	    Actions act = new Actions(driver);
        driver.switchTo().frame(0);
        WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        act.moveToElement(resizable).dragAndDropBy(resizable, 300, 0).build().perform();

	}

}
