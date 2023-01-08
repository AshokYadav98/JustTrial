package SoftAssertUse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse1 
{ 
	SoftAssert soft=new SoftAssert();
  @Test
  public void Testing() 
  {
	  String a="ashok";
	  String b="ashok";
	  
	  
	  
	  soft.assertNotEquals(a, b,"a and b are equal TC is failed");
	  
	  soft.assertNotNull(b, "b is  null TC is failed");
	  
	  soft.assertAll();
  }
  
  
  
}
