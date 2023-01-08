package listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.BaseProperties;
import neoStoxUtilityMaven.UtilityProperties;


public class Listener extends BaseProperties  implements ITestListener
{
	public void onTestFailure(ITestResult result) 
	{
		String methodname = result.getName();
		
		Reporter.log("TC "+methodname+" is failed please try again", true);
		
		try {
			UtilityProperties .Screenshot(driver, methodname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void onTestSuccess(ITestResult result) 
	{
		
		Reporter.log("TC "+result.getName()+" is passed successfully", true);
		
		
		
	}
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC "+result.getName()+" is skipped please check ", true);
		
	}
	
}
