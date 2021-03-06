package ashotApi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImages {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    WebElement logo = driver.findElement(By.xpath("//*[@id='nav-logo']/a/span[1]"));
	    Thread.sleep(2000);
	    BufferedImage expectedimage=ImageIO.read(new File("C://Users/Public/artifact_environment/Selenium/Ashot/logo.png"));
	    Screenshot logoimagescreenshot=new AShot().takeScreenshot(driver,logo);
	    BufferedImage actualImage=logoimagescreenshot.getImage();
	    ImageDiffer imgDiff = new ImageDiffer();
	    ImageDiff diff = imgDiff.makeDiff(expectedimage, actualImage);
	    if(diff.hasDiff()==true)
	    {
	    	System.out.println("images are same");
	    }
	    else{
	    	System.out.println("images are not same");
	    }
	    
	    driver.quit();

	}

}
