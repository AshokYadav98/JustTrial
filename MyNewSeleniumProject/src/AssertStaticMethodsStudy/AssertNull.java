package AssertStaticMethodsStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void Testing() 
  {
	  String a="abc";
	  
	  Assert.assertNull(a, "a is not null TC is failed");
  
	 
  }
}
