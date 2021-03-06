package com.sgtesting.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7 {

	public static WebDriver wd=null;
	public static ObjectMap objm=null;
	public static void main(String[] args)  {
		launch();
		navigate();
		login();
		createcustomer();
		createproject();
		createtask();
		deletetask();
		deleteproject();
		deletecustomer();
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
			objm=new ObjectMap(filename);
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
			wd.findElement(objm.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1200);
			wd.findElement(objm.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1200);
			wd.findElement(objm.getLocator("loginclickbutton")).click();
			Thread.sleep(2500);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try 
		{	
			wd.findElement(objm.getLocator("clickontaskimage")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("addnewtab")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("newcustomer")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("customertextfield")).sendKeys("OneTap");
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("createcustomerbutton")).click();
			Thread.sleep(1500);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createproject()
	{
		try 
		{	
			wd.findElement(objm.getLocator("addnewtab")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("addnewproject")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("projecttextfield")).sendKeys("Card");
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("createprojectbutton")).click();
			Thread.sleep(1500);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createtask()
	{
		try 
		{	
			wd.findElement(objm.getLocator("addnewtasktab")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("createnewtask")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("entertaskfield")).sendKeys("Task1");
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("createtask")).click();
			Thread.sleep(1500);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletetask()
	{
		try 
		{	
			wd.findElement(objm.getLocator("checkbox")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("deletetaskbutton")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("deletepertaskbuttopn")).click();
			Thread.sleep(1500);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try 
		{	
			wd.findElement(objm.getLocator("projectsettingsicon")).click();
			Thread.sleep(1500);
			
			wd.findElement(objm.getLocator("projectactiontab")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("projectdeletetab")).click();
			Thread.sleep(1500);
			//wd.findElement(objm.getLocator("projectdeletepertab")).click();
			Thread.sleep(1500);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try 
		{	
			wd.findElement(objm.getLocator("settingsicon")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("actiontab")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("actiondeletetab")).click();
			Thread.sleep(1500);
			wd.findElement(objm.getLocator("deletepermanent")).click();
			Thread.sleep(1500);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try 
		{	
			wd.findElement(objm.getLocator("logoutbutton")).click();
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
