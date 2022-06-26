package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class util_Screenshot extends TestBase {

	public static void ss(String name) throws IOException
	{
File local = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\ScreenShots//"+name+".png");
FileHandler.copy(local, dest);
	}
	public static void ssPass(String name) throws IOException
	{File local = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\Screenshot for pass Test cases//"+name+".png");
FileHandler.copy(local, dest);
		
	}
}
