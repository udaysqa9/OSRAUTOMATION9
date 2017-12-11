package scripts;

import org.junit.Assert;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class A {

	@Test
	public void testA()
	{
		Reporter.log("in a",true);
		
	}

@Test
public void testB()
{
	Reporter.log("in b",true);
	Assert.assertTrue(false);
}

@AfterMethod
public void check(ITestResult res)
{
	String testName = res.getName();
	int status = res.getStatus();
	System.out.println("status"+status);
	Reporter.log(testName,true);
	//Reporter.log(status,true);
}
}
