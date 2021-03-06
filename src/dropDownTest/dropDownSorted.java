package dropDownTest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropDownSorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
        WebElement drop = driver.findElement(By.id("animals"));
        Select se = new Select(drop);
        List originallist = new ArrayList();
        List <WebElement>options = se.getOptions();
        for(WebElement e:options) {
        	originallist.add(e.getText());
        }
        
        System.out.println(originallist);
        List templist = new ArrayList();
        templist = originallist;
        System.out.println("Before sorting" + templist);
        Collections.sort(templist);
        System.out.println("After sorting" + templist);
        if(originallist == templist) {
        	System.out.println("dropdown sorted");
        }
        else {
        	System.out.println("dropdown not sorted");
        	
        }
	}

}
