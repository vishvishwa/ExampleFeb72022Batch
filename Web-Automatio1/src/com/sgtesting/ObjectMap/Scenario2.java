package com.sgtesting.ObjectMap;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {
	public static WebDriver wd=null;
	public static ObjectMap omap=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		createuser();
		modifyuser();
		deleteuser();
		logout();
		closeApp();
	}
	private static void launch()
	{
		String filename=null;
		try 
		{	filename="E:\\JavaAutomation\\Web-Automation\\Proper\\Testscripts.properties";
			System.setProperty("webdriver.chrome.driver", "E:\\JavaAutomation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			wd=new ChromeDriver();
			omap=new ObjectMap(filename);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		
		try 
		{	
			wd.get("http://localhost:81/login.do");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		
		try 
		{	
			wd.findElement(omap.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1200);
			wd.findElement(omap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1200);
			wd.findElement(omap.getLocator("loginclickbutton")).click();
			Thread.sleep(2500);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createuser()
	{
		
		try 
		{	
			wd.findElement(omap.getLocator("usersimage")).click();
			Thread.sleep(1000);
			wd.findElement(omap.getLocator("addusertab")).click();
			Thread.sleep(1000);
			wd.findElement(omap.getLocator("firstnametextfeild")).sendKeys("Vishwa");
			wd.findElement(omap.getLocator("lastnametextfeild")).sendKeys("H");
			wd.findElement(omap.getLocator("emailtextfield")).sendKeys("Vish@gmail.com");
			wd.findElement(omap.getLocator("usernametextfield")).sendKeys("Vish");
			wd.findElement(omap.getLocator("passwordtextfield")).sendKeys("welcome123");
			wd.findElement(omap.getLocator("repasswordtextfield")).sendKeys("welcome123");
			Thread.sleep(2000);
			wd.findElement(omap.getLocator("createuserclick")).click();
			Thread.sleep(2000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	{
		
		try 
		{	
			wd.findElement(omap.getLocator("clickonuser")).click();
			Thread.sleep(1500);
			wd.findElement(omap.getLocator("lastnametextfeild")).clear();
			Thread.sleep(1500);
			wd.findElement(omap.getLocator("lastnametextfeild")).sendKeys("H");
			Thread.sleep(1500);
			wd.findElement(omap.getLocator("usersavechanges")).click();
			Thread.sleep(1500);
		
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		
		try 
		{	
			wd.findElement(omap.getLocator("clickonuser")).click();
			Thread.sleep(2500);
			wd.findElement(omap.getLocator("deleteuser")).click();
			Thread.sleep(1500);
			Alert olert=wd.switchTo().alert();
			olert.accept();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try 
		{	
			wd.findElement(omap.getLocator("logoutbutton")).click();
			Thread.sleep(1500);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try 
		{	
			wd.quit();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

