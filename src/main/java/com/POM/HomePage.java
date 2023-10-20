package com.POM;

import java.util.Set;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POJO.Base;

public class HomePage extends Base{
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='client brand banner']") 
	private WebElement Logo;
	
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-main-menu-button']")
	private WebElement HideElement;
	
	@FindBy(xpath="//input[@fdprocessedid='ruwi0k']") 
	private WebElement SearchInput;
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active toggle']")
	private WebElement Admin_Module;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item toggle'])[1]")
	private WebElement PIM_Module;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item toggle'])[2]")
	private WebElement Leave_Module;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item toggle'])[3]") 
	private WebElement Time_Module;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item toggle'])[4]") 
	private WebElement Recruitment_Module;
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item toggle'])[5]") 
	private WebElement MyInfo_Module;
	
	@FindBy(xpath="//span[text()='Performance']")
	private WebElement Performance_Module;
	
	@FindBy(xpath="//span[text()='Dashboard']") 
	private WebElement Dashboard_Module;
	
	@FindBy(xpath="//span[text()='Directory']")
	private WebElement Directory_Module;
	
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Maintenance_Module;
	
	@FindBy(xpath="//span[text()='Claim']")
	private WebElement Claim_Module;
	
	@FindBy(xpath="//span[text()='Buzz']")
	private WebElement Buzz_Module;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	private WebElement Profile;
	
	@FindBy(xpath="//button[@title='Help']")
	private WebElement Help;
	
	@FindBy(xpath="//ul[@role='menu']")
	private WebElement Menu;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']")
	private WebElement AllModules;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-list oxd-topbar-header-hamburger']")
	private WebElement ModulesListIcon;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-x oxd-sidepanel-header-close']")
	private WebElement CloseIcon;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']/li")
	private WebElement AfterSearchingelemet;
	
	public boolean LogoisDisplayed()
	{
		boolean a = Logo.isDisplayed();
		System.out.println("** Home Page Logo is displayed");
		return a;
	}
	
	public String HomePageTitle()
	{
		String a = driver.getTitle();
		System.out.println("** Home Page Title Get **");
		return a;
	}
	
	public String HomePageURL()
	{
		String a = driver.getCurrentUrl();
		System.out.println("** Home Page URL get");
		return a;
	}
	
	public void ClickOnHideElementSymbol()
	{
		if(HideElement.isDisplayed()&&HideElement.isEnabled())
		{
			HideElement.click();
		}
		System.out.println("** Clicked on HideElement **");
	}
	
	public void ClickOnAdmin_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnPIM_Module()
	{
		if(PIM_Module.isDisplayed())
		{
			PIM_Module.click();
		}
	}
	
	public void ClickOnLeave_Module()
	{
		if(Leave_Module.isDisplayed())
		{
			Leave_Module.click();
		}
	}
	
	public void ClickOnTime_Module()
	{
		if(Time_Module.isDisplayed())
		{
			Time_Module.click();
		}
	}
	
	public void ClickOnRecruitment_Module()
	{
		if(Recruitment_Module.isDisplayed())
		{
			Recruitment_Module.click();
		}
	}
	
	public void ClickOnMyInfo_Module()
	{
		if(MyInfo_Module.isDisplayed())
		{
			MyInfo_Module.click();
		}
	}
	
	public void ClickOnPerformance_Module()
	{
		if(Performance_Module.isDisplayed())
		{
			Performance_Module.click();
		}
	}
	
	public void ClickOnDirectory_Module()
	{
		if(Directory_Module.isDisplayed())
		{
			Directory_Module.click();
		}
	}
	
	public void ClickOnMaintenance_Module()
	{
		if(Maintenance_Module.isDisplayed())
		{
			Maintenance_Module.click();
		}
	}
	
	public void ClickOnClaim_Module()
	{
		if(Claim_Module.isDisplayed())
		{
			Claim_Module.click();
		}
		System.out.println("** Clicked on ");
	}
	
	public void ClickOnBuzz_Module()
	{
		if(Buzz_Module.isDisplayed())
		{
			Buzz_Module.click();
		}
		
		System.out.println("** Clicked on Admin **");
	}
	
	public void ClickOnHelp()
	{
		if(Help.isDisplayed())
		{
			Help.click();
		}
	}
	
	public void SendkeysSearchBox(String e)
	{
		SearchInput.sendKeys(e);
	}
	
	public void HideAllModules()
	{
		if(AllModules.isDisplayed())
		{
			CloseIcon.click();
		}
	}
	
	public void UnhideAllModules()
	{
		if(!AllModules.isDisplayed())
		{
			ModulesListIcon.click();
		}
	}

	
	public void ClickOnProfile()
	{
	     if(Profile.isDisplayed())
	     {
	    	 Profile.click();
	     }
	}
	
	public String AfterSearchingResult()
	{
		String a = AfterSearchingelemet.getText();
		return a;
	}
	

}
