package com.POM;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POJO.Base;

public class ForgottenPasswordPage extends Base {
	
	LoginPage login = new LoginPage();
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement Username;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement Cancle;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ResentPasswordbutton;
	
	@FindBy(xpath="//span[text()='Required']")
	private WebElement RequiredMessegeBlankUsername;
	
	@FindBy(xpath="//h6[text()='Reset Password link sent successfully']")
	private WebElement ResetPasswordsuccess;
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	private WebElement OrangeHRMInc;
	
	
	
	public String ForgottenPasswordPageTitle()
	{
		String a = driver.getTitle();
		System.out.println("** Forgotten Password Title Get **");
		return a;
	}
	
	public String ForgottenPasswordPageURL()
	{
		String a = driver.getCurrentUrl();
		System.out.println("** Forgotten Password CurrentURL Get **");
		return a;
	}
	
	public void EnterUsername(String e)
	{
		Username.sendKeys(e);
		System.out.println("** Entered Username on Forgotten Password Page **");
	}
	
	public LoginPage ClickonCancleButton()
	{
		Cancle.click();
		System.out.println("** Clicked on cancle button **");
		return login;
		
	}
	
	public void ClickOnRessetPasswordButton()
	{
		if(ResentPasswordbutton.isDisplayed()&&ResentPasswordbutton.isEnabled())
		{
			ResentPasswordbutton.click();
		}
		System.out.println("** Clicked on Reset Password Button **");
	}
	
	public String RequiredErrorMessege()
	{
		String a = null;
		if(RequiredMessegeBlankUsername.isDisplayed())
		{
			a = RequiredMessegeBlankUsername.getText();
		}
		System.out.println("** Required messege is displayed **");
		return a;
	}
	
	public String ResetPasswordSuccessfully()
	{
		String a = null;
		
		if(ResetPasswordsuccess.isDisplayed())
		{
			a = ResetPasswordsuccess.getText();
		}
		System.out.println("** Password Reset Messege get successfully **");
		return a;
	}
	
	public OrangeHRMIncPage ClickOnOrangeHRMIncLink()
	{
		OrangeHRMInc.click();
		System.out.println("** Clicked on OrangeHRMIncLink **");
		return new OrangeHRMIncPage();
	}
	

}
