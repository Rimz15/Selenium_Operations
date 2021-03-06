package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcExample {

	public static void main(String[] args) throws SQLException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\artifact_environment\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@whf00iso:1521/OBVAMPDB1414","CMC","CMC");
		Statement stmnt = con.createStatement();
		String s = "select SCREEN_CLASS_CODE,SCREEN_CLASS_DESC from CMC_TM_SCREEN_CLASS";
		ResultSet rs = stmnt.executeQuery(s);
		while(rs.next())
		{
			String code = rs.getString("SCREEN_CLASS_CODE");
			String DESC = rs.getString("SCREEN_CLASS_DESC");
			System.out.println(code);
			System.out.println(DESC);
			
		}
		con.close();
		
	}

}
