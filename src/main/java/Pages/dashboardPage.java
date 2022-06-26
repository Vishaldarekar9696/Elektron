package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class dashboardPage extends TestBase{
	

//@FindBy(xpath = "//div[@id='avatar-44']") private WebElement avtar;
@FindBy(xpath = "//span[@class='user-id']") private WebElement avtar;
	@FindBy(xpath = "//h4[@class='username']") private WebElement usernameLabel;
@FindBy(xpath = "//div[@class='email']") private WebElement emailLebal;


@FindBy(xpath = "//button[text()='Start investing ']") private WebElement startInvestingButton;
@FindBy(xpath = "(//input[@icon='search'])[2]")private WebElement searchBar;
@FindBy(xpath = "//span[@class='tradingsymbol']") private WebElement selectFirst;
@FindBy(xpath = "//button[contains(text(),'Create GTT ')]")private WebElement creatGTTButton;
@FindBy(xpath = "//input[@label='Trigger price']") private WebElement triggerPriceTextBox;
@FindBy(xpath = "//input[@label='Qty.']") private WebElement qtyTextBox;
@FindBy(xpath = "//input[@label='Price']") private WebElement priceTextBox;
@FindBy(xpath = "//button[normalize-space(text())='Cancel']") private WebElement cancelButton;

public dashboardPage()
{
	PageFactory.initElements(driver, this);
}

public String verifyUsernameLebal() throws InterruptedException
{    	//Thread.sleep(2000);

	avtar.click();
	//Thread.sleep(2000);
	return usernameLabel.getText();
}
public String verifyEmailLebal() throws InterruptedException
{	//Thread.sleep(2000);

	avtar.click();
	//Thread.sleep(2000);
return emailLebal.getText();
}

public void placeGTTOrder() throws InterruptedException, EncryptedDocumentException, IOException
{
	startInvestingButton.click();
	//Thread.sleep(1000);
	searchBar.sendKeys(readExcelFile(0, 0));
	//Thread.sleep(1000);
	selectFirst.click();
	//Thread.sleep(1000);
	creatGTTButton.click();
	//Thread.sleep(1000);
	triggerPriceTextBox.clear();
	//Thread.sleep(1000);
	triggerPriceTextBox.sendKeys(readExcelFile(0, 1));
	//Thread.sleep(1000);
	qtyTextBox.clear();
	//Thread.sleep(1000);
	qtyTextBox.sendKeys(readExcelFile(0, 2));
	//Thread.sleep(1000);
	priceTextBox.clear();
	//Thread.sleep(1000);
	priceTextBox.sendKeys(readExcelFile(0, 3));
	//Thread.sleep(1000);
	cancelButton.click();
	//Thread.sleep(1000);
}
}
