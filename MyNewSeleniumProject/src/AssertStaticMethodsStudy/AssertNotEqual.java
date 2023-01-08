package AssertStaticMethodsStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqual {
  @Test
  public void Testing() 
  {
	  String a="Ashok";
	  String b="ashok";
	  
	  Assert.assertNotEquals(a,b,"a and b are equal TC is fail");
  }
}
