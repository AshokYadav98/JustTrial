package POM_Study_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	@FindBy(id = "email")private WebElement UserId;
	
	@FindBy(id = "pass")private WebElement Password;
	
	@FindBy(name = "login") private WebElement LogInButton;
	
	//declare constructor
	
	public  LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilize
	
	public void EnterUserid()
	{
		UserId.sendKeys("7709987276");
	}
	
	public void EnterPassword()
	{
		 Password.sendKeys("9422851547");
	}
	public void ClickOnLogInButton()
	{
		LogInButton.click();
	}
	
}
