package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestBase {

public static WebDriver driver;
	
public String readPropertyFile(String value) throws IOException
{
Properties prop=new Properties();
FileInputStream file=new FileInputStream("C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\src\\main\\java\\Config\\Config.properties");
prop.load(file);
return prop.getProperty(value);
}

public void initalization() throws IOException
{String browserName= readPropertyFile("browser");
if (browserName.equalsIgnoreCase("chrome"))
{
	ChromeOptions co=new ChromeOptions();
co.addArguments("--disable-notifications");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\chromedriver.exe");
	driver=new ChromeDriver(co);
}
else if (browserName.equalsIgnoreCase("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\geckodriver.exe");
driver=new FirefoxDriver();
}
else if(browserName.equalsIgnoreCase("edge"))
{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\msedgedriver.exe");
driver=new EdgeDriver();

}

//switch( browserName)
//{
//case "chrome":{
//	ChromeOptions co=new ChromeOptions();
//	co.addArguments("--disable-notifications");
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\chromedriver.exe");
//driver=new ChromeDriver(co);break;
//}
//
//case "firefox":{System.setProperty("webdriver.gecko.driver", "C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\geckodriver.exe");
//driver=new FirefoxDriver();break;
//}
//
//case "edge":{System.setProperty("webdriver.edge.driver", "C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\msedgedriver.exe");
//driver=new EdgeDriver();break;
//}
//
//}
	driver.manage().window().maximize();
	//driver.get("https://kite.zerodha.com/");
	driver.get(readPropertyFile("url"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}

public String readExcelFile(int rowNumber,int cellNumber) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\Win\\eclipse-workspace\\26FebFrame\\TestData\\New Microsoft Office Excel Worksheet.xlsx");
 Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
String value = sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
return value;
}


}
//first 
//first retuen
