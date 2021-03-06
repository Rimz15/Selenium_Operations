package FileDownload;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DownloadFileWebDriver {
	
	public static void main(String[] args) {
		//download files using required location
		HashMap<String, Object> chromeprefs=new HashMap<String,Object>();
		chromeprefs.put("profile.default_content_settings.popups",0);
		chromeprefs.put("download.prompt_for_download","false");
		chromeprefs.put("downlaod.default_directory","C:\\Downloadfiles");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromeprefs);
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY,options);
		
		System.setProperty("webdriver.chrome.driver","C://Users//Public//artifact_environment//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);
	    driver.get("http://demo.automationtesting.in/FileDownload.html");
	    driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Testing");
        driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();
        
        if (isFileExist("C://Downloadfiles//info.txt")){
        System.out.println("file exist");	
        }
        else
        {
        	System.out.println("file not exist");
        }
        
        driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("Testing");
        driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();
       
        
}
	
	static boolean isFileExist(String path){
		File f = new File(path);
		if(f.exists()){
		return true;
		}
		else{
		return false;
		}
		
	}
}
