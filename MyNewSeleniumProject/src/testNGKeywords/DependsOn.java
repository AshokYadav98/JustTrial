package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn {
	 @Test(timeOut = 200)
	  public void D() throws InterruptedException
	  {
		  Thread.sleep(500);
		  Reporter.log("method D is running", true);
	  }
	  @Test
	  public void B()
	  {
		  Reporter.log("method B is running", true);
	  }
	  @Test
	  public void C()
	  {
		  Reporter.log("method C is running", true);
	  }
	  @Test(dependsOnMethods = {"D"})
	  public void A()
	  {
		  Reporter.log("method A is running", true);
	  }
}
