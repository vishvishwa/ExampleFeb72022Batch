package com.sgtesting.chrome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage 
{
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	//login page username
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	//pwd
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	//login
	@FindBy(xpath="//*[@id=\"loginButton\"]/div") 
	private WebElement ologin;
	public WebElement getloginbutton()
	{
		return ologin;
	}
	
	//minimise
	@FindBy(xpath="//*[@id=\"gettingStartedShortcutsPanelId\"]")
	private WebElement mini;
	public WebElement Min()
	{
		return mini;
	}
	
	//user
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement user;
	public WebElement getclickuser()
	{
		return user;
	}
	//add user
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[1]")
	private WebElement adduser;
	public WebElement clickadduser()
	{
		return adduser;
	}
	//fill details fn.ln,mail,
	private WebElement firstName;
	public WebElement fillFN()
	{
		return firstName;
	}
	//LastNAme
	private WebElement lastName;
	public WebElement fillLN()
	{
		return lastName;
	}
	//Email
	private WebElement email;
	public WebElement fillmailid()
	{
		return email;
	}
	//LoginDetails
	private WebElement userDataLightBox_usernameField;
	public WebElement Loginuser()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement password;
	public WebElement Loginpassword()
	{
		return password;
	}

	private WebElement passwordCopy;
	public WebElement LoginpasswordCopy()
	{
		return passwordCopy;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Create;
	public WebElement Createuser()
	{
		return Create;
	}
	//Delete User
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement Delete;
	public WebElement Clicktodelete()
	{
		return Delete;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement Deleteok()
	{
		return userDataLightBox_deleteBtn;
	}
	//Logout
	private WebElement logoutLink;
	public WebElement logout()
	{
		return logoutLink;
	}
	//Modify User
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[3]/span")
	private WebElement tikbox;
	public WebElement checkbox()
	{
		return tikbox;
	}
}

