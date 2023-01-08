package DisadvantagesOfHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Disadvantage 
{
	
	String a="pune";
	String b="pune";
  @Test
  public void Testing() 
  {
	  
	  
	  //if both are not equal and b is not null then TC should be pass
	  
	  Assert.assertNotEquals(a, b ,"a and b are equal TC is failed");
	  
	  Assert.assertNotNull(b, "b is null TC is failed");
  

  }
  @Test
  public void Testing1()
  {
	  
	  Assert.assertEquals(a,b, "TC is failed a and b are same");
	  
	  
  }
}
