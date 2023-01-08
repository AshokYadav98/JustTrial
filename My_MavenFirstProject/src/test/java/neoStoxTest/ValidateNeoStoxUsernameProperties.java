package neoStoxTest;




import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.BaseProperties;
import neoStoxPOM.NeoStoxHomePage;
import neoStoxPOM.Password;
import neoStoxPOM.SignInPage;
import neoStoxPOM.SignUppage;
import neoStoxUtilityMaven.UtilityProperties;



@Listeners(listener.Listener.class)
public class ValidateNeoStoxUsernameProperties extends BaseProperties
{
	SignUppage SU;
	SignInPage login;
	Password pass;
	NeoStoxHomePage home;
	
	
	
	@BeforeClass
	public void LaunchBrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Launchbrowser();
		SU=new SignUppage(driver);
		login =new SignInPage(driver);
		pass=new Password(driver);
		home=new NeoStoxHomePage (driver);
		
		
	}
	@BeforeMethod
	public void LogintoNeostox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SU.ClickonLoginbutton(driver);
		
		UtilityProperties .Wait(driver, 1000);
		
		login.Entermobilenumber(driver,UtilityProperties.ReadDataFromPropertyFile("mobileNum"));
		login.Clickonsignbutton(driver);
		UtilityProperties .Wait(driver, 1000);
		
	    pass.enter4digitpin(driver,UtilityProperties.ReadDataFromPropertyFile("password"));
	    Thread.sleep(1000);
	    pass.Clickonsubmitbutton(driver);
	    
	    Thread.sleep(1000);
	    home.HandelPopUp(driver);
	}
	
   @Test
   public void validateNeoStoxUserName() throws EncryptedDocumentException, IOException 
   {
	   Assert.assertEquals(home.getActualUserName(driver), UtilityProperties.ReadDataFromPropertyFile("username"),"TC fail  actual and expected username are not matching");
	   
//	   UtilityProperties .Screenshot(driver, home.getActualUserName(driver));
	   
	   Reporter.log("Username validated successsfully", true);
	   
   }


   @Test
   public void validateNeoStoxAccBalance() throws EncryptedDocumentException, IOException 
   {
	  
	   Assert.fail();
	   Assert.assertNotNull(home.getAccBalance(driver),"TC fail anable to fetch account balance");
	   
	   Reporter.log("AccBalance test validated ", true);
	   
   }
   
   @AfterMethod
   public void logout()
   {
	   home.logOut(driver);
   }
   
   @AfterClass
   
   public void closeBrowser()
   {
	   driver.close();
   }
}
