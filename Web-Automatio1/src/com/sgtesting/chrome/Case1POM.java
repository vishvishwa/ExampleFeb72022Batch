package com.sgtesting.chrome;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1POM 
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) 
	{
		LaunchBrowser();
		navigate();
		login();
		CreateUser();
		DeleteUser();
		Logoutclose();
	}
	private static void LaunchBrowser()
	{
		try
		{
			
			System.setProperty("webdriver.chrome.driver","E:\\JavaAutomation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getusername().sendKeys("admin");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("manager");
			Thread.sleep(1000);
			oPage.getloginbutton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser()
	{
		try
		{
			oPage.Min().click();
			Thread.sleep(2000);
			oPage.getclickuser().click();
			Thread.sleep(3000);
			
			oPage.clickadduser().click();
			Thread.sleep(2000);
			oPage.fillFN().sendKeys("Demo");
			oPage.fillLN().sendKeys("user");
			oPage.fillmailid().sendKeys("User1@gmail.com");
			oPage.Loginuser().sendKeys("user1");
			oPage.Loginpassword().sendKeys("user1");
			oPage.LoginpasswordCopy().sendKeys("user1");
			Thread.sleep(3000);
			oPage.Createuser().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser()
	{
		try
		{
			oPage.Clicktodelete().click();
			Thread.sleep(2000);
			oPage.Deleteok().click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String s=oAlert.getText();
			System.out.println(s);
			oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logoutclose()
	{
		try
		{
			oPage.logout().click();
			Thread.sleep(2000);
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
