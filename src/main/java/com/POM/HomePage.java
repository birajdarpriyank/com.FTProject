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
	
	@FindBy(xpath="//input[@placeholder='Search']") 
	private WebElement SearchInput;
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement Admin_Module;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIM_Module;
	
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement Leave_Module;
	
	@FindBy(xpath="//span[text()='Time']") 
	private WebElement Time_Module;
	
	@FindBy(xpath="//span[text()='My Info']") 
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
	
	@FindBy(xpath="//button[@class='oxd-icon-button']")
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
		System.out.println("** Clicked on HideElement Module **");
	}
	
	public AdminPage ClickOnAdmin_Module()
	{
		if(Admin_Module.isDisplayed())
		{
			Admin_Module.click();
		}
		System.out.println("** Clicked on Admin Module **");
		
		return new AdminPage();
	}
	
	public PIMPage ClickOnPIM_Module()
	{
		if(PIM_Module.isDisplayed())
		{
			PIM_Module.click();
		}
		System.out.println("** Clicked on PIM Module **");
		
		return new PIMPage();
	}
	
	public LeavePage ClickOnLeave_Module()
	{
		if(Leave_Module.isDisplayed())
		{
			Leave_Module.click();
		}
		System.out.println("** Clicked on Leave Module **");
		
		return new LeavePage();
	}
	
	public TimePage ClickOnTime_Module()
	{
		if(Time_Module.isDisplayed())
		{
			Time_Module.click();
		}
		System.out.println("** Clicked on Time Module **");
		
		return new TimePage();
	}
	
	public RecruitmentPage ClickOnRecruitment_Module()
	{
		if(Recruitment_Module.isDisplayed())
		{
			Recruitment_Module.click();
		}
		System.out.println("** Clicked on Recruitment Module **");
		
		return new RecruitmentPage();
	}
	
	public MyInfoPage ClickOnMyInfo_Module()
	{
		if(MyInfo_Module.isDisplayed())
		{
			MyInfo_Module.click();
		}
		System.out.println("** Clicked on MyInfo module **");
		
		return new MyInfoPage();
	}
	
	public Performance ClickOnPerformance_Module()
	{
		if(Performance_Module.isDisplayed())
		{
			Performance_Module.click();
		}
		System.out.println("** Clicked on Performance Module **");
		
		return new Performance();
	}
	
	public Directory ClickOnDirectory_Module()
	{
		if(Directory_Module.isDisplayed())
		{
			Directory_Module.click();
		}
		System.out.println("** Clicked on Directory Module **");
		
		return new Directory();
	}
	
	public MaintenancePage ClickOnMaintenance_Module()
	{
		if(Maintenance_Module.isDisplayed())
		{
			Maintenance_Module.click();
		}
		System.out.println("** Clicked on Maintenance Module **");
		
		return new MaintenancePage();
	}
	
	public ClaimPage ClickOnClaim_Module()
	{
		
		if(Claim_Module.isDisplayed())
		{
			Claim_Module.click();
		}
		System.out.println("** Clicked on Claim Module **");
		
		return new ClaimPage();
	}
	
	public BuzzPage ClickOnBuzz_Module()
	{
		if(Buzz_Module.isDisplayed())
		{
			Buzz_Module.click();
		}
		
		System.out.println("** Clicked on Buzz Module **");
		
		return new BuzzPage();
	}
	
	public void ClickOnHelp()
	{
		if(Help.isDisplayed())
		{
			Help.click();
		}
		System.out.println("** Clicked on Help Button **");
	}
	
	public void SendkeysSearchBox(String e)
	{
		SearchInput.sendKeys(e);
		System.out.println("** SendKeys in SearchBox **");
	}
	
	public void HideAllModules()
	{
		if(AllModules.isDisplayed())
		{
			CloseIcon.click();
		}
		System.out.println("** Clicked on CloseIcon **");
	}
	
	public void UnhideAllModules()
	{
		if(!AllModules.isDisplayed())
		{
			ModulesListIcon.click();
		}
		System.out.println("** Clicked on ModuleListIcon **");
	}

	
	public void ClickOnProfile()
	{
	     if(Profile.isDisplayed())
	     {
	    	 Profile.click();
	     }
	     System.out.println("** Clicked on Profile **");
	}

}
