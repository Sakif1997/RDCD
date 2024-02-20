package TestCase;

import java.awt.AWTException;
import java.io.IOException;

import Utilities.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Browser.BrowserSetup;
import MemberInformationCOOP.MemberFive;
import MemberInformationCOOP.MemberFour;
import MemberInformationCOOP.MemberOne;
import MemberInformationCOOP.MemberSix;
import MemberInformationCOOP.MemberThree;
import MemberInformationCOOP.MemberTwo;
import Utilities.SamityNibondhon2ndUpdatePage;
public class NineStepMemberCreation extends BrowserSetup{
	public By CommityPage = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By SodossoNibondhon_c = By.xpath("//button[@aria-label='আগের পাতায়']");
	public By SodossoNibondhonPage_c =By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By NewMemberAddButton_c = By.xpath("//button[contains(text(),'নতুন সদস্য যোগ করুন')]");
	public By NibondhonPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By NewAddMember_wc = By.xpath("//button[contains(text(),'নতুন সদস্য যোগ করুন')]");
	public By AddmemberPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	
	public By NibondhonPageIcon_c = By.xpath("//a[@href='/coop/samity-management/coop/member-registration']//*[name()='svg']");
	//public By secondPage_w = By.xpath("//strong[contains(text(),'(ক) মুখ্য উদ্দেশ্যঃ')]");
	//public By nextPage_c = By.xpath("//button[contains(text(),'পরবর্তী পাতায়')]");
	
	
	
	
	MemberOne mOne = new MemberOne();
	MemberTwo mtwo =new MemberTwo();
	MemberThree mthree = new MemberThree();
	MemberFour mFour = new MemberFour();
	MemberFive mFIve = new MemberFive();
	MemberSix mSix =new MemberSix();
	
	
	
	

	LoginBaboharkari log = new LoginBaboharkari();
	SamityNibondhonFirstPage p1= new SamityNibondhonFirstPage();
	Nibondhon2ndPage p2= new Nibondhon2ndPage();
	ThirdPage p3 = new ThirdPage();
	//SamityNibondhonPage1Test np2 = new SamityNibondhonPage1();

	SamityNibondhonPage1 newP2 = new SamityNibondhonPage1();
	SamityNibondhon2ndUpdatePage UpPage2 = new SamityNibondhon2ndUpdatePage();

	
	Methods method = new Methods();
	MemberOne m1 =new MemberOne();
	
	//landing on First Page 
	//Pre-requisitve : Must have created a samity previously
	SamityNibondhonFirstPage SamityNibondhonPage1 = new SamityNibondhonFirstPage();
	
	@Test(description = "Samity Name Use Input ")
	public void UpToAddMember() throws  InterruptedException, IOException, AWTException {
		log.Baboharkarilogin();
		//SamityName Input in First Page
		p1.firstpageInputs("QA Test-9");
		Thread.sleep(2000);
		//newP2.Page2();
		UpPage2.Page2();
		//method.clickElement(secondPageicon_c);
		//Thread.sleep(5000);
		//p2.secondPageDone();
		//Thread.sleep(5000);
		//method.WaitElementVisible(secondPage_w);
		//Thread.sleep(2000);
		////method.ScrollDown();
		//method.clickElement(nextPage_c);
		p3.page3();
		mOne.addMember();
		p3.page3();
		mtwo.addMember();
		p3.page3();
		mthree.addMember();
		p3.page3();
		mFour.addMember();
		p3.page3();
		mFIve.addMember();
		getDriver().navigate().refresh();
		//Thread.sleep(4000);
//		method.clickElement(NibondhonPageIcon_c);
//		method.clickWaitElement(NewAddMember_wc);
//		method.clickWaitElement(AddmemberPage_w);
		//method.ScrollUp();
		p3.page3();
		mSix.addMember();
		//p3.page3();
		//smp.OsompurnoAbedonfirstpageInputs();
		}
	
	

}
