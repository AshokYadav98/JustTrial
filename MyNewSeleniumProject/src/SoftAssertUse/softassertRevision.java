package SoftAssertUse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertRevision 
{
	SoftAssert soft=new SoftAssert();
  @Test
  public void f() 
  {
	  String a="ashok";
	  String b="yadav";
	  
	  soft.assertNotNull(b,"TC is failed b is null");
	  soft.assertEquals(a,b,"TC is failed a and b are not equals");
	  
	  soft.assertAll();
	  
	 
	  
	 
	  
	  
	  
	  
	  
	  
  }
  @Test
  public void x() 
  {
	  int c=10;
	  int d=11;
	  
	  soft.assertNotEquals(c,d,"TC is failed c and d are equals");
	  
	  soft.assertNotNull(d,"TC is failed d is null");
	  
	  soft.assertAll();
	  
  }
 
  
}
