package TestNGXML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class Testing1 {
  @Test(priority = -2)
  public void A() 
  {
	  Reporter.log("Test A is Running", true);
  }
  @Test
  public void B() 
  {
	  Assert.fail();
	  Reporter.log("Test Bis Running", true);
  }
  @Test(dependsOnMethods = "B")
  public void C() 
  {
	  Reporter.log("Test C is Running", true);
  }
  @Test(priority = -1)
  public void D() 
  {
	  Reporter.log("Test D is Running", true);
  }
}
