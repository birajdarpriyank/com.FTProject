package com.Tests;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.openqa.selenium.devtools.v109.dom.model.ShadowRootPopped;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.POJO.Base;
import com.POM.HomePage;
import com.POM.LoginPage;

public class HomeTest extends Base{
	
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
	    home = login.ClickOnLoginButton();
	}
	
	@Test (priority=1)
	public void ValidateLogoIsDisplayed()
	{
		boolean Actual = home.LogoisDisplayed();
		soft.assertTrue(Actual);
		soft.assertAll();
	}
	
	@Test (priority=2)
	public void ValidateHomePageURL()
	{
		String Actual = home.HomePageURL();
		String Expected = prop.getProperty("HomePageLink");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test (priority=3)
	public void ValidateHomePageTitle()
	{
		String Actual = home.HomePageTitle();
		String Expected = prop.getProperty("HomePageTitle");
		soft.assertEquals(Actual, Expected);
	}
	
	@Test  (priority=4)
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
	
	
	@Test  (priority=5)
	public void ValidateClickedOnPIM_Module()
	{
		home.ClickOnPIM_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("PIMModuleTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("PIMModuleURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	
	@Test  (priority=6)
	public void ValidateClickedOnLeave_Module()
	{
		home.ClickOnLeave_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("LeaveModuleTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("LeaveModuleURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test  (priority=7)
	public void ValidateClickedOnTime_Module()
	{
		home.ClickOnTime_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("TimeModuleTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("TimeModuleURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	
	
	@Test  (priority=8)
	public void ValidateClickedOnRecruitment_Module()
	{
		home.ClickOnRecruitment_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("RecruitmentTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("RecruitmentURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test  (priority=9)
	public void ValidateClickedOnInfo_Module()
	{
		home.ClickOnMyInfo_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("MyInfoTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("MYInfoURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test  (priority=10)
	public void ValidateClickedOnPerformance_Module()
	{
		home.ClickOnPerformance_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("PerformanceTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("PerformanceURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test  (priority=11)
	public void ValidateClickedOnDirectory_Module()
	{
		home.ClickOnDirectory_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("DirectoryTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("DirectoryURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test  (priority=12)
	public void ValidateClickedOnMaintenance_Module()
	{
		home.ClickOnMaintenance_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("MaintenanceTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("MaintenanceURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test  (priority=13)
	public void ValidateClickedOnClaim_Module()
	{
		home.ClickOnClaim_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("ClaimTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("ClaimURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test  (priority=14)
	public void ValidateClickedOnBuzz_Module()
	{
		home.ClickOnBuzz_Module();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = prop.getProperty("BuzzTitle");
		soft.assertEquals(ActualTitle, ExpectedTitle);
		
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("BuzzURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test (priority=15)
	public void ValidateClickedOnHelp()
	{
		home.ClickOnHelp();
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("HelpURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test (priority=16)
	public void ValidateSearchBoxWithValidateCredentials()
	{
		home.SendkeysSearchBox("Buzz");
		home.ClickOnBuzz_Module();
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("BuzzURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=18)
	public void ValidateShowAllModules()
	{
		home.UnhideAllModules();
		home.ClickOnMaintenance_Module();
		String Actual = driver.getCurrentUrl();
		String Expected = prop.getProperty("MaintenanceURL");
		Assert.assertEquals(Actual, Expected);
		
	}
	
	@Test(priority=17)
	public void ValidateUnshowAllModules()
	{
		home.HideAllModules();
		home.SendkeysSearchBox("Dir");
		
	}
	
	@Test (priority=19)
	public void ValidateSearchBoxWithInValidCredentials()
	{
		home.SendkeysSearchBox("Insight");
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	
	

}
