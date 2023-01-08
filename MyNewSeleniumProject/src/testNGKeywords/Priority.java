package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

//without any priority methods run alphabetically

public class Priority {
  @Test(priority = 2)
  public void D()
  {
	  Reporter.log("method D is running", true);
  }
  @Test(priority =1)
  public void B()
  {
	  Reporter.log("method B is running", true);
  }
  @Test(priority = -2)
  public void C()
  {
	  Reporter.log("method C is running", true);
  }
  @Test(priority = -1)
  public void A()
  {
	  Reporter.log("method A is running", true);
  }
}
