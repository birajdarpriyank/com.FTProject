package com.POJO;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Base {
	
	FileInputStream fileinputstream;
	public static WebDriver driver;
	
	public static String projectpath= System.getProperty("user.dir"); 
	
	 public void LaunchTheWeb() throws IOException
	 {
		 fileinputstream = new FileInputStream(".\\src\\test\\resources\\Property\\Config.properties");
		 
		 driver= new EdgeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 Properties prop= new Properties();
		 
		 prop.load(fileinputstream);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get(prop.getProperty("OrangeHRMurl"));
		 
	 }
	 
	 public void WaitForVisibility( String e)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(e)));
		}
}

