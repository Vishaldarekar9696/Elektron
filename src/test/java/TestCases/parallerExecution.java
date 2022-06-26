package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallerExecution {
@Test
public void fb()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.quit();
}
@Test
public void google()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.quit();


}
@Test
public void amazon()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.quit();
}
	
}
