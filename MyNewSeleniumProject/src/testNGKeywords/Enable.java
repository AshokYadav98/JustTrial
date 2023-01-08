package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

//Enable Keyword is used to stop method running

public class Enable {
	 @Test
	  public void D()
	  {
		  Reporter.log("method D is running", true);
	  }
	  @Test(enabled = true)
	  public void B()
	  {
		  Reporter.log("method B is running", true);
	  }
	  @Test(enabled = false)
	  public void C()
	  {
		  Reporter.log("method C is running", true);
	  }
	  @Test
	  public void A()
	  {
		  Reporter.log("method A is running", true);
	  }
}
