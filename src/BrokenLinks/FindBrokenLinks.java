package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindBrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.brokenlinkcheck.com/find-broken-links.php");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    List<WebElement> links= driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
        for(int i=0;i<=links.size();i++) {
        	WebElement element=links.get(i);
        	String url = element.getAttribute("href");
        	URL link = new URL(url);
        	HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
        	Thread.sleep(20000);
        	httpconn.connect();
        	Thread.sleep(20000);
        	int statuscode = httpconn.getResponseCode();
        	if(statuscode>=400) {
        		System.out.println(url+""+"broken link");
        	}
        	else {
        		System.out.println(url+""+"valid link");
        		
        	}
        	
        }
	}

}
