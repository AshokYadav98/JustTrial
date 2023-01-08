package neoStoxTest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hdfcNetBankingPOM.hdfcHomePage;
import hdfcNetBankingPOM.hdfcLogInPage;
import hdfcNetBankingPOM.hdfcSecuerAccessPage;

import neoStoxBase.HdfcBase;
import neoStoxUtilityMaven.UtilityProperties;
@Listeners(listener.Listener.class)
public class validateAccBalance extends HdfcBase
{
	hdfcLogInPage login;
	hdfcSecuerAccessPage secure;
	hdfcHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException, IOException
	{
		Launchbrowser() ;
		
		Thread.sleep(1000);
		
	    login=new hdfcLogInPage (driver);
	    
	    secure=new  hdfcSecuerAccessPage (driver);
	    
	    home=new hdfcHomePage (driver);
		
	}
	@BeforeMethod
	public void loginToHdfcnetbanking() throws InterruptedException, IOException
	{
		UtilityProperties.Wait(driver, 1000);
		
		Thread.sleep(1000);
		
		login.enterUserId(driver, UtilityProperties.ReadDataFromPropertyFile("userid"));
		
//		login.continuebutton(driver);
		
		UtilityProperties.Wait(driver, 1000);
		
//	    login.enterpassword(driver, Utility.Exelsheetreading(0, 1));
	
//		login.clickonloginbutton(driver);
	}
	
	
	
	
	
	
	
	
	
  @Test
  public void ValidateMyAccBalance() 
  {
	  
  }
}
