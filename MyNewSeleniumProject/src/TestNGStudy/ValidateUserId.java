package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserId {
  @Test
  public void validateupstoxuserid() 
  {
	  Reporter.log("User ID Validated", true);
	  
  }
  @BeforeMethod
  public void LogInIntoUpstox()
  {
	  Reporter.log("Log In Success", true);
  }
  @BeforeClass
  public void LounchingURL()
  {
	  Reporter.log("URL Lounch Successfully", true);
	  
  }
  @AfterMethod
  public void LogOutFromUpstox()
  {
	  Reporter.log("Loging Out", true);
  }
  @AfterClass()
  public void CloseBrowser()
  {
	  Reporter.log("Closing Browser Successfully", true);
  }
}

