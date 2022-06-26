package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class HardAssert extends TestBase{


	
	LogInPage login;
	@BeforeMethod
	public void setup() throws IOException
	{
		initalization();
		 login=new LogInPage();
		
	}
	


	@Test(priority = 1,invocationCount = -2)
	public void verifyTitleTest()
	{
		String title =login.verifyTitle();
		System.out.println("a");
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", title,"title dev la vichara");
		System.out.println("b");
		
	}
	
	@Test(enabled = true,priority = 2,dependsOnMethods = {"verifyTitleTest"})
	public void verifykiteLogoTest()
	{
		boolean value = login.verifyKiteLogo();
		Assert.assertEquals(value, true);
	}
	
	
	@Test(enabled = false,priority = 3,dependsOnMethods = {"verifyTitleTest"})
	public void verifyZarodhaLogoTest()
	{
		boolean value = login.verifyZarodhaLogo();
	Assert.assertEquals(value, true);
	}
	
	@Test(enabled = false,priority = 4)
	public void loginToApplicationTest() throws IOException, InterruptedException
	{
		String nickName = login.loginToApplication();
		Assert.assertEquals(nickName, "Vishal");
	}
	
	
@AfterMethod
public void exit()
{
	//driver.close();
	driver.quit();
}
	
	
	
	
	
}
