package com.Base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public Properties pro;
	public WebDriverWait wait;
	
	public WebDriver Initialization(String url) throws Exception
	{
		
		pro=new Properties();
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\ConfigeProperties\\Confige.properties");
		pro.load(file);  
		
		String Browsername = pro.getProperty("Browser");
		if(Browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
		else if(Browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(Browsername.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(Browsername.equalsIgnoreCase("safari"))
		{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		System.out.println(pro.getProperty("Browser"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(pro.getProperty(url));
		return driver;
		
	}
	
	public void waituntilVisibilityofElement(WebElement e)
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	public void waitelementtobeClikable(WebElement e)
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}
	
	public void waituntilAlertIsPresent()
	{
	   wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void waituntilElementToBeSelectable(WebElement e)
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(e));
	}
	
	public String GetTitleOfWebPage()
	{
	       return driver.getTitle();
	}
	
	public String GetCurrentURLofWebPage()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean DisplayedLoGo(WebElement e)
	{
		return e.isDisplayed();
	}
	
	public void click(WebElement e)
	{
		waitelementtobeClikable(e);
		e.click();
	}
	
	public String GetText(WebElement e)
	{
	   waituntilVisibilityofElement(e);
	  return e.getText();
	}
	
	public void sendKeys(WebElement e, String Text)
	{
		waituntilVisibilityofElement(e);
		e.sendKeys(Text);
	}
	
	public void NavigateBack()
	{
		driver.navigate().back();
	}
	
	public void ClearText(WebElement e)
	{
		waituntilVisibilityofElement(e);
		e.clear();
	}
	
	public void AcceptAlert(WebElement e)
	{
		waituntilAlertIsPresent();
		Alert alert = driver.switchTo().alert();
		System.out.println("Switched on Alert "+alert.getText());
		alert.accept();
	}
	
	public void DismissAlert()
	{
		waituntilAlertIsPresent();
		Alert alert = driver.switchTo().alert();
		System.out.println("Switched on Alert "+alert.getText());
		alert.dismiss();
	}
	
	public void ScrollPage(int a, int b)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy("+a+","+b+")");
	}
	
	public void ScrollIntoView(WebElement e)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("Arguments[0].scrollIntoViewIfNeeded", e);
	}
	
	public void BrowserPOPUP()
	{
		Set<String> AllWindow = driver.getWindowHandles();
		
	}
	
}

