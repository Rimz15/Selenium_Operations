package webTables;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TablesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Dimension r = driver.findElement(By.xpath("//table//tr")).getSize();
		System.out.println(r);
		Dimension col = driver.findElement(By.xpath("//table//tr/td")).getSize();
		System.out.println(col);
		for(int i=1;i<=10;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.print(driver.findElement(By.xpath("//table//tr[" +i+ "]/td[" +j+ "]")).getText());
				
			}
			
			System.out.println();
		}
		

	}

}
