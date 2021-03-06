package dataDrivenTests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("C:\\Users\\Public\\artifact_environment\\Selenium\\Workbook2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("Data");
		XSSFSheet sheet2 = workbook.createSheet("Data2");
		for(int row=0;row<=5;row++) {
			XSSFRow rowcount1 = sheet1.createRow(row);
			XSSFRow rowcount2 = sheet2.createRow(row);
		for(int cell=0;cell<=3;cell++) {
			rowcount1.createCell(cell).setCellValue("abc");
			rowcount2.createCell(cell).setCellValue("def");
		}
			
		}
		
		workbook.write(file);
		file.close();
		System.out.println("Written data to excel is completed");
}
}