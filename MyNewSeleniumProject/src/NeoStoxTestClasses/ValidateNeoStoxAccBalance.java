package NeoStoxTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeoStoxPOMClasses.NeoStoxHomePage;
import NeoStoxPOMClasses.Password;
import NeoStoxPOMClasses.SignInPage;
import NeoStoxPOMClasses.SignUppage;
import neoStoxBase.Base;
import neoStoxUtility.Utility;



public class ValidateNeoStoxAccBalance extends Base
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
		
		Utility.Wait(driver, 1000);
		
		login.Entermobilenumber(driver, Utility.Exelsheetreading(3, 0));
		login.Clickonsignbutton(driver);
		Utility.Wait(driver, 1000);
		
	    pass.enter4digitpin(driver, Utility.Exelsheetreading(3, 1));
	    Thread.sleep(1000);
	    pass.Clickonsubmitbutton(driver);
	    
	    Thread.sleep(1000);
	    home.HandelPopUp(driver);
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
	   Utility.Wait(driver, 1000);
	   driver.close();
   }
}
