package jsDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
//		javascriptUtil.flash(element, driver);
//		javascriptUtil.drawborder(element, driver);
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File("C:\\Users\\Public\\artifact_environment\\Selenium\\screenshot\\twoplug.png"));
		//System.out.println(driver.getTitle());
//		String title= javascriptUtil.getTitleByJS(driver);
//		System.out.println(title);
		javascriptUtil.clickElementByJS(element, driver);
		javascriptUtil.generateAlert(driver,"You clicked on button..");
		javascriptUtil.refreshPage(driver);
		
}
}
