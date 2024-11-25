package Utilities;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Browser.BrowserSetup;


public class ProductSetup2ndPage extends methods{
	public By ProductName_wait = By.name("productName");
	public By Date_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]");//01/02/2020
	public By timePeriod_dropselect = By.xpath("//select[@id='numberDuration']");//১২০ মাস
	public By SaveButton_click = By.xpath("//button[@aria-label='সংরক্ষণ করুন']");
	
	public By FirstYear_in = By.xpath("(//input[@name='profitRate'])[1]");
	public By SecondYear_in = By.xpath("(//input[@name='profitRate'])[2]");
	public By ThirdYear_in = By.xpath("(//input[@name='profitRate'])[3]");
	public By FourthYear_in = By.xpath("(//input[@name='profitRate'])[4]");
	public By FifthYear_in = By.xpath("(//input[@name='profitRate'])[5]");
	public By SixYear_in = By.xpath("(//input[@name='profitRate'])[6]");
	public By SeventhYear_in = By.xpath("(//input[@name='profitRate'])[7]");
	public By EightYear = By.xpath("(//input[@name='profitRate'])[8]");
	public By NineYear_in = By.xpath("(//input[@name='profitRate'])[9]");
	public By TenYear_in = By.xpath("(//input[@name='profitRate'])[10]");
	public By ElevenYear_in = By.xpath("(//input[@name='profitRate'])[11]");
	public By TwelveYear = By.xpath("(//input[@name='profitRate'])[12]");
	public By TherteenYear_in = By.xpath("(//input[@name='profitRate'])[13]");
	public By forteenYear_in = By.xpath("(//input[@name='profitRate'])[14]");
	public By fifteenYear_in = By.xpath("(//input[@name='profitRate'])[15]");
	public By NextButton_cl = By.xpath("//button[contains(text(),'পরবর্তী ধাপ')]");
	public By SaveButtonInpopup = By.xpath("//button[contains(text(),'সংরক্ষণ করুন')]");
	public By ProductSaveButton = By.xpath("//button[@aria-label='সংরক্ষণ করুন']");
	public void FillupSecondProductSetupPage(String ActivationDate, String Year, int munafayearNumber,String... MunafaRateValues) throws InterruptedException{
		WaitElement(ProductName_wait);
		ExtentTest test = BrowserSetup.extent.createTest("প্রোডাক্টের মুনাফা page","FDR Product Setup: 2nd step");
		test.log(Status.INFO, "fillup প্রোডাক্টের মুনাফা for particular years");
        test.pass("প্রোডাক্টের মুনাফা page appeared", MediaEntityBuilder.createScreenCaptureFromPath(methods.captureScreenshot("Screenshot3.png")).build());
		Thread.sleep(2000);
		Fieldvalue(Date_in, ActivationDate);
		DropDOwnSelectByVisibleTxt(timePeriod_dropselect, Year);
		Thread.sleep(2000);
		click(SaveButton_click);
		//getDriver().switchTo().alert();
		Thread.sleep(2000);
		for(int i=1; i<=munafayearNumber; i++) {
			Fieldvalue(By.xpath("(//input[@name='profitRate'])["+ i +"]"), MunafaRateValues[i-1]);
		}

        test.pass("প্রোডাক্টের মুনাফা setup screen", MediaEntityBuilder.createScreenCaptureFromPath(methods.captureScreenshot("Screenshot4.png")).build());
		click(NextButton_cl);
        test.pass("প্রোডাক্টের মুনাফা set", MediaEntityBuilder.createScreenCaptureFromPath(methods.captureScreenshot("Screenshot5.png")).build());
		Thread.sleep(2000);
		WaitElementClick(SaveButtonInpopup);
		Thread.sleep(2000);

	}



}
