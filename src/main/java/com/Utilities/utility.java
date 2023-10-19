package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.POJO.Base;

public class utility extends Base{

	public static void ImplicitlyWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static XSSFSheet getsheet(String sheetname) throws IOException
	{
		FileInputStream fis = new FileInputStream(projectpath+".\\src\\test\\resources\\ExcelData\\OrangeHRM.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		return sheet;
	}
	
	public static Object getSingleData(int rownum, int cellnum, XSSFSheet sheet)
	{
	     if(sheet.getRow(rownum).getCell(cellnum).getCellType().toString().equalsIgnoreCase("string"))
	     {
	      sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
	      
	     }
	     else {
	    	 sheet.getRow(rownum).getCell(cellnum).getNumericCellValue();
	     }
	     return sheet;
	}
	

	
	
}
