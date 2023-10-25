package com.Utilities;

import java.io.FileInputStream;



import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import com.POJO.Base;

import java.util.Map.Entry;

public class utility extends Base{

	public static void Implicitlywait()
	 {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
	 }
	 
	public static Sheet getsheet(int sheetnum) throws IOException
	{
		FileInputStream file = new FileInputStream("E:\\DESK DATA\\eclipse-workspace\\com.cucumberprojectshrhealthcare\\src\\test\\resources\\ExcelData\\OrangeHRM.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(sheetnum);
		
		//Sheet sh=WorkbookFactory.create(fileinputstream).getSheet(sheetname);
		return sheet;
	}
	
	@DataProvider(name="logindata")
	public static Object[][] getdata(Sheet sh) throws IOException
	{
		int columncount=0;
		
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		
		HashMap<Object, Object> finaldata = new HashMap();
		
		Object[][] exceldata = new Object [rowcount][columncount];
		
		for(int i=0; i<rowcount; i++)
		{
			
			HashMap<Object, Object> data = new HashMap();
			
			columncount = sh.getRow(i).getLastCellNum();
			System.out.println(columncount);
			
			for(int j=0; j<columncount; j++)
			{
				if(sh.getRow(i).getCell(j).getCellType().toString().equalsIgnoreCase("String"))
				{
					data.put(sh.getRow(0).getCell(j).getStringCellValue(), sh.getRow(i+1).getCell(j).getStringCellValue());
				}
				
				else if(sh.getRow(i).getCell(j).getCellType().toString().equalsIgnoreCase("numeric"))
				{
					data.put(sh.getRow(0).getCell(j).getNumericCellValue(), sh.getRow(i+1).getCell(j).getNumericCellValue());
				}
				else
				{
					System.out.println("Cell type not matched");
				}
			}
			exceldata[i][0] = data;
			System.out.println(data);
			data.forEach(finaldata :: put);
			System.out.println(data);
			
		}
		return exceldata ;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Object getSingleData(int rowNum,int cellNum,Sheet sh)
	{
		if(sh.getRow(rowNum).getCell(cellNum).getCellType().toString().equalsIgnoreCase("string"))
		{
			String ab=sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
			System.out.println(ab);
			return ab;
		}
		else {
			double ab=sh.getRow(rowNum).getCell(cellNum).getNumericCellValue();
			return ab;
		}
		
			
	}
	
	public static Map.Entry getAllData(Sheet sh) throws IOException
	{
		

		HashMap<Object,Object> map = new HashMap();
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			int cellNum = sh.getRow(i).getLastCellNum();
				map.put(sh.getRow(i).getCell(0).getStringCellValue(),sh.getRow(i).getCell(1).getStringCellValue());
			
		}
		//System.out.println(map);
		
		return (Entry) map.entrySet();
		
	}
	 
	 
	 
	 public void WaitForVisibility(String e)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
		}
	  
	 public static  void AlertIsPresent()
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.alertIsPresent());
	 }
	
}
