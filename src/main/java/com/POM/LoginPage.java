package com.POM;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POJO.Base;

public class LoginPage extends Base{
	
	
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@alt='orangehrm-logo']")
	private WebElement logo;
	
	@FindBy(xpath="//p[text()='Username : Admin']")
	private WebElement username;
	
	@FindBy(xpath="//p[text()='Password : admin123']")
	private WebElement password;
	
	@FindBy(name="username")
	private WebElement inputusername;
	
	@FindBy(name="password")
	private WebElement inputpassword;
	
	@FindBy(xpath="//p[text()='Invalid credentials']")
	private WebElement ErrorMessege;
	
	@FindBy(xpath="(//span[text()='Required'])[1]")
	private WebElement RequiredforUsernameError;
	
	@FindBy(xpath="(//span[text()='Required'])")
	private WebElement RequiredforPasswordError;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	private WebElement ForgottenPasswordLink;
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	private WebElement OrangeHRMIncLink;
	
	
	
	public String GetLoginPageTitle()
	{
		String a = driver.getTitle();
		System.out.println("** LoginPage Title get **");
		return a;
	}
	
	public String GetcurrentURLLoginPage()
	{
		String a = driver.getCurrentUrl();
		System.out.println("** Title Current Loginpage Url get **");
		return a;
	}
	
	public boolean LogoIsDisplayed()
	{
		boolean a = logo.isDisplayed();
		System.out.println("** LoginPage Logo is displayed **");
		return a;
	}
	
     public String getUsername()
     {
    	 String a = username.getText();
    	 System.out.println("** UserName is get **");
    	 return a.substring(a.indexOf('A'));
     }
     
     public String getPassword()
     {
    	 String a = password.getText();
    	 System.out.println("** Password is get **");
    	 return a.substring(a.lastIndexOf('a'));
     }
     
     public HomePage ClickOnLoginButton()
     {
    	 if(LoginButton.isDisplayed()&&LoginButton.isEnabled())
    	 {
    	    LoginButton.click();
    	 }
    	 System.out.println("** Clicked on LoginButton **");
    	return new HomePage();
     }

	
	public void setInputusername(String Setusername)
	{
		 inputusername.sendKeys(Setusername);
		 System.out.println("** Entered UserName **");
	}
	
	public String ErrorMessegeRequireforUsername()
	{
		String a=null;
		if(RequiredforUsernameError.isDisplayed())
		{
			a = RequiredforUsernameError.getText();
		}
		System.out.println("** Required is displayed and get text for UserName **");
		return a;
	}
	
	public String ErrorMessegeRequiredforpassword()
	{
		String a=null;
		if(RequiredforPasswordError.isDisplayed())
		{
			a = RequiredforPasswordError.getText();
		}
		System.out.println("** Required is displayed and get text for Password");
		return a;
		
	}

	
	public void setInputpassword(String Setpassword) 
	{
		 inputpassword.sendKeys(Setpassword);
		 System.out.println("** Entered Password **");
	}
	
	public String ErrorMessegeDisplayed()
	{
		String a=null;
		
		if(ErrorMessege.isDisplayed())
		{
			a = ErrorMessege.getText();
			 System.out.println("** Error messege Displayed **");
		}

		return a;
	}
	
	public ForgottenPasswordPage ClickOnForgottenPasswordLink()
	{
		if(ForgottenPasswordLink.isDisplayed()&&ForgottenPasswordLink.isEnabled())
		{
		ForgottenPasswordLink.click();
		}
		System.out.println("** Clicked on ForgottenPasswordLink **");
		
		return new ForgottenPasswordPage();
	}
	
	public OrangeHRMIncPage ClickOnOrangeHRMIncLink()
	{
		OrangeHRMIncLink.click();
		System.out.println("** Clicked on OrangeHRMIncLink **");
		return new OrangeHRMIncPage();
	}
	

}
