package cookieTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CookiesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    Set <Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie:cookies){
			System.out.println(cookie.getName()+" "+cookie.getValue());
		}
		System.out.println(driver.manage().getCookieNamed("session-id"));
		
		//add cookie
		Cookie cobj = new Cookie("Mycookie1234", "1234567890");//add cookie
		driver.manage().addCookie(cobj);
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie:cookies){
			System.out.println(cookie.getName()+" "+cookie.getValue());
		}
		
		//delete cookie
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		driver.close();

	}

}
