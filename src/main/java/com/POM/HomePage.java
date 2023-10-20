package com.POM;

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
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement Admin_Module;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIM_Module;
	
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement Leave_Module;
	
	@FindBy(xpath="//span[text()='Time']") 
	private WebElement Time_Module;
	
	@FindBy(xpath="//span[text()='Recruitment']") 
	private WebElement Recruitment_Module;
	
	@FindBy(xpath="//span[text()='My Info']") 
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
	
	@FindBy(xpath="//i[@class='oxd-icon bi-list oxd-topbar-header-hamburger']")
	private WebElement ModulesListIcon;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-x oxd-sidepanel-header-close']")
	private WebElement CloseIcon;
	
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
		System.out.println("** Clicked on ");
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
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnLeave_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnTime_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnRecruitment_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnMyInfo_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnPerformance_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnDashboard_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnMaintenance_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnClaim_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
	
	public void ClickOnBuzz_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
	}
}
