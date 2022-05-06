package com.sgtesting.chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		LanchBrowser();
		navigate();
		login();
		Minimise();
		ClickTask();
		AddCustomer();
		fillCoustomer();
		ModifydeleteCustomer();
		logout();
		closeapplication();
	}
	private static void LanchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\JavaAutomation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Minimise()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ClickTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void AddCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void fillCoustomer()
	{
		try
		{
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Demo User");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ModifydeleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			//Click Settings
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(4000);
		
			//Change It Achieve
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(2000);
			//change Achied
			oBrowser.findElement(By.xpath("/html/body/div[23]/div[2]")).click();
			Thread.sleep(3000);
			//Detete
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[2]/span")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[2]/a")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

