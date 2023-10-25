package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POJO.Base;

public class MaintenancePage extends Base {
	
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//toast-message[@class='oxd-text oxd-text--toast-message']")
	private WebElement Toast_Messege;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement Username;
	
	@FindBy(xpath="//p[text()='Invalid credentials']")
	private WebElement InvalidCredentials;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//span[text()='Required']")
	private WebElement RequiredErrorMessege;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement Canclebutton;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;
	
	public String GetMaintenanceTitle()
	{
		String a = driver.getTitle();
		System.out.println("** Get page Title **");
		return a;
	}
	
	public String GetCurrentURL()
	{
		String a = driver.getCurrentUrl();
		System.out.println("** Get Current URL of maintenance **");
		return a;
	}
	
	
	public String GetToast_Messege()
	{
		String a = Toast_Messege.getText();
		System.out.println("** Toast Messege is Get **");
		return a;
	}
	
	public String GetUserName()
	{
		String a = null;
		if(Username.isDisplayed()&&!Username.isEnabled())
		{
			a = Username.getText();
		}
		System.out.println("** Get UserName **");
		return a;
	}
	
	public void EnterPassword(String e)
	{
		Password.sendKeys(e);
	}
	
	public void ClickOnCancleButton()
	{
		if(Canclebutton.isDisplayed()&&Canclebutton.isEnabled())
		{
			Canclebutton.click();
		}
		System.out.println("** Clicked on Cancle Button **");
	}

	public void ClickonSubmitButton()
	{
		if(submitbutton.isDisplayed()&&submitbutton.isEnabled())
		{
			submitbutton.click();
		}
		System.out.println("** Clicked on Submit Button **");
	}
	
	public String ErrorMessgeInvalidCredentials()
	{
		String a = null;
		if(InvalidCredentials.isDisplayed())
		{
			a = InvalidCredentials.getText();
		}
		System.out.println("** Error Messege is Displayed and Get Text **");
		return  a;
	}
	
	public String ErrorMessegeRequired()
	{
		String a = null;
		if(RequiredErrorMessege.isDisplayed())
		{
			a = RequiredErrorMessege.getText();
		}
		System.out.println("** Required Error messege is displayed **");
		
		return a;
	}
	
}
