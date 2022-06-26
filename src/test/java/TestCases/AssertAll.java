package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAll {
	SoftAssert s=new SoftAssert();
	
@Test(enabled = false)
	public void method()
	{
		//Assert.assertEquals(false, false);
		System.out.println("11111111");
		Assert.assertEquals(false, true);
		System.out.println("22222222222");
	}
@Test
public void method1()
{

	s.assertEquals(false, false);
	System.out.println("11111111");

	s.assertEquals(true, false);
	System.out.println("22222222222");
	s.assertAll();

}

@Test
public void method2()
{
	s.assertEquals(false, false);
s.assertAll();

}
}
