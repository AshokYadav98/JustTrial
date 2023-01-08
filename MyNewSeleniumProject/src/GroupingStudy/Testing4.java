package GroupingStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing4 {
	 @Test(groups = "UID")
	  public void E() 
	  {
		  Reporter.log("Test E is Running", true);
	  }
	  @Test(groups = "PWD")
	  public void F() 
	  {
		  Reporter.log("Test F is Running", true);
	  }
	  @Test(groups = "UID")
	  public void G() 
	  {
		  Reporter.log("Test G is Running", true);
	  }
	  @Test(groups = "PWD")
	  public void H() 
	  {
		  Reporter.log("Test H is Running", true);
	  }
}
