package AssertStaticMethodsStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqual {
  @Test
  public void Testing() 
  {
	  String a="Pune";
	  String b="Pune";
	  
	  Assert.assertEquals(a,b , "a and b are not equal TC is failed");
	  
	  
  }
}
