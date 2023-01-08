package listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.BaseForAmazon;
import neoStoxUtilityMaven.UtilityPropertyAmazon;

public class ListenerAmazon extends BaseForAmazon implements ITestListener
{
	
	public void onTestSuccess(ITestResult result) 
	{
		
		try {
			UtilityPropertyAmazon.Screenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("Tc "+result.getName()+" passed successfully", true);
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		Reporter.log("TC "+result.getName()+" is failed ..please try again, true");
		
		try {
			UtilityPropertyAmazon.Screenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void onTestSkipped(ITestResult result)
	{
		
		Reporter.log("TC "+result.getName()+" is skipped ..please check, true");
		
	}
	

}
