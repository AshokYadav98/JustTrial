package AssertStaticMethodsStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfalse {
  @Test
  public void Testing() 
  {
	  boolean a=false;
	  
	  Assert.assertFalse(a, "a is true TC is failed");
  }
}
