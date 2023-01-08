package NokariTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NokariBase.BaseClass;
import NokariPOM.Homepage;
import NokariPOM.LoginPage;
import NokariPOM.ProfilePage;
import Utilitynokari.Utility;

public class TestCaseNokari extends BaseClass
{
	LoginPage login;
	Homepage home;
	ProfilePage profile;
	@BeforeClass
	public void launchBrowser()
	{
		launchBrowser();
		
		login=new LoginPage (driver);
		home=new Homepage (driver);
		profile= new ProfilePage (driver);
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		login.clickonlogin();	
		Thread.sleep(1000);
		
		login.enterUserName(Utility.readingPropertiFile("userId"));
		login.enterPassword(Utility.readingPropertiFile("password"));
		login.clickOnLogInButton();
		
		home.clickOnUpdateProfileButton();
		
	}
	
  @Test
  public void validateMobileNumber() throws IOException 
  {
	  Assert.assertEquals(profile.getMobNumber(), Utility.readingPropertiFile("password"),"TC failed actual and expected mobile number is not equal ");
	  
  }
  @Test
  public void validateEmailId() throws IOException
  {
	  Assert.assertEquals(profile.getEmailId(),Utility.readingPropertiFile("userId"));
  }
}
