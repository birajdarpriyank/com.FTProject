package com.Utilities;

import java.io.FileInputStream;



import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.POJO.Base;

import java.util.Map.Entry;

public class utility extends Base{

	public static void Implicitlywait()
	 {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
	 }
	 
	public static Sheet getsheet(String sheetname) throws IOException
	{
		FileInputStream fileinputstream = new FileInputStream(projectpath+"\\src\\main\\resources\\Exeldata\\OrangeHrmLogin.xlsx");
		
		Sheet sh=WorkbookFactory.create(fileinputstream).getSheet(sheetname);
		return sh;
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
