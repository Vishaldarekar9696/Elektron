package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import Base.TestBase;
import Pages.LogInPage;
import utility.util_Screenshot;

public class LoginSS extends TestBase{

	LogInPage login;
	@BeforeMethod
	public void setup() throws IOException
	{
		initalization();
		 login=new LogInPage();
	}
	



	@Test (groups = {"sanity"})
	public void verifyTitleTest()
	{
		String title =login.verifyTitle();
	Assert.assertEquals("1Kite - Zerodha's fast and elegant flagship trading platform", title);
	}
	
	@Test(groups = {"sanity"})
	public void verifykiteLogoTest()
	{
		boolean value = login.verifyKiteLogo();
		Assert.assertEquals(value, true);
	}
	
	
	@Test(enabled =  true,invocationCount = 1)
	public void verifyZarodhaLogoTest()
	{
		boolean value = login.verifyZarodhaLogo();
	Assert.assertEquals(value, true);
	}
	
	@Test(enabled =  true,invocationCount = 1)
	public void loginToApplicationTest() throws IOException, InterruptedException
	{
		String nickName = login.loginToApplication();
		Assert.assertEquals(nickName, "Vishal");
	}
	
	
@AfterMethod
public void exit(ITestResult it) throws IOException
{
	if(ITestResult.FAILURE==it.getStatus())
	{
		util_Screenshot.ss(it.getName());
	}
	else if(ITestResult.SUCCESS==it.getStatus())
	{
		util_Screenshot.ssPass(it.getName());
	}
	//driver.close();
	driver.quit();
}
	
	
	
	
	
}
