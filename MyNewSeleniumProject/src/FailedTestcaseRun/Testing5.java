package FailedTestcaseRun;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Testing5 {
	 @Test
	  public void A() 
	  {
		 // Assert.fail();
		  Reporter.log("Test A is Running", true);
	  }
	  @Test
	  public void B() 
	  {
		  Reporter.log("Test B is Running", true);
	  }
	  @Test
	  public void C() 
	  {
		//  Assert.fail();
		  Reporter.log("Test C is Running", true);
	  }
	  @Test
	  public void D() 
	  {
		  Reporter.log("Test D is Running", true);
	  }
}
