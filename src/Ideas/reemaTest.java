package Ideas;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import assertions.Test1;

public class reemaTest{
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://wanikirtesh.github.io");
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement filter =driver.findElement(By.id("selDetails"));
		
		WebElement reportbtn =driver.findElement(By.id("btnGen"));
		Select Filters = new Select(filter);
		Filters.selectByValue("department");
		Filters.selectByValue("region");
		
		WebElement department =driver.findElement(By.id("fltdepartment"));
		Select Department = new Select(department);
		Department.deselectAll();
		Department.selectByVisibleText("Marketing");
		
		WebElement region =driver.findElement(By.id("fltregion"));
		Select Region = new Select(region);
		Region.deselectAll();
		Region.selectByVisibleText("UAE");
		
		reportbtn.click();
		
		Set<String> allHandles = driver.getWindowHandles();
		 Thread.sleep(5000);
		 System.out.println("Count of windows:"+allHandles.size()); 
		

		String currentWindowHandle = allHandles.iterator().next();
	   

	    //Remove first/default Handle
	    allHandles.remove(allHandles.iterator().next());
//
//	    //get the last Window Handle
	    String lastHandle = allHandles.iterator().next();
//	    
//	    //switch to second/last window, because we know there are only two windows 1-parent window 2-other window(ad window)
	driver.switchTo().window(lastHandle);
	    System.out.println(driver.getTitle());
	    
//	   List <WebElement> rptable =driver.findElements(By.xpath("//table[@id='rpt']/tbody/tr"));
//	   int ctr=0;
//	   if(rptable.size()==9)
//	   {
//		   System.out.println(rptable.size());
//		   System.out.println("Pass");
//	   }
//	   for(int i=1;i<=rptable.size();i++)
//	   {
//		  
//		   if(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr["+i+"]/td[7]/input")).isSelected())
//		   {
//			   ctr++;
//		   }
//	   }
//	   if(ctr==4)
//	   {
//		   System.out.println("table has "+rptable.size()+" rows out of which "+ctr+" is checked");
//		   System.out.println("Pass");
//	   }
//	   List <WebElement> tbrow =driver.findElements(By.xpath("//table[@id='rpt']/tbody/tr[4]/td"));
//	   for(int j=1;j<=tbrow.size(); j++)
//	   {
//		   
//		   if(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText().equalsIgnoreCase("4") )
//		   {
//			   System.out.println(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText());
//			   System.out.println("Pass");
//		   }
//		   else if(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText().equalsIgnoreCase("Chetan Patel"))
//		   {
//			   System.out.println(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText());
//			   System.out.println("Pass");
//		   }
//		   else if(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText().equalsIgnoreCase("Marketing"))
//		   {
//			   System.out.println(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText());
//			   System.out.println("Pass");
//		   }
//		   else if(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText().equalsIgnoreCase("UAE"))
//		   {
//			   System.out.println(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText());
//			   System.out.println("Pass");
//		   }
//		   else if(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText().equalsIgnoreCase("band 2"))
//		   {
//			   System.out.println(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText());
//			   System.out.println("Pass");
//		   }
//		   else if(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText().equalsIgnoreCase("5"))
//		   {
//			   System.out.println(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]")).getText());
//			   System.out.println("Pass");
//		   }
//		   else if(driver.findElement(By.xpath("//table[@id='rpt']/tbody/tr[4]/td["+j+"]/input")).isSelected())
//		   {
//			   System.out.println("Checked");
//			   System.out.println("Pass");
//		   }
	   }
}