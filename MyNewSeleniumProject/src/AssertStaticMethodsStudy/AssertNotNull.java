package AssertStaticMethodsStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void Testing() 
  {
	  String a=null;
	  
	  Assert.assertNotNull(a, "a is null TC is failed");
  }
}
