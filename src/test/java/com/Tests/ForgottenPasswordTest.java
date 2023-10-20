package com.Tests;

import java.io.IOException;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.POJO.Base;
import com.POM.ForgottenPasswordPage;
import com.POM.LoginPage;

public class ForgottenPasswordTest extends Base {
	
	LoginPage login;
	public ForgottenPasswordPage forgot;
	SoftAssert soft = new SoftAssert();
	
	
	
	@BeforeMethod
	public void SetUp() throws IOException
	{
		BrowserInitialization();
		login = new LoginPage();
		login.ClickOnForgottenPasswordLink();
		forgot = new ForgottenPasswordPage();
	}
	
	@Test(priority=0)
	public void ValidateForgotPassTitle()
	{
		String Actual = forgot.ForgottenPasswordPageTitle();
		String Expected = prop.getProperty("ForgottenPasswordPageTitle");
		soft.assertEquals(Actual, Expected);
	}
	
	@Test(priority=1)
	public void ValidateForgotPassURL()
	{
		String Actual = forgot.ForgottenPasswordPageURL();
		String Expected = prop.getProperty("ForgottenPageURL");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=3)
	public void ValidateRessetPasswordWithValidateCredentials()
	{
		forgot.EnterUsername("Samiksha522526@gmail.com");
		forgot.ClickOnRessetPasswordButton();
		String Actual = forgot.ResetPasswordSuccessfully();
		String Expected = prop.getProperty("ResetPasswordsuccessfulmessege");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=4)
	public void ValidateRessetPasswordWithInValidateCredentials()
	{
		forgot.EnterUsername("#$#@$@#$%$#%$$^%$^%$^%$^$^$%^$%^$^%$%^$%^$");
		forgot.ClickOnRessetPasswordButton();
		String Actual = forgot.ResetPasswordSuccessfully();
		String Expected = prop.getProperty("ResetPasswordsuccessfulmessege");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=5)
	public void ValidateRessetPasswordWithBlankCredentials()
	{
		forgot.EnterUsername("");
		forgot.ClickOnRessetPasswordButton();
		String Actual = forgot.RequiredErrorMessege();
		String Expected = prop.getProperty("EnterBlankUsernameForgotPage");
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=6)
	public void ValidateCancleButton()
	{
		forgot.ClickonCancleButton();
		
		String Actual = login.GetLoginPageTitle();
		String Expected = prop.getProperty("LoginPageTitle");
		soft.assertEquals(Actual, Expected);
		
		String Actual1 = login.GetcurrentURLLoginPage();
		String Expected1 = prop.getProperty("OrangeHRMurl");
		Assert.assertEquals(Actual1, Expected1);
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	

}
