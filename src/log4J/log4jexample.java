package log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4jexample {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("log4jexample");
		DOMConfigurator.configure("log4j.xml");
		//PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("browser opened");
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    logger.info("email entered");
	    driver.findElement(By.id("email")).sendKeys("reemaaggarwal172@yahoo.com");
	    logger.info("exit test");
	    driver.close();

	}

}
