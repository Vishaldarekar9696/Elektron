package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;

public class LoginPageTest extends TestBase{

	LogInPage login;
	@BeforeMethod(groups = {"sanity"})
	public void setup() throws IOException
	{
		initalization();
		 login=new LogInPage();
	}
	


	@Test (groups = {"sanity"})
	public void verifyTitleTest()
	{
		String title =login.verifyTitle();
	Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", title);
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
	
	
@AfterMethod(groups = {"sanity"})
public void exit()
{
	//driver.close();
	driver.quit();
}
	
	
	
	
	
}
