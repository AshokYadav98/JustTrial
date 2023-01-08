package POMStudy_FacebookExel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
    @FindBy(id = "email")private WebElement UserId;
	
	@FindBy(id = "pass")private WebElement Password;
	
	@FindBy(name = "login") private WebElement LogInButton;
	
	//declare constructor
	
	public LogInPage  (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilize
	
	public void EnterUserid(String userid)
	{
		UserId.sendKeys(userid);
	}
	
	public void EnterPassword(String pass)
	{
		 Password.sendKeys(pass);
	}
	public void ClickOnLogInButton()
	{
		LogInButton.click();
	}

}
