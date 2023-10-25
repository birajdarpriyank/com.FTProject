package com.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.POJO.Base;
import com.POM.HomePage;
import com.POM.LoginPage;
import com.POM.MaintenancePage;

import Reports.MyListener;

@Listeners(MyListener.class)
public class MaintenanceTest extends Base {
	
	
	LoginPage login;
	HomePage home;
	MaintenancePage maintc;
	SoftAssert soft = new SoftAssert();
	
	@BeforeMethod
	public void SetUp() throws IOException
	{
		
		BrowserInitialization();
		login = new LoginPage();
		login.setInputusername(login.getUsername());
		login.setInputpassword(login.getPassword());
	    home = login.ClickOnLoginButton();
		maintc = home.ClickOnMaintenance_Module();
	}
	
	@Test
	public void ValidateMaintenancePageTitle()
	{
		String Actual = maintc.GetMaintenanceTitle();
		String Expected = prop.getProperty("MaintenanceTitle");
		soft.assertEquals(Actual, Expected);
	}
	
	@Test
	public void ValidateMaintenancePageURL()
	{
		String Actual = maintc.GetCurrentURL();
		String Expected = prop.getProperty("MaintenanceURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test
	public void ValidateToastMessege()
	{
		String Actual = maintc.GetToast_Messege();
		String Expected = prop.getProperty("Toast_Messege");
		soft.assertEquals(Actual, Expected);
	}
	
	@Test
	public void ValidateUserNameisDisabled()
	{
		String Actual = maintc.GetUserName();
		System.out.println(Actual);
	    String Expected = prop.getProperty("UserName");
		System.out.println(Expected);
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test
	public void ValidateEnterValidPassword()
	{
		maintc.EnterPassword(login.getPassword());
		maintc.ClickonSubmitButton();
	}
	
	@Test
	public void ValidateEnterInValidPassword()
	{
		
	}
	
	@Test
	public void ValidateEnterBlankPassword()
	{
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
