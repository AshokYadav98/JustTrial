package TestNGXML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class Testing3 {
  @Test(priority = -2)
  public void E() 
  {
	  Reporter.log("Test E is Running", true);
  }
  @Test
  public void F() 
  {
	  Assert.fail();
	  Reporter.log("Test F is Running", true);
  }
  @Test(dependsOnMethods = "F")
  public void G() 
  {
	  Reporter.log("Test G is Running", true);
  }
  @Test(priority = -1)
  public void H() 
  {
	  Reporter.log("Test H is Running", true);
  }
}
