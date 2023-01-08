package DisadvantagesOfHardAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy 
{
	int a=10;
	int b=10;
	boolean c=true;
	String d=null;
	SoftAssert soft=new SoftAssert();
	
	
  @Test
  public void A() 
  {
	  soft.assertNotEquals(a,b,"TC failed a and b are same");
	  
	  soft.assertTrue(c,"TC failed c is false");
	  
	  soft.assertAll();
	  
  }
	
  @Test
  public void B() 
  {
	  soft.assertNull(d,"TC faield d is not null");
	  
	  soft.assertFalse(c,"TC failed c is true");
	  
	  soft.assertAll();
  }
}
