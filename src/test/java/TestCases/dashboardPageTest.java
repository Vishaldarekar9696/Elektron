package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;
import Pages.dashboardPage;

public class dashboardPageTest extends TestBase {
	dashboardPage dash;
	LogInPage login;
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{initalization();
		dash=new dashboardPage();
	login=new LogInPage();
	login.loginToApplication();
		
	}
	
	
	@Test(enabled =  true,invocationCount = 5)
	public void verifyUsernameLebalTest() throws InterruptedException
	{
		String value = dash.verifyUsernameLebal();
		Assert.assertEquals(value, "Vishal Gorkshanath Darekar");
	}
	@Test(enabled =  true,invocationCount = 5)
	public void verifyEmailLebalTest() throws InterruptedException
	{
		String value = dash.verifyEmailLebal();
		Assert.assertEquals(value, "vishaldarekar9696@gmail.com");
	}
	
	@Test(enabled =  true,invocationCount = 5)
	public void placeGTTOrderTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		dash.placeGTTOrder();
	}
	@AfterMethod
	public void exit()
	{
		//driver.close();
	driver.quit();
	}
}
