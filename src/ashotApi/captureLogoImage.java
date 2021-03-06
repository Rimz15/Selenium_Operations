package ashotApi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class captureLogoImage {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    WebElement logo = driver.findElement(By.xpath("//*[@id='nav-logo']/a/span[1]"));
	    Thread.sleep(2000);
	    Screenshot logoimagescreenshot=new AShot().takeScreenshot(driver,logo);
	    ImageIO.write(logoimagescreenshot.getImage(),"png",new File("C://Users/Public/artifact_environment/Selenium/Ashot/logo.png"));
	    File f = new File("C://Users/Public/artifact_environment/Selenium/Ashot/logo.png");
	    if (f.exists()){
	    	System.out.println("image file exist");
	    }
	    	else{
	    		System.out.println("image file not exist");
	    	}
	    }

	}


