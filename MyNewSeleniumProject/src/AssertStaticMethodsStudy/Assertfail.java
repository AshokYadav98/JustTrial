package AssertStaticMethodsStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfail {
  @Test
  public void Testing () 
  {
	  Assert.fail();
  }
}
