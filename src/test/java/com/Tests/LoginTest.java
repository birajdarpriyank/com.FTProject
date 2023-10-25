package com.Tests;

import java.io.IOException;



import java.lang.reflect.Method;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.POJO.Base;
import com.POM.LoginPage;
import com.Utilities.utility;

@Listeners(Reports.MyListener.class)
public class LoginTest extends Base {
	
LoginPage login;
SoftAssert soft = new SoftAssert();

	
	@BeforeMethod
	public void SetUp(Method m) throws IOException 
	{
		BrowserInitialization();
		login= new LoginPage();
		System.out.println("*****Starting Test"+m.getName()+"*****");
		
	}
	
	@Test(priority=0)
	public void ValidateLoginPageLogo() throws InterruptedException
	{
		Thread.sleep(6000);
		boolean Actual = login.LogoIsDisplayed();
		soft.assertTrue(Actual);
		soft.assertAll();
	}
	
	@Test(priority=1)
	public void ValidateLoginPageTitle()
	{
		String Actual = login.GetLoginPageTitle();
		String Expected = prop.getProperty("LoginPageTitle");
		soft.assertEquals(Actual, Expected);
		
	}
	
//	@Test(dataProvider = "logindata")
//	public void gtdata(HashMap<String, String> data) throws IOException
//	{
//		Sheet sh = utility.getsheet(0);
//		Object [] [] data1 = utility.getdata(sh);
//	         login.setInputusername(data.get("Email"));
//	         login.setInputpassword(data.get("Password"));
//	}
	
	@Test(priority=2)
	public void ValidateLoginPageURL()
	{
		
		String Actual = login.GetcurrentURLLoginPage();
		String Expected = prop.getProperty("OrangeHRMurl");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=3)
	public void LoginWithValidCredential() throws InterruptedException
	{
		
		login.setInputusername(login.getUsername());
		login.setInputpassword(login.getPassword());
		Thread.sleep(8000);
		login.ClickOnLoginButton();
		
		String Actual1 = driver.getTitle();
		String Expected1 = prop.getProperty("HomePageTitle");
		soft.assertEquals(Actual1, Expected1);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("HomePageLink");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=4)
	public void LoginWithInvalidCredential()
	{
		login.setInputusername("dsdgvdgv@55665bjh");
		login.setInputpassword("@#@#$#4gvdv");
		login.ClickOnLoginButton();
		
		String Actual = login.ErrorMessegeDisplayed();
		String Expected = prop.getProperty("ErrorMessege");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=5)
	public void LoginWithBlankCredentials()
	{
		login.setInputusername("");
		login.setInputpassword("");
		login.ClickOnLoginButton();
		
		String Actual = login.ErrorMessegeRequireforUsername();
		System.out.println(Actual);
		String Expected = prop.getProperty("EnterBlankUsername");
		Assert.assertEquals(Actual, Expected);
		
		String Actual1 = login.ErrorMessegeRequiredforpassword();
		System.out.println(Actual1);
		String Expected1 = prop.getProperty("EnterBlankPassword");
		Assert.assertEquals(Actual1, Expected1);
		
	}
	
	@Test(priority=6)
	public void LoginWithUserNameOnly()
	{
		login.setInputusername(login.getUsername());
		login.setInputpassword("");
		login.ClickOnLoginButton();
		
		String Actual1 = login.ErrorMessegeRequiredforpassword();
		String Expected1 = prop.getProperty("EnterBlankPassword");
		Assert.assertEquals(Actual1, Expected1);
		
	}
	
	@Test(priority=7)
	public void LoginWithEnterPasswordOnly()
	{
		login.setInputusername("");
		login.setInputpassword(login.getPassword());
		login.ClickOnLoginButton();
		
		String Actual = login.ErrorMessegeRequireforUsername();
		String Expected = prop.getProperty("EnterBlankUsername");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=8)
	public void ValidateForgottenPasswordLink()
	{
		login.ClickOnForgottenPasswordLink();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("ForgottenPasswordPageTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = prop.getProperty("ForgottenPageURL");
		Assert.assertEquals(ActualURL, ExpectedURL);
	}
	
	@Test(priority=9)
	public void ValidateOrangeHRMIncLink()
	{
		login.ClickOnOrangeHRMIncLink();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("OrangeHRMIncPageTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = prop.getProperty("OrangeHRMIncPageCurrentURL");
		Assert.assertEquals(ActualURL, ExpectedURL);
	}
	
	@AfterMethod
	public void TearDown() throws InterruptedException
	
	{
		Thread.sleep(8000);
		driver.quit();
	}

}
