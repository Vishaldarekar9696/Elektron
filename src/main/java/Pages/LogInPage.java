package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LogInPage extends TestBase{

	@FindBy(xpath = "//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy(xpath = "//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	@FindBy(xpath = "//input[@label='User ID']") private WebElement userIdTextBox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTextBox;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement loginButton;
	@FindBy(xpath = "//input[@label='PIN']") private WebElement pinTextBox;
	@FindBy(xpath = "//button[text()='Continue ']") private WebElement continueButton;
	@FindBy(xpath = "//span[@class='nickname']") private WebElement nickname;
	
	public LogInPage()
	{
PageFactory.initElements(driver, this);
	}
	
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
public boolean verifyKiteLogo()
{
return	kiteLogo.isDisplayed();
}

 public boolean verifyZarodhaLogo()
 {
	return zerodhaLogo.isDisplayed(); 
 }

public String loginToApplication() throws InterruptedException, IOException
{
	userIdTextBox.sendKeys(readPropertyFile("userId"));
	passwordTextBox.sendKeys(readPropertyFile("password"));

	loginButton.click();

	pinTextBox.sendKeys(readPropertyFile("pin"));

	continueButton.click();
return	nickname.getText();
	

}




}
