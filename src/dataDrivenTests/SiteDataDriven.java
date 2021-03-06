package dataDrivenTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SiteDataDriven {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\Public\\\\artifact_environment\\\\Selenium\\\\Workbook1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		int rowscount = sheet.getLastRowNum();
		System.out.println("no of rows is " +rowscount);
		for(int i=1;i<=rowscount;i++) {
		XSSFRow currentrow=sheet.getRow(i);
		String First_Name = currentrow.getCell(0).toString();
		String Last_Name = currentrow.getCell(1).toString();
		String Phone = currentrow.getCell(2).toString();
		String Email = currentrow.getCell(3).toString();
		String Address = currentrow.getCell(4).toString();
		String City = currentrow.getCell(5).toString();
		String State = currentrow.getCell(6).toString();
		String Postalcode = currentrow.getCell(7).toString();
		String Country = currentrow.getCell(8).toString();
		String Uname = currentrow.getCell(9).toString();
		String Psswrd = currentrow.getCell(9).toString();
		
		//Registration process
		driver.findElement(By.linkText("REGISTER")).click();
	    driver.findElement(By.name("firstName")).sendKeys(First_Name);
		driver.findElement(By.name("lastName")).sendKeys(Last_Name);
		driver.findElement(By.name("phone")).sendKeys(Phone);
		driver.findElement(By.name("userName")).sendKeys(Email);
		driver.findElement(By.name("address1")).sendKeys(Address);
		driver.findElement(By.name("city")).sendKeys(City);
		driver.findElement(By.name("state")).sendKeys(State);
		driver.findElement(By.name("postalCode")).sendKeys(Postalcode);
		Select dropcountry = new Select(driver.findElement(By.name("country")));
		dropcountry.selectByVisibleText(Country);
		driver.findElement(By.name("email")).sendKeys(Uname);
		driver.findElement(By.name("password")).sendKeys(Psswrd);
		driver.findElement(By.name("confirmPassword")).sendKeys(Psswrd);
		//submitting a form
		driver.findElement(By.name("register")).click();
		
		if(driver.getPageSource().contains("Thank you for registering.")){
			
		
		System.out.println("registration completed " + i);
		
		}
		
		else 
		{
			System.out.println("registration Failed " + i);
		}
		}
		

	}
}


