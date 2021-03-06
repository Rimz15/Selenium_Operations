package UploadFileSikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException, FindFailed {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@class='file_upload']")).click();
    String imagesfilepath="C:\\Users\\Public\\artifact_environment\\Selenium\\sikuli_upload\\";
    String inputfile = "C:\\Users\\Public\\artifact_environment\\Selenium\\sikuli_upload\\";
    Screen s = new Screen();
    Pattern fileInputTextbox = new Pattern(imagesfilepath+"FileUpload.PNG");
    Pattern openbutton = new Pattern(imagesfilepath+"Open_button.PNG");
    Thread.sleep(5000);
    s.wait(fileInputTextbox,20);
    s.type(fileInputTextbox,inputfile+"a1.jpg");
    s.click(openbutton);
}
}
