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

import neoStoxBase.Base;

import neoStoxPOM.NeoStoxHomePage;
import neoStoxPOM.Password;
import neoStoxPOM.SignInPage;
import neoStoxPOM.SignUppage;
import neoStoxUtilityMaven.Utility;





@Listeners(listener.Listener.class)
public class ValidateNeoStoxUsername extends Base
{
	SignUppage SU;
	SignInPage login;
	Password pass;
	NeoStoxHomePage home;
	
	
	
	@BeforeClass
	public void LaunchBrowser() throws InterruptedException 
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
		
		Utility.Wait(driver, 1000);
		
		login.Entermobilenumber(driver, Utility.Exelsheetreading(driver, 3, 0));
		login.Clickonsignbutton(driver);
		Utility.Wait(driver, 1000);
		
	    pass.enter4digitpin(driver,Utility.Exelsheetreading(driver, 3, 1));
	    Thread.sleep(1000);
	    pass.Clickonsubmitbutton(driver);
	    
	    Thread.sleep(1000);
	    home.HandelPopUp(driver);
	}
	
   @Test(priority = -1)
   public void validateNeoStoxUserName() throws EncryptedDocumentException, IOException 
   {
	   Assert.assertEquals(home.getActualUserName(driver),Utility.Exelsheetreading(driver, 5, 0),"TC fail  actual and expected username are not matching");
	   
	   Utility.Screenshot(driver, home.getActualUserName(driver));
	   
	   Reporter.log("Username validated successsfully", true);
	   
   }


   @Test
   public void validateNeoStoxAccBalance() throws EncryptedDocumentException, IOException 
   {
	  
	   Assert.assertNotNull(home.getAccBalance(driver),"TC fail anable to fetch account balance");
	   
	   Utility.Screenshot(driver, "Accbalance");
	   
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
