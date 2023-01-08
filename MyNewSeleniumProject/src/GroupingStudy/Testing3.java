package GroupingStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing3 {
	 @Test(groups = "UID")
	  public void A() 
	  {
		  Reporter.log("Test A is Running", true);
	  }
	  @Test(groups = "PWD")
	  public void B() 
	  {
		  Reporter.log("Test Bis Running", true);
	  }
	  @Test(groups = "UID")
	  public void C() 
	  {
		  Reporter.log("Test C is Running", true);
	  }
	  @Test
	  public void D() 
	  {
		  Reporter.log("Test D is Running", true);
	  }
}
