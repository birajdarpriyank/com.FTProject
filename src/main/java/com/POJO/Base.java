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

import com.Utilities.utility;



public class Base {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public static String projectpath= System.getProperty("user.dir"); 
	
	 public WebDriver BrowserInitialization() throws IOException
	 {
		 driver= new EdgeDriver();
		 
		 utility.Implicitlywait();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		  prop= new Properties();
		 
		  FileInputStream fileinputstream = new FileInputStream("E:\\DESK DATA\\eclipse-workspace\\com.cucumberprojectshrhealthcare\\src\\test\\resources\\Property\\Config.properties");
			 
		 prop.load(fileinputstream);
		 
		 driver.get(prop.getProperty("OrangeHRMurl"));
		 
		 return driver;
	 }
}

