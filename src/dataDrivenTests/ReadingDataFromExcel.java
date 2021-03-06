package dataDrivenTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Public\\artifact_environment\\Selenium\\Workbook1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();//returns row count
		int colcount=sheet.getRow(0).getLastCellNum();//returns column count
		for(int i=0;i<rowcount;i++) {
			XSSFRow currentRow=sheet.getRow(i);//focused on current Row
			for(int j=0;j<colcount;j++) {
			//String value=currentRow.getCell(j).getStringCellValue();//otherMethods
			//double value=currentRow.getCell(j).getNumericCellValue();
			String value=currentRow.getCell(j).toString();//to string will all types of data read the value from a cell
			System.out.print(" " +value);
			}
			System.out.println();//for allignment
		}
		

	}

}
