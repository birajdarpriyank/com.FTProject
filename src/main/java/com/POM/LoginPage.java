package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POJO.Base;

public class LoginPage extends Base{
	
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p[text()='Username : Admin']")
	WebElement Username;
	
	@FindBy(xpath="//p[text()='Password : admin123']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement EnterUsername;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement EnterPassword;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement LoginButton;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement ForgotYourPassword;
	
	
	
	

}
