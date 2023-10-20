package com.Tests;

import java.io.IOException;

import org.openqa.selenium.devtools.v109.dom.model.ShadowRootPopped;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.POJO.Base;
import com.POM.HomePage;
import com.POM.LoginPage;

public class HomeDashboardTest extends Base{
	
	HomePage home;
	LoginPage login;
	SoftAssert soft = new SoftAssert();
	@BeforeMethod
	public void SetUp() throws IOException
	{
		BrowserInitialization();
		login = new LoginPage();
		login.setInputusername(login.getUsername());
		login.setInputpassword(login.getPassword());
		login.ClickOnLoginButton();
		home = new HomePage();
	}
	
	@Test 
	public void ValidateLogoIsDisplayed()
	{
		boolean Actual = home.LogoisDisplayed();
		soft.assertTrue(Actual);
		soft.assertAll();
	}
	
	@Test
	public void ValidateHomePageURL()
	{
		String Actual = home.HomePageURL();
		String Expected = prop.getProperty("HomePageLink");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test
	public void ValidateHomePageTitle()
	{
		String Actual = home.HomePageTitle();
		String Expected = prop.getProperty("HomePageTitle");
		soft.assertEquals(Actual, Expected);
	}
	
	@Test 
	public void ValidateClickedOnAdminModule()
	{
		home.ClickOnAdmin_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("AdminModuleTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("AdminModuleURl");
		Assert.assertEquals(Actual, Expected);
	}
	
	
	@Test 
	public void ValidateClickedOnPIM_Module()
	{
		home.ClickOnPIM_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("");
		Assert.assertEquals(Actual, Expected);
	}
	
	
	@Test 
	public void ValidateClickedOnLeave_Module()
	{
		home.ClickOnLeave_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test 
	public void ValidateClickedOnTime_Module()
	{
		home.ClickOnTime_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("");
		Assert.assertEquals(Actual, Expected);
	}
	
	
	
	@Test 
	public void ValidateClickedOnRecruitment_Module()
	{
		home.ClickOnRecruitment_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test 
	public void ValidateClickedOnInfo_Module()
	{
		home.ClickOnMyInfo_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test 
	public void ValidateClickedOnPerformance_Module()
	{
		home.ClickOnPerformance_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test 
	public void ValidateClickedOnDashboard_Module()
	{
		home.ClickOnDashboard_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test 
	public void ValidateClickedOnMaintenance_Module()
	{
		home.ClickOnMaintenance_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test 
	public void ValidateClickedOnClaim_Module()
	{
		home.ClickOnClaim_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test 
	public void ValidateClickedOnBuzz_Module()
	{
		home.ClickOnBuzz_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("");
		Assert.assertEquals(Actual, Expected);
	}
	
	
	

}
