package DisadvantagesOfHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertStudy 
{
  String a="ashok";
  String b="ashok";
  String c=null;
  @Test
  public void A() 
  {
	  
	  Assert.assertNotEquals(a,b,"TC failed a and b are equal");
	  
	  Assert.assertNull(c,"TC failed c is not null");
	  
  }
  
  @Test
  public void B()
  {
	  Assert.assertEquals(a,b,"TC faield a and b are not equal");
  }
}
